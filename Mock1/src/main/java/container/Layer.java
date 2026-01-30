package container;

import function.Function;
import util.Activation;
import util.GenRandom;

import java.util.ArrayList;

import static function.Function.*;

public class Layer {
    private Neuron[] neurons;
    private Function function;

    public Layer(int inNeurons, int nNeurons, Function function){
        setFunction(function);
        this.neurons = new Neuron[nNeurons];
        for(int id=0 ; id<nNeurons ; id++){
            double wei[] = new double[inNeurons];
            for(int i=0;i<inNeurons;i++){
                wei[i] = GenRandom.randomDouble(Neuron.getMinWeightValue(),Neuron.getMaxWeightValue());
            }
//            neurons[id].setWeights(wei);
//            neurons[id].setBias(GenRandom.randomDouble(0,1));
            neurons[id] = new Neuron(wei, GenRandom.randomDouble(0,1));
        }
    }

    public Layer(double[] input){
        neurons = new Neuron[input.length];
        for(int i=0;i<input.length;i++){
            neurons[i] = new Neuron(input[i]);
        }
        this.function = null;
    }

    public double applyActivation(double x) throws IllegalArgumentException{
        if(function == SIGMOID ){
            return Activation.sigmoid(x);
        }else if(function == TANH ){
            return Activation.tanh(x);
        }else if(function == RELU ){
            return Activation.relu(x);
        }else {
            throw new IllegalArgumentException("Unknown Activation Function: "+function);
        }
    }

    public double applyActivationDerivative(double x) throws IllegalArgumentException{
        if(function == SIGMOID ){
            return Activation.sigmoidDerivative(x);
        }else if(function == TANH ){
            return Activation.tanhDerivative(x);
        }else if(function == RELU ){
            return Activation.reluDerivative(x);
        }else {
            throw new IllegalArgumentException("Unknown Activation Function: "+function);
        }
    }


    public Neuron[] getNeurons() {
        return neurons;
    }

    public void setNeurons(Neuron[] neurons) {
        this.neurons = neurons;
    }

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

}
