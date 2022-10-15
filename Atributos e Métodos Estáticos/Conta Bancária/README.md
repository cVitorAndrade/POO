## Descrição
### Seu sistema deverá:
* Inicializar.
    - Gerenciar várias classes de Conta Bancária.
    - Cada conta bancária deverá ter um número, titular e um saldo.
    - Cada conta bancária deverá ter um número, titular e um saldo.
    - A conta bancária deve realizar três operações:
        - sacar um valor
        - depositar um valor
        - transferir um valor.

## Shel
init gustavo

$init gustavo

show 0

$show 0

Nro da conta: 0, Titular: gustavo, Saldo: 0.00

deposita 0 1000

$deposita 0 1000

show 0

$show 0

Nro da conta: 0, Titular: gustavo, Saldo: 1000.00

init pedro

$init pedro

show 1

$show 1

Nro da conta: 1, Titular: pedro, Saldo: 0.00

deposita 1 450

$deposita 1 450

show 1

$show 1

Nro da conta: 1, Titular: pedro, Saldo: 450.00

transfere 0 1 200

$transfere 0 1 200

show 0

$show 0

Nro da conta: 0, Titular: gustavo, Saldo: 800.00

show 1

$show 1

Nro da conta: 1, Titular: pedro, Saldo: 650.00

end

$end

init pedro

$init pedro

deposita 0 1000

$deposita 0 1000

show 0

$show 0

Nro da conta: 0, Titular: pedro, Saldo: 1000.00

saca 0 1200

$saca 0 1200

Conta ficou zerada após o saque 1000.00 reais

show 0

$show 0

Nro da conta: 0, Titular: pedro, Saldo: 0.00

end

$end