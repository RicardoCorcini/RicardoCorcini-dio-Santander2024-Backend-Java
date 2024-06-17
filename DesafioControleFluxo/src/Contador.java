import java.util.Scanner;

public class Contador {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo número: ");
        int parametroDois = terminal.nextInt();
        try{
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosExcptions e){
            System.out.println("O segundo poarametro deve ser maior que o segundo");
        }
        terminal.close();
    }
   

static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosExcptions{
    int contagem = parametroDois - parametroUm;
    System.out.println(contagem);
    if (parametroDois <= parametroUm){
        throw new ParametrosInvalidosExcptions();
    } else {
        for (int x = 1 ; x <= contagem ; x++ ) {
            System.out.println("Contagem numero: " + x);
        }
    }

}
}