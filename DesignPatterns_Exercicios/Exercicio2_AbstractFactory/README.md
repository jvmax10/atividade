# Exercício 2 — Abstract Factory

Padrão utilizado: **Abstract Factory (GoF)**.

Cada fábrica concreta representa um país e cria a família completa de três produtos daquele país: documento fiscal, pagamento e etiqueta. `Checkout.finalizar()` recebe apenas a fábrica e cria os três artefatos a partir dela, evitando combinações entre países.

A seleção da fábrica usa convenção de nomes em `SeletorFabrica`, sem `if/switch` por país no checkout.

## Compilação
```bash
javac -d out $(find src -name "*.java")
java -cp out client.Main
```
