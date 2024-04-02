import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Cria um objeto Cofrinho para armazenar as moedas
        Cofrinho cofre = new Cofrinho();

        int opcao;
        do {
            // Imprime o menu de opções
            System.out.println("------------------------------------------");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Calcular valor total");
            System.out.println("0 - Sair");
            System.out.println("------------------------------------------");

            // Lê a opção escolhida pelo usuário
            opcao = scanner.nextInt();

            // Executa a ação correspondente à opção escolhida
            switch (opcao) {
                case 1:
                    // Adiciona uma moeda ao cofrinho
                    adicionarMoeda(cofre, scanner);
                    break;
                case 2:
                    // Remove uma moeda do cofrinho
                    removerMoeda(cofre, scanner);
                    break;
                case 3:
                    // Lista as moedas no cofrinho
                    cofre.listagemMoedas();
                    break;
                case 4:
                    // Calcula e imprime o valor total no cofrinho
                    System.out.println("Total convertido em reais: " + cofre.totalConvertido());
                    break;
                case 0:
                    // Sai do programa
                    System.out.println("Saindo...");
                    break;
                default:
                    // Informa ao usuário que a opção escolhida é inválida
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);  // Repete até que o usuário escolha a opção de sair

    }

    private static void adicionarMoeda(Cofrinho cofrinho, Scanner scanner) {
        // Imprime o menu de moedas
        System.out.println("------------------------------------------");
        System.out.println("Qual moeda você deseja adicionar?");
        System.out.println("1 - Dólar");
        System.out.println("2 - Euro");
        System.out.println("3 - Real");
        System.out.println("------------------------------------------");

        // Lê o tipo de moeda que o usuário deseja adicionar
        int tipoMoeda = scanner.nextInt();

        // Solicita ao usuário o valor da moeda
        System.out.println("Digite o valor: ");
        double valor = scanner.nextDouble();

        // Adiciona a moeda correspondente ao cofrinho
        switch (tipoMoeda) {
            case 1:
                cofrinho.adicionar(new Dolar(valor));
                break;
            case 2:
                cofrinho.adicionar(new Euro(valor));
                break;
            case 3:
                cofrinho.adicionar(new Real(valor));
                break;
            default:
                // Informa ao usuário que a moeda escolhida é inválida
                System.out.println("Moeda inválida!");
        }
    }

    private static void removerMoeda(Cofrinho cofrinho, Scanner scanner) {
        // Imprime o menu de moedas
        System.out.println("------------------------------------------");
        System.out.println("Qual moeda você deseja remover?");
        System.out.println("1 - Dólar");
        System.out.println("2 - Euro");
        System.out.println("3 - Real");
        System.out.println("------------------------------------------");

        // Lê o tipo de moeda que o usuário deseja remover
        int tipoMoeda = scanner.nextInt();

        // Solicita ao usuário o valor da moeda
        System.out.println("Digite o valor: ");
        double valor = scanner.nextDouble();

        // Remove a moeda correspondente do cofrinho
        switch (tipoMoeda) {
            case 1:
                cofrinho.remover(new Dolar(valor));
                break;
            case 2:
                cofrinho.remover(new Euro(valor));
                break;
            case 3:
                cofrinho.remover(new Real(valor));
                break;
            default:
                // Informa ao usuário que a moeda escolhida é inválida
                System.out.println("Moeda inválida!");
        }
    }

}

