package javasitrings;
import java.util.Scanner;

public class Criando {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String numeros;
		int i,b=0;
		System.out.println("Digite os números ");
		numeros = ler.next();
		for (i=0; i<numeros.length(); i++) {
			if (numeros.charAt(i) == '1') {
				b++;
			}
		}
		System.out.println("A quantidade de 1's é de" + b);
	}

}
