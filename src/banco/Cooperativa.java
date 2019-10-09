package banco;

import java.util.Date;


public class Cooperativa extends Banco {
    
    private int numeroDeSocios;
    private boolean tasaAltaDeInteres;
    private String nombreCliente;       

    public Cooperativa(int numeroDeSocios, boolean tasaAltaDeInteres, String nombreCliente, int numeroDeCajas, int numeroDeTrabajadores, Date fechaDeApertura, String nombreDelDueno, boolean tieneSucursales) {
        super(numeroDeCajas, numeroDeTrabajadores, fechaDeApertura, nombreDelDueno, tieneSucursales);
        this.numeroDeSocios = numeroDeSocios;
        this.tasaAltaDeInteres = tasaAltaDeInteres;
        this.nombreCliente = nombreCliente;
    }
    
    public void aumentarTasaDeInteres(){
        this.tasaAltaDeInteres = true;
        
     }
    public void cambiarNombre (String NombreCliente){
        String cambiarNombre = null;
        this.nombreCliente = cambiarNombre;
    
    }
    
    public int getNumeroDeSocios(){
         return numeroDeSocios;
    }
    
    public void setNumeroDeSocios(int numeroDeSocios){
        this.numeroDeSocios = numeroDeSocios;
        
        
        
    }

    public boolean isTasaAltaDeInteres() {
        return tasaAltaDeInteres;
    }

    public void setTasaAltaDeInteres(boolean tasaAltaDeInteres) {
        this.tasaAltaDeInteres = tasaAltaDeInteres;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    

}


