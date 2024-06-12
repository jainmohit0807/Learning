package DesignPattern.StrategyPattern;

public class SubtractCalculation implements Calculator{

    @Override
    public int result(int a, int b) {
        return a-b;
    }
}
