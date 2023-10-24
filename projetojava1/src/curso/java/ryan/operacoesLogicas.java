package curso.java.ryan;

public class operacoesLogicas {

	public static void main(String[] args) {

		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 100;
		int nota4 = 90;

		int media = (nota1 + nota2 + nota3 + nota4) / 4;

		// Operadores lógicos IF && ELSE
		/*
		 * if (media >= 60) { System.out.println("Aluno foi aprovado" + media); } else
		 * if (media >= 30 && media <= 59) {
		 * System.out.println("Aluno está em recuperação" + media); } else {
		 * System.out.println("Aluno foi reprovado" + media); }
		 */

		// Operadores ternários para micro validações
		/*
		 * String saidaResultado = media >= 60 ? "Aluno aprovado" : (media >= 30 &&
		 * media <= 59) ? "Aluno em recuperação" : "Aluno reprovado";
		 * System.out.println(saidaResultado);
		 */
		//Operações lógicas aninhadas: São operações dentro de operações
		/*
		if (media >= 60) {
			if (media >= 70) {
				if (media > 90) {
					System.out.println("Aluno está aprovado - Parabéns " + media);
				} else {
					System.out.println("Aluno está aprovado " + media);
				}
			} else {
				System.out.println("Aluno está em recuperação " + media);
			}
		} else {
			System.out.println("Aluno está reprovado " + media);
		}
		*/
	}
}
