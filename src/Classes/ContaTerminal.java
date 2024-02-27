package Classes;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero da agencia: ");
		int numero = sc.nextInt();
		
		System.out.print("Digite sua conta: ");
		String conta = sc.next();
		
		System.out.print("Digite seu nome: ");
		String nomeCliente = sc.next();
		
		System.out.print("Digite seu saldo: ");
		double saldo = sc.nextDouble();
		
		System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+numero+", conta "+conta+" e seu saldo "+saldo+ " ja esta disponivel para saque");
		sc.close();
	}
}
