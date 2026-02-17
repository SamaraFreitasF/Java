package school.sptech;

public class Exercicio02 {
    public static void main(String[] args) {

        String nome = "Jorge";
        // Minutos Jorge

        Integer aquecimentoMin = 20;
        Integer aerobicosMin = 60;
        Integer musculacaoMin = 30;

        Integer minExercicios = aquecimentoMin + aerobicosMin + musculacaoMin;

        // Calorias
        Integer kcalAquecimento = 12;
        Integer kcalAerobicos = 20;
        Integer kcalMusculacao = 25;

        Integer caloriasGastas = ((aquecimentoMin * kcalAquecimento) + (aerobicosMin * kcalAerobicos) + (musculacaoMin * kcalMusculacao));

        String mensagem =("Olá, %s. Você fez um total de %d minutos de exercícios e perdeu cerca de %d calorias.");

        System.out.println(mensagem.formatted(nome, minExercicios, caloriasGastas));

   }
}
