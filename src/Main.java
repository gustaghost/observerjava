//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observador1 = new ConcreteObserver("Fade");
        ConcreteObserver observador2 = new ConcreteObserver("Sova");
        ConcreteObserver observador3 = new ConcreteObserver("Skye");

        subject.registerObserver(observador1);
        subject.registerObserver(observador2);
        subject.registerObserver(observador3);

        System.out.println("Todos os observadores:");
        subject.setMessage("Another Life");


        System.out.println("\nRemovendo observador 2 e alterando a mensagem:");
        subject.removeObserver(observador2);
        subject.setMessage("Last Resort");


        System.out.println("\nRemovendo observador 1 e alterando a mensagem:");
        subject.removeObserver(observador1);
        subject.setMessage("Chop Suey!");
    }
}
