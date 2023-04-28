import java.util.Scanner;

public class CalculadoraSimples{
    public static void main(String[] args) {
        //declaração de variante
        int n1, n2, total, op;

        //Criação e instancia do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        do{
            System.out.println("\n\t\t\t--CalcuLdora Simples--\n");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            op = entrada.nextInt();

            if(op == 1){
                System.out.println("\n\t\t\tSoma\n");
            } else if(op == 2){
                System.out.println("\n\t\t\tSubtração\n");
            } else if(op == 3){
                System.out.println("\n\t\t\tForte Abraço!\n");
            } else{
                System.out.println("Opção" +op + "incorreta");
            }
        }while(op!=3);
    }
}