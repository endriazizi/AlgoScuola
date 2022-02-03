public class Domanda {

    private String nomePersona;
    private int idDomanda;
    private Scuola primaScelta;
    private Scuola secondaScelta;
    private int punteggioPrimaScelta;
    private int punteggioSecondaScelta;
    private String esito;

    public Domanda(String nomePersona, int idDomanda, Scuola primaScelta, Scuola secondaScelta, int punteggioPrimaScelta, int punteggioSecondaScelta, String esito) {
        this.nomePersona = nomePersona;
        this.idDomanda = idDomanda;
        this.primaScelta = primaScelta;
        this.secondaScelta = secondaScelta;
        this.punteggioPrimaScelta = punteggioPrimaScelta;
        this.punteggioSecondaScelta = punteggioSecondaScelta;
        this.esito = esito;
    }

    public String getNomePersona() {
        return nomePersona;
    }

    public void setNomePersona(String nomePersona) {
        this.nomePersona = nomePersona;
    }

    public Integer getIdDomanda() {
        return idDomanda;
    }

    public void setIdDomanda(int idDomanda) {
        this.idDomanda = idDomanda;
    }

    public Scuola getPrimaScelta() {
        return primaScelta;
    }

    public void setPrimaScelta(Scuola primaScelta) {
        this.primaScelta = primaScelta;
    }

    public Scuola getSecondaScelta() {
        return secondaScelta;
    }

    public void setSecondaScelta(Scuola secondaScelta) {
        this.secondaScelta = secondaScelta;
    }

    public int getPunteggioPrimaScelta() {
        return punteggioPrimaScelta;
    }

    public void setPunteggioPrimaScelta(int punteggioPrimaScelta) {
        this.punteggioPrimaScelta = punteggioPrimaScelta;
    }

    public int getPunteggioSecondaScelta() {
        return punteggioSecondaScelta;
    }

    public void setPunteggioSecondaScelta(int punteggioSecondaScelta) {
        this.punteggioSecondaScelta = punteggioSecondaScelta;
    }

    public String getEsito() {
        return esito;
    }

    public void setEsito(String esito) {
        this.esito = esito;
    }

    @Override
    public String toString() {
        return "Domanda{" +
                "nomePersona='" + nomePersona + '\'' +
                ", idDomanda=" + idDomanda +
                ", primaScelta=" + primaScelta +
                ", secondaScelta=" + secondaScelta +
                ", punteggioPrimaScelta=" + punteggioPrimaScelta +
                ", punteggioSecondaScelta=" + punteggioSecondaScelta +
                ", esito=" + esito +
                '}';
    }
}
