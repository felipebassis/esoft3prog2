package br.com.unicesumar.aula20190222;

import java.io.Reader;
import java.util.Scanner;

public class App {

    private static final int SALARIO_INICIAL = 1000;
    private static final double SALARIO_MAXIMO = 10000D;
    private static final int IDADE_MINIMA = 18;

    public static void main(String[] args) {
        for (int counter = 100; counter > 0; counter--) {
            System.out.println("Good night. " + counter);
        }

        boolean ganhaBem1 = 5000.33 < obterSalario(40);
        System.out.println(ganhaBem1);

        boolean ganhaBem2 = 5000.33 < obterSalario(18);
        System.out.println(ganhaBem2);
    }

    private static double obterSalario(int idade) {
        if (idade < IDADE_MINIMA) {
            throw new RuntimeException("Somente maiores de 18 anos");
        }
        return ((idade - 17) * SALARIO_INICIAL) > SALARIO_MAXIMO ? SALARIO_MAXIMO : ((idade - 17) * SALARIO_INICIAL);
    }


}
