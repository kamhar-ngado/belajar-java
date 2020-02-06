public class method_overloading {

    static int penjumlahan(int a, int b) {
        return a + b;
    }

    static Double pecahan(Double c, Double d) {
        return d - c;
    }

    public static void main(String[] args) {
        int angka1 = penjumlahan(1, 2);
        Double angka2 = pecahan(4.1, 8.2);
        
        System.out.println("hasil dari penjumlahan a + b = " + angka1);
        System.out.println("hasil dari pengurangan d - c = " + angka2);
    }
}