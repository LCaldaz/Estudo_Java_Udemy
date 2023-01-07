
/* ------------------ EXERC�CIO 05 -------------------- 
  Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1,
  o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 
  e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
   ---------------------------------------------------	
*/

package exercicioEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPeca1 = sc.nextInt();
		int qntPeca1 = sc.nextInt();
		double vlPeca1 = sc.nextDouble();
		
		int codPeca2 = sc.nextInt();
		int qntPeca2 = sc.nextInt();
		double vlPeca2 = sc.nextDouble();
		
		double resultPeca1 = qntPeca1 * vlPeca1;
		double resultPeca2 = qntPeca2 * vlPeca2;
		double soma = resultPeca1 + resultPeca2;
		
		System.out.printf("VALOR A PAGAR = R$ %.2f", soma );
		
		sc.close();
	}

}
