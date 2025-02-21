/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author adria
 */
public class DataHora implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private Date data;
    private String formato = "dd/MM/yyyy HH:mm";
    
    public DataHora() {
        this.data = new Date();
    }
    
    public DataHora(Date data) {
        this.data = data;
    }
    
    public Date getData() {
        return data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    
    public String getFormato() {
        return formato;
    }
    
    public void setFormato(String formato) {
        this.formato = formato;
    }
    
    public String formatarData() {
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        return sdf.format(data);
    }
    
}
