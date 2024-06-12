package DesignPattern.DecoratorPattern;

abstract public class TreeDecorator implements ChristmasTree {
    ChristmasTree tree;
    public TreeDecorator(ChristmasTree tree) {
        this.tree = tree;
    }
}
