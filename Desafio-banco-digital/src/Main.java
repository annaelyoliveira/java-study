public class Main {

	public static void main(String[] args) {
		Cliente annaely = new Cliente();
		annaely.setNome("Annaely");
		
		Conta cc = new ContaCorrente(annaely);
		Conta poupanca = new ContaPoupanca(annaely);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}