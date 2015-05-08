public abstract class AbstractTennisGame implements TennisGame {
    public static final int FOURTY_VALUE = 3;

    protected int P2point;
    protected int P1point;
    protected String player1Name;
    protected String player2Name;

    public AbstractTennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    protected String getScoreString(int score) {
        if (score > FOURTY_VALUE)
            return "";
        return SCORES[score];
    }

    protected String leadingPlayerName() {
        return ((P1point > P2point) ? player1Name : player2Name);
    }

    protected boolean differByOne() {
        return Math.abs(P1point - P2point) == 1;
    }

    protected boolean allHaveLessOrEqualThanForty() {
        return P2point <= FOURTY_VALUE && P1point <= FOURTY_VALUE;
    }

    protected boolean deuce() {
        return tie() && P1point >= FOURTY_VALUE;
    }

    protected boolean tie() {
        return P1point == P2point;
    }

    public void wonPoint(String player) {
        if (player1Name.equals(player))
            P1point++;
        else
            P2point++;
    }

    public abstract String getScore();

    protected final String[] SCORES = new String[]{"Love", "Fifteen", "Thirty", "Forty"}; // 0,1,2,3

    protected boolean allHaveFourty() {
        return (P1point == FOURTY_VALUE && P2point == FOURTY_VALUE);
    }
}
