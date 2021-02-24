import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MyClientT1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hostname = "192.168.0.12"; // Declaração do Host
		int port = 8910; // Declaração da porta
		ServerSocket serverSocket; // Declaração do ServerSocket
		Socket socket; // Declaração do Socket
		OutputStream output; // Declaração da Saida (byte)
		InputStream input; // Declaração da Entrada (byte)
		BufferedOutputStream bufferedOutputStream; // Declaração da Saida (linha de texto)
		BufferedInputStream bufferedInputStream; // Declaração da Entrada (linha de texto)
		BufferedReader reader;
		PrintWriter writer;
		String texto;
		Scanner teclado;

		teclado = new Scanner(System.in);

/*		try {
			do {
				System.out.println("Enviar: ");
				texto = teclado.nextLine();
				socket = new Socket(hostname, port);
				output = socket.getOutputStream();
				writer = new PrintWriter(output, true);
				writer.println(texto);

				System.out.println(texto);

			} while (!texto.equals("bye"));

		} catch (IOException ex) {
			System.out.println("Server exception: " + ex.getMessage());
			ex.printStackTrace();
		} este codigo funciona, porem o abaixo esta mais organizado*/
		

		do {
			System.out.println("Enviar: ");
			texto = teclado.nextLine();
			System.out.println(texto);
			try {
				socket = new Socket(hostname, port);
				output = socket.getOutputStream();
				writer = new PrintWriter(output, true);
				writer.println(texto);
				
				} catch (IOException ex) {
					System.out.println("Server exception: " + ex.getMessage());
					ex.printStackTrace();
					}
			} while (!texto.equals("bye"));
		teclado.close();

	}

}
