package Barbeiro;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Leandro
 */

public class barbeiroController {
    public void createBarbeiro(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para criar um novo Barbeiro: ");
        System.out.print("nome: ");
        String nome = input.next();
        System.out.print("estilo: ");
        String estilo = input.next();    
        
        barbeiroBean bb = new barbeiroBean(nome, estilo);
        barbeiroModel.create(bb, con);
        System.out.println("Barbeiro criado com sucesso!");     
    }

    public void listarBarbeiro(Connection con) throws SQLException {
        HashSet all = barbeiroModel.listAll (con);
        Iterator<barbeiroBean> it = all.iterator();
        while(it.hasNext()) {
        System.out.println(it.next().toString());
        }
    }

    public void alterarBarbeiro(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe os seguintes dados para atualizar as informacoes de um Barbeiro já cadastrado: ");
        System.out.print("codbarbeiro: ");
        int codbarbeiro = input.nextInt();
        System.out.print("nome: ");
        String nome = input.next();
        System.out.print("estilo: ");
        String estilo = input.next();    
        
        barbeiroBean bb = new barbeiroBean(codbarbeiro, nome, estilo);
        barbeiroModel.update(bb, con);
        System.out.println("Barbeiro atualizado com sucesso!");     
    }

    public void deletarBarbeiro(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o código do Barbeiro a ser Deletado: ");
        int codbarbeiro = input.nextInt();    
        
        barbeiroBean bb = new barbeiroBean(codbarbeiro);
        barbeiroModel.delete(bb, con);
        System.out.println("Barbeiro deletado com sucesso!");     
    }

}
