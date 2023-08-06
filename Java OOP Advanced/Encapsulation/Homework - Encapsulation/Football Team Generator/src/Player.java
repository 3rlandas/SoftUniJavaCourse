public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        this.setName(name);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
    }

    public double overallSkillLevel() {
        return (this.endurance + this.sprint + this.dribble + this.passing + this.shooting) / 5.0;
    }

    private void setEndurance(int endurance) {
        statsValidator(endurance, "Endurance");
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        statsValidator(sprint, "Sprint");
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        statsValidator(dribble, "Dribble");
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        statsValidator(passing, "Passing");
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        statsValidator(shooting, "Shooting");
        this.shooting = shooting;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.trim().isEmpty()){
            throw new IllegalArgumentException("Names cannot be blank.");
        }
        this.name = name;
    }
    private void statsValidator(int range, String stats){

        if(range < 0 || range > 100){
            throw new IllegalArgumentException(String.format("A player's %s should be a number between 0 and 100.", stats));
        }
    }
}
