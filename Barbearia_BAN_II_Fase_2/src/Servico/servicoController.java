package Servico;

import Conexao.Conexao;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Leandro
 */

public class servicoController {

    public void createServico(Conexao con) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para criar um novo Servico: ");
        System.out.print("descricao: ");
        String descricao = input.next();
        System.out.print("valor: ");
        float valor = input.nextFloat();   
        
        servicoBean sb = new servicoBean(descricao, valor);
        servicoModel.create(sb, con);
        System.out.println("Servico criado com sucesso!");     
    }

    public void listarServico(Conexao con){
        HashSet all = servicoModel.listAll (con);
        Iterator<servicoBean> it = all.iterator();
        while(it.hasNext()) {
        System.out.println(it.next().toString());
        }
    }

    public void alterarServico(Conexao con){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe os seguintes dados para atualizar as informacoes de um Servico já cadastrado: ");
        System.out.print("descricao: ");
        String descricao = input.next();
        System.out.print("valor: ");
        float valor = input.nextFloat();   
        
        servicoBean sb = new servicoBean(descricao, valor);
        servicoModel.update(sb, con);
        System.out.println("Servico atualizado com sucesso!");     
    }

    public void deletarServico(Conexao con){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o código do Servico a ser Deletado: ");
        int codservico = input.nextInt();    
        
        servicoBean bb = new servicoBean(codservico);
        servicoModel.delete(bb, con);
        System.out.println("Servico deletado com sucesso!");     
    }
    
}
