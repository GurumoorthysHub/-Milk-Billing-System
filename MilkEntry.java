public class MilkEntry {
    private double quantity;
    private double fat;
    private double snf;

    public MilkEntry(double quantity, double fat, double snf) {
        this.quantity = quantity;
        this.fat = fat;
        this.snf = snf;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getFat() {
        return fat;
    }
    
    public double snf() {
        return snf;
    }
}