package javasitrings;

public class Questao4 {

	public static void main(String[] args) {
		int [] numeros = {10,12,15,18,3};
		int local = preencher(numeros);
		System.out.println("O maior número é: " +local);

	}
	public static int preencher (int [] numeros) {
		int i;
		int local = 0;
		for (i=0; i<numeros.length; i++ ) {
			if (numeros[i] > numeros[local]) {
				local = i;
			}
		}
		return local;
	}
}
