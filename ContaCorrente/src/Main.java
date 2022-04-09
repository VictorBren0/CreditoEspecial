import java.util.Scanner;

import entidade.Conta;

public class Main {

	public static Conta conta = new Conta("Victor", 1, 0, 100);

	public static void main(String[] args) {
		//16021011 - Victor Breno Santos Rodrigues

		Scanner sc = new Scanner(System.in);

		VerConta();
		System.out.println("Digite o valor do saque: ");
		double valor = sc.nextDouble();
		if (conta.getSaldo() >= valor) {
			conta.Saque(valor);
			System.out.printf("Dinheiro sacado: %.2f", valor);
			System.out.println();
			VerConta();
		} else if ((conta.getSaldo() < valor) && ((conta.getCredito() + conta.getSaldo()) >= valor)) {
			conta.Saque(valor);
			System.out.printf("Saquei retirado do credito especial", valor);
			System.out.println();
			VerConta();
		} else {
			System.out.println("Saldo insuficiente!");
		}
		System.out.println("Digite o valor do deposito: ");
		valor = sc.nextDouble();
		conta.Deposito(valor);
		System.out.printf("Dinheiro depositado: %.2f", valor);
		System.out.println();
		VerConta();
		sc.close();
		}
	
	public static void VerConta() {
		System.out.println(conta.getUsuario() + " " + conta.getNumero());
		System.out.printf("Saldo: %.2f", conta.getSaldo());
		System.out.println();
		System.out.printf("Credito especial: %.2f", conta.getCredito());
		System.out.println();
	}

}
