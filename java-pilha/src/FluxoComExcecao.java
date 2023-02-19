import com.sun.org.apache.bcel.internal.generic.ArithmeticInstruction;

public class FluxoComExcecao{

    public static void main(String[] args){
        System.out.println("Início do main");
        try {
            metodo1();
        }
        catch (ArithmeticException | NullPointerException | MinhaException ex){
            String msg = "";
            msg = ex.getMessage();
            System.out.println("Exception: " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1(){
        System.out.println("Início do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2(){
        System.out.println("Início do metodo2");
        throw  new MinhaException("Algo deu muito errado.");
    }
}

