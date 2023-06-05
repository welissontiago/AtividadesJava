package javasitrings;

public class Testando {

    public static void main(String[] args) {
        int[] numeros = {10, 12, 15, 1, 3};
        int posicaoMaior = preencher(numeros);
        System.out.println("A posição do maior número é: " + posicaoMaior);
    }

    public static int preencher(int[] numeros) {
        int i;
        int posicaoMaior = 0;
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > numeros[posicaoMaior]) {
                posicaoMaior = i;
            }
        }
        return posicaoMaior;
    }
}