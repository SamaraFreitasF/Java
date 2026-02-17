package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Exercicio06 {
    public static void main(String[] args) {
        // Sorteio

        Integer escolhido = 55;

        Integer posicaoEscolhido = 0;
        Integer contPares = 0;
        Integer contImpares = 0;

        for (Integer i = 0; i < 200; i++){
            Integer sorteio = ThreadLocalRandom.current().nextInt(1, 101);

            if(escolhido == sorteio){
                posicaoEscolhido = i;
            }

            if(sorteio % 2 == 0){
                contPares++;
            } else {
                contImpares++;
            }
        }

        System.out.println("Posição Número Sorteado pela Primeira Vez:" + posicaoEscolhido);
        System.out.println("Quantidade de Números Pares:" + contPares);
        System.out.println("Quantidade de Números Impares:" + contImpares);
    }
}
