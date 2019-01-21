package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author codemcmhome
 */
public class Lista {
    Nodo principal;
    
    public Lista(){
        principal = null;
    }
    
    public void insertarNodo(String nombre){
        Nodo nombreNuevo = new Nodo(nombre);
        
        if(principal == null) {
            principal =nombreNuevo;
        }else{
            nombreNuevo.siguiente = principal;
            principal = nombreNuevo;
        }
        
        JOptionPane.showMessageDialog(null,"Se registro correctamente");
    }
    
    public String mostrarLista(){
        
        Nodo auxiliar = principal;
        String lista = "Lista de alumnos \n";
        while(auxiliar!=null){
            lista += auxiliar.nombre + " \n";
            auxiliar = auxiliar.siguiente;
        }
        
        return lista;
    }
    
    public void eliminarAlumno() {
        if(principal != null) {
            principal = principal.siguiente;
        }else{
            JOptionPane.showMessageDialog(null, "No tiene alumnos la lista");
        }
        
        
    }
}
