package atividadeUm;

import java.util.Scanner;

public class atividadeUmm{


public static void main(String[] args) {

Scanner in = new Scanner(System.in);
String nome;
int idade;

System.out.print("\n Digite seu nome:");
nome = in.next();

System.out.print("\n Digite sua idade:");
idade = in.nextInt();

System.out.print("\n" + nome +"," + idade + "anos.");

}
}