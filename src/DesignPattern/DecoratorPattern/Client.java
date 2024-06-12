package DesignPattern.DecoratorPattern;

public class Client {
    public static void main(String[] args) {
        ChristmasTree tree = new Garland(new TreeTopper(new ChristmasTreeImpl()));
        System.out.println(tree.decorate());
    }

}
