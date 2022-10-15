import java.util.Scanner;
import java.util.Locale;


class Jogo{
    
    private int numJogadores;
    private int [] armadilha = new int [3];
    private int [] posicao;
    private boolean [] podeJogar = new boolean [numJogadores];
    private int numArmadilha = 0;
    private int numCasas;
    private int prox = 0;
    private boolean fimDoJogo = false;
    
    public Jogo(int numJogadores, int numCasas){
        this.numJogadores = numJogadores;
        this.numCasas = numCasas;
        podeJogar = new boolean [numJogadores];
        posicao = new int [numJogadores];
        // for(int i = 0; i < numJogadores; i++)
        // {
        //     this.posicao[i] = 0;
        // }
        int i = 0;
        while(i < numJogadores)
        {
            this.posicao[i] = 0;
            this.podeJogar[i] = true;
            i++;
        }
        
    }
    
    public void addArmadilha(int t)
    {
        if(numArmadilha < 3)
        {
            armadilha[numArmadilha] = t;
            numArmadilha++;
        }
    }
    
    public void addMove(int dado1, int dado2)
    {
        if(!fimDoJogo)
        {
            if(!podeJogar[prox])
            {
                System.out.printf("O jogador %d passa a vez\n", prox +1);
                podeJogar[prox] = true;
                prox++;
            }
            if(podeJogar[prox])
            {
                posicao[prox] += dado1 + dado2;
                System.out.printf("O jogador %d vai para a casa %d\n", prox +1, posicao[prox]);
                if(posicao[prox] > numCasas)
                    {
                        System.out.printf("O jogador %d venceu o jogo\n", prox +1);
                        fimDoJogo = true;
                    }
                for(int j = 0; j < 3; j++)
                {
                    if(posicao[prox] == armadilha[j])
                    {
                        System.out.printf("O jogador %d caiu em um armadilha\n", prox +1);
                        podeJogar[prox] = false;
                    }
                }
                prox++;
            }
            if(prox >= numJogadores)
                    {
                        prox = 0;
                    }
        }else{
            System.out.printf("O jogo acabou\n");
            }
    }
    
    public String toString()
    {
        for(int i = 0; i < numJogadores; i++)
        {
            System.out.printf("PosJogador[%d] = %d\n", i+1, posicao[i]);
        }
        return "";
    }
    
}



class Solver{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault ( Locale.US ) ;
        Jogo jogo = new Jogo(0,0);

        while(true) {
            String line = scanner.nextLine();
            String ui[] = line.split(" ");
            System.out.println("$" + line);
            if(ui[0].equals("init")) {
                jogo = new Jogo( Integer.parseInt( ui[1]),  Integer.parseInt( ui[2]) );
            } else if(ui[0].equals("end")) {
                break; 
            } else if(ui[0].equals("addArmadilha")) {
                jogo.addArmadilha( Integer.parseInt( ui[1]) ); 
            } else if(ui[0].equals("addMove")) {
                int d1 = Integer.parseInt( ui[1]);
                int d2 = Integer.parseInt( ui[2]);
                jogo.addMove(d1, d2);
            } else if(ui[0].equals("show")) {
                System.out.println(jogo);
            }else{
                System.out.println("fail: comando invalido");
            }
        }
        scanner.close();
    }
}