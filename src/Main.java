import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean interacao = true;
        Scanner scanner = new Scanner(System.in);
        while (interacao) {
            System.out.println("""
                    ****************************************************
                    Seja bem-vindo/a ao Conversor de Moeda =]
                    
                    1) Dólar =>> Peso Argentino
                    2) Peso Argentino =>> Dólar
                    3) Dólar (USD) =>> Real Brasileiro
                    4) Real Brasileiro =>> Dólar
                    5) Dólar =>> Peso Colombiano
                    6) Peso Colombiano =>> Dólar
                    7) Sair
                    
                    Escolha uma opção valida:
                    ****************************************************
                    """);
            String escolha = scanner.nextLine();
            System.out.println(escolha);
            interacao = false;
        }



//        ConsultaMoeda consultaMoeda = new ConsultaMoeda();
//        Conversor novaConversao = consultaMoeda.valorFinal("USD","BRL",10);
//        System.out.println(novaConversao);

//        System.out.println("*****************************************************************");
//        System.out.println("Seja bem-vindo/a ao Conversor de Moeda =]");
//        System.out.println("\n" +
//                "1) Dólar =>> Peso Argentino\n" +
//                "2) Peso Argentino =>> Dólar\n" +
//                "3) Dólar =>> Real Brasileiro\n" +
//                "4) Real Brasileiro =>> Dólar\n" +
//                "5) Dólar =>> Peso Colombiano\n" +
//                "6) Peso Colombiano =>> Dólar\n" +
//                "7) Sair");
//        System.out.println("Escolha uma opção valida:");
//        System.out.println("*****************************************************************");


    }
}