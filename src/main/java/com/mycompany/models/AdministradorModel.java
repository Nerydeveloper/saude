package com.mycompany.models;

/**
 *
 * @author adria
 */
public class AdministradorModel extends UsuarioModel{
    
    public AdministradorModel(String nome, String email, String senha) {
        super(nome, email, senha, TipoUsuario.ADMIN);
    }
    
}
