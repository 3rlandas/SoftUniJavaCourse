import java.util.List;
import java.util.Map;

public class Person {

    private String name;
    private Map<String, Person> data;
    private List<String> Parent;


    static class Parent {

    }

    static class Children {

        private Map<String, String> children;
        private String leftSideName = null;
        private String rightSideName = null;
        private String leftSideBirthday = null;
        private String rightSideBirthday = null;
        private String characterName = null;

        public Children(String characterName, String leftSideName, String leftSideBirthday, String rightSideName, String rightSideBirthday) {
           this.characterName = characterName;
            this.leftSideName = leftSideName;
            this.leftSideBirthday = leftSideBirthday;
            this.rightSideName = rightSideName;
            this.rightSideBirthday = rightSideBirthday;
        }
        public String getCharacterName() {
            return characterName;
        }

        public String getRightSideBirthday() {
            return rightSideBirthday;
        }

        public String getLeftSideBirthday() {
            return leftSideBirthday;
        }

        public String getRightSideName() {
            return rightSideName;
        }

        public String getLeftSideName() {
            return leftSideName;
        }

        public void setCharacterName(String characterName) {
            this.characterName = characterName;
        }

        if(characterN)



      /*  public Children(String name, String birthday) {
            this.name = name;
            this.birthday = birthday;

            children.putIfAbsent(null, birthday);
        }

        public Children(String name) {
            this.name = name;

            children.putIfAbsent(name, birthday);
        }*/
    }

}
