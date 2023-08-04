public class Player {
    public String name;
    public int endurance;
    public int sprint;
    public int dribble;
    public int passing;
    public int shooting;

    private Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        this.name = name;
        this.endurance = endurance;
        this.sprint = sprint;
        this.dribble = dribble;
        this.passing = passing;
        this.shooting = shooting;
    }

    private double overallSkillLevel() {
        return 5 / (this.endurance + this.sprint + this.dribble + this.passing + this.shooting);
    }

    private void setEndurance(int endurance) {
        /// if(endurance < 0 || endurance > 100){
        //     throw new IllegalArgumentException("")
        // }
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        this.shooting = shooting;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
