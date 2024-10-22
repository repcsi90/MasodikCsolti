
package Osztályok;


public class Ember {
    private String nev;
    private int SzulEv;
    private int munkaEv;
    public Ember(String nev, int kor, int munkaEv) {
        this.nev = nev;
        this.SzulEv = SzulEv;
        this.munkaEv = munkaEv;
        
        
    }

    public Ember(String nev, int SzulEv) {
        this.nev = nev;
        this.SzulEv = SzulEv;
        this.munkaEv = 0;
    }

    
    
    public String bemutatkozik(){
        return ("A nevem: "+ nev 
                + "A korom:" + getKor() + ", " + munkaEv + "ennyi ideje dolgozom" );
    }

    public int getMunkaEv() {
        return munkaEv;
    }
    public String szuletesEv(){
        return "A korom: " + (2024-SzulEv);
    }

    public String getNev() {
        return nev;
    }

    public int getSzulEv() {
        return SzulEv;
    }
    public int getKor(){
        return 2024-SzulEv;
    }
    
    
}
