/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campane;

/**
 * Programma che crea una campana, la affida ad un thread e lo esegue 
 * @author 70659092
 */
public class Dindondan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Runnable cam1 = new Campana("din",5);
       Thread thr1 = new Thread(cam1);
       thr1.start();
       Thread thr2 = new Thread(new Campana("don",5));
       thr2.start();
       new Thread(new Campana("dan",5)).start();
    }
    
}
