package Model.scacchiera;

import Model.Agente;

public class CasellaBandiera extends Decorator{

    private Agente agente;

    public CasellaBandiera(Casella casella, Agente agente) {
        this.casella = casella;
        this.agente = agente;
    }

    @Override
    public String getInfo() {
        return casella.getInfo() + ";Bandierina_" + agente.getName();
    }    
}
