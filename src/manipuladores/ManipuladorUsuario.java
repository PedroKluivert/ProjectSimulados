package manipuladores;

import Conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import modelo.Usuario;

public class ManipuladorUsuario {
    
    public void Cadastrar(Usuario usuario){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO usuarios (cod, nome, senha) VALUES (?, ?, ?)");
            stmt.setString(1, usuario.getCod());
            stmt.setString(2, usuario.getNome());
            stmt.setString(3, usuario.getSenha());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha no cadastro!"+ex);
            Logger.getLogger(ManipuladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public boolean checkLogin(String cod, String senha) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM usuarios WHERE cod = ? and senha = ?");
            stmt.setString(1, cod);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {
                check = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
        return check;
    }
    
 }