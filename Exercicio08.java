package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Exercicio08 {

    // Votacao

    public static void main(String[] args) {

        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer quatroQueijos = 0;

        for(Integer i = 0; i < 10; i++){
            Integer sorteio = ThreadLocalRandom.current().nextInt(1,4 );

            if(sorteio == 1){
                mussarela++;
            }else if (sorteio == 2){
                calabresa++;
            }else{
                quatroQueijos++;
            }
        }

        System.out.println("Quantidade de Votos: Mussarela: " + mussarela);
        System.out.println("Quantidade de Votos: Calabresa: " + calabresa);
        System.out.println("Quantidade de Votos: Quatro Queijos: " + quatroQueijos);

        if(mussarela > calabresa && mussarela > quatroQueijos){
            System.out.println("Sabor Favorito: Mussarela");
        }

        else if(calabresa > mussarela && calabresa > quatroQueijos){
            System.out.println("Sabor Favorito: Calabresa");
        }

        else if(quatroQueijos > mussarela && quatroQueijos > calabresa){
            System.out.println("Sabor Favorito: Quatro Queijos");
        }
        else {
            System.out.println("Houve um empate");
        }
    }
}
