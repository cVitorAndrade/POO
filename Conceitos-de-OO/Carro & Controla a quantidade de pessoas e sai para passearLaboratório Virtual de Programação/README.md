Essa atividade se propõe a implementar um carro ecológico que pode passear pela cidade. Ele deve poder embarcar e desembarcar pessoas, colocar combustível e andar.

## Requisitos
### Seu sistema deverá:
* Inicializar.
    - Iniciar de tanque vazio, sem ninguém dentro e com 0 de quilometragem.
    - Para simplificar, nosso carro esportivo suporta até 2 pessoas e seu tanque suporta até 100 litros de água como combustível.

* Entrando e Saindo.
    - Embarcar uma pessoa por vez
    - Desembarcar uma pessoa por vez.
    - Não embarque além do limite ou desembarque se não houver ninguém no carro.

* Abastecer.
    - Abastecer o tanque passando a quantidade de litros de combustível.
    - Caso tente abastecer acima do limite, descarte o valor que passou.

* Dirigir.
    - Caso haja pelo menos uma pessoa no carro e algum combustível, ele deve gastar combustível andando e aumentar a quilometragem.
    - Nosso carro faz um kilômetro por litro de água.
    - Caso não exista combustível suficiente para completar a viagem inteira, dirija o que for possível e emita uma mensagem indicando quanto foi percorrido.

## Shel
#__case inicializar
 O comando "$enter" insere uma pessoa no carro.
 O comando "$leave" retira uma pessoa do carro".
 O comando "$show" mostra o estado do carro.
 Deve ser emitido um erro caso não seja possível inserir ou retirar uma pessoa.
$show

pass: 0, gas: 0, km: 0

$enter

$enter

$show

pass: 2, gas: 0, km: 0

$enter

fail: limite de pessoas atingido

$show

pass: 2, gas: 0, km: 0

$leave

$leave

$leave

fail: nao ha ninguem no carro

$show

pass: 0, gas: 0, km: 0

$end

#__case abastecer

$fuel 60

$show

pass: 0, gas: 60, km: 0


#__case dirigir vazio

$drive 10

fail: nao ha ninguem no carro


#__case dirigir

$enter

$drive 10

$show

pass: 1, gas: 50, km: 10


#__case para longe

$drive 70

fail: tanque vazio apos andar 50 km

$drive 10

fail: tanque vazio

$show

pass: 1, gas: 0, km: 60


#__case enchendo o tanque

$fuel 200

$show

pass: 1, gas: 100, km: 60

$end

#__end__