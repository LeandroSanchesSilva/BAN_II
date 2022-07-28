package Cliente;

import Conexao.Conexao;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Leandro
 */

public class clienteController {
    public void createCliente(Conexao con) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para criar um novo Cliente: ");
        System.out.print("nome: ");
        String nome = input.next();
        System.out.print("email: ");
        String email = input.next();    
        System.out.print("cpf: ");
        String cpf = input.next();  
        
        clienteBean cb = new clienteBean(nome, email, cpf);
        clienteModel.create(cb, con);
        System.out.println("Cliente criado com sucesso!");     
    }

    public void listarCliente(Conexao con) {
        HashSet all = clienteModel.listAll (con);
        Iterator<clienteBean> it = all.iterator();
        while(it.hasNext()) {
        System.out.println(it.next().toString());
        }
    }

public void alterarCliente(Conexao con){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe os seguintes dados para atualizar as informacoes de um Cliente já cadastrado: ");
        System.out.print("nome: ");
        String nome = input.next();
        System.out.print("email: ");
        String email = input.next();    
        System.out.print("cpf: ");
        String cpf = input.next();     
        
        clienteBean cb = new clienteBean(nome, email, cpf);
        clienteModel.update(cb, con);
        System.out.println("Cliente atualizado com sucesso!");    
    }

    public void deletarCliente(Conexao con){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o código do Cliente a ser Deletado: ");
        int codcliente = input.nextInt();    
        
        clienteBean bb = new clienteBean(codcliente);
        clienteModel.delete(bb, con);
        System.out.println("Cliente deletado com sucesso!");     
    }

}