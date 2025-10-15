//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;
import java.util.Random;
class Esercizio {
    public void visualizzaVettore(int [] V, int N){
        int i ;
        for (i = 0 ; i <= N-1; ++i){
            System.out.println("Cella "+i+" : "+V[i]);
        }
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner( System.in );
        Random r = new Random();
        int N,nP,nD,i,x;
        System.out.println("Inserisci quanti nuumeri vuoi generare");
        N = in.nextInt();
        int [] V = new int[N*10], int [] Vp = new int[N*10],int [] Vd = new int[N*10];
        nP = 0;
        nD = 0;
        i = 0;
        while(i <= N-1){
            x = r.nextInt((N*10)+1);
            if (x % 2 == 0){
                Vp[nP] = x;
                ++nP;
            }
            else{
                Vd[nD] = x;
                ++nD;
            }
            ++i;
        }
        System.out.println("Ecco il vettore dispari : ");
        visualizzaVettore(Vd,nD);
        System.out.println("Ecco il vettore pari : ");
        visualizzaVettore(Vp,nP);
    }
}
