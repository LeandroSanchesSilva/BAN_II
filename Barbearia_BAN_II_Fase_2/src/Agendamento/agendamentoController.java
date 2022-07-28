package Agendamento;

import Conexao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Leandro
 */

public class agendamentoController {
    public void createAgendamento(Conexao con) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para criar um novo Agendamento: ");
        System.out.print("codcliente: ");
        int codcliente = input.nextInt();
        System.out.print("codbarbeiro: ");
        int codbarbeiro = input.nextInt();
        System.out.print("codservico: ");
        int codservico = input.nextInt();
        System.out.print("data (dd/MM/yyyy): ");
        String data = input.next();
        System.out.print("hora (HH:mm): ");
        String hora = input.next();
        
        agendamentoBean ab = new agendamentoBean(codcliente, codbarbeiro, codservico, data, hora);
        agendamentoModel.create(ab, con);
        System.out.println("Agendamento realizado com sucesso!");     
    }

    public void listarAgendamento(Conexao con){
        HashSet all = agendamentoModel.listAll (con);
        Iterator<agendamentoBean> it = all.iterator();
        while(it.hasNext()) {
        System.out.println(it.next().toString());
        }
    }

    public void alterarAgendamento(Conexao con){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe os seguintes dados para atualizar as informacoes de uma Aplicacao já cadastrada: ");
        System.out.print("codagendamento: ");
        int codagendamento = input.nextInt();
        System.out.print("codcliente: ");
        int codcliente = input.nextInt();
        System.out.print("codbarbeiro: ");
        int codbarbeiro = input.nextInt();
        System.out.print("codservico: ");
        int codservico = input.nextInt();
        System.out.print("data (dd/MM/yyyy): ");
        String data = input.next();
        System.out.print("hora (HH:mm): ");
        String hora = input.next();
        
        agendamentoBean ab = new agendamentoBean(codagendamento, codcliente, codbarbeiro, codservico, data, hora);
        agendamentoModel.update(ab, con);
        System.out.println("Agendamento atualizado com sucesso!");     
    }

public void deletarAgendamento(Conexao con) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o código do Agendamento a ser Deletado: ");
        int codagendamento = input.nextInt();    
        
        agendamentoBean bb = new agendamentoBean(codagendamento);
        agendamentoModel.delete(bb, con);
        System.out.println("Agendamento deletado com sucesso!");     
    }

}
