package javasitrings;
import java.util.Scanner;

public class ContadorDeUns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') {
                count++;
            }
        }

        System.out.println("O número de ocorrências de '1' na string é: " + count);
    }
}