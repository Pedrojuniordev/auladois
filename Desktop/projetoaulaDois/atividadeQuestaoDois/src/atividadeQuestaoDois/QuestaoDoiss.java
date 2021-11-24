package atividadeQuestaoDois;

import java.util.Scanner;

public class QuestaoDoiss {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String nome;
		int idade;
		String cidade;


		System.out.print("\n Digite seu nome:");
		nome = in.next();

		System.out.print("\n Digite sua idade:");
		idade = in.nextInt();

		System.out.print("\n Digite sua cidade:");
		cidade = in.next();

			System.out.print("\n\n" + nome + " , " + idade + " anos," + cidade + ".");

			}

}
