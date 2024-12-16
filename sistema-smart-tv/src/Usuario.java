public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV está ligada? " + smartTv.ligada);
        
        smartTv.subirCanal();
        smartTv.subirCanal();
        
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        smartTv.alterarVolume(true);
        smartTv.alterarVolume(true);
        smartTv.alterarVolume(true);
        smartTv.alterarVolume(true);
        smartTv.alterarCanal(10);
        

        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("TV está ligada? " + smartTv.ligada);

    }
}
