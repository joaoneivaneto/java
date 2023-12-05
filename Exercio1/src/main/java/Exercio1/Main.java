/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercio1;

import java.util.Scanner;
/**
 *
 * @author joaon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
        int n;
        System.out.println("Digite um numero:");
        n = leitor.nextInt();
        
        if(n >=100  && n<=200){
            System.out.println("o numero esta no intervalo");
        } else {
            System.out.println("o numero não esta no intervalo");
        }
       
     
    }
    
}
