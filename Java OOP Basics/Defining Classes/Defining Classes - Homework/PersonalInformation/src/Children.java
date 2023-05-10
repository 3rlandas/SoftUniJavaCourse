public class Children {
    private String childName;
    private String childBirthday;


    public Children(String childName, String childBirthday){
        this.childName = childName;
        this.childBirthday = childBirthday;
    }

    public String getChildBirthday() {
        return childBirthday;
    }

    public String getChildName() {
        return childName;
    }
    @Override
    public String toString() {
        return this.getChildName() + " " + this.getChildBirthday();
    }
}
