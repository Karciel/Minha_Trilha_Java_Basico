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

/*Em resumo, um método em Java é um bloco de código ou coleção de instruções que executa uma tarefa específica.
Ele fornece a reutilização do código, pois escrevemos um método uma vez e o usamos várias vezes.
Não precisamos escrever código repetidamente. 
Ele também fornece a fácil modificação e legibilidade do código */