package javasitrings;
import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String palavra;
		char letra;
		int i, b=0;
		System.out.println("Digite a palavra que você quer");
		palavra = ler.next();
		System.out.println("Digite a letra que você quer saber a quantidade");
		letra = ler.next().charAt(0);
		for (i=0; i<palavra.length(); i++) {
			if (letra == palavra.charAt(i)) {
				b++;
			}
		}
		System.out.println("A quantida da letra que você quer é de " +b);
	}

}
