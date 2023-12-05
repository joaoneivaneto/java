
package FOR;
import java.util.Scanner;
public class Main {

  
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       
//        System.out.println("digite a quantide de numeros que vai testar:");
//        int quantide = leitor.nextInt();
//        for(int i = 1; i<=quantide; i++){
//            System.out.println("digite o numero para o teste "+ i);
//            int numero = leitor.nextInt();
//            if(numero > 0){
//                System.out.println("esse numero é positivo");
//            }else if(numero < 0){
//                System.out.println("esse numero e negativo");
//            }else{
//                System.out.println("esse numero é igual a 0");
//            }
//        };
         char desejaContinuar = 'S' ;
         int i = 1;
        while (desejaContinuar == 's' || desejaContinuar=='S') {
             System.out.println("digite o numero para o teste "+ i);
             float numero = leitor.nextFloat();
             i++;
             
            if(numero > 0){
                System.out.println("esse numero é positivo");
            }else if(numero < 0){
                System.out.println("esse numero e negativo");
            }else{
                System.out.println("esse numero é igual a 0");
            }
            System.out.println("Deseja continuar? S - sim / N - não"); 
            desejaContinuar = leitor.next().charAt(0);
            
        }
    }
    
}
