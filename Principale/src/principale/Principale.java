/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principale;

/**
 * Il programma somma 1 al risultato lanciando tutte le volte un thread
 * il quale lavora al risultato finale.
 * @author 70659092
 */
public class Principale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestCalcoli GC = new GestCalcoli();
        GC.setRisultato(0);
        System.out.println(GC.getRisultato());

        for (int i = 0; i < 10; i++) {
            new Thread(new CalcoloEdInserisco(1, GC)).start();
        }
        while (Thread.activeCount() > 1) {
            System.out.println(Thread.activeCount());
        }
    }
    
}
