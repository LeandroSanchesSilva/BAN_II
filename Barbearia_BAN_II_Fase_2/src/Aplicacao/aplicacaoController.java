package Aplicacao;

import Conexao.Conexao;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Leandro
 */

public class aplicacaoController {
    public void createAplicacao(Conexao con){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para cadastrar uma nova Aplicação: ");
        System.out.print("codservico: ");
        int codservico = input.nextInt();
        System.out.print("codcosmetico: ");
        int codcosmetico = input.nextInt();    
        
        aplicacaoBean ab = new aplicacaoBean(codservico, codcosmetico);
        aplicacaoModel.create(ab, con);
        System.out.println("Aplicação cadastrada com sucesso!");     
    }

    public void listarAplicacao(Conexao con) {
        HashSet all = aplicacaoModel.listAll (con);
        Iterator<aplicacaoBean> it = all.iterator();
        while(it.hasNext()) {
        System.out.println(it.next().toString());
        }
    }

    public void alterarAplicacao(Conexao con){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe os seguintes dados para atualizar as informacoes de uma Aplicacao já cadastrada: ");
        System.out.print("codaplicacao: ");
        int codaplicacao = input.nextInt();
        System.out.print("codservico: ");
        int codservico = input.nextInt();
        System.out.print("codcosmetico: ");
        int codcosmetico = input.nextInt();    
        
        aplicacaoBean ab = new aplicacaoBean(codaplicacao, codservico, codcosmetico);
        aplicacaoModel.update(ab, con);
        System.out.println("Aplicacao atualizada com sucesso!");     
    }

    public void deletarAplicacao(Conexao con) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o código da Aplicacao a ser Deletada: ");
        int codaplicacao = input.nextInt();    
        
        aplicacaoBean bb = new aplicacaoBean(codaplicacao);
        aplicacaoModel.delete(bb, con);
        System.out.println("Aplicacao deletada com sucesso!");     
    }
}

