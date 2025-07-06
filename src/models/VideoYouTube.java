package models;

public class VideoYouTube extends ContenidoAudiovisual {
    private String canal;
    private int likes;

    public VideoYouTube(String titulo, int duracion, String genero, String canal, int likes) {
        super(titulo, duracion, genero);
        this.canal = canal;
        this.likes = likes;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Video YouTube:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " min");
        System.out.println("Género: " + getGenero());
        System.out.println("Canal: " + canal);
        System.out.println("Likes: " + likes);
        System.out.println();
    }
}