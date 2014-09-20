/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author User
 */
public class Alumno extends Persona{
    
    private String nroCarnet;

    public Alumno() {
    }

    public Alumno(String apellidoPaterno, String apellidoMaterno, String nombres, String nroCarnet) {
        super(apellidoPaterno, apellidoMaterno, nombres);
        this.nroCarnet = nroCarnet;
    }

    public Alumno(Integer codigo, String apellidoPaterno, String apellidoMaterno, String nombres, String nroCarnet) {
        super(codigo, apellidoPaterno, apellidoMaterno, nombres);
        this.nroCarnet = nroCarnet;
    }

    public String getNroCarnet() {
        return nroCarnet;
    }

    public void setNroCarnet(String nroCarnet) {
        this.nroCarnet = nroCarnet;
    }

    @Override
    public String getNombreCompleto() {
        return super.getNombreCompleto()+ " " +this.getNroCarnet();
    }

    @Override
    public Integer getPrefijo() {
        return 2;
    }
    
    public final double getDescuento(){
        return 0.10;
    }
}
