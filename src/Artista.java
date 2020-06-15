

public class Artista {
    String nombreArtista;

    public Artista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }
//falta get
    //añadido
    
    @Override
    public String toString() {
        return "Artista{" +
                "nombreArtista='" + nombreArtista + '\'' +
                '}';
    }
}


