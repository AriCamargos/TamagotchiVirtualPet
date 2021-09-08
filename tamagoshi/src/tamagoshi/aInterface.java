package tamagoshi;

//import enumstamagoshi.Tamagoshi;

import java.util.Scanner;

//import java.util.Scanner;

public class aInterface {

    public void aInterface(){
        System.out.println("=== ♥ CUIDE BEM DO SEU BIXINHO VIRTUAL ♥ ===");
        System.out.println("AVISO: DIGITE APENAS COM LETRA minúscula\n");
    }
    
    public void mostreStatus(Status sorteieNovoStatus) {
        System.out.println("O que o Tamagoshi está sentindo?\n"+ sorteieNovoStatus+"\n");
    }
    
    protected void mostrarMenu() { 
        System.out.println(" ==== MENU ==== ");
        System.out.println("Aperte a - Alimentar");
        System.out.println("Aperte b - Dar bebida");
        System.out.println("Aperte c - Apagar a luz");
        System.out.println("Aperte d - Brincar");
        System.out.println("Aperte e - Perguntar como está hoje");
        System.out.println("Aperte x - Sair");
    }
        

    public Acao pecaAcao() {
        this.mostrarMenu();
       Scanner scan = new Scanner (System.in);
       String acaoStr = scan.nextLine();
       switch (acaoStr){
           case "a" -> { 
               return Acao.DAR_COMIDA;
            }
           case "b" -> {
               return Acao.DAR_BEBIDA;
            }
           case "c" -> {
               return Acao.FAZER_DORMIR;
            }
           case "d" -> {
               return Acao.BRINCAR;
            }
           case "e" -> {
               return Acao.PERGUNTAR_HUMOR;
            }
           case "x" -> {
               return Acao.SAIR;
            }
       }
       return Acao.INDEFINIDO;
    }

    public void mostrarReacao(Reacao r){
        if (r.estaSatisfeito()){
            System.out.println("☺ OBRIGADA!! Agora estou muito satisfeito!\n");
        }else{
            System.out.println("☼ ERRADO! Não é isso que estou sentindo!\na");
        }
    }
}
