package DesignPattern.StrategyPattern;

public class Context {
    Calculator calculator;

    Context(Calculator calculator){
        this.calculator = calculator;
    }

    int performCalculation(int a,int b){
        return calculator.result(a,b);
    }

    void setCalculator(Calculator calculator){
        this.calculator = calculator;
    }
}
