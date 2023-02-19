public class Gerente extends Funcionario implements Autenticavel {

	private AutenticadorGenerico autenticadorGenerico;

	public Gerente(){
		this.autenticadorGenerico = new AutenticadorGenerico();
	}

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do GERENTE");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticadorGenerico.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticadorGenerico.autentica(senha);
	}
}
