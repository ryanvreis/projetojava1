package curso.java.ryan;

public class whileDoWhile {
	public static void main(String[] args) {

		int numero = 0;
		// Verifica e executa o código
		while (numero <= 5) {
			System.out.println("O número atual é: " + numero);
			numero++;
		}
		//---------------------------------------------------------------------------
		int numero2 = 0;
		// Executa e depois verifica
		do {
			System.out.println("O número atual é: " + numero2);
			numero2++;

		} while (numero2 <= 5);

	}

}
