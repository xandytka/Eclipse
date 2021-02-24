import java.util.Random;

public class NumAleat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random aleatorio = new Random();
		int valor_inteiro = aleatorio.nextInt(10) + 1;
		float valor_decimal = aleatorio.nextFloat() * 100;
		System.out.println("Numero aleatorio inteiro: " + valor_inteiro);
		System.out.println("Numero aleatorio decimal: " + valor_decimal);

	}

}
