import java.io.Serializable;

public class Course implements Serializable {

    private String name;
    private int studentsCount;

    public Course(String name, int studentsCount) {

        this.name = name;
        this.studentsCount = studentsCount;
    }

    public String getName() {
        return this.name;
    }

    public void setName() {
        this.name = name;
    }

    public int getStudentsCount() {
        return this.studentsCount;
    }

    public void setStudentsCount(int studentsCount) {
        this.studentsCount = studentsCount;
    }

    @Override
    public String toString() {
        return new StringBuffer("Course name: ")
                .append(this.name)
                .append(", Students enrolled: ")
                .append(this.studentsCount)
                .toString();
    }
}
