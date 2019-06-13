public class Card {

    private SuitType suit;
    private RankType rank;

    public Card(SuitType suit, RankType rank){
        this.suit = suit;
        this.rank = rank;
    }

    public SuitType getSuit() {
       return this.suit;
    }

    public RankType getRank() {
        return this.rank;
    }

    public int getRankValue() {
        return this.rank.getValue();
    }

    public int getSuitValue() {
        return this.suit.getValue();
    }
}
