public class Novela extends Libro {
  String tipo;
  
  public Novela(String titulo, String autor, double precio, String tipo) {
    super(titulo, autor, precio);

    this.tipo = tipo;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  @Override
  public void imprimirEnPantalla() {
    super.imprimirEnPantalla();
    System.out.println("Tipo de novela: " + tipo);
  }
}
