package atividadeTres;

import java.util.Scanner;

public class questaoTres {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String nome;
		long rg;
		long cpf;
		
		System.out.print("\n\tDigite seu nome:");
		nome = in.next();
		
		System.out.print("\tDigite seu cpf:");
		cpf = in.nextLong();
		
		System.out.print("\tDigite seu rg:");
		rg = in.nextLong();
		
		System.out.print("\n" + nome +"," + cpf +"," + rg +",cadastro feito com sucesso.");
}
}	

