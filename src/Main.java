//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observador1 = new ConcreteObserver("Phoenix");
        ConcreteObserver observador2 = new ConcreteObserver("Sova");
        ConcreteObserver observador3 = new ConcreteObserver("Omen");

        subject.registerObserver(observador1);
        subject.registerObserver(observador2);
        subject.registerObserver(observador3);

        System.out.println("Definindo mensagem a ser enviada para os observadores:");
        subject.setMessage("Boa noite!");


        System.out.println("\nRemovendo observador 2");
        subject.removeObserver(observador2);


        System.out.println("'Mudando a mensagem:'");
        subject.setMessage("Dinossauro Rex");


        System.out.println("\nRemovendo observador 1");
        subject.removeObserver(observador1);

        System.out.println("Definindo mensagem final:");
        subject.setMessage("Chop Suey!");
    }
}
