import java.util.Scanner;
import java.text.*;

class Car{
    public int pass; // Passageiros
    public int passMax; // limite de Passageiros
    public int gas; // tanque
    public int gasMax; // limite do tanque
    public int km; // quantidade de quilometragem
    
    public Car()
    {
        passMax = 2;
        gasMax = 100;
        pass = 0;
        km = 0;
        gas = 0;
    }
    
    public String toString()
    {
        return "pass: " + this.pass + ", gas: " + this.gas + ", km: " + this.km;
    }
    
    public void enter()
    {
        if(pass < 2)
        {
            pass++;
        }else{
            System.out.println("fail: limite de pessoas atingido");
        }
    }
    
    public void leave()
    {
        if(pass > 0)
        {
            pass--;
        }else{
            System.out.println("fail: nao ha ninguem no carro");
        }
    }    
    
    public void fuel(int gas)
    {
        this.gas += gas;
        if(this.gas > 100)
        {
            this.gas = 100;
        }
    }
    
    public void drive (int km)
    {
           if(pass == 0)
           {
               System.out.println("fail: nao ha ninguem no carro");
           }else if(this.gas == 0){
               System.out.println("fail: tanque vazio");
           }else{
               if(this.gas >= km)
               {
                   this.km += km;
                   this.gas -= km;
               }else{
                   System.out.println("fail: tanque vazio apos andar " + this.gas + " km");
                   this.km = this.km + this.gas;
                   this.gas = 0;
               }
           }
    }
};

class Solver{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();

        while(true) {
            String line = scanner.nextLine();
            String ui[] = line.split(" ");
            System.out.println("$" + line);
            if(ui[0].equals("end")) {
                break;
            } else if(ui[0].equals("enter")) {
                car.enter();
            } else if(ui[0].equals("leave")) {
                car.leave();
            } else if(ui[0].equals("show")) {
                System.out.println(car.toString());
            } else if (ui[0].equals("drive")) {//km
                car.drive(Integer.parseInt(ui[1]));
            } else if (ui[0].equals("fuel")) {//gas
                car.fuel(Integer.parseInt(ui[1]));
            } else{
                System.out.println("fail: comando invalido");
            }
        }
        scanner.close();
    }
}