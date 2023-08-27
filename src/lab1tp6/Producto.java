package lab1tp6;

/**
 *
 * @author Leonel
 */
public class Producto implements Comparable<Producto> {

    private int codigo;
    private String descripcion;
    private double precio;
    private int existencias;
    private String rubro;

    public Producto(int codigo, String descripcion, double precio, int existencias, String rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.existencias = existencias;
        this.rubro = rubro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    @Override
    public int compareTo(Producto o) {
        return Integer.compare(this.codigo, o.getCodigo());
    }

}
