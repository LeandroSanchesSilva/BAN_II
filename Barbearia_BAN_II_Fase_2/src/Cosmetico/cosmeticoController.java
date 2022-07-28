package Cosmetico;

import Conexao.Conexao;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Leandro
 */

public class cosmeticoController {
    public void createCosmetico(Conexao con){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para cadastrar um novo Cosmético: ");
        System.out.print("descrição: ");
        String descricao = input.next();
        
        cosmeticoBean cb = new cosmeticoBean(descricao);
        cosmeticoModel.create(cb, con);
        System.out.println("Cosmético cadastrado com sucesso!");     
    }

    public void listarCosmetico(Conexao con){
        HashSet all = cosmeticoModel.listAll (con);
        Iterator<cosmeticoBean> it = all.iterator();
        while(it.hasNext()) {
        System.out.println(it.next().toString());
        }
    }

    public void alterarCosmetico(Conexao con){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe os seguintes dados para atualizar as informacoes de um Cosmetico já cadastrado: ");
        System.out.print("codcosmetico: ");
        int codcosmetico = input.nextInt();
        System.out.print("descricao: ");
        String descricao = input.next();
        
        cosmeticoBean cb = new cosmeticoBean(codcosmetico, descricao);
        cosmeticoModel.update(cb, con);
        System.out.println("Cosmetico atualizado com sucesso!");     
    }

    public void deletarCosmetico(Conexao con){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o código do Cosmetico a ser Deletado: ");
        int codcosmetico = input.nextInt();    
        
        cosmeticoBean bb = new cosmeticoBean(codcosmetico);
        cosmeticoModel.delete(bb, con);
        System.out.println("Cosmetico deletado com sucesso!");     
    }
}
