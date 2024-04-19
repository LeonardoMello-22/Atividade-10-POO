public  class Caixa {
    private String identificador;
    private String conteudo;
    private float peso;
    private float altura;

    public Caixa(String identificador, String conteudo, float peso, float altura) {
        this.identificador = identificador;
        this.conteudo = conteudo;
        this.peso = peso;
        this.altura = altura;
    }
    public String getIdentificador() {
        return identificador;
    }
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }public void exibirEtiqueta(){
        System.out.println(identificador);
        System.out.println(conteudo);
        System.out.println(peso);
        System.out.println(altura);
    }
}
