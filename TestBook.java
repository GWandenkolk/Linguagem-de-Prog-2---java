public class TestBook {
    public static void main(String[] args) {
        // Criar e alocar o array de autores
        Author[] authors = new Author[2];
        authors[0] = new Author("Autor 01", "autor01@somewhere.com.br", 'm');
        authors[1] = new Author("Autor 02", "autor02@nowhere.com.br", 'm');

        // Declarar e alocar a instância de um Book
        Book testeBook = new Book("Java for Dummy", authors, 19.99, 99);

        // Testar o método toString() da classe Book
        System.out.println(testeBook); 
        // Saída esperada:
        // Book[name=Java for Dummy,authors={Author[name=Autor 01,email=autor01@somewhere.com.br,gender=m], Author[name=Autor 02,email=autor02@nowhere.com.br,gender=m]},price=19.99,qty=99]

        // Testar os Getters e Setters
        System.out.println("Nome do Livro: " + testeBook.getName());
        System.out.println("Preço: " + testeBook.getPrice());
        System.out.println("Quantidade: " + testeBook.getQty());

        // Testando a modificação de preço e quantidade
        testeBook.setPrice(25.50);
        testeBook.setQty(150);

        System.out.println("Novo Preço: " + testeBook.getPrice());
        System.out.println("Nova Quantidade: " + testeBook.getQty());
    }
}
