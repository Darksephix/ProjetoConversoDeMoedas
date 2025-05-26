package br.com.alura.ConversorDeMoedas;

import java.util.ArrayList;
import java.util.List;

public class Historico {

    private List<String> registros;

    public Historico() {
        this.registros = new ArrayList<>();
    }

    public void adicionar(String de, String para, double valorOriginal, double valorConvertido) {
        String registro = String.format("Convertido %.2f %s para %.2f %s",
                valorOriginal, de, valorConvertido, para);
        registros.add(registro);
    }

    public void exibir() {
        if (registros.isEmpty()) {
            System.out.println("Nenhuma conversão registrada ainda.");
        } else {
            System.out.println("===== HISTÓRICO DE CONVERSÕES =====");
            for (String registro : registros) {
                System.out.println(registro);
            }
            System.out.println("===================================");
        }
    }
}
