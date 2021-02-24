import java.util.Scanner;

public class EntradaTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nome;
		int idade;
		System.out.println("Digite seu nome: ");
		nome = teclado.nextLine();
		System.out.println("Bom dia: " + nome);
		System.out.println("Digite sua idade: ");
		idade = teclado.nextInt();
		System.out.println("Sua idade é: " + idade);
		teclado.close();

	}

}
