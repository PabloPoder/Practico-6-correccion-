/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6ej1;

import java.util.ArrayList;
import java.util.HashMap;

public class DirectorioTelefonico {
    
   HashMap<String, Clientes> miDirectorio = new HashMap<> ();
       
   //Metodos
   
    public void agregarCliente(String numero, Clientes cliente){
       System.out.println("-----------------------------------");
        if(!miDirectorio.containsKey(numero)){
            miDirectorio.put(numero, cliente);
            System.out.println("Cliente registrado");
            
        }else{
            System.out.println("Ese cliente ya esta registrado");
        }
    }
    
    public Clientes buscarCliente(String numero){
        return miDirectorio.get(numero);
    }
    
    public ArrayList<String> buscarTelefonos(String apellido){
        
        ArrayList<String> clientesApellido = new ArrayList<>();
        
        for(String numero : miDirectorio.keySet()){
            if(miDirectorio.get(numero).getApellido().equalsIgnoreCase(apellido)){
                clientesApellido.add(numero);
//                System.out.println(miDirectorio.get(numero).getApellido());
            }
        }
        
        return clientesApellido;
    }
    
    public ArrayList<Clientes> buscarClientes(String ciudad){
        
        ArrayList<Clientes> clientesCiudad = new ArrayList<>();
        
        for(String numero : miDirectorio.keySet()){
            if(miDirectorio.get(numero).getCiudad().equalsIgnoreCase(ciudad)){
                clientesCiudad.add(miDirectorio.get(numero));
//                System.out.println(miDirectorio.get(numero).getApellido());
            }
        }
        return clientesCiudad;
    }
    
    public void borrarCliente(String dni){
        boolean borrado = false;
        
        for (String numero : miDirectorio.keySet()) {
            if(miDirectorio.get(numero).getDni().equals(dni)){  
                System.out.println("Cliente: " + miDirectorio.get(numero).getApellido() + " borrado.");
                miDirectorio.remove(numero);
                borrado = true;
                break;
            }
        }
        if(!borrado){
            System.out.println("Cliente no encontrado.");
        }
    }  
    
}
    
