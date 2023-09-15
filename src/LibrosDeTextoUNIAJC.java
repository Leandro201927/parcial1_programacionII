public class LibrosDeTextoUNIAJC extends LibrosDeTexto {
  private String facultad;

  public LibrosDeTextoUNIAJC(String titulo, String autor, double precio, String curso, String facultad) {
    super(titulo, autor, precio, curso);
    this.facultad = facultad;
  }

  public String getFacultad() {
    return facultad;
  }

  public void setFacultad(String facultad) {
    this.facultad = facultad;
  }

  @Override
  public void imprimirEnPantalla() {
    super.imprimirEnPantalla();
  }
}