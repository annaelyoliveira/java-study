public class Main {
    public static void main(String[] args) {
        Cliente annaely = new Cliente("Annaely", "123456789");
        annaely.setNome("Annaely");
        annaely.setCpf("123456789");
        
        Conta cc = new ContaCorrente(annaely);
        Conta poupanca = new ContaPoupanca(annaely);

        cc.depositar(0);
        cc.transferir(100, poupanca);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}