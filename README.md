# 💱 Conversor de Moedas - Java + API ExchangeRate

Este é um projeto simples de conversor de moedas em **Java**, que utiliza a API da [ExchangeRate](https://www.exchangerate-api.com/) para obter as taxas de câmbio em tempo real. Ele possui um menu interativo no console e registra o histórico das conversões feitas durante a execução.

---

## ✨ Funcionalidades

- Menu interativo para seleção de moedas.
- Conversões em tempo real usando API online.
- Histórico de todas as conversões realizadas na sessão.
- Uso da biblioteca **Gson** para parseamento de JSON.
- Estrutura modular e orientada a objetos.

---

## 🚀 Tecnologias Usadas

- Java 17+
- [Gson](https://github.com/google/gson) - Biblioteca para leitura de JSON.
- API pública da ExchangeRate:  
  `https://v6.exchangerate-api.com/v6/6df1720eb621bbb20888a163/latest/USD`

---


## 📥 Instalação

### 1. Clone o repositório

``bash
git clone https://github.com/seu-usuario/conversor-de-moedas.git
cd conversor-de-moedas 

-----------

### 2. Adicione o Gson

<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.10.1</version>
</dependency>

▶️ Como Executar

Compile os arquivos:

javac -cp gson-2.10.1.jar br/com/alura/ConversorDeMoedas/**/*.java

Execute o programa:

java -cp .:gson-2.10.1.jar br.com.alura.ConversorDeMoedas.Principal

No Windows, troque : por ; no classpath.

📋 Exemplo de Uso

=========== CONVERSOR DE MOEDAS ===========
1) Dólar >>> Peso Argentino
2) Peso Argentino >>> Dólar
...
Escolha uma opção: 1
Digite o valor que deseja converter: 100
Valor convertido de USD para ARS: 8765.12

Escolha uma opção: 7

===== HISTÓRICO DE CONVERSÕES =====
Convertido 100.00 USD para 8765.12 ARS
===================================

📚 Estrutura do Projeto

src/
└── br/
    └── com/
        └── alura/
            └── ConversorDeMoedas/
                ├── Metodos/
                │   └── Menu.java
                ├── Conversor.java
                ├── ExchangeRatesResponse.java
                ├── Historico.java
                └── Principal.java

🔐 API Key
Este projeto usa uma chave gratuita da ExchangeRate. Para produção, recomenda-se criar sua própria API Key no site:

📎 https://www.exchangerate-api.com/

🧑‍💻 Autor
Desenvolvido por Adriano Silveira Fernanades da Silva
Sinta-se à vontade para contribuir, sugerir melhorias ou relatar problemas! 🚀


