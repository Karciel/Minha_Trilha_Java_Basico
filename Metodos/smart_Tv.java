public class smart_Tv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    public void aumentarVolume(){
        volume ++;
    //poderia fazer assim: volume = volume +1; 
    }

    public void diminuirVolume(){
        volume --;
    //poderia fazer assim: volume = volume -1; 
    }

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
    



    
}   

