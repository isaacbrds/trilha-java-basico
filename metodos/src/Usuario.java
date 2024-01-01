public class Usuario {
    
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Tv Volume atual? " + smartTv.volume);
        System.out.println("Tv canal? " + smartTv.canal);

        smartTv.ligar();
        System.out.println("Tv Ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Tv Ligada? " + smartTv.ligada);
        
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Tv Volume atual? " + smartTv.volume);
        smartTv.reduzirVolume();
        System.out.println("Tv Volume atual? " + smartTv.volume);
        
        smartTv.aumentarCanal();
        System.out.println("Tv canal atual ? " + smartTv.canal);
        smartTv.reduzirCanal();
        System.out.println("Tv canal autal? " + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Tv canal atual? " + smartTv.canal);
    }
}
