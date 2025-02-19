package com.mycompany.controllers;

import com.google.gson.reflect.TypeToken;
import com.mycompany.models.AdministradorModel;
import com.mycompany.persistence.JSONManager;
import java.util.List;

/**
 *
 * @author adria
 */
public class AdministradorController {

    private static final String ADMIN_FILE = "admins.json";

    private List<AdministradorModel> admins;

    public AdministradorController() {
        carregarDados();
    }

    private void carregarDados() {
        this.admins = JSONManager.carregarLista(ADMIN_FILE, new TypeToken<List<AdministradorModel>>() {
        });

    }
    public void salvarDados(){
        JSONManager.salvarLista(ADMIN_FILE, admins);
    }
    
    // Métodos para Administradores
    public void cadastrarAdmin(AdministradorModel admin) {
        admins.add(admin);
        salvarDados();
    }
    
    //Metodo remove admin pelo ID
    public void removerAdmin(String idAdmin) {
        admins.removeIf(a -> a.getId().equals(idAdmin));
        salvarDados();
    }
    
    public AdministradorModel buscarPeloEmail(String email){
        return admins.stream().filter(a -> a.getEmail().equals(email)).findFirst().orElse(null);
    }
    
    public boolean isAdmin(String id ){
        return admins.stream().anyMatch(a -> a.getId().equals(id));
    }
}
