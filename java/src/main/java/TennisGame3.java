
public class TennisGame3 extends AbstractTennisGame {

    public TennisGame3(String player1Name, String player2Name) {
        super(player1Name, player2Name);
    }

    @Override
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

}
