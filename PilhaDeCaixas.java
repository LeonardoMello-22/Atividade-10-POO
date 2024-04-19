import java.util.ArrayList;

public class PilhaDeCaixas extends Caixa {
    private float alturaMaxima;
    private ArrayList<Caixa> pilha;

    public PilhaDeCaixas(float alturaMaxima) {
        super("", "", 0, 0);
        this.alturaMaxima = alturaMaxima;
        this.pilha = new ArrayList<>();
    }

    public boolean empilhar(Caixa caixa) {
        if (calcularAlturaAtual() + caixa.getAltura() > alturaMaxima) {
            System.out.println("Altura máxima da pilha atingida. Caixa não empilhada.");
            return false;
        }

        if (caixa instanceof CaixaFragil) {
            float pesoTotalCaixasFrageis = calcularPesoTotalCaixasFrageis() + caixa.getPeso();
            if (pesoTotalCaixasFrageis > ((CaixaFragil) caixa).getPesoMax()) {
                System.out.println("Peso máximo suportado por caixa frágil seria ultrapassado. Caixa não empilhada.");
                return false;
            }
        }

        pilha.add(caixa);
        System.out.println("Caixa empilhada com sucesso.");
        return true;
    }

    public Caixa desempilhar() {
        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia. Não há mais caixas para desempilhar.");
            return null;
        }
        return pilha.remove(pilha.size() - 1);
    }

    public float calcularAlturaAtual() {
        float alturaTotal = 0;
        for (Caixa caixa : pilha) {
            alturaTotal += caixa.getAltura();
        }
        return alturaTotal;
    }

    public float calcularPesoTotalAtual() {
        float pesoTotal = 0;
        for (Caixa caixa : pilha) {
            pesoTotal += caixa.getPeso();
        }
        return pesoTotal;
    }

    public void exibirDadosPilha() {
        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.println("Dados das caixas empilhadas:");
            for (int i = pilha.size() - 1; i >= 0; i--) {
                Caixa caixa = pilha.get(i);
                System.out.println("Identificador: " + caixa.getIdentificador());
                System.out.println("Conteúdo: " + caixa.getConteudo());
                System.out.println("Peso: " + caixa.getPeso());
                System.out.println("Altura: " + caixa.getAltura());
                System.out.println("---------------------");
            }
            System.out.println("Altura atual da pilha: " + calcularAlturaAtual());
            System.out.println("Peso total atual da pilha: " + calcularPesoTotalAtual());
        }
    }

    private float calcularPesoTotalCaixasFrageis() {
        float pesoTotalCaixasFrageis = 0;
        for (Caixa caixa : pilha) {
            if (caixa instanceof CaixaFragil) {
                pesoTotalCaixasFrageis += caixa.getPeso();
            }
        }
        return pesoTotalCaixasFrageis;
    }
}
