public class CaixaFragil extends Caixa {
    public CaixaFragil(String identificador, String conteudo, float peso, float altura, float pesoMax) {
        super(identificador, conteudo, peso, altura);
        this.pesoMax = pesoMax;
    }

    private float pesoMax = 20;

    public float getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(float pesoMax) {
        this.pesoMax = pesoMax;
    }
    public void exibirEtiqueta(){
        System.out.println(pesoMax);
    }
}
