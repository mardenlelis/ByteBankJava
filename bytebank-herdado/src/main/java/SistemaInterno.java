public class SistemaInterno implements Autenticavel{

    private int senha = 2222;

    public SistemaInterno(){this.autenticadorGenerico = new AutenticadorGenerico();}

    private AutenticadorGenerico autenticadorGenerico;

    public void autentica(Autenticavel fa){
        boolean autenticou = fa.autentica(this.senha);

        if(autenticou){
            System.out.println("Pode entrar no sistema");
        }else{
            System.out.println("Não pode entrar no sistema");
        }
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
