public class Operadores_2 {
    

public static void main(String [] args) {
    String concatenacao = "?";

    concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
   
    concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
    
    concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
    
    concatenacao = "1"+1+1+1+1;
        System.out.println(concatenacao);

    concatenacao = "1"+(1+1+1);
       System.out.println(concatenacao);


       
}


}


/*Aqui mostra como o JAVA para de somar os valores e passa a concatenar a partir do comento em que percebe 1 número como STRING (EX: "1")

Ele soma os valores 1+1+1 = 3 e logo em seguida, ao ler que precisa concatenar essa STRING "1", ele adiciona o 1 da STRING, ficando 31
 */