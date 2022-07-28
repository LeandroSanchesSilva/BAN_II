package Servico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

/**
 *
 * @author Leandro
 */

public class servicoModel {

    static void create(servicoBean m, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("INSERT INTO servico (codservico, descricao, valor) "
                    + "VALUES (( Select max(a.codservico)+1 From servico a ),?,?)");
            st.setString(1, m.getDescricao());
            st.setFloat(2, m.getValor());
            st.execute();
            st.close();
    }

    static HashSet listAll(Connection con) throws SQLException {
        Statement st;
    HashSet list = new HashSet();
        st = con.createStatement();
        String sql = "Select codservico, descricao, valor From servico";
        ResultSet result = st.executeQuery(sql);
        while(result.next()) {
            list.add(new servicoBean(result.getInt(1), result.getString(2), (int) result.getFloat(3)));
        }
        return list;
    }

    static void update(servicoBean m, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("Update servico Set descricao = ?, valor = ? "
                    + "Where codservico = ?");
            st.setInt(3, m.getCodservico());
            st.setString(1, m.getDescricao());
            st.setFloat(2, m.getValor());
            st.execute();
            st.close();
    }

    static void delete(servicoBean m, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("Delete from servico Where codservico = ?");
            st.setInt(1, m.getCodservico());
            st.execute();
            st.close();
    }
    
}
