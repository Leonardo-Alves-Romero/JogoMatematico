package view;

import main.calculos;

import java.util.Scanner;

public class Jogo {
    static Scanner input = new Scanner(System.in);
    static int pontos = 0;
    static calculos calculos;

    public static void main(String[] args) {
        Jogo.play();
    }

    public static  void play() {
        System.out.println("Informe o nível de dificuldade desejado [1 ou 2]: ");
        int nível = Jogo.input.nextInt();

        Jogo.calculos = new calculos(nível);

        System.out.println("Informe o resultado para a seguinte operação: ");

        //somar
        if(calculos.getOperacao() == 0) {
            System.out.println(calculos.getValor1() + " + " +calculos.getValor2());
            int resposta = Jogo.input.nextInt();

            if(calculos.somar(resposta)) {
                Jogo.pontos += 1;
                System.out.println("Voçê tem " + Jogo.pontos + "ponto(s).");
            }
        }

        //subtrair
        if(calculos.getOperacao() == 0) {
            System.out.println(calculos.getValor1() + " - " +calculos.getValor2());
            int resposta = Jogo.input.nextInt();

            if(calculos.subtrair(resposta)) {
                Jogo.pontos += 1;
                System.out.println("Voçê tem " + Jogo.pontos + "ponto(s).");
            }
        }

        //multiplicar
        if(calculos.getOperacao() == 0) {
            System.out.println(calculos.getValor1() + " * " +calculos.getValor2());
            int resposta = Jogo.input.nextInt();

            if(calculos.multiplicar(resposta)) {
                Jogo.pontos += 1;
                System.out.println("Voçê tem " + Jogo.pontos + "ponto(s).");
            }
        }else {
            System.out.println("A operação " + calculos.getOperacao() + "não é reconhecida.");
        }

        System.out.println("Deseja continuar? [1 - sim, 2 - não]");
        int continuar = Jogo.input.nextInt();

        if(continuar == 1) {
            Jogo.play();
        }else {
            System.out.println("Você fez " + Jogo.pontos + " ponto(s).");
            System.out.println("Até a próxima!");
            System.exit(2);
        }
    }
}
