/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provanani2;

/**
 * Vengono creati 7 thread e si contano i nani
 * @author 70659092
 */
public class ProvaNani2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread thr1 = new ContaINani2("topolino");
        Thread thr2 = new ContaINani2("pippo");
        thr1.start();
        thr2.start();
        
    }
    
}
