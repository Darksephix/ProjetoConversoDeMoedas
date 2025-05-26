package br.com.alura.ConversorDeMoedas;

import br.com.alura.ConversorDeMoedas.Metodos.Menu;
import java.util.HashMap;
import java.util.Map;

public class Principal {

    public static void main(String[] args) {

        Map<String, String[]> opcoes = new HashMap<>();
        opcoes.put("1", new String[]{"USD", "ARS"});
        opcoes.put("2", new String[]{"ARS", "USD"});
        opcoes.put("3", new String[]{"USD", "BRL"});
        opcoes.put("4", new String[]{"BRL", "USD"});
        opcoes.put("5", new String[]{"USD", "COP"});
        opcoes.put("6", new String[]{"COP", "USD"});

        Historico historico = new Historico();

        while (true) {
            Menu menu = Menu.exibirMenu();

            if (menu.getMoedaSelecionada().equals("7")) {
                System.out.println("\nSaindo do programa...");
                historico.exibir();
                break;
            }

            String[] moedas = opcoes.get(menu.getMoedaSelecionada());

            if (moedas == null) {
                System.out.println("Opção inválida.\n");
                continue;
            }

            double resultado = Conversor.converter(moedas[0], moedas[1], menu.getValor());

            System.out.printf("Valor convertido de %s para %s: %.2f%n%n",
                    moedas[0], moedas[1], resultado);

            historico.adicionar(moedas[0], moedas[1], menu.getValor(), resultado);
        }
    }
}
