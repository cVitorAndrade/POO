## Descrição
### Seu sistema deverá:
* Gerenciar um cofrinho do tipo Porquinho capaz de guardar moedas e itens.
*As moedas devem ser criadas através de uma enum.
* Ambos moedas e itens tem um método getVolume() e getDescription().
* O volume do cofre incrementa conforme ele recebe itens e moedas.
* A lógica da utilização do cofre é:
    - Para inserir moedas e itens o cofre deve estar inteiro.
    - Para obter moedas e itens o cofre deve estar quebrado.
    - Ao obter moedas e itens, os atribuitos valor e itens do porco devem ser zerados.

## Shel
$init 20

$show

I:() M:0,0 V:0/20 EQ:false

$addCoin 10

$show

I:() M:0,1 V:1/20 EQ:false

$addCoin 50

$show

I:() M:0,6 V:4/20 EQ:false

$addItem ouro 3

$show

I:(ouro) M:0,6 V:7/20 EQ:false

$addItem passaporte 2

$show

I:(ouro, passaporte) M:0,6 V:9/20 EQ:false

$getItens

You must break the pig first


$getCoins

You must break the pig first

0.0

$show

I:(ouro, passaporte) M:0,6 V:9/20 EQ:false

$breakPig

$getItens

ouro, passaporte

$getCoins

0.6

$show

I:(ouro, passaporte) M:0,6 V:9/20 EQ:true

$end