public class Turista {

    // Atributos -Variavéis de instância
    private String nome;
    private String cpf;
    // Construtor Padrão
    Turista(){}
    // Conatrutor Personalizado
    Turista(String _nome){
        this.nome = _nome;
    }
    // Métodos
    public String viajar(){
        return "Viajou!!!";
    }
    // Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        // Validar CPF

        this.cpf = cpf;
    }
}
