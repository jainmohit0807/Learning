package DesignPattern.DecoratorPattern;

public class Tinsel extends TreeDecorator{
    public Tinsel(ChristmasTree tree) {
        super(tree);
    }
    @Override
    public String decorate() {
        return tree.decorate()+"Add Tinsel ";
    }
}
