package curso.java.ryan;

public class switchCase {
	public static void main(String[] args) {

		int dia = 4;
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;
		default:
			System.out.println("Dia qualquer");
			break;
		}
	}
}