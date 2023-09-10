package cursoExecutavel;

public class ParadaBreak {
	public static void main(String[] args) {

		for (int numero = 0; numero <= 10; numero++) {
			
			
			if (numero == 7) {
				System.out.println("Ova encontrei o numero 3");
				System.out.println("Estou parando de executar");
				break;
			}
		}
	}

}
