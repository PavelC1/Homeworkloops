

public class Main{
    import java.util.Scanner;
    public static void main(String[] args)
    {
        //sarcina 1
        char Litera='i';
        switch(Litera)
        {
            case 'a': System.out.println("Vocala");
             break;
            case 'e': System.out.println("Vocala");
             break;
            case 'i': System.out.println("Vocala");
             break;
            case 'o': System.out.println("Vocala");
             break;
            case 'u': System.out.println("Vocala");
             break;
             default: System.out.println("Consoana");
        }

        //sarcina 2  nu lucreaza
        int n;
        int i=0;
        Scanner = new Scanner(System.in);
        System.out.print("Introdu numarul de iteratii: ");
        n = scanner.nextInt();
        while(i<=n)
        {           
        int RandomNum= Math.floor(Math.random() * 10);
        int Result= RandomNum*RandomNum;
        i++;
        }
        
        //sarcina 3
        int iteratii=10;
        int Rezultat=0;
        for(int i=0; i<=iteratii;i++)
        {
            Rezultat= i*n;
        }
        System.out.println(Rezultat);
        
    }

}