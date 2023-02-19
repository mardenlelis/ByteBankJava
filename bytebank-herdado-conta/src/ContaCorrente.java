

//new ContaCorrente()
public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorASacar = valor + 0.2;
		try{
			super.saca(valorASacar);
		}catch (SaldoInsuficienteException ex) {
			throw ex;
		}
	}

	@Override
	public void deposita(double valor) {
        super.saldo += valor;
    }
	
}
