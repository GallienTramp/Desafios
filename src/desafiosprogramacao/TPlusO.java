
package desafiosprogramacao;

import java.util.Scanner;

 class TPlusO {
    
    public static void main(String[] args) {
        
        leitura();
        
    }
    
    public static void leitura()
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a + " " + b + " " + maior(a,b));
            
        }
    }
    
    public static int maior(int a, int b)
    {
        
        int maior = 0;
        int aux;
        int i;
        if(a<=b){
            for(i = a; i<=b; i++)
            if((aux=calc(i))>maior)
                maior = aux;}
            else{
                System.out.println("Olá " + maior);
            for(i = b; i<=a; i++)
                if((aux=calc(i))>maior)
                    maior = aux;    }
        
        return maior;
    }
    
    public static int calc(int a)
    {
 
        int cont =0;
        while(true){
            cont++;
            if(a==1) return cont;
            if(a%2==1) a = 3*a +1;
            else a = a/2;
        }
    }
    
}
