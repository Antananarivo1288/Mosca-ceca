package Model.scacchiera;
import Model.Agente;
public interface Scac_Interface{

    //metodo astratto che genera la scacchiera
    public void generate();

    //ritorna le caselle vicine a quella passata
    public Casella[] getNeighborhood(int x, int y);

    //l'agente specificato pianta la bandiera nella casella specificata (compito della scacchiera dire se la casella è disponibile)
    public boolean pianta(int x, int y, Agente agg);

    //ritorna lo stato della casella specificata (vuota, energia, risorsa, bandiera)
    public String getStato(int x,int y);

    //ritorna l'oggetto casella alle coordinate specificate
    public Casella getCasella(int x,int y);
}