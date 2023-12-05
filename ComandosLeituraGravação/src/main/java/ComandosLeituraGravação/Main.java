/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComandosLeituraGravação;

import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor =  new Scanner(System.in);
        
        int idade = leitor.nextInt();
        float contacaoDolar = leitor.nextFloat();
        double CotacaoEuro = leitor.nextDouble();
        String Nome = leitor.nextLine();
        String CodigoRua = leitor.next();
    }
    
}
