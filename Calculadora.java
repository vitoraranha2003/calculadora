import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while(true){
            System.out.println("======================");
            System.out.println("      CALCULADORA");
            System.out.println("======================");
            System.out.println("[0] Somar");
            System.out.println("[1] Subtrair");
            System.out.println("[2] Multiplicar");
            System.out.println("[3] Dividir");
            System.out.println("[4] Sair do programa");
            System.out.println("======================");
            System.out.print("Selecione uma operacao:");
            Integer operacao = scanner.nextInt();



            if (operacao==0){
                System.out.print("Digite um numero:");
                Double num1 = scanner.nextDouble();
                System.out.print("Digite outro numero:");
                Double num2 = scanner.nextDouble();
                Double soma = num1+num2;
                System.out.printf("(%.2f) + (%.2f) = %.2f ",num1,num2,soma);
            }



            if (operacao==1){
                System.out.print("Digite um numero:");
                Double num1 = scanner.nextDouble();
                System.out.print("Digite outro numero:");
                Double num2 = scanner.nextDouble();
                Double subtracao = num1-num2;
                System.out.printf("(%.2f) - (%.2f) = %.2f ",num1,num2,subtracao);
                }



            if (operacao==2){
                System.out.print("Digite um numero:");
                Double num1 = scanner.nextDouble();
                System.out.print("Digite outro numero:");
                Double num2 = scanner.nextDouble();
                Double multiplicacao = num1*num2;
                System.out.printf("(%.2f) x (%.2f) = %.2f",num1,num2,multiplicacao);
            }



            if (operacao==3){
                System.out.print("Digite um numero:");
                Double num1 = scanner.nextDouble();
                System.out.print("Digite outro numero:");
                Double num2 = scanner.nextDouble();
                Double divisao = num1/num2;
                System.out.printf("(%.2f)  ÷ (%.2f) = %.2f",num1,num2,divisao);
            }



            if (operacao==4){
                System.out.println("Fim do programa");
                break;
            }



            if(operacao!=0){
                if(operacao!=1){
                    if(operacao!=2){
                        if(operacao!=3){
                            if(operacao!=4){
                                System.out.println("ERRO.Digite um numero valido.");
                                continue;
                            }
                        }
                    }
                }
            }



            System.out.println();
            System.out.print("Quer continuar? [Ss/Nn]");
            String escolha = scanner.next();
            if (escolha.contains("Nn")){
                System.out.println("Fim do programa");
                break;
            }
            if (escolha.contains("Ss")){
                continue;
            }
            else{
                System.out.println("Resposta invalida. Digite uma resposta valida.");
                continue;
            }
        }
    }
}
