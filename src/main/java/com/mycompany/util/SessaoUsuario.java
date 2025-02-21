package com.mycompany.util;

import com.mycompany.models.AdministradorModel;
import com.mycompany.models.MedicoModel;

public class SessaoUsuario {

    private static AdministradorModel usuarioLogado;
    private static MedicoModel usuarioLogadoMedicoModel;

    public static void setUsuario(AdministradorModel usuario) {
        usuarioLogado = usuario;
    }

    public static AdministradorModel getUsuario() {
        return usuarioLogado;
    }

    public static void setUsuario(MedicoModel usuario) {
        usuarioLogadoMedicoModel = usuario;
    }

    public static MedicoModel getUsuarioMedico() {
        return usuarioLogadoMedicoModel;
    }

    public static void limparSessao() {
        usuarioLogado = null;
    }

}
