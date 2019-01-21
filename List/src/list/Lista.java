
package list;
/**
 *
 * @author codemcmhome
 */
public class Lista {
    
    Nodo cabeza;
    public Lista() {
        cabeza =null;
    }
    
    public void insertarElemento(String nombre) {
        Nodo nombreNuevo = new Nodo(nombre);
        
        if(cabeza == null){
            cabeza =nombreNuevo;
        } else {
            nombreNuevo.siguiente = cabeza;
            cabeza = nombreNuevo;
        }
    }
}
