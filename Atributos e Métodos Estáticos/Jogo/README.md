## Descrição
Nosso jogo consiste em um tabuleiro contendo uma trilha de quadrados e um conjunto de peças coloridas. No início do jogo, cada jogador recebe uma peça; todas as peças são inicialmente posicionadas logo antes da primeira casa da trilha.

O jogo prossegue em rodadas. Em cada rodada, os jogadores rolam um par de dados e movem suas peças para frente um número de quadrados igual ao resultado obtido pelos dados. Os jogadores rolam os dados sempre na mesma ordem (jogador A, depois jogador B, etc.) nas rodadas. A maioria dos quadrados no tabuleiro são quadrados simples, mas alguns são “armadilhas”. Se a peça de um jogador cair em um quadrado da armadilha no final do movimento do jogador, o jogador perde a próxima rodada. Ou seja, ela/ele não jogue os dados, e sua peça fica uma rodada sem se mover.

Haverá exatamente três armadilhas na trilha.

O vencedor do jogo é o jogador cuja peça chega primeiro ao final da trilha. O fim da trilha é depois da última casa do tabuleiro. Considere, por exemplo, a placa da figura acima, que tem quadrados numerados de 1 a 48. No início, as peças são posicionadas no local marcado como ‘Início’, ou seja, antes do quadrado número 1. Portanto, se um jogador rolar um 7 (dados mostrando 2 e 5 por exemplo), sua peça é posicionada na casa número 7 no final da primeira rodada do jogo. Além disso, se a peça de um jogador estiver posicionada na casa 41, o jogador precisa de um resultado de rolagem de pelo menos 8 para chegar ao final da trilha e ganhar o jogo.Observe também que não haverá empate no jogo.

## Shel

$init 2 10

$addArmadilha 2

$addArmadilha 4

$addArmadilha 8

$show

PosJogador[1] = 0

PosJogador[2] = 0


$addMove 1 1

O jogador 1 vai para a casa 2

O jogador 1 caiu em um armadilha

$addMove 3 4

O jogador 2 vai para a casa 7

$addMove 1 2

O jogador 1 passa a vez

O jogador 2 vai para a casa 10

$addMove 6 5

O jogador 1 vai para a casa 13

O jogador 1 venceu o jogo

show

$show

PosJogador[1] = 13

PosJogador[2] = 10


$addMove 3 7

O jogo acabou

$end
