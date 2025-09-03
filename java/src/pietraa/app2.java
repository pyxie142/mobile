package pietraa;

public class app2 {
    public static void main(String[] args) {
        aula livro = new aula();
        livro.nome = "absolute superman";
        livro.descricao = "uma história em quadrinhos de super-herói";
        livro.isbn = "88711741";
        livro.preco = 99.88;
        livro.autor = "Jason Aaron";
        livro.datapub = "2024";
        System.out.println(livro.descricao); 

        livro.dadosLivros();

    }
}
