package tamagoshi;


public class Reacao {
    
    protected boolean satisfeito;
    protected Acao acaoExecutada;

    public Reacao(boolean satisfeito, Acao acaoExecutada) {
        this.satisfeito = satisfeito;
        this.acaoExecutada = acaoExecutada;
        
    }
    
    public Acao retorneAcao(){
        return acaoExecutada;
    }
    
    public boolean estaSatisfeito(){
        return this.satisfeito; //já retorna true or false
    }
    
}
