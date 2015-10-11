package desafiosprogramacao;


import java.util.Scanner;

public class Vampires {
    public static void main(String[] args) {
        resolve();
    }
    
    public static void resolve()
    {
       Scanner sc = new Scanner(System.in);
       String resp;
       while(sc.hasNext()){
           resp = fight(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
           if(resp == null) return;
           System.out.println(resp);
       }
    }
    
    public static String fight(int vp, int v2, int at, int d)
    {
        if(vp==0 && v2 ==0 && at ==0 && d ==0) return null;
        
        if(at==3)
        {
            double p1 = Math.ceil((double)vp/d);
            double p2 = Math.ceil((double)v2/d);
            return String.format("%.1f", 100*((double)p1/(p1+p2)));
        }else
        {
            double p1 = (double)at/6;
            double p2 = 1 - p1;
            double m1 = Math.ceil((double)vp/d);
            double m2 = Math.ceil((double)v2/d);
            double probabilidade = ((1 - Math.pow((p2/p1), m1))/(1 - Math.pow(p2/p1, m1+m2)));
            return String.format("%.1f", 100*probabilidade);
        }
        
        
    }
}
