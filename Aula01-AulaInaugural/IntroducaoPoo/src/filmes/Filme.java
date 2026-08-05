package filmes;

public class Filme {
    //Atributos
    String titulo;
    String ator;
    String genero;
    int anolancamento;
    int duracao;

    @Override
    public String toString() {
        return
                "titulo='" + titulo + '\'' +
                ", ator='" + ator + '\'' +
                ", genero='" + genero + '\'' +
                ", anolancamento=" + anolancamento +
                ", duracao=" + duracao +
                '}';
    }
}

