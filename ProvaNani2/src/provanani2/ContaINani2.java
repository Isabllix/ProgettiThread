/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provanani2;

/**
 *
 * @author 70659092
 */
public class ContaINani2 extends Thread{

    /**
     *
     * @param nome
     */
    public ContaINani2(String nome){
        super();
        setName(nome);
    }

    /**
     *
     */
    public void run(){
        for(int i = 0; i < 7; i++){
            System.out.println((i + 1) + " " + getName());
        }
    }
}
