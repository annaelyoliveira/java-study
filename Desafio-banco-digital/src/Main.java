public class Main {
    public static void main(String[] args) {
        Cliente annaely = new Cliente("Annaely", "123456789");

        Conta cc = new ContaCorrente(annaely);
        Conta poupanca = new ContaPoupanca(annaely);

        // Realizando depósitos e transferências
        cc.depositar(100);
        cc.transferir(50, poupanca);

        // Imprimindo detalhes das transações e extratos
        System.out.println("=== Detalhes das Transações Conta Corrente ===");
        for (Transacao transacao : cc.getTransacoes()) {
            System.out.println(transacao);
        }

        System.out.println("=== Extrato Conta Corrente ===");
        cc.imprimirExtrato();

        System.out.println("=== Detalhes das Transações Conta Poupança ===");
        for (Transacao transacao : poupanca.getTransacoes()) {
            System.out.println(transacao);
        }

        System.out.println("=== Extrato Conta Poupança ===");
        poupanca.imprimirExtrato();
    }
}