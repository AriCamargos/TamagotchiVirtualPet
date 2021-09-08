package tamagoshi;

public class Gerente {
    protected Tamagoshi tamagoshi;
    protected aInterface umaI;
    
    public void faca(){
        while(true){
            this.umaI.aInterface();
            Status s = this.tamagoshi.getStatus();
            this.umaI.mostreStatus(s);
            Acao a = this.umaI.pecaAcao();
            if(a == Acao.SAIR){
                return;
            }
            if(a == Acao.INDEFINIDO){
                continue;
            }
            Reacao r = this.tamagoshi.exeecuteAcao(a);
            this.umaI.mostrarReacao(r);
        }
    }   
    
    
    public Gerente(){ 
        this.umaI = new aInterface();
        this.tamagoshi = new Tamagoshi();
    }

}
