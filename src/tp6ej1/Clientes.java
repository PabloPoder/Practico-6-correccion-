/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6ej1;

/**
 *
 * @author pablo
 */
public class Clientes {

//    Atributos
    private String nombre;
    private String apellido;
    private String domicilio;
    private String ciudad;
    private String nroTelefono;
    private String dni;
    
    
//    Constructor
    public Clientes(String nombre, String apellido, String domicilio, String ciudad, String nroTelefono, String dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.ciudad = ciudad;
        this.nroTelefono = nroTelefono;
        this.dni = dni;
    }
    
//    Get Set
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public String getDomicilio(){
        return domicilio;
    }
    public void setDomicilio(String domicilio){
        this.domicilio = domicilio;
    }
    
    public String getCiudad(){
        return ciudad;
    }
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }
    
    public String getNroTelefono(){
        return nroTelefono;
    }
    public void setNroTelefono(String nroTelefono){
        this.nroTelefono = nroTelefono;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getDni() {
        return dni;
    }

}
