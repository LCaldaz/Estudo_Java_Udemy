
/* ------------------ EXERC�CIO 04 -------------------- 
  Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero 
  de horas trabalhadas, o valor que recebe por ora e calcula o sal�rio 
  desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, 
  com duas casas decimais.
   ---------------------------------------------------	
*/

package exercicioEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numFunc = sc.nextInt();
		int horasTrab = sc.nextInt();
		double valorHora = sc.nextDouble();
		double salario = horasTrab * valorHora;
		
		System.out.println("NUMBER = " + numFunc);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
		
	}

}
