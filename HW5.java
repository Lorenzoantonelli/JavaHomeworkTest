public class HW5 {
    public static void main(String[] args) throws NoSuchNodeException, NoSuchPathException, NoSuchElemException {
        Network net2=new MyNetwork();
        Integer[] Nodes2 = new Integer[5];
        for(int i=0;i<5;i++){
            Nodes2[i]=new Integer(i);
            net2.addNode(Nodes2[i]);
        }
        net2.setSource(Nodes2[0]);
        net2.setTarget(Nodes2[3]);
        net2.addEdge(Nodes2[0], Nodes2[1]);
        net2.addEdge(Nodes2[1], Nodes2[0]);
        net2.addEdge(Nodes2[1], Nodes2[2]);
        net2.addEdge(Nodes2[2], Nodes2[1]);
        net2.addEdge(Nodes2[2], Nodes2[3]);
        net2.addEdge(Nodes2[3], Nodes2[2]);
        IntList result2 = net2.shortestPath();
        System.out.println("Di seguito dovrebbe stampare 0 1 2 3");
        for (int i = 0; i < result2.size(); i++) System.out.print(result2.get(i) + " ");

        System.out.println();
        System.out.println("Ora vengono testati diversi errori che il codice dovrebbe lanciare:");
        try{
            result2.get(50);
            System.out.println("Errore, l'eccezione NoSuchElemException non viene lanciata dal metodo get di MyIntList");
        }
        catch (NoSuchElemException x){
            System.out.println("Eccezione NoSuchElemException lanciata correttamente");
        }

        Network test1=new MyNetwork();
        test1.addNode(1);
        try{
            test1.setSource(6);
            System.out.println("Errore nel metodo setSource, dovrebbe lanciare NoSuchNodeException");
        }
        catch (NoSuchNodeException x){
            System.out.println("Eccezione NoSuchNodeException di setSource lanciata correttamente");
        }

        try{
            test1.setTarget(6);
            System.out.println("Errore nel metodo setTarget, dovrebbe lanciare NoSuchNodeException");
        }
        catch (NoSuchNodeException x){
            System.out.println("Eccezione NoSuchNodeException di setTarget lanciata correttamente");
        }

        try{
            test1.addEdge(1,2);
            System.out.println("Errore nel metodo addEdge, dovrebbe lanciare NoSuchNodeException");
        }
        catch(NoSuchNodeException x){
            System.out.println("Eccezione NoSuchNodeException di addEdge lanciata correttamente");
        }

        Integer t1=test1.source();
        if (t1==null) System.out.println("Source restituisce null, corretto");
        else System.out.println("Errore nel metodo get di MyNetwork");

        try{
            net2.setSource(Nodes2[0]);
            net2.setTarget(Nodes2[4]);
            IntList result3=net2.shortestPath();
            for (int i = 0; i < result3.size(); i++) System.out.print(result3.get(i) + " ");
            System.out.println("Errore nel metodo shortestPath, dovrebbe lanciare NoSuchPathException poichè non esite un percorso da 0 a 4");

        }
        catch (NoSuchPathException x){
            System.out.println("Eccezione NoSuchPathException di shortestPath lanciata correttamente");
        }

        System.out.println("Ultimo test, dovrebbe stampare 0 1 2 3 11 14 15 oppure 0 1 13 12 11 14 15:");
        Network net3=new MyNetwork();
        Integer[] Nodes3 = new Integer[16];
        for(int i=0;i<16;i++){
            Nodes3[i]=new Integer(i);
            net3.addNode(Nodes3[i]);
        }
        net3.setSource(Nodes3[0]);
        net3.setTarget(Nodes3[15]);
        net3.addEdge(Nodes3[0],Nodes3[1]);
        net3.addEdge(Nodes3[1],Nodes3[2]);
        net3.addEdge(Nodes3[2],Nodes3[1]);
        net3.addEdge(Nodes3[2],Nodes3[3]);
        net3.addEdge(Nodes3[3],Nodes3[2]);
        net3.addEdge(Nodes3[3],Nodes3[11]);
        net3.addEdge(Nodes3[11],Nodes3[3]);
        net3.addEdge(Nodes3[11],Nodes3[12]);
        net3.addEdge(Nodes3[12],Nodes3[11]);
        net3.addEdge(Nodes3[12],Nodes3[13]);
        net3.addEdge(Nodes3[13],Nodes3[12]);
        net3.addEdge(Nodes3[13],Nodes3[1]);
        net3.addEdge(Nodes3[1],Nodes3[13]);
        net3.addEdge(Nodes3[3],Nodes3[4]);
        net3.addEdge(Nodes3[4],Nodes3[5]);
        net3.addEdge(Nodes3[5],Nodes3[6]);
        net3.addEdge(Nodes3[6],Nodes3[7]);
        net3.addEdge(Nodes3[7],Nodes3[6]);
        net3.addEdge(Nodes3[8],Nodes3[7]);
        net3.addEdge(Nodes3[9],Nodes3[8]);
        net3.addEdge(Nodes3[10],Nodes3[9]);
        net3.addEdge(Nodes3[13],Nodes3[10]);
        net3.addEdge(Nodes3[11],Nodes3[14]);
        net3.addEdge(Nodes3[14],Nodes3[15]);
        IntList result4=net3.shortestPath();
        for (int i = 0; i < result4.size(); i++) System.out.print(result4.get(i) + " ");
        System.out.println();
        int tempo=0;
        System.out.println("Calcolo il tempo di esecuzione in nanosecondi del metodo shortestPath:");
        for (int i = 0; i < 10; i++) {
            long startTime = System.nanoTime();
            net3.shortestPath();
            long endTime = System.nanoTime();
            tempo+=(endTime-startTime);
        }
        System.out.println((tempo/10)+" Nanosecondi");
    }
}
