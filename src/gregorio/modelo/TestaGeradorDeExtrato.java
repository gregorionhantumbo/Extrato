package gregorio.modelo;
import java.util.Scanner;

public class TestaGeradorDeExtrato {
	public static void main(String[]args) {
		GeradorDeExtrato gerador = new GeradorDeExtrato();
		ContaPoupanca cp = new ContaPoupanca();
		ContaCorrente cc = new ContaCorrente();
		System.out.println("Introduza o valor para a conta POUPANCA!");
		cp.setSaldo(new Scanner(System.in).nextDouble());
		System.out.println("Introduza o valor da conta CORRENTE!");
		cc.setSaldo(new Scanner(System.in).nextDouble());
		System.out.println("\n\n");
		gerador.imprimirExtrato(cp);
		gerador.imprimirExtrato(cc);
	}
}
