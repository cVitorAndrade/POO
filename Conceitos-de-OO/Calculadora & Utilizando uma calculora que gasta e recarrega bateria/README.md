O objetivo dessa atividade é implementar uma calculadora a bateria. Se há bateria, ela executa operações de soma, multiplicação e divisão. É possível também mostrar a quantidade de bateria e recarregar a calculadora. Ela avisa quando está sem bateria e se há tentativa de divisão por 0.

## Requisitos
* Mostrar bateria da calculadora.
* Recarregar a bateria.
* Realizar opera��es matem�ticas de soma e divis�o.
* Se o usu�rio tentar realizar opera��es e a bateria estiver vazia, dever� ser mostrada uma notifica��o sobre falta de bateria.
* Se for tentada divis�o por zero, deve ser notificado o erro.

## Shel
* case iniciar mostrar e recarregar
* O comando "$init M" inicia uma calculadora passando por parâmetro a bateria máxima.
* O comando "$show" mostra o valor da última operação bem sucedida no display e o estado da bateria
* O comando "$charge V" recarrega a bateria de V


$init 5  

$show  

display = 0.00, battery = 0 

$charge 3 

$show

display = 0.00, battery = 3

$charge 1

$show

display = 0.00, battery = 4

$charge 2

$show

display = 0.00, battery = 5

$init 4

$charge 2

$show

display = 0.00, battery = 2

$charge 3

$show

display = 0.00, battery = 4

$end 
   
#__case somando

$init 2

$charge 2

$sum 4 3

$show

display = 7.00, battery = 1

$sum 2 3

$show

display = 5.00, battery = 0

$sum -4 -1

fail: bateria insuficiente

$charge 1

$show

display = 5.00, battery = 1

$sum -4 -2

$show

display = -6.00, battery = 0

$end

#__case dividindo

$init 3

$charge 3

$div 6 3

$div 7 0

fail: divisao por zero

$show

display = 2.00, battery = 1

$div 7 2

$div 10 2

fail: bateria insuficiente

$show

display = 3.50, battery = 0

$end