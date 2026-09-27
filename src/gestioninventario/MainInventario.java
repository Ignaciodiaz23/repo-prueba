package gestioninventario;
public class MainInventario {
    public static void main(String[] args) {
        Producto productoUno = new Producto();
        productoUno.codigo = "P-001";
        productoUno.nombre = "Teclado mecanico";
        productoUno.precio = 45000.0;
        productoUno.stock = 12;

        Producto productoDos = new Producto();
        productoDos.codigo = "P-002";
        productoDos.nombre = "Mouse inalambrico";
        productoDos.precio = 15000.0;
        productoDos.stock = 30;

        Producto productoTres = new Producto();
        productoTres.codigo = "P-003";
        productoTres.nombre = "Monitor 24";
        productoTres.precio = 120000.0;
        productoTres.stock = 5;

        productoUno.mostrarFicha();
        productoUno.venderUnidades(3);
        productoUno.venderUnidades(50);
        productoUno.reponerStock(20);
        productoUno.actualizarPrecio(39900.0);

        Producto copia = productoUno;
        copia.stock = 29;
        System.out.println("Stock de productoUno tras modificar copia: " + productoUno.stock + " (mismo objeto en el Heap)");
    }
}