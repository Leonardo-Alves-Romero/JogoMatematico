package main;

import java.util.Random;

public class calculos {
    private int nivel;
    private int valor1;
    private int valor2;
    private int operacao;
    private int resultado;

    public calculos(int nivel) {
        Random random = new Random();
        this.operacao = random.nextInt(2); //0-somar, 1-diminuir, 2-muitiplicar
        this.nivel = nivel;

        if(nivel == 1){
            //fácil
            this.valor1 = random.nextInt(10);
            this.valor2 = random.nextInt(10);
        }else {
            this.valor1 = random.nextInt(100);
            this.valor2 = random.nextInt(100);
        }
    }

    public int getValor1() {
        return valor1;
    }

    public int getNivel() {
        return nivel;
    }

    public int getValor2() {
        return valor2;
    }

    public int getOperacao() {
        return operacao;
    }

    public int getResultado() {
        return resultado;
    }

    public String toString() {
        String opcao;
        if(this.getOperacao() == 0) {
            opcao = "Somar";
        }else if(this.getOperacao()  == 1) {
            opcao = "Subtrair";
        }else if(this.getOperacao() == 2) {
            opcao = "Multiplicar";
        }else {
            opcao = "Opção inválida";
        }


        return "valor 1: " + this.getValor1()
                + "\nvalor2: " + this.getValor2()
                + "\nOperação: " + opcao
                + "\nDificuldade: " + this.getNivel();
    }

    public boolean somar(int valor) {
        this.resultado = this.getValor1() + this.getValor2();
        boolean certo = false;

        if(valor == this.getResultado()) {
            System.out.println("Resposta correta!");
            certo = true;
        }else {
            System.out.println("Estude mais!");
        }
        System.out.println(this.getValor1() + " + " + this.getValor2() + " = " + this.getResultado());
        return certo;
    }

    public boolean subtrair(int resposta) {
        this.resultado = this.getValor1() - this.getValor2();
        boolean certo = false;

        if (resposta == this.getResultado()) {
            System.out.println("Resposta correta!");
            certo = true;
        } else {
            System.out.println("Estude mais!");
        }
        System.out.println(this.getValor1() + " - " + this.getValor2() + " = " + this.getResultado());
        return certo;
    }

    public boolean multiplicar(int valor) {
        this.resultado = this.getValor1() * this.getValor2();
        boolean certo = false;

        if (valor == this.getResultado()) {
            System.out.println("Resposta correta!");
            certo = true;
        } else {
            System.out.println("Estude mais!");
        }
        System.out.println(this.getValor1() + " * " + this.getValor2() + " = " + this.getResultado());
        return certo;
    }
}
