package modelos;

public class Podcast extends Audio{
    private String host;
    private String participante;

    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public String getParticipante() {
        return participante;
    }
    public void setParticipante(String participante) {
        this.participante = participante;
    }

    public int getClassificacao(){
        if (this.getTotalReproducoes() >= 2000){
            return 10;
        } else {
            return 7;
        }
    }
}
