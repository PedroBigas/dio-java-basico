public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void alterarCanal(int numeroCanal){
            canal = numeroCanal;
    }

    public void subirCanal(){
        canal++;
    }
    
    public void descerCanal(){
        canal--;
    }

    public void alterarVolume(Boolean aumentar){
        if (aumentar) {
            volume++;
            System.out.println("Aumentando volume para: " + volume);
        } else {
            volume--;
            System.out.println("Diminuindo volume para: " + volume);
        }

    }

    public void ligar(){
        ligada = true;
    }
    
    public void desligar(){
        ligada = false;
    }

}
