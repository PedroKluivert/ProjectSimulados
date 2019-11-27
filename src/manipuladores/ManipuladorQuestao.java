package manipuladores;

import Conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM questoes WHERE id = ?");
            stmt.setInt(1, questao.getId());
            rs = stmt.executeQuery();
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "ID indisponível!");
            } else {
                stmt = con.prepareStatement("INSERT INTO questoes "
                        + "(id, texto, tipo, resposta, id_assunto, cod_usuario)"
                        + " VALUES (?, ?, ?, ?, ?, ?)");
                stmt.setInt(1, questao.getId());
                stmt.setString(2, questao.getTexto());
                stmt.setString(3, questao.getTipo());
                stmt.setString(4, questao.getResposta());
                stmt.setInt(5, questao.getId_Assunto());
                stmt.setString(6, questao.getCod_usuario());

                stmt.executeUpdate();

                JOptionPane.showMessageDialog(null, "Questão cadastrada!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha no cadastro!"+ex);
            Logger.getLogger(ManipuladorAssunto.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    }
    
//    public List<Integer> IDs_Assuntos(Usuario usuario){
//        Connection con = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        ResultSet rs = null;
//        List<Integer> ListaIDsAssuntos = new ArrayList<Integer>();
//        try {
//            stmt = con.prepareStatement("SELECT * FROM assuntos WHERE cod_usuario = (?)");
//            stmt.setString(1, usuario.getCod());
//        
//            rs = stmt.executeQuery();
//            while(rs.next()){
//                ListaIDsAssuntos.add(rs.getInt("id"));
//            }
//        }catch (SQLException ex) {
//            System.out.println(ex);
//            JOptionPane.showMessageDialog(null, "ERROR: "+ex);
//        }finally{
//            ConnectionFactory.closeConnection(con, stmt, rs);
//        }
//        
//        return ListaIDsAssuntos;
//    }
    
    public List<Questao> Listagem(Usuario usuario){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Questao> ListaQuestoes = new ArrayList<Questao>();
        try {
            
            stmt = con.prepareStatement("SELECT * FROM questoes WHERE cod_usuario = (?)");
            stmt.setString(1, usuario.getCod());

            rs = stmt.executeQuery();
            
            
            while(rs.next()){
                Questao questaoAtual = new Questao();
                questaoAtual.setId(rs.getInt("id"));
                questaoAtual.setTexto(rs.getString("texto"));
                questaoAtual.setTipo(rs.getString("tipo"));
                questaoAtual.setResposta(rs.getString("resposta"));
                questaoAtual.setId_Assunto(rs.getInt("id_assunto"));
                ListaQuestoes.add(questaoAtual);
            }
            
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "ERROR: "+ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return ListaQuestoes;
    }
    
    public void Edicao(Questao questao){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE questoes SET texto = (?)"
                    + " WHERE id = (?) AND cod_usuario = (?)");
            stmt.setString(1, questao.getTexto());
            stmt.setInt(2, questao.getId());
            stmt.setString(3, questao.getCod_usuario());
            
            stmt.executeUpdate();
            
            stmt = con.prepareStatement("UPDATE questoes SET tipo = (?)"
                    + " WHERE id = (?) AND cod_usuario = (?)");
            JOptionPane.showMessageDialog(null, questao.getTipo());
            stmt.setString(1, questao.getTipo());
            stmt.setInt(2, questao.getId());
            stmt.setString(3, questao.getCod_usuario());
            
            stmt.executeUpdate();
            
            stmt = con.prepareStatement("UPDATE questoes SET resposta = (?)"
                    + " WHERE id = (?) AND cod_usuario = (?)");
            stmt.setString(1, questao.getResposta());
            stmt.setInt(2, questao.getId());
            stmt.setString(3, questao.getCod_usuario());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Questão atualizada!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: "+ex);
            System.out.println(ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
    }
    }
    
    public void Excluir(Questao questao){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM questoes WHERE id = (?)"
                    + " AND cod_usuario = (?)");
            stmt.setInt(1, questao.getId());
            stmt.setString(2, questao.getCod_usuario());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Questão excluída!");
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "ERROR: "+ex);
            System.out.println(ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
    }
    }
}
