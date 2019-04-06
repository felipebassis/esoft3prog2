package br.com.unicesumar.aula20190215;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!!");

        final int LIMIT = getLimit();

        for (int contador = 0; contador <= LIMIT; contador++) {
            System.out.println(contador % 2 == 0 ? contador + " é Par" : contador + " é impar");
        }
    }

    private static int getLimit() {
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        if (valor % 2 == 1) {
            throw new RuntimeException("Número deve ser par.");
        }
        return valor;
    }
}
