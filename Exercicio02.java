package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Exercicio02 {
    public static void main(String[] args) {
        // Acumulador

        Integer acumulador;
        Integer soma = 0;
        Integer cont = 0;

        do {
            acumulador = ThreadLocalRandom.current().nextInt(0,11);
            soma = soma + acumulador;
            cont++;
        } while(acumulador != 0);

        System.out.printf("A soma dos números é %d", soma);
    }
}
