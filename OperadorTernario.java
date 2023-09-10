package operadoresternario;

public class OperadorTernario {
	/* operador para fazer micro validações */
	public static void main(String[] args) {

		int nota1 = 70;
		int nota2 = 60;
		int nota3 = 90;
		int nota4 = 90;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/*condições lógica com IF e ELSE*/
		/*if (media >= 70) {
			System.out.println("Aluno aprovado:" + media);

		} else if (media <= 40 && media < +69) {

		}
		if (media >= 40 && media <= 69) {
			System.out.println("Aluno reprovad: " + media);
		} else {
			System.out.println("Aluno reprovado:" + media);
		}*/
		/* operador para fazer micro validações */

	
		
		/*Esses dois pontos nessa parte do codigo e como se fose o else*/
		String saidaResultado = media >= 70 ? "Aluno aprovado" : (media >= 40 && media <= 69)? "Aluno recuperação " : " Reprovado" ;
			/* O exemplo acima é o mesmo exempl0 do primeiro exemplo so que escrita em mesma linha*/						
	
	
	System.out.println(saidaResultado);
	}

}
