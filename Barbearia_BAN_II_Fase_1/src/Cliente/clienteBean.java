package Cliente;

/**
 *
 * @author Leandro
 */


public class clienteBean {

    private int codcliente;
    private String nome;
    private String email;
    private String cpf;    


    public clienteBean(int codcliente, String nome, String email, String cpf) {
        this.codcliente = codcliente;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public clienteBean(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public clienteBean(int codcliente) {
        this.codcliente = codcliente;
    }

    public int getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(int codcliente) {
        this.codcliente = codcliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString(){
        return " Codigo do Cliente: "+codcliente+" Nome do Cliente: "+nome+" Email: "+email+" CPF: "+cpf;
    }

}