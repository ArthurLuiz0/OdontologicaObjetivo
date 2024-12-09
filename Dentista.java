package OdontologiaObjetivo;
public class Dentista {
    private String nome;
    private String crm;
    private String telefone;
    private String email;

    // Construtor
    public Dentista(String nome, String crm, String telefone, String email) {
        this.nome = nome;
        this.crm = crm;
        this.telefone = telefone;
        this.email = email;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método para exibir informações do dentista
    @Override
    public String toString() {
        return "Dentista {" +
                "nome='" + nome + '\'' +
                ", crm='" + crm + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
