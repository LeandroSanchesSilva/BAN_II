package Barbeiro;

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

public class barbeiroModel {
    static void create(barbeiroBean m, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("INSERT INTO barbeiro (codbarbeiro, nome, estilo) "
                    + "VALUES (( Select max(a.codbarbeiro)+1 From barbeiro a ),?,?)");
            st.setString(1, m.getNome());
            st.setString(2, m.getEstilo());
            st.execute();
            st.close();
    }

    static HashSet listAll(Connection con) throws SQLException {
        Statement st;
    HashSet list = new HashSet();
        st = con.createStatement();
        String sql = "Select codbarbeiro, nome, estilo From barbeiro";
        ResultSet result = st.executeQuery(sql);
        while(result.next()) {
            list.add(new barbeiroBean(result.getInt(1), result.getString(2), result.getString(3)));
        }
        return list;

    }

    static void update(barbeiroBean m, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("Update barbeiro Set nome = ?, estilo = ? "
                    + "Where codbarbeiro = ?");
            st.setInt(3, m.getCodbarbeiro());
            st.setString(1, m.getNome());
            st.setString(2, m.getEstilo());
            st.execute();
            st.close();
    }

    static void delete(barbeiroBean m, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("Delete from barbeiro Where codbarbeiro = ?");
            st.setInt(1, m.getCodbarbeiro());
            st.execute();
            st.close();
    }
    
}
