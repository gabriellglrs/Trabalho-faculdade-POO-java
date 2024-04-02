public class Real extends Moeda {

    // Construtor da classe Real
    public Real(double valor) {
        // Inicializa o valor da moeda
        this.valor = valor;
    }

    // Método para converter o valor do real para reais
    @Override
    public double converter() {
        // Retorna o valor em reais, pois a moeda já está em reais
        return valor;
    }

    // Método para imprimir informações sobre a moeda
    @Override
    public void info() {
        // Imprime o tipo da moeda e o seu valor
        System.out.println("Moeda: Real");
        System.out.println("Valor: " + valor);
    }

}
