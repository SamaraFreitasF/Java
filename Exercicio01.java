package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Exercicio01 {
    public static void main(String[] args) {
    // Loteria

        Integer sorteado = 5;
        Integer cont = 0;
        Integer numeroAleatorio;

        System.out.printf("Número apostado: %d%n", sorteado);

        do {
            numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 11);
            System.out.println(numeroAleatorio);
            cont++;
        }
        while(sorteado != numeroAleatorio);


        if(cont <= 3){
            System.out.println("Você é MUITO sortudo");
        } else if (cont <=10) {
            System.out.println("Você é sortudo");
        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
        System.out.printf("Quantidade de vezes apostadas: %d%n", cont);
    }
}
