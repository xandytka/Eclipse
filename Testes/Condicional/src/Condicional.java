import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Primeiro numero: ");
		num1 = entrada.nextInt();
		System.out.println("Segundo numero: ");
		num2 = entrada.nextInt();
		entrada.close();
		
		if(num1 == num2) {
			System.out.println("O Primeiro e segundo numeros são iguais.");
		}
		else if (num1 > num2) {
			System.out.println("O Primeiro numero é maior que o Segundo");
		}
		else {
			System.out.println("O Primeiro numero é menor que o Segundo.");
		}

	}

}
