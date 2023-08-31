package lab1tp6;

import java.util.ArrayList;

/**
 *
 * @author Leonel
 */
public class ListaProductos {

    private final ArrayList<Producto> productos;
    private final ArrayList<Observador> observadores;

    public ListaProductos() {
        productos = new ArrayList();
        observadores = new ArrayList();
    }

    public boolean agregar(Producto producto) {
        boolean b = productos.add(producto);
        if (b) {
            notificarObservadores();
        }
        return b;
    }

    public boolean quitar(Producto producto) {
        boolean b = productos.remove(producto);
        if (b) {
            notificarObservadores();
        }
        return b;
    }

    public Producto[] getProductos() {
        Producto[] p = new Producto[productos.size()];
        return productos.toArray(p);
    }

    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar();
        }
    }

    public void quitarObservador(Observador observador) {
        observadores.remove(observador);
    }
}
