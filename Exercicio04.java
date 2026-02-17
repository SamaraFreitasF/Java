package school.sptech;

public class Exercicio04 {
    public static void main(String[] args) {
        //  Cálculo de Média

        String nome = "Samara";
        Float nota1 = 10f;
        Float nota2 = 8f;

        Float media = (nota1 + nota2) / 2;

        String mensagem = ("Olá, %s. Sua média foi de %.2f");

        System.out.println(mensagem.formatted(nome, media));


    }
}
