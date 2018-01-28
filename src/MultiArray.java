import java.util.Random;

public class MultiArray {
    private int[][] tab;

    public MultiArray(int n , int m) {
        Random rand = new Random();
        this.tab = new int[n][m];

        for(int i = 0; i<tab.length; i++){
           for(int y= 0; y<tab[i].length; y++){
               this.tab[i][y] = rand.nextInt(100);
           }
        }
    }

    public void randomize(){

        Random rand = new Random();
        for(int i = 0; i<tab.length; i++){
            for(int y= 0; y<tab[i].length; y++){
                this.tab[i][y] = rand.nextInt(100);
            }
        }
    }

    public int findMin(){
        int wynik;
        wynik =tab[0][0];

        for(int i= 0; i < tab.length; i++){
            for(int y = 0; y <tab[i].length;y++){
                if(wynik > tab[i][y]){
                    wynik = tab[i][y];
                }
            }

        }
        return wynik;
    }

    public int findMax(){
        int wynik;
        wynik =tab[0][0];

        for(int i= 0; i < tab.length; i++){
            for(int y = 0; y <tab[i].length;y++){
                if(wynik < tab[i][y]){
                    wynik = tab[i][y];
                }
            }

        }
        return wynik;
    }

    public void print(){
        for (int i = 0; i < tab.length; i++) {
            System.out.print("Liczby  w wierszu " + (i+1) + " : ");
            for (int y = 0; y < tab[i].length; y++) {
                System.out.print(tab[i][y] + " ");
            }
            System.out.print("\n");
        }
    }

}
