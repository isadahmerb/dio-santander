public class usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println( "Tv ligada "  + smartTv.ligada);
        System.out.println("canal atual=" +  smartTv.canal);
        System.out.println("volume atual= " + smartTv.volume);

        smartTv.ligar();
        System.out.println( "novo status --> Tv ligada "  + smartTv.ligada);

        smartTv.desligar();
        System.out.println( "novo status --> Tv ligada "  + smartTv.ligada);




    }
}
