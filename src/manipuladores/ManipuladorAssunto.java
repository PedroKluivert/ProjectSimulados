package manipuladores;

import Conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Assunto;

/*
 * @author Pedro Kluivert
 */
public class ManipuladorAssunto {
    
    public void cadastrar(Assunto assunto){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO assuntos "
                    + "(id, nome, datacadastro, quantidade, cod_usuario) VALUES (?, ?, ?, ?, ?)");
            stmt.setInt(1, assunto.getId());
            stmt.setString(2, assunto.getNome());
            stmt.setString(3, assunto.getDataCadastro());
            stmt.setInt(4, assunto.getQuantidade());
            stmt.setString(5, assunto.getCod_usuario());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Assunto cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha no cadastro!"+ex);
            Logger.getLogger(ManipuladorAssunto.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public String Listagem(){
        return null;
    }
    
    public void Edicao(){
    
    }
    
    public boolean Eclusao(){
        return false;
    }
    
}
