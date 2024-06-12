package DesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.addObserver(new ConcreteObserver1(concreteSubject));
        concreteSubject.addObserver(new ConcreteObserver2(concreteSubject));
        concreteSubject.doSomething();
    }
}
