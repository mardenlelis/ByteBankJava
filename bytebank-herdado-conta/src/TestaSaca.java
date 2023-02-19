public class TestaSaca {
    public static void main(String[] args) throws SaldoInsuficienteException{
        Conta conta = new ContaCorrente(123, 321);

        conta.deposita(1000);

        try{
            conta.saca(1021);
        }catch (SaldoInsuficienteException ex){
            throw ex;
        }

        System.out.println(conta.getSaldo());
    }
}
