package filmes;

public class Principal {

    public static void main(String[] args) {

        Filme chris = new Filme();
        chris.titulo = "Todo Mundo Odeia o Chris";
        chris.anolancamento = 2014;
        chris.ator = "Chris";
        chris.genero = "Comédia";
        chris.duracao = 180;

        System.out.println(chris.toString());
    }
}

