package soccer;

import utility.GameUtils;

public class Game {

    private Team homeTeam;
    private Team awayTeam;
    private Goal[] goals;

    public Game(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public void playGame(int maxGoals) {
        int numberOfGoals = (int) (Math.random() * maxGoals + 1);
        Goal[] theGoals = new Goal[numberOfGoals];
        this.goals = theGoals;
        GameUtils.addGameGoals(this);
    }

    public void playGame() {
        playGame(6);
    }

    public String getDescription() {
        StringBuilder returnString = new StringBuilder();
        for (Goal currGoal : this.goals) {
            returnString.append("Goal scored after " + currGoal.theTime);
            returnString.append(" mins by " + currGoal.thePlayer.playerName);
            returnString.append(" of " + currGoal.theTeam.teamName);
            returnString.append("\n");
        }
        return returnString.toString();
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Goal[] getGoals() {
        return goals;
    }

    public void setGoals(Goal[] goals) {
        this.goals = goals;
    }
}
