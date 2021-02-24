import java.util.Scanner;
public class LacoWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String nome;
		
		System.out.println("Digite seu nome ou s para sair.");
		nome = entrada.nextLine();
		
		while(!nome.equals("s")){
			System.out.println("Bom Dia: " + nome);
			System.out.println("Digite seu nome ou s para sair.");
			nome = entrada.nextLine();
		}

		entrada.close();
		System.out.println("Fim da execução");
	}

}
