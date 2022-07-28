package Barbeiro;

/**
 *
 * @author Leandro
 */

public class barbeiroBean {

    private int codbarbeiro;    
    private String nome;
    private String estilo;

    public barbeiroBean(int codbarbeiro, String nome, String estilo) {
        this.codbarbeiro = codbarbeiro;
        this.nome = nome;
        this.estilo = estilo;
    }

    public barbeiroBean(String nome, String estilo) {
        this.nome = nome;
        this.estilo = estilo;
    }

    public barbeiroBean(String nome) {
        this.nome = nome;
    }

    public barbeiroBean(int codbarbeiro) {
        this.codbarbeiro = codbarbeiro;
    }

    public int getCodbarbeiro() {
        return codbarbeiro;
    }

    public void setCodbarbeiro(int codbarbeiro) {
        this.codbarbeiro = codbarbeiro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
    
    public String toString(){
        return " Codigo do Barbeiro: "+codbarbeiro+" Nome do Barbeiro: "+nome+" Estilo: "+estilo;
    }

}
