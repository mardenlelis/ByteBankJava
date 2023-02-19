public class TestaConexao {

    public static void main(String[] args) throws Exception {

       // Conexao con = null;

       // try{
       //     con = new Conexao();

       //     con.leDados();

       // }catch (IllegalStateException ex){
       //     throw ex;
       // }finally {
       //     if(con != null){
       //         con.close();
       //     }
       // }

        try(Conexao conexao = new Conexao()){
            conexao.leDados();
        }catch (IllegalStateException ex){
            System.out.println("Deu erro na conexão.");
        }

    }

}
