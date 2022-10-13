import java.util.Scanner;

enum Coin {
    M10(0.10, 1),
    M25(0.25, 2),
    M50(0.50, 3),
    M100(1.00, 4);

    public double value;
    public int volume;
    private Coin(double value, int volume) {
        this.value = value;
        this.volume = volume;
    }
    public int getVolume() {
        return volume;
    }
    public String getDescription() {
        return "Coin: " + value;
    }
    public String toString() {
        return "Coin: " + value + " Volume: " + value;
    }
}
class Item {
    private String description = "";
    private int volume = 0;
    public Item(String description, int volume)
    {
        this.description = description;
        this.volume = volume;
    }
    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description += description;
    }
    public void setVolume(int volume)
    {
        this.volume = volume;
    }
    public int getVolume()
    {
        return volume;
    }
    public String toString()
    {
        return "";
    }
}
class Pig{
    private String itens = "";
    private double value = 0;
    private int volume = 0;
    private int volumeMax;
    private boolean broken = false;
    //inicializa o volumeMax
    public Pig(int volumeMax)
    {
        this.volumeMax = volumeMax;
    }
    //se nao estiver quebrado e couber, adicione o value e o volume
    public boolean addCoin(Coin moeda)
    {
        if(!broken)
        {
            if(volume + moeda.volume <= volumeMax)
            {
                value += moeda.value;
                volume += moeda.volume;
                return true;
            }
        }
        
        return false;
    }
    //se não estiver quebrado e couber, adicione no volume e na descrição
    public boolean addItem(Item item)
    {
        if(!broken)
        {
            if(volume + item.getVolume() <= volumeMax)
            {
                if(itens == "")
                {
                    itens += item.getDescription();
                }else{
                    itens += ", ";
                    itens += item.getDescription();
                }
                
                volume += item.getVolume();
                return true;
            }
        }
        return false;
    }
    //quebre o pig
    public boolean breakPig()
    {
        return broken = true;
    }
    //se estiver quebrado, pegue e retorne o value
    public double getCoins()
    {
        if(!isBroken())
        {
            System.out.println("You must break the pig first");
           return 0.0;
        }else{
            return value;
        }
    }
    //se estiver quebrado, pegue e retorno os itens
    public String getItens()
    {
        if(!isBroken())
        {
            System.out.println("You must break the pig first");
           return "";
        }else{
            return itens;
        }
    }
    public int getVolume()
    {
        return volume;
    }
    public int getVolumeMax()
    {
        return volumeMax;
    }
    public boolean isBroken()
    {
        return broken;
    }
    //mostre o conteúdo do pig
    public String toString()
    {
        return "I:(" + itens + ")" + " M:" + value +  " V:" + volume + "/" + volumeMax + " EQ:" + broken; 
    }
}

class Solver{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pig pig = new Pig(0);

        while(true) {
            String line = scanner.nextLine();
            String ui[] = line.split(" ");
            System.out.println("$" + line);

            if(ui[0].equals("init")) {
                pig = new Pig( Integer.parseInt( ui[1]) );
            } else if(ui[0].equals("end")) {
                break;
            } else if(ui[0].equals("addCoin")) {
                if( ui[1].equals("10") ){
                    pig.addCoin(Coin.M10);
                }else if( ui[1].equals("25") ){
                    pig.addCoin(Coin.M25);             
                }else if( ui[1].equals("50") ){
                    pig.addCoin(Coin.M50);             
                }else if( ui[1].equals("100") ){
                    pig.addCoin(Coin.M100);             
                } 
            } else if(ui[0].equals("addItem")) {
                pig.addItem(new Item(ui[1], Integer.parseInt(ui[2])));
            } else if(ui[0].equals("getItens")) {
                System.out.println( pig.getItens() );
            } else if (ui[0].equals("getCoins")) {//km
                System.out.println( pig.getCoins() );
            } else if (ui[0].equals("show")) {//gas
                System.out.println(pig);
            } else if (ui[0].equals("breakPig")) {//gas
                pig.breakPig();
            }else{
                System.out.println("fail: comando invalido");
            }
        }
        scanner.close();
    }
}
