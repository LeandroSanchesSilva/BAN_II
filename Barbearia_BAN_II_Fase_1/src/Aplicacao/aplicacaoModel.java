package Aplicacao;

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

public class aplicacaoModel {
    static void create(aplicacaoBean m, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("INSERT INTO aplicacao (codaplicacao, codservico, codcosmetico) "
                    + "VALUES (( Select max(a.codaplicacao)+1 From aplicacao a ),?,?)");
            st.setInt(1, m.getCodservico());
            st.setInt(2, m.getCodcosmetico());
            st.execute();
            st.close();
    }

    static HashSet listAll(Connection con) throws SQLException {
        Statement st;
    HashSet list = new HashSet();
        st = con.createStatement();
        String sql = "Select codaplicacao, codcosmetico, codservico From aplicacao";
        ResultSet result = st.executeQuery(sql);
        while(result.next()) {
            list.add(new aplicacaoBean(result.getInt(1), result.getInt(2), result.getInt(3)));
        }
        return list;
    }

    static void update(aplicacaoBean m, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("Update aplicacao Set codservico = ?, codcosmetico = ?"
                    + "Where codaplicacao = ?");
            st.setInt(3, m.getCodaplicacao());
            st.setInt(1, m.getCodservico());
            st.setInt(2, m.getCodcosmetico());
            st.execute();
            st.close();
    }

    static void delete(aplicacaoBean m, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("Delete from aplicacao Where codaplicacao = ?");
            st.setInt(1, m.getCodaplicacao());
            st.execute();
            st.close();
    }
}
