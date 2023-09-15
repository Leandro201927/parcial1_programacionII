public class App {
    public static void main(String[] args) throws Exception {
        LibrosDeTextoUNIAJC libroUniajc = new LibrosDeTextoUNIAJC("quimica organica", "yepes", 599.990, "quimica", "facultad de ciencias naturales");
        libroUniajc.imprimirEnPantalla();

        Novela novelaAventurera = new Novela("la aventura", "oscar", 199.990, "aventuras");
        novelaAventurera.imprimirEnPantalla();
    }
}
