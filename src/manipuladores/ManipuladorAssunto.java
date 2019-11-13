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
            
            JOptionPane.showMessageDialog(null, "Assunto cadastrado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha no cadastro!"+ex);
            Logger.getLogger(ManipuladorAssunto.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Assunto> Listagem(Usuario usuario){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Assunto> ListaAssuntos = new ArrayList<Assunto>();
        try {
            stmt = con.prepareStatement("SELECT * FROM assuntos WHERE cod_usuario = (?)");
            stmt.setString(1, usuario.getCod());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Assunto assuntoAtual = new Assunto();
                assuntoAtual.setId(rs.getInt("id"));
                assuntoAtual.setNome(rs.getString("nome"));
                assuntoAtual.setDataCadastro(rs.getString("datacadastro"));
                assuntoAtual.setQuantidade(rs.getInt("quantidade"));
                ListaAssuntos.add(assuntoAtual);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: "+ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return ListaAssuntos;
    }
    
    public void Edicao(Assunto assunto){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE assuntos SET nome = (?)"
                    + " WHERE id = (?) AND cod_usuario = (?)");
            stmt.setString(1, assunto.getNome());
            stmt.setInt(2, assunto.getId());
            stmt.setString(3, assunto.getCod_usuario());
            
            stmt.executeUpdate();
            
            stmt = con.prepareStatement("UPDATE assuntos SET quantidade = (?)"
                    + " WHERE id = (?) AND cod_usuario = (?)");
            stmt.setInt(1, assunto.getQuantidade());
            stmt.setInt(2, assunto.getId());
            stmt.setString(3, assunto.getCod_usuario());
            
            stmt.executeUpdate();
            
            stmt = con.prepareStatement("UPDATE assuntos SET datacadastro = (?)"
                    + " WHERE id = (?) AND cod_usuario = (?)");
            stmt.setString(1, assunto.getDataCadastro());
            stmt.setInt(2, assunto.getId());
            stmt.setString(3, assunto.getCod_usuario());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Assunto atualizado!");
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "ERROR: "+ex);
            System.out.println(ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
    }
           
}
    
    public void Excluir(Assunto assunto){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM assuntos WHERE id = (?)"
                    + " AND cod_usuario = (?)");
            stmt.setInt(1, assunto.getId());
            stmt.setString(2, assunto.getCod_usuario());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Assunto excluído!");
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "ERROR: "+ex);
            System.out.println(ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
    }
    }
    
    
}
