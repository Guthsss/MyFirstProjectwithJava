# My First Project with Java - Corner Shop Net Income Calculator

Um utilitário simples em Java desenvolvido para auxiliar na contabilidade básica de uma pequena loja de conveniência, calculando os ganhos totais por item e o lucro líquido final com base nas despesas operacionais informadas.

---

### Funcionalidades

- **Cálculo de Renda Bruta:** Exibe a lista de itens vendidos (chicletes, doces, sorvetes, chocolates, donuts e panquecas) e calcula a receita total acumulada.
- **Entrada de Despesas:** Permite ao usuário informar os custos com equipe (*staff expenses*) e outras despesas operacionais (*other expenses*).
- **Cálculo de Lucro Líquido (*Net Income*):** Subtrai as despesas totais da receita bruta para apresentar o balanço financeiro final.

---

### Tecnologias e Ferramentas

- **Linguagem:** Java 11+
- **Gerenciador de Build:** Gradle
- **Origem:** Projeto prático da trilha de Java do JetBrains Academy / Hyperskill

---

### Estrutura do Código

O ponto de entrada da aplicação está localizado em:
`My First Project with Java/task/src/calculator/Main.java`

---

### Como Executar

#### Pré-requisitos
- JDK 11 ou superior instalado e configurado no `PATH`.

#### Opção 1: Executando diretamente com o compilador Java
Navegue até o diretório do código-fonte e execute:

```bash
cd "My First Project with Java/task/src"
javac calculator/Main.java
java calculator.Main
```

#### Opção 2: Executando via Gradle
Na raiz do projeto:

- **Linux / macOS:**
  ```bash
  ./gradlew run
  ```
- **Windows (PowerShell ou CMD):**
  ```powershell
  .\gradlew.bat run
  ```

---

### Exemplo de Execução

```text
Earned amount:
Bubblegum:  $202.0
Toffee:  $118.0
Ice cream:  $2250.0
Milk chocolate:  $1680.0
Doughnut:  $1075.0
Pancake:  $80.0
Income: $5405.0
Staff expenses:
> 1000
Other expenses:
> 200
Net income: $4205.0
```

---

### Licença
Este projeto foi desenvolvido para fins educacionais e de prática em programação Java.
