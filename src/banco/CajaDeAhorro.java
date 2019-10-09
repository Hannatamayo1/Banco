package banco;

import java.util.Date;


public class CajaDeAhorro extends Banco {
    
    private boolean sonConfiables;
    private Date fechaDeApertura;
    private int cantidadDeTrabajadores;

    public CajaDeAhorro(boolean sonConfiables,int cantidadDeTrabajadores, int numeroDeCajas, int numeroDeTrabajadores, Date fechaDeApertura, String nombreDelDueno, boolean tieneSucursales) {
        super(numeroDeCajas, numeroDeTrabajadores, fechaDeApertura, nombreDelDueno, tieneSucursales);
        this.sonConfiables = sonConfiables;
        this.fechaDeApertura = fechaDeApertura;
        this.cantidadDeTrabajadores = cantidadDeTrabajadores;
    }
    
    public void contratarTrabajadores(int nuevoTrabajador){
          this.cantidadDeTrabajadores = nuevoTrabajador;
          

    public void contratarTrabajadores(){           
        this.cantidadDeTrabajadores = cantidadDeTrabajadores+2; 
    }
    
    public boolean isSonConfiables() {
        return sonConfiables;
    }

    public void setSonConfiables(boolean sonConfiables) {
        this.sonConfiables = sonConfiables;
    }

    public Date getFechaDeApertura() {
        return fechaDeApertura;
    }

    @Override
    public void setFechaDeApertura(Date fechaDeApertura) {
        this.fechaDeApertura = fechaDeApertura;
    }

    public int getCantidadDeTrabajadores() {
        return cantidadDeTrabajadores;
    }

    public void setCantidadDeTrabajadores(int cantidadDeTrabajadores) {
        this.cantidadDeTrabajadores = cantidadDeTrabajadores;
    }
          
         }


                }
    
    

    

