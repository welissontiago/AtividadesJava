package javasitrings;

public class Vetores2 {

	public static void main(String[] args) {
		int [] vetor1 = {10,12,15,18,3}; int [] vetor2 = {11,12,13,14,15};
		int [] vetorsoma = somar(vetor1,vetor2);
		System.out.println("A Soma é: ");
		for (int i=0; i<vetorsoma.length; i++) {
			System.out.println(vetorsoma[i]);
		}
	}
	public static int[] somar (int [] vetor1, int[] vetor2) {
		int i;
		int[] vetorsomar = new int [5];
		for (i=0; i<vetor1.length; i++ ) {
			vetorsomar[i] = vetor1[i] + vetor2[i];
			}
		return vetorsomar;
		}
	}