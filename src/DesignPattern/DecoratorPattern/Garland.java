package DesignPattern.DecoratorPattern;

public class Garland extends TreeDecorator {
    public Garland(ChristmasTree tree) {
        super(tree);
    }
    @Override
    public String decorate() {
        return tree.decorate()+"Add Garland ";
    }
}
