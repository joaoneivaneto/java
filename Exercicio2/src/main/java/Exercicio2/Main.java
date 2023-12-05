
package Exercicio2;

import java.util.Scanner;
public class Main {

   
    public static void main(String[] args) {
       Scanner leitorScanner = new Scanner(System.in);
       
        System.out.println("Digite um seu nome");
        
        String nome = leitorScanner.nextLine();
        
        System.out.println("Digite sua nota do primeiro bimestre");
        
        float nota1 = leitorScanner.nextFloat();
        
        System.out.println("Digite sua nota do segundo bimestre");
        
        float nota2 = leitorScanner.nextFloat();
        
        System.out.println("Digite sua nota do terceiro bimestre");
        
        float nota3 = leitorScanner.nextFloat();
        
       float media = (nota1 + nota2 + nota3)/3;
       
        if (media >= 7.0) {
            System.out.println("O aluno "+ nome +" esta aprovado" );
        }else if(media <= 5){
            System.out.println("O aluno "+ nome +" esta reprovado");
        }else if(media>=5.1 && media <= 6.9){
            System.out.println("o aluno "+ nome +" esta em recurepação ");
        }
        System.out.println(media);
        
    }
    
}
