package atividadeOito;

import java.util.Scanner;

public class questaoOito {

	public static void main(String[] args) {
	// Questão 7º - Pedro 
		// Estudar CONCATENAÇÃO DE VARIAVIES 
			
		Scanner entrada = new Scanner(System.in);
		
		double cel, fah, ken;
		
		System.out.print("\n\t Calculadora do Pedro! <3");
		
		System.out.print("\n Digite a temperatura em Celsius: ");
		cel = entrada.nextDouble();
		
		fah = ( 9 * cel + 160) / 5;
		
		System.out.print("\n A medida convertida da calculadora do Pedro é:" + fah + "ºF \n");
		
		ken = cel + 273;
		
		System.out.print("\n A medida convertida da calculadora do Pedro é:" + ken + "ºK \n");
}
}