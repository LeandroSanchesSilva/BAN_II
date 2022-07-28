package Cosmetico;

/**
 *
 * @author Leandro
 */

public class cosmeticoBean {

    private int codcosmetico;    
    private String descricao;

    public cosmeticoBean(int codcosmetico, String descricao) {
        this.codcosmetico = codcosmetico;
        this.descricao = descricao;
    }

    public cosmeticoBean(String descricao) {
        this.descricao = descricao;
    }

    public cosmeticoBean(int codcosmetico) {
        this.codcosmetico = codcosmetico;
    }

    public int getCodcosmetico() {
        return codcosmetico;
    }

    public void setCodcosmetico(int codcosmetico) {
        this.codcosmetico = codcosmetico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toString(){
        return " Codigo Cosmetico: "+codcosmetico+" Descricao: "+descricao;
    }

}
