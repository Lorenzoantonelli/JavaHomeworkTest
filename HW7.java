public class HW7 {
    public static void main(String[] args) {
        ChurchUtil chut = new MyChurchUtil();
        Church test1=new MyChurch(42);

        if (chut.decode(test1)==42) System.out.println("Il metodo decode funziona correttamente con numeri >0");
        else System.out.println("Il metodo decode non funziona correttamente con numeri >0");


        if (chut.decode(chut.successore(new MyChurch(42)))==43) System.out.println("Il metodo successore funziona correttamente");
        else System.out.println("Il metodo successore non funziona correttamente");

        if (chut.decode(new MyChurch(0))==0) System.out.println("Il metodo decode funziona correttamente con zero");
        else System.out.println("Il metodo decode non funziona correttamente con 0");

        if (chut.decode(chut.somma(new MyChurch(10),new MyChurch(15)))==25) System.out.println("Il metodo somma funziona correttamente");
        else System.out.println("Errore nel metodo somma");

        System.out.println("Provo a sommare zero con zero:");
        Church test2_1=new MyChurch(0);
        Church test2_2=new MyChurch(0);

        if (chut.decode(chut.somma(test2_1,test2_2))==0) System.out.println("Somma effettuata correttamente");
        else System.out.println("Erroe nella somma fra zero e zero");

        System.out.println("Provo a sommare un numero con zero:");
        if (chut.decode(chut.somma(new MyChurch(0),new MyChurch(42)))==42) System.out.println("Somma effettuata correttamente");
        else System.out.println("Erroe nella somma fra un numero e zero");


    }
}
