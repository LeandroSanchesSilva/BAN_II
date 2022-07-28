package Cosmetico;

import Barbeiro.barbeiroBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

/**
 *
 * @author Lenovo
 */

public class cosmeticoModel {


    static void create(cosmeticoBean m, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("INSERT INTO cosmetico(codcosmetico, descricao) "
                    + "VALUES (( Select max(a.codcosmetico)+1 From cosmetico a ),?)");
            st.setString(1, m.getDescricao());
            st.execute();
            st.close();
    }

    static HashSet listAll(Connection con) throws SQLException {
        Statement st;
    HashSet list = new HashSet();
        st = con.createStatement();
        String sql = "Select codcosmetico, descricao From cosmetico";
        ResultSet result = st.executeQuery(sql);
        while(result.next()) {
            list.add(new cosmeticoBean(result.getInt(1), result.getString(2)));
        }
        return list;

    }

    static void update(cosmeticoBean m, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("Update cosmetico Set descricao = ? "
                    + "Where codcosmetico = ?");
            st.setInt(2, m.getCodcosmetico());
            st.setString(1, m.getDescricao());
            st.execute();
            st.close();
    }

    static void delete(cosmeticoBean m, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("Delete from cosmetico Where codcosmetico = ?");
            st.setInt(1, m.getCodcosmetico());
            st.execute();
            st.close();
    }
    
}
