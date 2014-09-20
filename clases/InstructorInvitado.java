/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author User
 */
public class InstructorInvitado extends Instructor{

    private final int NRO_INVITACIONES=1; // constante (No cambia) 
    
    public InstructorInvitado() {
        //nroInvitaciones=2;
    }

    @Override
    public double getSueldo() {
        return 50.0;
    }
    
}
