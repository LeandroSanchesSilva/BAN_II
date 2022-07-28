package Cliente;

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

public class clienteModel {

    static void create(clienteBean m, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("INSERT INTO cliente (codcliente, nome, email, cpf) "
                    + "VALUES (( Select max(a.codcliente)+1 From cliente a ),?,?,?)");
            st.setString(1, m.getNome());
            st.setString(2, m.getEmail());
            st.setString(3, m.getCpf());
            st.execute();
            st.close();
    }

    static HashSet listAll(Connection con) throws SQLException {
        Statement st;
    HashSet list = new HashSet();
        st = con.createStatement();
        String sql = "Select codcliente, nome, email, cpf From cliente";
        ResultSet result = st.executeQuery(sql);
        while(result.next()) {
            list.add(new clienteBean(result.getInt(1), result.getString(2), result.getString(3), result.getString(4)));
        }
        return list;
    }

    static void update(clienteBean m, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("Update cliente Set nome = ?, email = ?, cpf = ? "
                    + "Where codcliente = ?");
            st.setInt(4, m.getCodcliente());
            st.setString(1, m.getNome());
            st.setString(2, m.getEmail());
            st.setString(3, m.getCpf());
            st.execute();
            st.close();
    }

    static void delete(clienteBean m, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("Delete from cliente Where codcliente = ?");
            st.setInt(1, m.getCodcliente());
            st.execute();
            st.close();
    }

}
