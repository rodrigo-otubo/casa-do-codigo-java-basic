public class Livro {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    private boolean impressao;

    public Livro(){
        this.isbn = "000-00-00000-00-0";
    }

    public Livro(Autor autor){
        this();
        this.autor = autor;
        this.impressao = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    void setValor(double valor){
        this.valor = valor;
    }

    double getValor(){
        return this.valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    void mostrarDetalhe(){
        System.out.println("Mostrando detalhes do livro");
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        if (this.temAutor()){
            autor.mostrarDetalhes();
        }
        System.out.println("--");
    }

    boolean aplicaDescontoDe(double porcentagem){

        if (porcentagem > 0.3){
            System.out.println("Desconto não pode ser maior do que 30%");
            return false;
        } else if (!this.impressao && porcentagem > 0.15){
            return false;
        }
        this.valor -= this.valor * porcentagem;
        return true;
    }

    boolean temAutor(){
        return this.autor != null;
    }


}

