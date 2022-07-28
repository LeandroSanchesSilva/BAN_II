package Aplicacao;

/**
 *
 * @author Leandro
 */

public class aplicacaoBean {

    private int codaplicacao;
    private int codservico;
    private int codcosmetico;

    public aplicacaoBean(int codaplicacao, int codservico, int codcosmetico) {
        this.codaplicacao = codaplicacao;
        this.codservico = codservico;
        this.codcosmetico = codcosmetico;
    }

    public aplicacaoBean(int codservico, int codcosmetico) {
        this.codservico = codservico;
        this.codcosmetico = codcosmetico;
    }

    public aplicacaoBean(int codaplicacao) {
        this.codaplicacao = codaplicacao;
    }

    public int getCodaplicacao() {
        return codaplicacao;
    }

    public void setCodaplicacao(int codaplicacao) {
        this.codaplicacao = codaplicacao;
    }

    public int getCodservico() {
        return codservico;
    }

    public void setCodservico(int codservico) {
        this.codservico = codservico;
    }

    public int getCodcosmetico() {
        return codcosmetico;
    }

    public void setCodcosmetico(int codcosmetico) {
        this.codcosmetico = codcosmetico;
    }

    public String toString(){
        return "Codigo Aplicacao: "+codaplicacao+" Codigo Cosmetico: "+codcosmetico+" Codigo Servico: "+codservico;
    }

}
