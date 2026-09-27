package biblioteca;

public class MainBiblioteca {
    public static void main(String[] args) {
        // new Libro(); // no compila, al declarar constructores propios, el constructor sin argumentos que regalaba el compilador deja de existir.

        // 1) 3 libros combinando constructores
        Libro libro1 = new Libro("Clean Code", "Robert C. Martin", "9780132350884");
        Libro libro2 = new Libro("Efectivo con Java", "Ana Restrepo", "9781234567897", 3, 22000.0);
        Libro libro3 = new Libro("Cien Años de Soledad", "Gabriel Garcia Marquez", "9780307474728", 2, 18500.0);

        // 2) Demostrar 2 rechazos
        Libro libroConError = new Libro("", "Autor X", "123", 1, 15000.0);
        System.out.println("Título real usado: " + libroConError.getTitulo() + " (debería ser 'Sin titulo')");

        boolean aceptoPrecioMalo = libro1.setPrecioReposicion(-100.0);
        System.out.println("¿Se aceptó el precio -100.0? " + aceptoPrecioMalo + " (se mantiene el precio anterior)");
        System.out.println("Precio actual: $" + libro1.getPrecioReposicion());

        // Cambio válido para mostrar que sí funciona
        libro1.setPrecioReposicion(18000.0);

        // 3) Mostrar fichas
        libro1.mostrarFicha();
        libro2.mostrarFicha();
        libro3.mostrarFicha();

        // 4) Agotar copias y probar que no queda negativo
        System.out.println("\n--- Probando prestar() hasta agotar ---");
        libro1.prestar();
        boolean prestamoExtra = libro1.prestar();
        System.out.println("¿Se pudo prestar de más? " + prestamoExtra);

        libro1.devolver();
    }
}