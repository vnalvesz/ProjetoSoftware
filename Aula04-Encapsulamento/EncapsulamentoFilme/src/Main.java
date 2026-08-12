import entidades.Filme;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme ("Homem aranha", "Ação", "Dan Slott", 115, 35, 5);
        System.out.println("Novo Filme: " + filme.getTitulo());
        System.out.println("Valor do Filme: " + filme.getValor());

       filme.setValor(55);

       System.out.println("Valor do filme: " + filme.getValor());
   }
}