package polimorfisme;

public class persegi extends bangundatar {
    private double sisi;

    @Override
    public double luas() {
        return sisi * sisi;

    }

    @Override
    public double keliling() {
        return 4 * sisi;
    }

    public persegi(final double sisi){
        this.sisi = sisi;

    }


}