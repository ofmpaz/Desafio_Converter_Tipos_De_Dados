package fundamentos;

import java.util.Scanner;


public class Desafio_Conversao {

	public static void main(String[] args) {
		/*Obter três salários por meio de String, converter para número soma e tirar a média e aceitar valores
		 * tanto escritos com vírgula quanto com pontos*/

		Scanner input = new Scanner(System.in);
		String salario01, salario02, salario03; 

		System.out.println("Informe o valor dos três salários");
		salario01 = input.next().replace(",","."); 
		salario02 = input.next().replace(",",".");
		salario03 = input.next().replace(",",".");
		

		double valor01 = Double.parseDouble(salario01); 
		double valor02 = Double.parseDouble(salario02);
		double valor03 = Double.parseDouble(salario03);
		
		double soma = (valor01 + valor02 + valor03); 
		double media = (soma / 3); 
		
		System.out.println("A média de salário é: " + media);
		
		
		input.close(); 
	}
	
		
}
