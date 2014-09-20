/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author User
 */
public abstract class Persona {
    // Atributos
    public final Integer SEXO_MASCULINO=1;
    public final Integer SEXO_FEMENINO=2;
    
    private Integer codigo;
    private String  apellidoPaterno;
    private String  apellidoMaterno;
    private String  nombres;
    
    // Constructores

    public Persona() {
    }

    public Persona(String apellidoPaterno, String apellidoMaterno, String nombres) {
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombres = nombres;
    }

    public Persona(Integer codigo, String apellidoPaterno, String apellidoMaterno, String nombres) {
        this.codigo = codigo;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombres = nombres;
    }

    // Geters/Setters

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }   
    
    protected String getNombreCompleto(){
        return  this.getApellidoPaterno()+ " "+
                this.getApellidoMaterno()+ ", "+
                this.getNombres();
    }

    
    public Integer getSEXO_FEMENINO() {
        return SEXO_FEMENINO;
    }

    public Integer getSEXO_MASCULINO() {
        return SEXO_MASCULINO;
    }

       
    public abstract Integer getPrefijo();
}
