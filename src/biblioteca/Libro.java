package biblioteca;

public final class Libro {
    private final String titulo;
    private final String autor;
    private final String isbn;
    private int copiasDisponibles;
    private double precioReposicion;

    private static boolean esNuloOVacio(String s) {
        return s == null || s.trim().isEmpty();
    }

    private static boolean esPrecioValido(double precio) {
        return precio > 0;
    }

    // Constructor canónico - ÚNICO lugar con validación completa
    public Libro(String titulo, String autor, String isbn, int copiasDisponibles, double precioReposicion) {
        // titulo
        if (esNuloOVacio(titulo)) {
            System.out.println("Título inválido, se usó \"Sin titulo\" por defecto.");
            this.titulo = "Sin titulo";
        } else {
            this.titulo = titulo.trim();
        }

        // autor
        if (esNuloOVacio(autor)) {
            System.out.println("Autor inválido, se usó \"Desconocido\" por defecto.");
            this.autor = "Desconocido";
        } else {
            this.autor = autor.trim();
        }

        // isbn
        if (esNuloOVacio(isbn)) {
            System.out.println("ISBN inválido, se usó \"0000000000000\" por defecto.");
            this.isbn = "0000000000000";
        } else {
            this.isbn = isbn.trim();
        }

        if (copiasDisponibles < 0) {
            this.copiasDisponibles = 0;
        } else {
            this.copiasDisponibles = copiasDisponibles;
        }

        if (!esPrecioValido(precioReposicion)) {
            System.out.println("Precio inválido, se usó 10000 por defecto.");
            this.precioReposicion = 10000.0;
        } else {
            this.precioReposicion = precioReposicion;
        }
    }

    public Libro(String titulo, String autor, String isbn) {
        this(titulo, autor, isbn, 1, 10000.0);
    }

    public Libro(String titulo, String autor, String isbn, int copiasDisponibles, Double precioReposicion) {
        this(titulo, autor, isbn, copiasDisponibles, precioReposicion != null ? precioReposicion : 10000.0);
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getIsbn() { return isbn; }
    public int getCopiasDisponibles() { return copiasDisponibles; }
    public double getPrecioReposicion() { return precioReposicion; }

    public boolean setPrecioReposicion(double nuevoPrecio) {
        if (!esPrecioValido(nuevoPrecio)) {
            System.out.println("No se puede actualizar: precio inválido.");
            return false;
        }
        this.precioReposicion = nuevoPrecio;
        return true;
    }

    public boolean prestar() {
        if (copiasDisponibles <= 0) {
            System.out.println("No hay copias disponibles de \"" + titulo + "\"");
            return false;
        }
        copiasDisponibles--;
        return true;
    }

    public void devolver() {
        copiasDisponibles++;
    }

    public void mostrarFicha() {
        System.out.println("\n--- FICHA ---");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Copias: " + copiasDisponibles);
        System.out.println("Precio: $" + precioReposicion);
    }
}