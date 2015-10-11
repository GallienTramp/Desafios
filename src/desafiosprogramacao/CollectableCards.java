

package desafiosprogramacao;

import java.util.Scanner;

public class CollectableCards {
    public static void main(String[] args) {
        inicia();
    }
    
    public static void inicia()
    {
        Scanner sc = new Scanner(System.in);
        int testes = sc.nextInt();
        
        for(int i = 0; i< testes; i++)
            System.out.println(euclides(sc.nextInt(), sc.nextInt()));

        
    }
    
    public static int euclides(int a, int b)
    {
        int aux;
        if(a<b){ 
            aux = b;
            b = a;
            a = aux;
        }
        int resto = a%b;
        while(resto!=0)
        {
            a = b;
            b=resto;
            resto = a%b;
        }
        
        return b;
    }
}
