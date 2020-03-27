public class HW3 {
    public static final int DIMENSIONE = 10;

    public static boolean[][] mkStruct (int d) {
        boolean[][] labi=new boolean[d][d];

        // aggiungere queste righe se si vuole creare un loop
        //labi[6][3]=true;
        //labi[6][4]=true;
        //labi[7][4]=true;

        labi[0][1]=true; //rimuovere questa riga se lo si vuole senza uscita (si può usare insieme al loop)
        labi[1][1]=true;
        labi[1][2]=true;
        labi[1][3]=true;
        labi[1][4]=true;
        labi[1][5]=true;
        labi[1][6]=true;
        labi[1][7]=true;
        labi[1][8]=true;
        labi[2][8]=true;
        labi[3][1]=true;
        labi[3][2]=true;
        labi[3][3]=true;
        labi[3][4]=true;
        labi[3][6]=true;
        labi[3][7]=true;
        labi[3][8]=true;
        labi[4][1]=true;
        labi[4][4]=true;
        labi[4][6]=true;
        labi[4][8]=true;
        labi[5][1]=true;
        labi[5][6]=true;
        labi[5][8]=true;
        labi[6][1]=true;
        labi[6][2]=true;
        labi[6][8]=true;
        labi[7][2]=true;
        labi[7][7]=true;
        labi[7][8]=true;
        labi[8][2]=true;
        labi[8][3]=true;
        labi[8][4]=true;
        labi[8][5]=true;
        labi[8][6]=true;
        labi[8][7]=true;
        return labi;
    }

    public static void main(String[] args) {

        Maze m = new Maze (mkStruct(DIMENSIONE), 4, 4);
        Teseo.printWayOut(m);
    }
}
