package curso.java.ryan;

public class variaveis {

	public static void main(String[] args) {

		int nota1 = 20;
		int nota2 = 20;
		int nota3 = 20;
		int nota4 = 10;

		int media = (nota1 + nota2 + nota3 + nota4) / 4;
		/*
		 * if (media >= 60) { System.out.println("Aluno foi aprovado" + media); }
		 * else if (media >= 30 && media <= 59) {
		 * System.out.println("Aluno está em recuperação" + media); } else {
		 * System.out.println("Aluno foi reprovado" + media); }
		 */
		// Operadores ternários para micro validações
		String saidaResultado = media >= 60 ? "Aluno aprovado"
				: (media >= 30 && media <= 59) ? "Aluno em recuperação" : "Aluno reprovado";
		System.out.println(saidaResultado);
	}
}
