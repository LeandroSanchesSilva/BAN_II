
package Principal;

import Barbeiro.barbeiroController;
import Cliente.clienteController;
import Conexao.Conexao;
import Servico.servicoController;
import java.util.Scanner;
import redis.clients.jedis.Jedis;

/**
 *
 * @author Leandro
 */

public class Principal {

    

public static void main(String[] args){
        Conexao con = new Conexao();
        con.Connection();

        int op = 0;
        Jedis jedis = null;
        do{
            op = menu();
            try {
                switch (op) {
                    case 1: System.out.println("");
                            new barbeiroController().createBarbeiro(con);
                            break;
                    case 2: System.out.println(""); 
                            new clienteController().createCliente(con);
                            break;
                    case 3: System.out.println(""); 
                            new servicoController().createServico(con);
                            break;/*
                    case 4: System.out.println(""); 
                            new cosmeticoController().createCosmetico(con);
                            break;
                    case 5: System.out.println(""); 
                            new agendamentoController().createAgendamento(con);
                            break;
                    case 6: System.out.println(""); 
                            new aplicacaoController().createAplicacao(con);
                            break;
                    case 7: System.out.println(""); 
                            new barbeiroController().listarBarbeiro(con);
                            break;
                    case 8: System.out.println(""); 
                            new clienteController().listarCliente(con);
                            break;
                    case 9: System.out.println(""); 
                            new agendamentoController().listarAgendamento(con);
                            break;
                    case 10: System.out.println(""); 
                            new aplicacaoController().listarAplicacao(con);
                            break;
                    case 11: System.out.println(""); 
                            new cosmeticoController().listarCosmetico(con);
                            break;
                    case 12: System.out.println(""); 
                            new servicoController().listarServico(con);
                            break;
                    case 13: System.out.println(""); 
                            new barbeiroController().alterarBarbeiro(con);
                            break;
                    case 14: System.out.println(""); 
                            new clienteController().alterarCliente(con);
                            break;
                    case 15: System.out.println(""); 
                            new cosmeticoController().alterarCosmetico(con);
                            break;
                    case 16: System.out.println(""); 
                            new servicoController().alterarServico(con);
                            break;
                    case 17: System.out.println(""); 
                            new aplicacaoController().alterarAplicacao(con);
                            break;
                    case 18: System.out.println(""); 
                            new agendamentoController().alterarAgendamento(con);
                            break;
                    case 19: System.out.println(""); 
                            new barbeiroController().deletarBarbeiro(con);
                            break;
                    case 20: System.out.println(""); 
                            new clienteController().deletarCliente(con);
                            break;
                    case 21: System.out.println(""); 
                            new cosmeticoController().deletarCosmetico(con);
                            break;
                    case 22: System.out.println(""); 
                            new servicoController().deletarServico(con);
                            break;
                    case 23: System.out.println(""); 
                            new aplicacaoController().deletarAplicacao(con);
                            break;
                    case 24: System.out.println(""); 
                            new agendamentoController().deletarAgendamento(con);
                            break;*/
                }
            }catch(Exception e) {
                System.out.println(e);
                continue;
            }
        } while(op>0 && op<2);  
        con.Shutdown(jedis);
    }
    
    private static int menu() {
        System.out.println("");
        System.out.println("Informe o número da opção que desejas executar: ");
        System.out.println("1 - Inserir um novo barbeiro");/*
        System.out.println("2 - Inserir um novo cliente");
        System.out.println("3 - Inserir um novo serviço");
        System.out.println("4 - Inserir um novo cosmético");
        System.out.println("5 - Inserir um novo agendamento");
        System.out.println("6 - Inserir uma nova aplicação");
        System.out.println("7 - Listar todos os barbeiros cadastrados");
        System.out.println("8 - Listar todos os clientes cadastrados");
        System.out.println("9 - Listar todos os agendamentos realizados");
        System.out.println("10 - Listar todas as aplicacoes cadastradas");
        System.out.println("11 - Listar todos os cosmeticos cadastrados");
        System.out.println("12 - Listar todos os servicos disponibilixados");
        System.out.println("13 - Alterar as informações de um barbeiro cadastrado");
        System.out.println("14 - Alterar as informações de um cliente cadastrado");
        System.out.println("15 - Alterar as informações de um cosmetico cadastrado");
        System.out.println("16 - Alterar as informações de um servico cadastrado");
        System.out.println("17 - Alterar as informações de uma aplicacao cadastrada");
        System.out.println("18 - Alterar as informações de um agendamento marcado");
        System.out.println("19 - Deletar as informacoes de um Barbeiro Cadastrado");
        System.out.println("20 - Deletar as informacoes de um Cliente Cadastrado");
        System.out.println("21 - Deletar as informacoes de um Cosmetico Cadastrado");
        System.out.println("22 - Deletar as informacoes de um Servico Cadastrado");
        System.out.println("23 - Deletar as informacoes de um Servico Cadastrado");
        System.out.println("24 - Deletar as informacoes de um Agendamento Cadastrado");
*/


        System.out.println("");
        System.out.println("Digite qualquer outro valor para sair");
        System.out.print("Sua opção: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

}