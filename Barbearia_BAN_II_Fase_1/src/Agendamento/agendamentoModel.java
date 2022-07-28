package Agendamento;

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

public class agendamentoModel {

    static void create(agendamentoBean m, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("INSERT INTO agendamento (codagendamento, codcliente, codbarbeiro, codservico, data, hora) "
                    + "VALUES (( Select max(a.codagendamento)+1 From agendamento a ),?,?,?,?,?)");
            st.setInt(1, m.getCodcliente());
            st.setInt(2, m.getCodbarbeiro());
            st.setInt(3, m.getCodservico());
            st.setString(4, m.getData());
            st.setString(5, m.getHora());
            st.execute();
            st.close();
    }

    static HashSet listAll(Connection con) throws SQLException {
        Statement st;
    HashSet list = new HashSet();
        st = con.createStatement();
        String sql = "Select codagendamento, codcliente, codbarbeiro, codservico, data, hora From agendamento";
        ResultSet result = st.executeQuery(sql);
        while(result.next()) {
            list.add(new agendamentoBean(result.getInt(1), result.getInt(2), result.getInt(3), result.getInt(4), result.getString(5), result.getString(6)));
        }
        return list;
    }
    
    static void update(agendamentoBean m, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("Update agendamento Set codcliente = ?, codbarbeiro = ?, codservico = ?, data = ?, hora = ?"
                    + "Where codagendamento = ?");
            st.setInt(6, m.getCodagendamento());
            st.setInt(1, m.getCodcliente());
            st.setInt(2, m.getCodbarbeiro());
            st.setInt(3, m.getCodservico());
            st.setString(4, m.getData());
            st.setString(5, m.getHora());
            st.execute();
            st.close();
    }

    static void delete(agendamentoBean m, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("Delete from agendamento Where codagendamento = ?");
            st.setInt(1, m.getCodagendamento());
            st.execute();
            st.close();
    }
}
