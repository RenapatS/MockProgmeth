package container;

public class NeuronDemo {
    private Neuron n;
    public void demonstrate(){
        double wei[] = {0.2,0.3,0.4};
        n = new Neuron(wei,0.2);
        n.setMinWeightValue(0.1);
        n.setMaxWeightValue(0.7);
        n.setGradient(0.6);
        n.setValue(1);
    }

    public Neuron getN() {
        return n;
    }

    public void setN(Neuron n) {
        this.n = n;
    }
}
