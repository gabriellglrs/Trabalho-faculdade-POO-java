public class Euro extends Moeda {

    // Construtor da classe Euro
    public Euro(double valor) {
        // Inicializa o valor da moeda
        this.valor = valor;
    }

    // Método para converter o valor do euro para reais
    @Override
    public double converter() {
        // Retorna o valor convertido para reais
        // A taxa de câmbio usada aqui é fictícia
        return valor * 6.0;
    }

    // Método para imprimir informações sobre a moeda
    @Override
    public void info() {
        // Imprime o tipo da moeda e o seu valor
        System.out.println("Moeda: Euro");
        System.out.println("Valor: " + valor);
    }

}

