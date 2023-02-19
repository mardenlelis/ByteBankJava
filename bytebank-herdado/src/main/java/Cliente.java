public class Cliente implements Autenticavel{

    private AutenticadorGenerico autenticaGenerico;

    public Cliente(){
        this.autenticaGenerico = new AutenticadorGenerico();
    }

    @Override
    public void setSenha(int senha) {
        autenticaGenerico.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
       return this.autenticaGenerico.autentica(senha);
    }
}
