# Projeto de Conta Digital #
Este é um projeto de conta digital feito para o Bootcamp Santander Back end Java pela DIO, que simula um sistema bancário básico, permitindo operações como depósitos, saques, transferências e consultas de extratos. O projeto foi desenvolvido em Java e segue princípios de programação orientada a objetos.

## Funcionalidades ##
Criação de Cliente: Permite criar clientes com nome e CPF.
Contas Bancárias: Oferece tipos de contas como Conta Corrente e Conta Poupança.
Operações Bancárias: Inclui operações básicas como depósito, saque e transferência entre contas.
Histórico de Transações: Registra e imprime detalhes de todas as transações realizadas.

# Estrutura do Projeto #
## Classes Principais ##
### Cliente ###

* Representa um cliente bancário com informações como nome e CPF.
### Conta ###

* Classe abstrata que define operações básicas de uma conta bancária.
* Contém uma lista de transações realizadas na conta.

### ContaCorrente e ContaPoupanca ### 

* Implementações concretas da classe Conta.
* ContaCorrente pode incluir um limite e taxas de manutenção.
* ContaPoupanca é uma conta com características típicas de uma poupança.

### Transacao ###

* Representa uma transação realizada na conta, incluindo tipo (depósito, saque, transferência), valor e data.
### Banco ### 

* Gerencia uma lista de contas e o nome do banco.
### Main ### 

* Classe principal que demonstra o funcionamento do sistema com exemplos de operações bancárias.

## Exemplo de Saída ##
```
=== Detalhes das Transações Conta Corrente ===
Depósito: 100.00 em 25/07/2024 14:22:00
Transferência para conta 2: 50.00 em 25/07/2024 14:22:00

=== Extrato Conta Corrente ===
Titular: Annaely
Agência: 1
Número: 1
Saldo: 50.00
Transações:
Depósito: 100.00 em 25/07/2024 14:22:00
Transferência para conta 2: 50.00 em 25/07/2024 14:22:00

=== Detalhes das Transações Conta Poupança ===
Depósito: 50.00 em 25/07/2024 14:22:00

=== Extrato Conta Poupança ===
Titular: Annaely
Agência: 1
Número: 2
Saldo: 50.00
Transações:
Depósito: 50.00 em 25/07/2024 14:22:00
