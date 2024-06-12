package DesignPattern.StrategyPattern;

public class Client {

    public static void main(String[] args) {
        Context context = new Context(new SumCalculation());
        System.out.println("SumCalculation = "+ context.performCalculation(3,2));

        context.setCalculator(new MultiplyCalculation());
        System.out.println("MultiplyCalculaion = "+ context.performCalculation(3,2));

        context.setCalculator(new SubtractCalculation());
        System.out.println("SubtractCalculation = "+ context.performCalculation(3,2));
    }
}
