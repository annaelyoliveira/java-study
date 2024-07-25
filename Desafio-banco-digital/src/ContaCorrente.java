public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		
		super.imprimirInfosComuns();
	}
	
	private double limite;
    
    public ContaCorrente(Cliente cliente, double limite, double taxaDeManutencao) {
        super(cliente);
        this.limite = limite;
        
    }
	public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
