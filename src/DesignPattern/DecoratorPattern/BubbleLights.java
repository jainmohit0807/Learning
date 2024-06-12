package DesignPattern.DecoratorPattern;

public class BubbleLights extends TreeDecorator {

    public BubbleLights(ChristmasTree tree) {
        super(tree);
    }
    @Override
    public String decorate() {
        return tree.decorate()+"Add BubbleLight ";
    }
}
