import java.util.Scanner;

public class Constantes {
	public static final int DDD_AREA = 11;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num_tele;
		System.out.println("Digite seu numero de telefone: ");
		num_tele = teclado.nextInt();
		System.out.println("Seu numero de telefone com codigo de area é: " + DDD_AREA + " " + num_tele);

	}

}
