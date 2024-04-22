package B1;

public class TaxManager {

    private static final int MAX = 100;
    private Taxpaper[] list = new Taxpaper[MAX];
    private int count = 0;

    public boolean addTaxpayer(Taxpaper taxpayer) {
        if (count >= MAX) {
            return false;
        }
        list[count++] = taxpayer;
        return true;
    }

    public double getTax() {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            //method pay is polymorphic because we do not    
            // know exact object is instance of which class
            sum += list[i].pay();
        }
        return sum;
    }
}
