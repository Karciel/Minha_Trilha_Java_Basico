public class usuario_Tv {

    public static void main(String[] args) throws Exception {

        smart_Tv Smart_Tv = new smart_Tv();

        System.out.println("Tv ligada? ? : " + Smart_Tv.ligada);
        System.out.println("Canal atual ? : " + Smart_Tv.canal);
        System.out.println("Volume atual ? " + Smart_Tv.volume);


        Smart_Tv.ligar();
        System.out.println("Novo status -> TV LIGADA: " + Smart_Tv.ligada);

        Smart_Tv.desligar();
        System.out.println("Novo status -> TV DESLIGADA: " + Smart_Tv.ligada);


        Smart_Tv.aumentarVolume();
        System.out.println("O volume está em " + Smart_Tv.volume);





    }





}