/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principale;

/**
 *
 * @author 70659092
 */
public class CalcoloEdInserisco implements Runnable {

    private double B;
    private GestCalcoli gc;

    /**
     * Implementa la classe che ospita i calcoli e contiene un valore
     * double a cui viene sommato il risultato ottenuto dal gestore dei calcoli.
     *
     * @param b
     * @param gc
     */
    public CalcoloEdInserisco(double b, GestCalcoli gc) {
        B = b;
        this.gc = gc;
    }

    public void run() {
        gc.setRisultato((int)(gc.getRisultato() + B));
        System.out.println(Thread.currentThread().getName() + " " + gc.getRisultato());
    }
}