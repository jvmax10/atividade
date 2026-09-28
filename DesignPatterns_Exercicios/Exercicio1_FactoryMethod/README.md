# Exercício 1 — Factory Method

Padrão utilizado: **Factory Method (GoF)**.

O cliente seleciona o criador por convenção de nome (`CriadorAuto`, `CriadorResidencial`, `CriadorVida`, `CriadorViagem`) usando `SeletorCriador`, sem instanciar produtos concretos. O algoritmo de contratação fica centralizado em `CriadorApolice.processarContratacao`, que é `final`.

Para adicionar uma quinta linha, basta criar uma nova subclasse de `Apolice`, uma nova subclasse de `CriadorApolice` e registrar/usar a classe seguindo a convenção de nomes; as classes existentes não precisam ser alteradas.

## Compilação
```bash
javac -d out $(find src -name "*.java")
java -cp out client.Main
```
