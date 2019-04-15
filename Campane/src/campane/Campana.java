package campane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * L'oggetto campana ha un  suono ed un numero di volte
 * con cui rintoccherà
 * @author 70659092
 */
public class Campana implements Runnable{
    String suono;
    int volte;
    
    /**
     * Costruttore della campana 
     * @param suono
     * @param volte
     */
    public Campana(String suono, int volte){
        this.suono=suono;
        this.volte=volte;
    }
    
    /**
     * Per il numero di k volte prestabilito viene stampato il suono 
     */
    public void run(){
        for(int k = 0; k<volte;k++){
            System.out.println((k+1) +suono+" ");
        }
    }
    
}
