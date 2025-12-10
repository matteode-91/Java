package studente;
import java.util.*;

public class Studente {
    private String nome;
    private String cognome;
    private int età;
    private String nazione;
    
    public Studente(){}  //Costruttore vuoto

//Metodi della classe set() e get()
    //setnomeattributo(tipo attributo e Parametro)
    public void setNome(String nome){this.nome=nome;}
    public void setCognome(String cognome){this.cognome=cognome;}
    public void setEta(int età){this.età=età;}
    public void setNazione(String nazione){this.nazione=nazione;}
    //getnomeattributo(tipo attributo e Parametro)
    public String getNome(){return nome;}
    public String getCognome(){return cognome;}
    public int getEta(){return età;}
    public String getNazione(){return nazione;}
    
    public void Stampa(){
        System.out.println("Il nome e' "+this.getNome()+" "+this.getCognome()+" eta "+this.getEta()+" nazione "+this.getNazione());
    }
    public static void main(String[] args) {
        Studente s1=new Studente();
        s1.setNome("Matteo");
        s1.setCognome("Deidda");
        s1.setEta(33);
        s1.setNazione("Italia");
        s1.Stampa();
        s1.setNome("Giuseppe"); //Modifica il parametro nome
        System.out.println("Il nome modificato e' "+s1.getNome()); 
       //La stampa del nome modificato va separata dal metodo stampa e va inserita nel main.
        
    }
    
}
