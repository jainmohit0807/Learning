package DesignPattern.StrategyPattern;

public class SumCalculation implements Calculator{

    @Override
    public int result(int a, int b) {
        return a+b;
    }
}
