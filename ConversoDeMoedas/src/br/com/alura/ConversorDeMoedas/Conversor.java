package br.com.alura.ConversorDeMoedas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;

public class Conversor {

    private static final String API_URL = "https://v6.exchangerate-api.com/v6/6df1720eb621bbb20888a163/latest/USD";

    public static double converter(String de, String para, double valor) {
        try {
            URL url = new URL(API_URL);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            StringBuilder resposta = new StringBuilder();
            String linha;

            while ((linha = in.readLine()) != null) {
                resposta.append(linha);
            }

            in.close();

            Gson gson = new Gson();
            br.com.alura.ConversorDeMoedas.ExchangeRatesResponse exchange = gson.fromJson(resposta.toString(), br.com.alura.ConversorDeMoedas.ExchangeRatesResponse.class);

            double taxaDe = exchange.getConversion_rates().get(de);
            double taxaPara = exchange.getConversion_rates().get(para);

            double valorEmUSD = valor / taxaDe;
            return valorEmUSD * taxaPara;

        } catch (Exception e) {
            System.out.println("Erro ao converter: " + e.getMessage());
            return 0.0;
        }
    }
}
