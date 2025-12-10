import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;


public class Automobile {
    String carburante;
    int potenza;
    int serbatoio;

    public Automobile(){}
    
    public Automobile(String carburante,int potenza,int serbatoio){
        this.carburante=carburante;
        this.potenza=potenza;
        this.serbatoio=serbatoio;
    }
    
    public void setcarburante(String carburante){this.carburante=carburante;}
    public void setpotenza(int potenza){this.potenza=potenza;}
    public void setserbatoio(int serbatoio){this.serbatoio=serbatoio;}
    public String getcarburante(){return carburante;}
    public int getpotenza(){return potenza;}
    public double getserbatoio(){return serbatoio;}

    public String fileCSV(){
        return String.join(";",carburante,Integer.toString(potenza),Integer.toString(serbatoio));
    }
   

    public boolean telecomando(boolean accendi){
        if(accendi==true){
            System.out.println("La macchina e' accesa");}
        else{
            System.out.println("La macchina e' spenta");
            }
        return accendi;
    }
    
    public void motore(){
        boolean guasto;
        double temperatura=(Math.random()*120);
        if(temperatura>=100){
            guasto=true;
            System.out.println(+temperatura+" Gradi.\nTemperatura elevata");
        }
        else{
            guasto=false;
        System.out.println(+temperatura+" Gradi.\nTemperatura nella norma");
        }
    }
    

    public static void main(String[] args) {
    Path csv = Path.of("Automobile.csv");
    Automobile Fiat=new Automobile("Gasolio",75,35);
    Automobile Ford=new Automobile();
    Ford.setcarburante("Benzina");
    Ford.setpotenza(125);
    Ford.setserbatoio(50);
    Scanner sc=new Scanner(System.in);
    System.out.println("Digita true or false");
    boolean chiave=sc.nextBoolean();
    Ford.telecomando(chiave);
    if(chiave==true){
    Ford.motore();
    }
  }
}
