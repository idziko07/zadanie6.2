public class Test {
    public static void main(String[] args) {
        MultiArray array = new MultiArray(3, 4);

        System.out.println("Stworzona tablica");
        array.print();

        System.out.println("\nTablica po metodzie randomize");
        array.randomize();
        array.print();

        int min;
        min = array.findMin();
        System.out.println("\nNajmniejsza liczba: " + min);

        int max;
        max = array.findMax();
        System.out.println("Najwieksza liczba: " + max);

    }
}
