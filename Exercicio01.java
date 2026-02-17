package school.sptech;

public class Exercicio01 {
    public static void main(String[] args) {

        //Cálculo de Renda

        //Quantidade de Filhos
        Integer crianca = 2; // 0 a 3 anos
        Integer adolescente = 2; // 4 a 16 anos
        Integer adulto = 1; // 17 a 18 anos

        //Quantidade total de Filhos
        Integer totalFilhos = crianca + adolescente + adulto;

        //Valores da bolsa
        Float bolsaCrianca = 25.12f; //0 a 3 anos
        Float bolsaAdolescente = 15.88f; //4 a 16 anos
        Float bolsaAdulto = 12.44f; // 17 a 18 anos

        //Valor total da bolsa
        Float bolsaFilhos = (crianca * bolsaCrianca) + (adolescente * bolsaAdolescente) + (adulto * bolsaAdulto);

        String mensagem  = ("Você tem um total de %d filhos e vai receber R$ %.2f de bolsa");

        System.out.println(mensagem.formatted(totalFilhos, bolsaFilhos));

    }
}
