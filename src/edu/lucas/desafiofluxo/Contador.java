package edu.lucas.desafiofluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		int num2 = scan.nextInt();
		try {
			
			contarNumeros(num1, num2);
			
		} catch(ParametrosInvalidosException e){
			System.out.println("O segundo número deve ser maior que o primeiro");
		}
	}
	
	static void contarNumeros(int num1, int num2) throws ParametrosInvalidosException{
		if(num1 >= num2)
			throw new ParametrosInvalidosException();
		
		int max = num2 - num1;
		for(int i = 1; i <= max; i++) {
			System.out.println(i);
		}
	}

}
