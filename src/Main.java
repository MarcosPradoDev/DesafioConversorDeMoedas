import java.util.Scanner;

public class Main {
    static String historico = "\n";

    public static void main(String[] args) {
        boolean interacao = true;
        Scanner scanner = new Scanner(System.in);

        while (interacao) {
            System.out.println("""
                    ****************************************************
                    Seja bem-vindo/a ao Conversor de Moeda =]
                    
                    1) Dólar           =>> Peso Argentino
                    2) Peso Argentino  =>> Dólar
                    3) Dólar           =>> Real Brasileiro
                    4) Real Brasileiro =>> Dólar
                    5) Dólar           =>> Peso Colombiano
                    6) Peso Colombiano =>> Dólar
                    7) Histórico
                    8) Sair
                    
                    Escolha uma opção valida:
                    ****************************************************
                    """);
            String escolha = scanner.nextLine();

            switch (escolha) {
                case "1":
                    converteValor("USD", "ARS");
                    break;

                case "2":
                    converteValor("ARS", "USD");
                    break;

                case "3":
                    converteValor("USD", "BRL");
                    break;

                case "4":
                    converteValor("BRL", "USD");
                    break;

                case "5":
                    converteValor("USD", "COP");
                    break;

                case "6":
                    converteValor("COP", "USD");
                    break;

                case "7":
                    System.out.println("Historico até agora: " + historico);
                    break;

                default:
                    if (escolha.equals("8")) {
                        System.out.println("Fechando o conversor de moedas!");
                        interacao = false;
                    } else {
                        System.out.println("ENTRE COM UM OPÇÃO VALIDA:");
                    }
                    break;
            }
        }
    }

    private static void converteValor(String moeda1, String moeda2){
        Scanner scanner = new Scanner(System.in);
        String impressao;
        System.out.println("Digite o valor a ser convertido: ");
        try {
            double valor = scanner.nextDouble();
            scanner.nextLine();
            ConsultaMoeda consultaMoeda = new ConsultaMoeda();
            Conversor novaConversao = consultaMoeda.valorFinal(moeda1, moeda2, valor);
            impressao = valor + " (" + moeda1 + ") " + "Corresponde ao valor final de: " + novaConversao.valorFinal() + " (" + moeda2 + ") ";
            System.out.println(impressao);
            historico = historico + "\n" + impressao;



        } catch (Exception e){
            System.out.println("DIGITE UM VALOR VALIDO!!!");
        }
    }
}




























