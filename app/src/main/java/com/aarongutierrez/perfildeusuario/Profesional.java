package com.aarongutierrez.perfildeusuario;

public class Profesional {
    private String razonSocial;
    private String cif;
    private String direccion;
    private String paginaWeb;
    private String correoElectronico;



    public Profesional(String razonSocial, String cif, String direccion, String paginaWeb, String correoElectronico) {
        this.razonSocial = razonSocial;
        this.cif = cif;
        this.direccion = direccion;
        this.paginaWeb = paginaWeb;
        this.correoElectronico = correoElectronico;
    }
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
