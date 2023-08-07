/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.Date;


public class clase1 {
    private int id;
    private String noTanquegas;
    private Date fecha;
    private String horaEncendido;
    private String horaApagado;
    private String nombrePrende;
    private String nombreApaga;
    private String porcentajeGas;
    private String elaboradoG;
    private String observacionesG;
    
    public clase1(){
        
    }

    public clase1(String noTanquegas, Date fecha, String horaEncendido, String horaApagado, String nombrePrende, String nombreApaga, String porcentajeGas, String elaboradoG, String observacionesG, int id) {
        this.noTanquegas = noTanquegas;
        this.fecha = fecha;
        this.horaEncendido = horaEncendido;
        this.horaApagado = horaApagado;
        this.nombrePrende = nombrePrende;
        this.nombreApaga = nombreApaga;
        this.porcentajeGas = porcentajeGas;
        this.elaboradoG = elaboradoG;

        this.id = id;
        
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNoTanquegas() {
        return noTanquegas;
    }

    public void setNoTanquegas(String noTanquegas) {
        this.noTanquegas = noTanquegas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHoraEncendido() {
        return horaEncendido;
    }

    public void setHoraEncendido(String horaEncendido) {
        this.horaEncendido = horaEncendido;
    }

    public String getHoraApagado() {
        return horaApagado;
    }

    public void setHoraApagado(String horaApagado) {
        this.horaApagado = horaApagado;
    }

    public String getNombrePrende() {
        return nombrePrende;
    }

    public void setNombrePrende(String nombrePrende) {
        this.nombrePrende = nombrePrende;
    }

    public String getNombreApaga() {
        return nombreApaga;
    }

    public void setNombreApaga(String nombreApaga) {
        this.nombreApaga = nombreApaga;
    }

    public String getPorcentajeGas() {
        return porcentajeGas;
    }

    public void setPorcentajeGas(String porcentajeGas) {
        this.porcentajeGas = porcentajeGas;
    }

    public String getElaboradoG() {
        return elaboradoG;
    }

    public void setElaboradoG(String elaboradoG) {
        this.elaboradoG = elaboradoG;
    }

    
    
    
    
}
 
