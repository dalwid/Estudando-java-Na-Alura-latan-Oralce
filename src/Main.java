import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nome = "David";
        String tipoConta = "conta corrente";
        double saldo = 1599.99;

        String dados = """
                *****************************************
                    Dados iniciais do cliente:
                ****************************************
                Nome:             %s
                Tipo conta:       %s
                Saldo inicial:    R$ %s 
                *****************************************
                """;

        String menu = """
                ======================== 
                === Digite sua opção ===
                ========================
                    1 - ver saldo
                    2 - sacar Valor
                    3 - depositar valor
                    4 - Sair
                ========================
                """;

        int opcoa = 0;
        Scanner leitura = new Scanner(System.in);


        do {
            System.out.println(menu);
            opcoa = leitura.nextInt();

            if(opcoa == 1){
                System.out.println("Saldo: "+saldo);
            }


            if(opcoa == 2){
                double valorComparar = leitura.nextDouble();
                if(valorComparar > saldo){
                    System.out.println("Saldo insuficiente");
                }
                else{
                    System.out.println("Operação realizada com sucesso. saldo atual R$"+ (saldo -= valorComparar));
                }
            }

            if(opcoa == 3){
                double valorComparar = leitura.nextDouble();
                System.out.println("Operação realizada co msucesso. saldo atual R$"+(saldo += valorComparar));
            }

            if(opcoa == 4){
                System.out.println("Você escolheu sair veja em seguida seus dados");
            }

            if(opcoa > 4){
                System.out.println("O QUE É ISSO? FUMOU MACONHA? ");
                return;
            }
        }
        while (opcoa != 4);

        System.out.println(dados.formatted(nome, tipoConta, saldo));
    }
}