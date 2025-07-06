package models;

public class Temporada {
    private int numero;
    private int capitulos;

    public Temporada(int numero, int capitulos) {
        this.numero = numero;
        this.capitulos = capitulos;
    }

    public void mostrarTemporada() {
        System.out.println("Temporada " + numero + ": " + capitulos + " capítulos");
    }
}
