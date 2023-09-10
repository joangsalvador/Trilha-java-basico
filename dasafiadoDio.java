import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        try {
            Scanner leitorDeEntradas = new Scanner(System.in);

            System.out.print("Informe o valor do salário: ");
            float valorSalario = leitorDeEntradas.nextFloat();

            System.out.print("Informe o valor dos benefícios: ");
            float valorBeneficios = leitorDeEntradas.nextFloat();

            float valorImposto = 0;
            if (valorSalario >= 0 && valorSalario <= 1100) {
                valorImposto = 0.05F * valorSalario;
            } else if (valorSalario > 1100.01 && valorSalario <= 2500.00) {
                valorImposto = 0.10F * valorSalario;
            } else {
                valorImposto = 0.15F * valorSalario;
            }

            float saida = valorSalario - valorImposto + valorBeneficios;
            System.out.println(String.format("Valor líquido: R$ %.2f", saida));
        } catch (Exception e) {
            System.out.println("Entrada inválida. Certifique-se de inserir valores numéricos.");
        }
    }
}
