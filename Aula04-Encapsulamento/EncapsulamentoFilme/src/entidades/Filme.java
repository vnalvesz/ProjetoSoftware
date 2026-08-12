package entidades;

public class Filme {
    private String titulo;
    private String genero;
    private String autor;
    private int duracao;
    private double valor;
    private int qtdIngressos;

    @Override
    public String toString() {
        return  "Titulo: " + titulo +
                "\nGênero: " + genero +
                "\nAutor: " + autor +
                "\nDuracao: " + duracao  +
                "\nValor:" + valor +
                "\nQuantidade de Ingressos disponiveis: " + qtdIngressos;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getAutor() {
        return autor;
    }

    public String getDuracao() {
        return duracao;
    }

    public double getValor() {
        return valor;
    }

    public Filme(String titulo, String genero, String autor, String duracao, double valor, int qtdIngressos) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.duracao = duracao;
        this.valor = valor;
        this.qtdIngressos = qtdIngressos;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setValor(double valor) {
        this.valor = valor;
     }
}

