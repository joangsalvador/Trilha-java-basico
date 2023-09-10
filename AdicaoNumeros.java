
import java.util.Scanner;

public class AdicaoNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        System.out.printf("%s%n", "Entre com o primeiro numero");
        number1 = input.nextInt();

        System.out.printf("%s%n", "Entre como o segundo numero:");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.printf("A soma é: %d%n", sum);

        input.close();

    }
}
