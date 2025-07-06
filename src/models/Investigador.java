package models;

public class Investigador {
    private String nombre;
    private String campo;

    public Investigador(String nombre, String campo) {
        this.nombre = nombre;
        this.campo = campo;
    }

    public void mostrarInvestigador() {
        System.out.println("Investigador: " + nombre + " - Especialidad: " + campo);
    }
}