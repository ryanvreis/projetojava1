package curso.java.ryan;

public class estruturaFor {
	public static void main(String args[]) {
		/*
		 * // Estrutura de repetição FOR crescente for (int numero = 0; numero <= 10;
		 * numero++) { System.out.println("Número atual é: " + numero); }
		 */
		/*
		 * // Estrutura de repetição FOR decrescente for (int numero2 = 10; numero2 >=
		 * 0; numero2--) { System.out.println("Número atual é: " + numero2); }
		 */
		/*
		 * Estrutura de repetição FOR com break(parada) for (int i = 0; i <= 7; i++) {
		 * if (i == 7) { System.out.println("Encontrei o numero 7");
		 * System.out.println("Estou parando de executar!!!"); break; } }
		 */
		// Estrutura de repetição FOR e continue
		for (int i = 0; i <= 10; i++) {
			if (i == 3 || i == 6 || i == 10) {
				System.out.println("Encontrei o numero: " + i);
				continue;
			}
			System.out.println("Processando laço de repetição");
		}
	}
}