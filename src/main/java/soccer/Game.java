package soccer;

import utility.GameUtils;

public class Game {

    public Team homeTeam;
    public Team awayTeam;
    public Goal[] goals;

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

}
