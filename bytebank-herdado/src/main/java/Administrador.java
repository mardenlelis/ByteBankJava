package main.java;

public class Administrador extends Funcionario implements Autenticavel{

    private AutenticadorGenerico autenticadorGenerico;

    public Administrador(){
        this.autenticadorGenerico = new AutenticadorGenerico();
    }

    @Override
    public double getBonificacao() {
        return 50;
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
