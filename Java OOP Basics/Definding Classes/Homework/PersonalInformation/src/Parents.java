public class Parents {
    private String parentName;
    private String parentBirthday;


    public Parents(String parentName, String parentBirthday){
        this.parentName = parentName;
        this.parentBirthday = parentBirthday;
    }

    public String getParentBirthday() {
        return parentBirthday;
    }

    public String getParentName() {
        return parentName;
    }
    @Override
    public String toString() {
        return this.getParentName() + " " + this.getParentBirthday();
    }
}
