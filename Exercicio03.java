package school.sptech;

public class Exercicio03 {
    public static void main(String[] args) {
        // Cálculo de Troco

        Double produto = 5.50d;
        Integer quantidade = 10;
        Double valorPago = 80d;

        Double troco = (valorPago - (produto * quantidade));

        String mensagem = ("Seu troco será de R$ %.2f, onde %.2f  é o valor a ser devolvido ao cliente.");

        System.out.println(mensagem.formatted(troco, troco));
    }
}
