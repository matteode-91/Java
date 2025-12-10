import java.util.*;

public class Automobile {
    String carburante;
    int potenza;
    double serbatoio;
    
    public Automobile(){}
    
    public void setcarburante(String carburante){this.carburante=carburante;}
    public void setpotenza(int potenza){this.potenza=potenza;}
    public void setserbatoio(double serbatoio){this.serbatoio=serbatoio;}
    public String getcarburante(){return carburante;}
    public int getpotenza(){return potenza;}
    public double getserbatoio(){return serbatoio;}
   

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
    Automobile Ford=new Automobile();
    Ford.setcarburante("Benzina");
    Ford.setpotenza(125);
    Ford.setserbatoio(50.45);
    Scanner sc=new Scanner(System.in);
    System.out.println("Digita true or false");
    boolean chiave=sc.nextBoolean();
    Ford.telecomando(chiave);
    if(chiave==true){
    Ford.motore();
    }
  }
}
