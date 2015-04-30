public abstract class AbstractTennisGame implements TennisGame {
    public abstract void wonPoint(String playerName);

    public abstract String getScore();

    protected final String[] SCORES = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
}
