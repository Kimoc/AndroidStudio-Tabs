package com.aarongutierrez.perfildeusuario;

public class Personal {
    private String nif;
    private String nombre;
    private String apellidos;
    private String fechaNaciemiento;
    private String direccion;

    public Personal(String nif, String nombre, String apellidos, String fechaNaciemiento, String direccion) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNaciemiento = fechaNaciemiento;
        this.direccion = direccion;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNaciemiento() {
        return fechaNaciemiento;
    }

    public void setFechaNaciemiento(String fechaNaciemiento) {
        this.fechaNaciemiento = fechaNaciemiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
