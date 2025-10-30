# GEMINI

# 🏭 Padrão de Projeto: Factory Method (Método de Fábrica)
O Factory Method é um padrão Criacional (do GoF - Gang of Four) que lida com a criação de objetos, mas delega a responsabilidade de qual classe concreta instanciar para as subclasses.

# 1. O que o Factory Method Resolve?
O principal problema resolvido pelo Factory Method é o acoplamento forte e a dependência entre o código cliente (que usa o objeto) e as classes concretas do objeto (o Produto).

Acoplamento Forte: Sem o Factory Method, o código cliente usa o operador new diretamente. Se o tipo de objeto a ser criado mudar, o código cliente deve ser modificado em todos os lugares.

Violação do OCP (Princípio Aberto/Fechado): O padrão garante que uma classe seja aberta para extensão (adicionar novos produtos via novas subclasses) e fechada para modificação (o código de uso na classe criadora abstrata permanece inalterado).

Encapsulamento da Lógica de Criação: A lógica de qual classe deve ser instanciada é centralizada e delegada às subclasses da fábrica, em vez de estar espalhada pelo código da aplicação.

# 2. Quais são suas Vantagens?
Alto Desacoplamento: O código cliente interage apenas com a interface do produto (o Produto) e a interface do criador (Criador), sem conhecer os detalhes da classe que está sendo criada.

Extensibilidade e Conformidade com o OCP: É fácil introduzir novos produtos. Para adicionar um novo tipo de objeto, você simplesmente adiciona uma nova Classe de Produto Concreto e uma nova Subclasse Criadora, sem alterar as classes existentes.

Separação de Preocupações: O método principal que usa o produto (processarPedido no exemplo do frete) permanece limpo e focado na lógica de negócio, sem se preocupar com a lógica de instancialização.

# 3. Quais são suas Desvantagens?
A principal desvantagem é o aumento da complexidade estrutural (Verboseza).

Aumento da Verboseza: O padrão exige a criação de uma hierarquia paralela de classes. Para cada Produto Concreto (ex: FreteEUA), você precisa de um Criador Concreto (ex: FabricaFreteEUA). Isso aumenta significativamente o número de classes no projeto.

Complexidade Excessiva para Casos Simples: Se a lógica de criação for muito simples e o sistema tiver poucas variações, o custo de configurar e manter a hierarquia de Criadores Abstratos e Concretos supera os benefícios de flexibilidade.

Acoplamento à Hierarquia do Criador: Embora resolva o acoplamento ao Produto, o código cliente fica acoplado ao Criador Concreto que ele escolhe (new FabricaFreteBrasil()).

# 4. Quando Não Utilizar o Factory Method?
O Factory Method deve ser evitado quando a complexidade introduzida for desnecessária para o problema:

Lista de Produtos Estática: Se você sabe que a aplicação não precisará de novos tipos de produtos no futuro (ou que as mudanças serão muito raras).

O Objetivo é Apenas a Concisão: Se a meta é apenas limpar o código do new e centralizar a lógica de criação (como em métodos utilitários), o Simple Factory (o método estático com if/else) ou um Static Factory Method (como List.of() do Java) são soluções mais concisas e adequadas.

A Abstração Não é Necessária: Se o código de uso e o código de criação estão embutidos em uma única classe e não há necessidade de delegar a criação, o new direto ou o Simple Factory são suficientes.


---

# CHATGPT

## O que o Factory Method resolve?

O padrão **Factory Method** resolve o problema de criação de objetos de forma desacoplada, permitindo que o código cliente dependa de **abstrações** e não de **implementações concretas**.
Ele centraliza e delega a responsabilidade de criar objetos a subclasses, facilitando a substituição ou adição de novos tipos sem modificar o código existente.

Em resumo, ele resolve:
- Acoplamento entre código cliente e classes concretas.
- Dificuldade de estender o sistema com novos tipos.
- Uso excessivo de `new` espalhado pelo código.
- Violação do Princípio Aberto/Fechado (OCP).

---

## Quando **não** utilizar o Factory Method?

Evite usar quando:
- Há **apenas uma implementação** possível do objeto.
- A criação do objeto é **simples e direta** (`new Objeto()` é suficiente).
- O sistema é pequeno ou não requer extensibilidade.
- O uso do padrão adicionará complexidade desnecessária (over-engineering).
- Você já utiliza **Injeção de Dependência/IoC**, que resolve a criação de forma mais simples.

---

## Vantagens

- Reduz acoplamento entre classes.
- Facilita extensão do sistema com novos tipos de objetos.
- Centraliza e organiza a criação de objetos.
- Melhora testabilidade (mockando fábricas).
- Segue princípios SOLID, especialmente:
  - OCP (Open/Closed Principle)
  - DIP (Dependency Inversion Principle)

---

## Desvantagens

- Aumenta o número de classes no projeto.
- Adiciona complexidade estrutural — pode ser *overkill* em projetos pequenos.
- Curva de aprendizado maior para iniciantes.
- Pode dificultar a leitura se aplicado sem necessidade real.

