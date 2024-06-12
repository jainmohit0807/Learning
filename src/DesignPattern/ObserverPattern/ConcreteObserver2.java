package DesignPattern.ObserverPattern;

public class ConcreteObserver2 implements Observer{

    ConcreteSubject subject;
    public ConcreteObserver2(ConcreteSubject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("Notify Concrete Observer 2");
        System.out.println("Get updated value from concrete Subject :-  "+ subject.getValue());
    }
}
