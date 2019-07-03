package aplicacao;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		File file = new File("C:\\texto.txt ");// Localização do arquivo
		Scanner teclado = null;

		try {// Try para tratamento de exceções

			teclado = new Scanner(file);// Scanner sendo instanciado mas no lugar do (System.in) vai o file
			while (teclado.hasNextLine()) {// Verifica se existe uma proxima linha para leitura
				System.out.println(teclado.nextLine());// Imprimi as linhas do arquivo
			}
		} catch (IOException e) {

			System.out.println("Erro: "+e.getMessage());
		}finally {//Para encerrar o Scanner
			teclado.close();
		}

	}

}
