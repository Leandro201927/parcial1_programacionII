public class LibrosDeTexto extends Libro {
  private String curso;

  public LibrosDeTexto(String titulo, String autor, double precio, String curso) {
    super(titulo, autor, precio); // heredar atrbutos del padre
    this.curso = curso;
  }

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  @Override
  public void imprimirEnPantalla() {
    super.imprimirEnPantalla();
    System.out.println("Curso: " + curso);
  }
}