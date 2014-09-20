/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author User
 */
public class AlumnoTrabajador  extends Alumno{
     private Double descuento;
     
     @Override
     public double getDescuento(){
        return 0.20;
    }
}
