package funcoes;
public class AparelhoTelefonico {
    public void ligar(String numero){
        System.out.println("\nVocê está ligando para o seguinte número: " + numero);
    }
    public void atender(){
        System.out.println("\nAtendido!");
    }
    public void iniciarCorreioVoz(){
        System.out.println("\nO correio de voz vai ser iniciado em:");
        
        int x = 3;
        while(x !=0 ){
            try {
                Thread.sleep(2000);
                System.out.println("\n"+x);
                x--;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
