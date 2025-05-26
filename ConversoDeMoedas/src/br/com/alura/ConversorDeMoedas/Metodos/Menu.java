package br.com.alura.ConversorDeMoedas.Metodos;

import java.util.Scanner;

public class Menu {

    private String moedaSelecionada;
    private double valor;

    public String getMoedaSelecionada() {
        return moedaSelecionada;
    }

    public void setMoedaSelecionada(String moedaSelecionada) {
        this.moedaSelecionada = moedaSelecionada;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public static Menu exibirMenu() {
        Scanner leitura = new Scanner(System.in);
        Menu menu = new Menu();

        System.out.println("*******************************************");
        System.out.println("=========== CONVERSOR DE MOEDAS ===========");
        System.out.println("1) Dólar >>> Peso Argentino");
        System.out.println("2) Peso Argentino >>> Dólar");
        System.out.println("3) Dólar >>> Real Brasileiro");
        System.out.println("4) Real Brasileiro >>> Dólar");
        System.out.println("5) Dólar >>> Peso Colombiano");
        System.out.println("6) Peso Colombiano >>> Dólar");
        System.out.println("7) Sair");
        System.out.println("*******************************************");

        System.out.print("Escolha uma opção: ");
        menu.setMoedaSelecionada(leitura.nextLine());

        if (!menu.getMoedaSelecionada().equals("7")) {
            System.out.print("Digite o valor que deseja converter: ");
            menu.setValor(leitura.nextDouble());
        }

        return menu;
    }
}
