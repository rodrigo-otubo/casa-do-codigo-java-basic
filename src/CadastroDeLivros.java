public class CadastroDeLivros {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        autor.setEmail("rodrigo.turini@caelum.com.br");
        autor.setCpf("123.456.789.10");

        Livro livro = new Livro();
        livro.setNome("Java 8 Prático");
        livro.setDescricao("Novos recursos da linguaguem");
        livro.setValor(59.90);
        // livro.setIsbn("978-85-66250-46-6");

        livro.setAutor(autor);
        livro.mostrarDetalhe();

        Autor outroAutor = new Autor();
        outroAutor.setNome("Paulo Silveira");
        outroAutor.setEmail("paulo.silveira@caelum.com.br");
        outroAutor.setCpf("123.456.789.10");

        Livro outroLivro = new Livro();
        outroLivro.setNome("Lógica de Programação");
        outroLivro.setDescricao("Novos recursos da linguaguem");
        outroLivro.setValor(59.90);
        outroLivro.setIsbn("978-85-66250-46-6");

        outroLivro.setAutor(outroAutor);
        outroLivro.mostrarDetalhe();
    }
}
