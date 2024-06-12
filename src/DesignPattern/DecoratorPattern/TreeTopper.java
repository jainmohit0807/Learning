package DesignPattern.DecoratorPattern;

public class TreeTopper extends TreeDecorator{
    public TreeTopper(ChristmasTree tree) {
        super(tree);
    }
    @Override
    public String decorate() {
        return tree.decorate()+"Add TreeTopper ";
    }
}
