O visitor é ótimo para adicionar operações, mas ele tem um custo: a estrutura de objetos (os Elementos) se torna rígida.

1 - Dificuldade em adicionar novos tipos de elementos (no exemplo01, a forma geométrica). Se for necessário adicionar
um novo tipo de forma, digamos Losango, é obrigatório modificar todas as interfaces e classes Visitante (Ex. Exportador,
ExportadorJSON, ExportadorXML) para adicionar um novo método visitar(Losango losango).
Conclusão: o visitor é excelente para adicionar novas operações, mas é ruim para adicionar novos tipos de Elementos.

2 - Violação de Encapsulamento. O visitante geralmente precisa acessar o estado interno dos Elementos (ex: c.raio no ExportarJSON).
Para fazer isso, muitas vezes os campos precisam ser declarados como public ou métodos getters expostos, o que pode
enfraquecer o encapsulamento dos Elementos.

3 - Complexidade inicial. É um padrão mais complexo de implementar do que simplesmente adicionar um método a cada classe.
O mecanismo de Dupla Distribuição (Elemento.aceitar(Visitante) que chama Visitante.visitar(Elemento)) pode confundir iniciantes.

# Quando não utilizar o Visitor

- Sua estrutura de classes (os Elementos) muda frequentemente: se você adicionar novos tipos de Elementos com mais
frequência do que novas operações, não use o Visitor. Prefira a aobrdadgem tradicional ou um padrão como o Strategy.

- A operação precisa de muito estado transitório: se a nova operação precisar armazenar muitos dados complexos entre as visitas
a diferentes elementos, pode ser melhor colocar a lógica diretamente nos Elementos.

- Encapsulamento estrito é crítico: se você não pode expor nenhum detalhe interno dos Elementos ao Visitante, o padrão não funcionará de forma eficiente.
