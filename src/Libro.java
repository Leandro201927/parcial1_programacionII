public class Libro {
  private String titulo;
  private String autor;
  private double precio;

  public Libro(String titulo, String autor, double precio) {
    this.titulo = titulo;
    this.autor = autor;
    this.precio = precio;
  }

  public void imprimirEnPantalla() {
    System.out.println("Título: " + titulo);
    System.out.println("Autor: " + autor);
    System.out.println("Precio: " + precio);
  }

  public String getAutor() {
    return autor;
  }

  public double getPrecio() {
    return precio;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
}