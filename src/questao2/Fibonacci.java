package questao2;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	
	 Scanner input = new Scanner(System.in);

     System.out.print("Informe um número inteiro: ");
     int numero = input.nextInt();

     int fib1 = 0, fib2 = 1, fibonacci = 0;
     boolean pertence = false;

     while (fibonacci <= numero) {
         if (fibonacci == numero) {
             pertence = true;
             break;
         }
         fib1 = fib2;
         fib2 = fibonacci;
         fibonacci = fib1 + fib2;
     }

     if (pertence) {
         System.out.println(numero + " pertence à sequência de Fibonacci.");
     } else {
         System.out.println(numero + " não pertence à sequência de Fibonacci.");
     }

     input.close();
}
}
