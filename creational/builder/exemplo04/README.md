O Builder é um padrão de projeto criacional, que permite a construção de
objetos complexos passo a passo.

Diferente de outros padrões, o Builder não exige que os produtos tenham uma
interface comum. Isso torna possível produzir produtos diferentes usando o
mesmo processo de construção.

O padrão Builder pode ser reconhecido na classe que possui um único método
e criação e vários métodos para configurar o objeto resultante. Os métodos do
Builder geralmente suportam encadeamento (por exemplo,
algumBuilder->configValorA(1)->configValorB(2)->criar()).

# Exemplo04: produção de um automóvel passo a passo

Neste exemplo, o padrão Builder permite a construção passo a passo de
diferentes modelos de carros.

O exemplo também mostra como o Builder produz produtos de diferentes tipos
(manual do carro, o documento com as informações do veículo) usando as mesmas
etapas de construção.

O diretor controla a ordem de construção. Ele sabe quais etapas de construção
chamar para produzir este ou aquele modelo de carro. Ele funciona com builders
apenas por meio de sua interface comum. Isso permite passar diferentes tipos
de builders para o diretor.

O resultado final é recuperado do objeto builder porque o diretor não pode
saber o tipo de produto resultante. Somente o objeto builder sabe o que
exatamente ele cria.
