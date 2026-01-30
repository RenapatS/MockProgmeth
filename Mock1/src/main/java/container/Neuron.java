package container;

public class Neuron {
    private static double minWeightValue;
    private static double maxWeightValue;
    private double[] weights;
    private double gradient;
    private double bias;
    private double value;

    public Neuron(double[] weights, double bias){
        this.gradient = 0;
        this.value = 0;
        setWeights(weights);
        setBias(bias);
//        this.weights = weights;
//        this.bias = bias;
    }
    public Neuron(double value){
//        this.value = value;
        setValue(value);
        this.bias = -1;
        this.gradient = -1;
        this.weights = null;
    }
    public static void setRangeWeight(double min,double max){
//        this.maxWeightValue = max;
//        this.minWeightValue = min;
        setMaxWeightValue(max);
        setMinWeightValue(min);
    }

    public static double getMaxWeightValue() {
        return maxWeightValue;
    }

    public static void setMaxWeightValue(double maxWeightValue) {
        Neuron.maxWeightValue = maxWeightValue;
    }

    public static double getMinWeightValue() {
        return minWeightValue;
    }

    public static void setMinWeightValue(double minWeightValue) {
        Neuron.minWeightValue = minWeightValue;
    }

    public double[] getWeights() {
        return weights;
    }

    public void setWeights(double[] weights) {
        this.weights = weights;
    }

    public double getGradient() {
        return gradient;
    }

    public void setGradient(double gradient) {
        this.gradient = gradient;
    }

    public double getBias() {
        return bias;
    }

    public void setBias(double bias) {
        this.bias = bias;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
