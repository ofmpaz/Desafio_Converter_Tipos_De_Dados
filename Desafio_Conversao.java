package fundamentos;

import java.util.Scanner;


public class Desafio_Conversao {

	public static void main(String[] args) {
		/*Obter tr�s sal�rios por meio de String, converter para n�mero soma e tirar a m�dia e aceitar valores
		 * tanto escritos com v�rgula quanto com pontos*/

		Scanner input = new Scanner(System.in);
		String salario01, salario02, salario03; 

		System.out.println("Informe o valor dos tr�s sal�rios");
		salario01 = input.next().replace(",","."); 
		salario02 = input.next().replace(",",".");
		salario03 = input.next().replace(",",".");
		

		double valor01 = Double.parseDouble(salario01); 
		double valor02 = Double.parseDouble(salario02);
		double valor03 = Double.parseDouble(salario03);
		
		double soma = (valor01 + valor02 + valor03); 
		double media = (soma / 3); 
		
		System.out.println("A m�dia de sal�rio �: " + media);
		
		
		input.close(); 
	}
	
		
}
