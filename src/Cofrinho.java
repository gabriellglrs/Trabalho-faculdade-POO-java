import java.util.ArrayList;
import java.util.List;

public class Cofrinho {

    // Lista para armazenar as moedas
    private List<Moeda> moedas;
    // Variável para armazenar o total em reais
    private double totalReais;

    // Construtor da classe Cofrinho
    public Cofrinho() {
        // Inicializa a lista de moedas
        this.moedas = new ArrayList<>();
        // Inicializa o total em reais
        this.totalReais = 0.0;
    }

    // Método para adicionar uma moeda ao cofrinho
    public void adicionar(Moeda moeda) {
        // Adiciona a moeda à lista
        moedas.add(moeda);
        // Atualiza o total em reais
        totalReais += moeda.converter();
    }

    // Método para remover uma moeda do cofrinho
    public void remover(Moeda moeda) {
        // Remove a moeda da lista
        moedas.remove(moeda);
        // Atualiza o total em reais
        totalReais -= moeda.converter();
    }

    // Método para listar as moedas no cofrinho
    public void listagemMoedas() {
        // Imprime o cabeçalho da listagem
        System.out.println("---------------------");
        System.out.println(" LISTAGEM DE MOEDAS");
        System.out.println("---------------------");
        // Itera sobre as moedas e imprime as informações de cada uma
        for (Moeda moeda : moedas) {
            moeda.info();
        }
    }

    // Método para calcular o total em reais
    public double totalConvertido() {
        // Retorna o total em reais
        return totalReais;
    }
}
