package DesignPattern.ObserverPattern;

public class ConcreteObserver1 implements Observer {

    ConcreteSubject subject;

    public ConcreteObserver1(ConcreteSubject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("Notify Observer 1");
        System.out.println("Get updated value from concrete Subject :-  "+ subject.getValue());
    }
}
