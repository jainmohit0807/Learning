package DesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{
    List<Observer> observerList;

    ConcreteSubject(){
        this.observerList = new ArrayList<>();
    }
    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.observerList.forEach(Observer::update);
    }

    public void doSomething(){
        System.out.println("Done some update");
        notifyObservers();
    }

    public int getValue(){
        return 5;
    }
}
