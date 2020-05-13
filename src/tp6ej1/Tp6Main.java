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
public class Tp6Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        //Creacion de un directorio
        DirectorioTelefonico directorioTelefonico = new DirectorioTelefonico();
        
        //Creacion de Personas/Clientes
        Clientes cliente = new Clientes("Pablo", "Poder", "Cerros Colorados", "Juana Koslay", "45.456.496");
        Clientes cliente1 = new Clientes("Calos", "Juarez", "Cerros Colorados", "Juana Koslay", "23.498.456");
        Clientes cliente2 = new Clientes("Mario", "Gomez", "Cerros Colorados", "San Luis", "12.266.786");
        Clientes cliente3 = new Clientes("Nacho", "Cruceno", "Miami", "Calle Francia", "78.366.86");
        Clientes cliente4 = new Clientes("Luis", "Mercado", "Los Lapachos", "La Punta", "23.248.778");
        Clientes cliente5 = new Clientes("Luis", "Mercado", "Los Lapachos", "La Punta", "23.248.778");
        
        
        //Anniadiendo clientes
        directorioTelefonico.agregarCliente("2664 507432", cliente);
        directorioTelefonico.agregarCliente("2664 505562", cliente1);
        directorioTelefonico.agregarCliente("2664 122362", cliente2);
        directorioTelefonico.agregarCliente("2664 698571", cliente3);
        directorioTelefonico.agregarCliente("2664 585121", cliente4);
        directorioTelefonico.agregarCliente("2664 202020", cliente5);
       
        //Anniadiendo cliente repetido
        directorioTelefonico.agregarCliente("2664 585121", cliente4);
        
        
        //Buscar cliente por 'numero'
        directorioTelefonico.buscarCliente("2664 505080");
        
        //Buscar clientes por 'ciudad'
        directorioTelefonico.buscarClientes("Juana Koslay");
                
        //Buscar cliente por 'apellido'
        directorioTelefonico.buscarTelefonos("Mercado");
        
        //Borrar cliente por 'dni'
        directorioTelefonico.borrarCliente("45.456.496");

    }
}
