package atividadeOito;

import java.util.Scanner;

public class questaoOito {

	public static void main(String[] args) {
	// Quest�o 7� - Pedro 
		// Estudar CONCATENA��O DE VARIAVIES 
			
		Scanner entrada = new Scanner(System.in);
		
		double cel, fah, ken;
		
		System.out.print("\n\t Calculadora do Pedro! <3");
		
		System.out.print("\n Digite a temperatura em Celsius: ");
		cel = entrada.nextDouble();
		
		fah = ( 9 * cel + 160) / 5;
		
		System.out.print("\n A medida convertida da calculadora do Pedro �:" + fah + "�F \n");
		
		ken = cel + 273;
		
		System.out.print("\n A medida convertida da calculadora do Pedro �:" + ken + "�K \n");
}
}