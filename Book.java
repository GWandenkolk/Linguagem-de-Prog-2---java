public class Book {
    // Atributos privados
    private String name;
    private Author[] authors; // Array de autores
    private double price;
    private int qty; // Quantidade em estoque

    // Construtor para inicializar os atributos
    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors; // O array de autores é passado pelo construtor
        this.price = price;
        this.qty = qty;
    }

    // Getters para os atributos
    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    // Método toString() para a classe Book
    @Override
    public String toString() {
        StringBuilder authorsStr = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            authorsStr.append(authors[i].toString());
            if (i < authors.length - 1) {
                authorsStr.append(", ");
            }
        }
        return "Book[name=" + name + ",authors={" + authorsStr.toString() + "},price=" + price + ",qty=" + qty + "]";
    }
}
