
package desafiosprogramacao;

import java.util.Scanner;

public class PopulationIncrease {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        leitura();
        System.out.println(-time+System.currentTimeMillis());
    }
    
    public static void leitura()
    {
        Scanner sc = new Scanner(System.in);
        int testes = sc.nextInt();
        
        for(int i =0; i < testes; i++)
            calc(sc.nextInt(), sc.nextInt(), sc.nextDouble(), sc.nextDouble());
    }
    
    public static void calc(int a, int b, double ac, double bc)
    {
        int cont=0;
        if((a*(Math.pow((1+(ac/100)),100))) < (b*(Math.pow((1+(bc/100)),100)))){
            System.out.println("Mais de 1 seculo.");
        }
        else{
            System.out.println(encontra(a, b, ac, bc) + " anos.");
        }
    }
    public static int encontra(int a, int b, double ac, double bc)
    {
        int inicio=0, fim=100;
        while(fim - inicio >1)
        {
            int meio = (inicio+fim)/2;
            if((calcula(a, ac, meio)<=(calcula(b,bc,meio)))) inicio = (fim+inicio)/2;
            else fim = (inicio+fim)/2;
        }
        
        return fim;
    }
    
    public static int calcula(int a, double ac, int meio)
    {
        while(meio>0)
        {
            a += a*(ac/100);
            meio--;
        }
        
        return a;
    }

}


