package Agendamento;
/**
 *
 * @author Leandro
 */

public class agendamentoBean {
    
    private int codagendamento;
    private int codcliente;
    private int codbarbeiro;
    private int codservico;
    private String data;
    private String hora;


    public agendamentoBean(int codagendamento, int codcliente, int codbarbeiro, int codservico, String data, String hora) {
        this.codagendamento = codagendamento;
        this.codcliente = codcliente;
        this.codbarbeiro = codbarbeiro;
        this.codservico = codservico;
        this.data = data;
        this.hora = hora;
    }    

    public agendamentoBean(int codcliente, int codbarbeiro, int codservico, String data, String hora) {
        this.codcliente = codcliente;
        this.codbarbeiro = codbarbeiro;
        this.codservico = codservico;
        this.data = data;
        this.hora = hora;
    }

    public agendamentoBean(int codagendamento) {
        this.codagendamento = codagendamento;
    }


    public int getCodagendamento() {
        return codagendamento;
    }

    public void setCodagendamento(int codagendamento) {
        this.codagendamento = codagendamento;
    }

    public int getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(int codcliente) {
        this.codcliente = codcliente;
    }

    public int getCodbarbeiro() {
        return codbarbeiro;
    }

    public void setCodbarbeiro(int codbarbeiro) {
        this.codbarbeiro = codbarbeiro;
    }

    public int getCodservico() {
        return codservico;
    }

    public void setCodservico(int codservico) {
        this.codservico = codservico;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String toString(){
        return "Codigo Agendamento: "+codagendamento+" Codigo Cliente: "+codcliente+" Codigo Barbeiro: "+codbarbeiro+" Codigo Servico: "+codservico+" Data: "+data+" Horario: "+hora;
    }
}
