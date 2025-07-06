package poo;

import models.*;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        // Película con actores (Agregación)
        // Una película puede tener uno o varios actores relacionados, pero los actores
        // pueden existir sin la película.
        Pelicula pelicula = new Pelicula("Avatar", 125, "Acción", "20th Century Studios");
        Actor actor1 = new Actor("Sam Worthington", 47);
        Actor actor2 = new Actor("Zoe Saldaña", 45);
        pelicula.mostrarDetalles();
        actor1.mostrarActor();
        actor2.mostrarActor();

        // Serie con temporada (Composición)
        // Una temporada no puede existir sin su serie correspondiente.
        SerieDeTV serie = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        Temporada temporada1 = new Temporada(1, 10);
        serie.mostrarDetalles();
        temporada1.mostrarTemporada();

        // Documental con investigador (Asociación)
        // El investigador tiene una relación directa con el documental, pero puede
        // existir de forma independiente.
        Documental documental = new Documental("Cosmos", 45, "Science", "Astronomía");
        Investigador investigador = new Investigador("Carl Sagan", "Astrofísica");
        documental.mostrarDetalles();
        investigador.mostrarInvestigador();

        // Subclase: VideoYouTube (Herencia y especialización)
        // Hereda de ContenidoAudiovisual y agrega atributos propios como canal y likes.
        VideoYouTube video = new VideoYouTube("POO en 10 minutos", 10, "Educativo", "CodeJorge", 2300);
        video.mostrarDetalles();

        // Subclase: Cortometraje (Herencia con atributo exclusivo: director)
        // También hereda y define su propio comportamiento específico.
        Cortometraje corto = new Cortometraje("El Viaje", 20, "Drama", "Ana Ruiz");
        corto.mostrarDetalles();

        // Nuevo ejemplo 1: Película con otro actor
        Pelicula pelicula2 = new Pelicula("Interestelar", 169, "Ciencia Ficción", "Paramount Pictures");
        Actor actor3 = new Actor("Matthew McConaughey", 54);
        pelicula2.mostrarDetalles();
        actor3.mostrarActor();

        // Nuevo ejemplo 2: Serie con otra temporada
        SerieDeTV serie2 = new SerieDeTV("Stranger Things", 50, "Misterio", 4);
        Temporada temporada2 = new Temporada(2, 9);
        serie2.mostrarDetalles();
        temporada2.mostrarTemporada();
    }
}