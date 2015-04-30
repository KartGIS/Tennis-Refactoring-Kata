
public class TennisGame3 extends AbstractTennisGame {

    public TennisGame3(String player1Name, String player2Name) {
        super(player1Name, player2Name);
    }

    public String getScore() {
        if (allHaveLessOrEqualThanForty() && !allHaveFourty()) {
            return (tie())
                    ? getScoreString(P1point) + "-All"
                    : getScoreString(P1point) + "-" + getScoreString(P2point);
        }

        if (tie()) {
            return "Deuce";
        }

        return leadingType() + leadingPlayerName();
    }

    private String leadingType() {
        return (differByOne() ? "Advantage ":  "Win for ");
    }

    private boolean allHaveFourty() {
        return (P1point == FOURTY_VALUE && P2point == FOURTY_VALUE);
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            this.P1point += 1;
        else
            this.P2point += 1;
        
    }

}
