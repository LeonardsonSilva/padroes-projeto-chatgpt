# GEMINI

🏭 Padrão de Projeto Abstract Factory (Fábrica Abstrata)
O Abstract Factory é um padrão de projeto criacional que lida com a criação de famílias de objetos relacionados.

❓ O que o Padrão de Projeto Abstract Factory resolve?
O principal problema resolvido pelo Abstract Factory é o acoplamento forte entre o código cliente e as classes concretas dos produtos.

Ele resolve a necessidade de:

Garantir a Consistência da Família: Assegura que todos os objetos criados pelo cliente (como Botão, Janela, etc.) pertençam à mesma "família" de produtos (ex: Tema Claro, Tema Escuro, Plataforma Windows). Impede a mistura de produtos incompatíveis.

Isolar o Cliente das Concretizações: Permite que o código que usa os objetos interaja apenas com interfaces (produtos abstratos e a fábrica abstrata), sem precisar saber o nome das classes concretas que estão sendo instanciadas (ex: BotaoClaro, JanelaEscura).

Permitir a Fácil Troca de Famílias: Facilita a mudança do conjunto de produtos utilizados pelo sistema, bastando trocar a fábrica concreta injetada no cliente.

✅ Quais são suas Vantagens?
Baixo Acoplamento: O cliente é desacoplado das classes concretas, dependendo apenas das interfaces da Fábrica e dos Produtos Abstratos.

Consistência Garantida: É o único padrão que garante que os produtos criados em um determinado contexto sejam todos da mesma família.

Extensibilidade (Novas Famílias): Adicionar uma nova família de produtos (ex: um "Tema Azul") não exige modificar o código que usa a fábrica (o cliente), apenas adicionar a nova Fábrica Concreta.

❌ Quais são suas Desvantagens?
Aumento da Complexidade: Para sistemas pequenos, o padrão introduz uma grande quantidade de novas interfaces e classes (Fábrica Abstrata, Fábricas Concretas, Produtos Abstratos e Produtos Concretos), resultando em over-engineering (excesso de engenharia).

Dificuldade em Adicionar Novos Tipos de Produtos: Se você precisar adicionar um novo tipo de produto a todas as famílias (ex: adicionar uma CaixaDeTexto), você terá que modificar:

A interface da Fábrica Abstrata (adicionar o método criarCaixaDeTexto()).

Todas as Fábricas Concretas existentes (implementar o novo método).

🚫 Quando não utilizar o Abstract Factory?
Quando há apenas uma família de produtos: Se o seu sistema só precisar de um conjunto de objetos (ex: sempre Tema Claro), o padrão Factory Method ou um Simple Factory é uma solução mais simples e adequada.

Quando a criação de novos tipos de produtos é muito frequente: Se você prevê que o conjunto de produtos a serem criados mudará constantemente (adicionar ou remover tipos de componentes), o custo de atualizar todas as fábricas concretas se torna proibitivo.

Quando a criação dos objetos é trivial: Se os objetos não têm dependências complexas e podem ser criados com um simples new, o overhead do padrão não se justifica.


---

# CHATGPT

## O que o Padrão de Projeto Abstract Factory resolve?

O **Abstract Factory** resolve o problema de criar **famílias de objetos relacionados** (que devem trabalhar juntos ou manter consistência entre si) **sem acoplar o código às classes concretas**.
Ele permite trocar todo o conjunto de objetos criados apenas mudando a fábrica, mantendo o código cliente independente de implementações específicas.

---

## Quando não utilizar o Abstract Factory?

Você **não deve utilizar** o Abstract Factory quando:

- Existe **apenas uma família de objetos** e não há previsão de criar variantes.
- O sistema é **pequeno ou simples**, e o padrão traria apenas **complexidade desnecessária**.
- Precisa **adicionar novos tipos de produto com frequência** (novos métodos na fábrica exigem mudar todas as fábricas concretas).
- A consistência entre objetos **não é uma preocupação** (eles não precisam “combinar” entre si).
- Uma simples implementação com **injeção de dependência** ou **Factory Method** já resolve o problema.

---

## Quais são suas vantagens?

- ✅ **Desacoplamento** do código cliente em relação às classes concretas.
- ✅ **Criação consistente** de objetos que pertencem à mesma família.
- ✅ **Facilidade para trocar famílias de produtos** (ex.: tema Windows ↔ tema Mac).
- ✅ **Organiza e centraliza a lógica de criação** de objetos.
- ✅ Melhora **testabilidade**, permitindo usar fábricas mock.

---

## Quais são suas desvantagens?

- ❌ **Aumenta a complexidade** do sistema (muitas interfaces/classes).
- ❌ **Menos flexível** para adicionar novos tipos de produtos
  (exige modificar todas as fábricas existentes).
- ❌ Pode ser **overkill** para projetos pequenos ou com poucas variações.
- ❌ Introduz uma **camada indireta** de criação, dificultando a depuração em alguns casos.

---
