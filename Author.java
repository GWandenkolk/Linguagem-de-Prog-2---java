package ex1;

/**
 *
 * @author LOWCOST
 */
public class Author {

    
    // Atributos privados
    private String name;
    private String email;
    private char gender; // 'm' ou 'f'

    // Construtor para inicializar os atributos
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getter para o atributo 'name'
    public String getName() {
        return name;
    }

    // Getter para o atributo 'email'
    public String getEmail() {
        return email;
    }

    // Setter para o atributo 'email'
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter para o atributo 'gender'
    public char getGender() {
        return gender;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
    }
}
