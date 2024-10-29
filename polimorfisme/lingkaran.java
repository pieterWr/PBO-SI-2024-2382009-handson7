package polimorfisme;

public class lingkaran extends bangundatar{
    private double jariJari;

    public lingkaran (final double jariJari){
        this.jariJari = jariJari;
    }

    @Override
    public double luas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double keliling() {
        return 2 * Math.PI * jariJari;
    }


}