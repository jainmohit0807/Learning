package DesignPattern.StrategyPattern;

public class MultiplyCalculation implements Calculator{

    @Override
    public int result(int a, int b) {
        return a*b;
    }
}
