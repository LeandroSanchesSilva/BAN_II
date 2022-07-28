
package Servico;

/**
 *
 * @author Leandro
 */

public class servicoBean {

    private int codservico;
    private String descricao;
    private float valor;

    public servicoBean(int codservico, String descricao, float valor) {
        this.codservico = codservico;
        this.descricao = descricao;
        this.valor = valor;
    }

    public servicoBean(String descricao, float valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public servicoBean(int codservico) {
        this.codservico = codservico;
    }

    public int getCodservico() {
        return codservico;
    }

    public void setCodservico(int codservico) {
        this.codservico = codservico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String toString(){
        return " Codigo do Servico: "+codservico+" Descricao: "+descricao+" Valor: "+valor;
    }    
}
