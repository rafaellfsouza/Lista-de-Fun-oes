<div align="center">

# 🧩 Lista de Exercícios — Métodos (Funções) em Java

**Seis programas em Java dedicados à criação e uso de métodos: parâmetros, retorno, decomposição de responsabilidades e reuso de código.**

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Exercícios](https://img.shields.io/badge/exerc%C3%ADcios-6-7C3AED?style=flat-square)
![Foco](https://img.shields.io/badge/foco-m%C3%A9todos%20e%20fun%C3%A7%C3%B5es-0EA5E9?style=flat-square)

</div>

---

## 📖 Sobre

Lista de exercícios focada em **métodos** — o objetivo é sair do código monolítico dentro do `main` e praticar **decomposição**: cada regra vira uma função com parâmetros tipados e valor de retorno.

## 📚 Exercícios

| Arquivo | Classe | Método principal | O que faz |
|:---|:---|:---|:---|
| `Somadetresnumeros.java` | `SomaTresNumeros` | `int somaTresArgumentos(int a, int b, int c)` | Recebe três inteiros e devolve a soma |
| `Verificanumero.java` | `VerificaNumero` | `char verificarPositivo(int numero)` | Retorna `'P'` se o número for positivo e `'N'` caso contrário |
| `Calculaimposto.java` | `CalculaImposto` | `double somaImposto(double taxaImposto, double custo)` | Aplica a taxa de imposto (%) sobre o custo do item e devolve o valor final |
| `Conversordehorario.java` | `ConversorHorario` | `Object[] converterPara12(int hora, int minuto)`<br/>`void mostrarResultado(...)` | Converte horário do formato 24h para 12h com sufixo A.M./P.M. (meia-noite vira `12 A.M.`), valida intervalo e permite repetir a conversão em laço |
| `PadraoNumericoCrescente.java` | `PadraoNumericoCrescente` | `void imprimirPadrao(int n)` | Imprime padrão crescente — `1` / `1 2` / `1 2 3` / … até `n` linhas |
| `Programaimprimir123.java` | `PadraoNumerico` | `void imprimirPadrao(int n)` | Imprime padrão por linha — cada linha `i` repete o número `i`, `i` vezes |

## 🧠 Conceitos aplicados

- Declaração de métodos `static` com parâmetros e tipos de retorno (`int`, `double`, `char`, `Object[]`, `void`)
- Retorno múltiplo via array (`Object[]`) no conversor de horário
- Separação entre **cálculo** (método puro) e **apresentação** (`mostrarResultado`)
- Validação de entrada com `try/catch` e laço de nova tentativa
- `System.out.printf` para formatação (`%d:%02d %c.M.`, `R$ %.2f`)

## ▶️ Como executar

```bash
git clone https://github.com/rafaellfsouza/Lista-de-Fun-oes.git
cd Lista-de-Fun-oes

javac SomaTresNumeros.java    # ou o nome do arquivo do exercício desejado
java SomaTresNumeros
```

---

<div align="center">

<sub>Desenvolvido por <a href="https://github.com/rafaellfsouza"><b>Rafael Luiz Ferreira de Souza</b></a> · <code>Java</code> <code>Métodos</code> <code>Lógica de Programação</code></sub>

</div>
