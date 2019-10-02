package banco;

import java.util.Date;

public class Banco {

    private int numeroDeCajas;
    private int numeroDeTrabajadores;
    private Date fechaDeApertura;
    private String nombreDelDueno;
    private boolean tieneSucursales;

    public Banco(int numeroDeCajas, int numeroDeTrabajadores, Date fechaDeApertura, String nombreDelDueno, boolean tieneSucursales) {
        this.numeroDeCajas = numeroDeCajas;
        this.numeroDeTrabajadores = numeroDeTrabajadores;
        this.fechaDeApertura = fechaDeApertura;
        this.nombreDelDueno = nombreDelDueno;
        this.tieneSucursales = tieneSucursales;
    }

    public int getNumeroDeCajas() {
        return numeroDeCajas;
    }

    public void setNumeroDeCajas(int numeroDeCajas) {
        this.numeroDeCajas = numeroDeCajas;
    }

    public int getNumeroDeTrabajadores() {
        return numeroDeTrabajadores;
    }

    public void setNumeroDeTrabajadores(int numeroDeTrabajadores) {
        this.numeroDeTrabajadores = numeroDeTrabajadores;
    }

    public Date getFechaDeApertura() {
        return fechaDeApertura;
    }

    public void setFechaDeApertura(Date fechaDeApertura) {
        this.fechaDeApertura = fechaDeApertura;
    }

    public String getNombreDelDueno() {
        return nombreDelDueno;
    }

    public void setNombreDelDueno(String nombreDelDueno) {
        this.nombreDelDueno = nombreDelDueno;
    }

    public boolean isTieneSucursales() {
        return tieneSucursales;
    }

    public void setTieneSucursales(boolean tieneSucursales) {
        this.tieneSucursales = tieneSucursales;
    }

    
}
