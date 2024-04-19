public class Main {
    public static void main(String[] args) {
        // Criando caixas
        Caixa caixa1 = new Caixa("C1", "Conteúdo 1", 10, 20);
        CaixaFragil caixaFragil1 = new CaixaFragil("CF1", "Conteúdo Frágil 1", 15, 20, 20);
        Caixa caixa2 = new Caixa("C2", "Conteúdo 2", 12, 18);
        CaixaFragil caixaFragil2 = new CaixaFragil("CF2", "Conteúdo Frágil 2", 18, 20, 20);
        
        // Criando pilha de caixas com altura máxima de 50 cm
        PilhaDeCaixas pilhaDeCaixas = new PilhaDeCaixas(50);

        // Empilhando as caixas
        pilhaDeCaixas.empilhar(caixa1);
        pilhaDeCaixas.empilhar(caixaFragil1);
        pilhaDeCaixas.empilhar(caixa2);
        pilhaDeCaixas.empilhar(caixaFragil2);

        pilhaDeCaixas.desempilhar();

        pilhaDeCaixas.exibirDadosPilha();
    }
}
