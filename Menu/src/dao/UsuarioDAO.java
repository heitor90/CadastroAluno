/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import factory.ConnectionFactory;
import modelo.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;
public class UsuarioDAO {
 private Connection connection;
 Long id;
 String nome;
 String cidade;
 String email;
 String telefone;
 String estado;
 public UsuarioDAO(){
 this.connection = new ConnectionFactory().getConnection();
 }
 public void adiciona(Usuario usuario){
 String sql = "INSERT INTO alunos (nome,cidade,email,telefone,estado) VALUES (?,?,?,?,?)";
 try {
         PreparedStatement stmt = connection.prepareStatement(sql);
         stmt.setString(1, usuario.getNome());
         stmt.setString(2, usuario.getCidade());
         stmt.setString(3, usuario.getEmail());
         stmt.setString(4, usuario.getTelefone());
         stmt.setString(5, usuario.getEstado());
         stmt.execute();
         stmt.close();
 }
 catch (SQLException u) {
 throw new RuntimeException(u);
 }

 } 
}

/**
 *
 * @author senai
 */
