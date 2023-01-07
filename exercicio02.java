
/* ------------------ EXERCÍCIO 2 -------------------- 
  Faça um programa para ler o valor do raio de um círculo, e depois mostrar 
  o valor da área deste círculo com quatro casas decimais conforme exemplos. 
  					Fórmula da área: area = π . raio2 
  Considere o valor de π = 3.14159
   ---------------------------------------------------	
*/

package exercicioEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		double raio2 = raio * raio;
		double pi = 3.14159;
		double area = pi * raio2;
		
		System.out.printf("A = %.4f%n", area);
		
		sc.close();
	}

}
