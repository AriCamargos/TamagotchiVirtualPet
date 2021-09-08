package tamagoshi;
        
import java.util.Random;
//Lista de status que o Tamagoshi terá.
enum Status {
    FOME,
    SEDE,
    SONO,
    FELIZ;
    
    //Passando a lista de enum String para Inteiros, assim é possibilitado o envio do sorteio aleatório em Random.
    public static Status fromInt(int x){
        switch (x){
            case 0 -> {
                return FOME;
            }
            case 1 -> {
                return SEDE;
            }
            case 2 -> {
                return SONO;
            }
            case 3 -> {
                return FELIZ;
            }
        }
        return null;
    } 
    
    //Sorteio de  status aleatório assim que o programa é executado.
    public static Status sorteieNovoStatus(){
        Random r = new Random();
        int statusint = r.nextInt(3);
        return fromInt(statusint);
    }
}


