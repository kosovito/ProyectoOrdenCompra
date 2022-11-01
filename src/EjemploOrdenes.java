import java.util.Date;


public class EjemploOrdenes {
    public static void main(String[] args) {

        //Orden1
        OrdenCompra orden1 = new OrdenCompra("Orden primera");
        Cliente cliente1 = new Cliente("Juan", "Gómez");
        Producto producto1 = new Producto("Vileda", "Fregona", 9);
        Producto producto2 = new Producto("Ajax", "Fregasuelos", 1);
        Producto producto3 = new Producto("MrProper", "Lejía", 2);
        Producto producto4 = new Producto("Lagarto", "Jabón", 1);
        orden1.setCliente(cliente1);
        orden1.setFecha(new Date());
        orden1.addProducto(producto1);
        orden1.addProducto(producto2);
        orden1.addProducto(producto3);
        orden1.addProducto(producto4);

        //Orden2
        OrdenCompra orden2 = new OrdenCompra("Orden segunda");
        Cliente cliente2 = new Cliente("Paco", "Pérez");
        Producto producto5 = new Producto("Antec", "Torre", 45);
        Producto producto6 = new Producto("Nvidia", "Tarjeta Gráfica", 135);
        Producto producto7 = new Producto("Intel", "Procesador", 220);
        Producto producto8 = new Producto("Asus", "Placa base", 90);
        orden2.setCliente(cliente2);
        orden2.setFecha(new Date());
        orden2.addProducto(producto5);
        orden2.addProducto(producto6);
        orden2.addProducto(producto7);
        orden2.addProducto(producto8);

        //Orden3
        OrdenCompra orden3 = new OrdenCompra("Orden tercera");
        Cliente cliente3 = new Cliente("Pepe", "Martínez");
        Producto producto9 = new Producto("Bosch", "Lavadora", 300);
        Producto producto10 = new Producto("Samsung", "Televisión", 599);
        Producto producto11 = new Producto("Bosch", "Lavavajillas", 350);
        Producto producto12 = new Producto("LG", "Microondas", 90);
        orden3.setCliente(cliente3);
        orden3.setFecha(new Date());
        orden3.addProducto(producto9);
        orden3.addProducto(producto10);
        orden3.addProducto(producto11);
        orden3.addProducto(producto12);

        //Impresión orden primera
        System.out.println("***** ID"+orden1.getId()+" - "+orden1.getFecha().toString()+" "
                           +orden1.getDescripcion()+"*****");
        System.out.println("Esta orden pertenece a: "+orden1.getCliente().getNombre()+" "
                           +orden1.getCliente().getApellido());
        System.out.println("Contiene los siguientes productos: ");
        for (Producto producto: orden1.getProductos()){
            System.out.println("Nombre: " + producto.getNombre()+" Fabricante: " + producto.getFabricante()
                               +" Precio: "+producto.getPrecio());
        }
        System.out.println("El total del pedido asciende a: "+orden1.granTotal()+"\n");

        //Impresión orden segunda
        System.out.println("***** ID"+orden2.getId()+" - "+orden2.getFecha().toString()+" "
                +orden2.getDescripcion()+"*****");
        System.out.println("Esta orden pertenece a: "+orden2.getCliente().getNombre()+" "
                +orden2.getCliente().getApellido());
        System.out.println("Contiene los siguientes productos: ");
        for (Producto producto: orden2.getProductos()){
            System.out.println("Nombre: " + producto.getNombre()+" Fabricante: " + producto.getFabricante()
                    +" Precio: "+producto.getPrecio());
        }
        System.out.println("El total del pedido asciende a: "+orden2.granTotal()+"\n");

        //Impresión orden tercera
        System.out.println("***** ID"+orden3.getId()+" - "+orden3.getFecha().toString()+" "
                +orden3.getDescripcion()+"*****");
        System.out.println("Esta orden pertenece a: "+orden3.getCliente().getNombre()+" "
                +orden3.getCliente().getApellido());
        System.out.println("Contiene los siguientes productos: ");
        for (Producto producto: orden3.getProductos()){
            System.out.println("Nombre: " + producto.getNombre()+" Fabricante: " + producto.getFabricante()
                    +" Precio: "+producto.getPrecio());
        }
        System.out.println("El total del pedido asciende a: "+orden3.granTotal()+"\n");
    }
}
