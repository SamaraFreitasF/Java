package school.sptech;

public class Exercicio05 {
    public static void main(String[] args) {

        Integer n1 = 2;
        Integer n2 = 5;
        Integer cont = 1;
        Integer potencia = 1;

        while (cont <= n2){
            potencia = potencia * n1;
            cont++;
        }
        System.out.println("O resultado da Potenciação é: " + potencia);
        //System.out.println("Potenciação: " + (Math.pow(n1, n2)));

    }
}
