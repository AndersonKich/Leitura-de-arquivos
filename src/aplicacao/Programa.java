package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Programa {

	public static void main(String[] args) {

		//Primeira maneira de ler um arquivo
		
		/*File file = new File("C:\\texto.txt ");// Localização do arquivo
		Scanner teclado = null;

		try {// Try para tratamento de exceções

			teclado = new Scanner(file);// Scanner sendo instanciado mas no lugar do (System.in) vai o file
			while (teclado.hasNextLine()) {// Verifica se existe uma proxima linha para leitura
				System.out.println(teclado.nextLine());// Imprimi as linhas do arquivo
			}
		} catch (IOException e) {

			System.out.println("Erro: "+e.getMessage());
		}finally {//Para encerrar o Scanner
			if(teclado != null) {
			teclado.close();
			}
		}*/
		//==========================================================================================================================
		
		String path = "C:\\texto.txt ";//Localização do arquivo
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Erro! "+e.getMessage());
		}
		
		
		
		
		
		
		
		

	}

}
