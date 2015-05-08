
public class TennisGame1 extends AbstractTennisGame {

    public TennisGame1(String player1Name, String player2Name) {
        super(player1Name, player2Name);
    }

    @Override
    public String getScore() {
        if (tie())
            return deuce() ? "Deuce" : getScoreString(P1point) + "-All";
        if (anyHaveMoreThanForty()) {
            if (differByOne()) {
                return "Advantage " + leadingPlayerName();
            }
            return "Win for " + leadingPlayerName();
        }
        return getScoreString(P1point) + "-" + getScoreString(P2point);
    }

    private boolean anyHaveMoreThanForty() {
        return !allHaveLessOrEqualThanForty();
    }
}
