public class Usuario {
    
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);
        System.out.println("-------------------------------");

        smartTv.ligarTv();
        System.out.println("Tv Ligada ? " + smartTv.ligada);
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.mudarCanal(13);
        smartTv.diminuirCanal();
        
    }
}
