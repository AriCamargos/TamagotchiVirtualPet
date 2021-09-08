package tamagoshi;

public class Tamagoshi {
    
    protected Status status;

    public Tamagoshi() {
        this.status = Status.sorteieNovoStatus();
    }
    
    public Status getStatus(){
        return status;
    }

    protected Acao retorneAcaoDesejada(){
        Status s = this.status;
        switch (s){
              case FOME -> { 
                  return Acao.DAR_COMIDA;
            }
            case SEDE -> {
                return Acao.DAR_BEBIDA;
            }
            case SONO -> {
                return Acao.FAZER_DORMIR;
            }
            case FELIZ -> {
            }
            default  -> {
                return Acao.BRINCAR; 
            }
        }
        return null;
    }
    
    public Reacao exeecuteAcao(Acao acaoRecebida){ 
        Acao acaoDesejada = this.retorneAcaoDesejada();
        Reacao r = new Reacao(acaoDesejada == acaoRecebida, acaoRecebida);
        if (r.estaSatisfeito()) {
            this.status = Status.sorteieNovoStatus();
        }
        return r;
    }
}


