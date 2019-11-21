package manipuladores;

import Conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Assunto;
import modelo.Questao;
import modelo.Usuario;

/**
 *
 * @author pedro
 */
public class ManipuladorQuestao {
    
    public int busca_ID_Assunto(Usuario usuario, String Nome_Assunto){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int ID = 0;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM assuntos WHERE cod_usuario = (?) AND "
                    + "nome = (?)");
            stmt.setString(1, usuario.getCod());
            stmt.setString(2, Nome_Assunto);
            
            rs = stmt.executeQuery();
            while(rs.next()){
                if(rs.getString("nome").equals(Nome_Assunto)){
                    ID = rs.getInt("id");
                } 
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: "+ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return ID;
    }
    
    public void cadastrar(Questao questao){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO questoes "
                    + "(id, texto, tipo, resposta, id_assunto) VALUES (?, ?, ?, ?, ?)");
            stmt.setInt(1, questao.getId());
            stmt.setString(2, questao.getTexto());
            stmt.setString(3, questao.getTipo());
            stmt.setString(4, questao.getResposta());
            stmt.setInt(5, questao.getId_Assunto());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Questão cadastrada!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha no cadastro!"+ex);
            Logger.getLogger(ManipuladorAssunto.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
