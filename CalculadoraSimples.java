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
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            op = entrada.nextInt();

            if(op == 1){
                System.out.println("\n\t\t\tSoma\n");
                
                //Entrada
                System.out.println("Informe: N1 ");
                n1 = entrada.nextInt();
                System.out.println("Informe: N2 ");
                n2 = entrada.nextInt();

                //Processamento
                total = n1 + n2;

                //Saida
                System.out.printf("Resultado:%d + %d = %d", n1, n2, total);

            }else if(op == 2){
                System.out.println("\n\t\t\tSubtração\n");
            
                //Entrada
                System.out.println("Informe N1:");
                n1 = entrada.nextInt();
                System.out.println("Informe N2:");
                n2 = entrada.nextInt();

                //Processamento
                total = n1 - n2;

                //saida
                System.out.printf("Resultado: %d - %d = %d", n1, n2, total);

            }else if(op == 3){
                System.out.println("\n\t\t\tMultiplicação\n");

                //Entradas
                System.out.println("Informe N1:");
                n1 = entrada.nextInt();
                System.out.println("Informe N2:");
                n2 = entrada.nextInt();

                //processamento
                total = n1 * n2;

                //saida
                System.out.printf("Resultado: %d * %d = %d", n1, n2, total);

            }else if(op == 4){
                System.out.println("\n\t\t\tDivisão\n");

                //Entradas
                System.out.println("informe N1:");
                n1 = entrada.nextInt();
                System.out.println("informe N2:");
                n2 = entrada.nextInt();

                //Processamento 
                total = n1 / n2;

                //Saida
                System.out.printf("Resultado: %d / %d = %d", n1, n2, total);

            }else if(op == 5){
                System.out.println("\n\t\t\tObrigado, Tchau!\n");
            }else{
                System.out.println("Opção" +op + "invalida");
            }
        }while(op!=5);
    }
}