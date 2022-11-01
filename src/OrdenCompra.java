import java.util.Date;

public class OrdenCompra {

    private int id;
    private static int ultimoId;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos = new Producto[4];
    private int indiceProducto;

    public OrdenCompra(String descripcion) {
        this.id = ++this.ultimoId;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public static int getUltimoId() {
        return ultimoId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProducto(Producto producto){
        if(this.indiceProducto < this.productos.length){
            this.productos[this.indiceProducto++] = producto;
        }
    }

    public int granTotal(){
        int total=0;
        int tamanio = productos.length;
        for (int i = 0; i < tamanio; i++){
            total += productos[i].getPrecio();
        }
        return total;
    }
}
