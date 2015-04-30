
public class TennisGame2 extends AbstractTennisGame {

    public TennisGame2(String player1Name, String player2Name) {
        super(player1Name, player2Name);
    }

    public String getScore() {
        if (deuce()) {
            return "Deuce";
        }
        if (tie()) {
            return getScoreString(P1point) + "-All";
        }
        if (allHaveLessOrEqualThanForty()) {
            return getScoreString(P1point) + "-" + getScoreString(P2point);
        }

        if (differByOne()) {
            return "Advantage " + leadingPlayerName();
        }
        return "Win for " + leadingPlayerName();
    }

    public void P1Score() {
        P1point++;
    }

    public void P2Score() {
        P2point++;
    }

    public void wonPoint(String player) {
        if (player1Name.equals(player))
            P1Score();
        else
            P2Score();
    }
}