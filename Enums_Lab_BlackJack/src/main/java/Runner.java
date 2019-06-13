import java.sql.SQLOutput;

public class Runner {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck.shuffler());
        System.out.println(deck.dealCard());
    }
}
