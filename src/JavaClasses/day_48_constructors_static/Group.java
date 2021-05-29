package JavaClasses.day_48_constructors_static;
import java.util.ArrayList;
import java.util.List;

public class Group {

    private String name;
    private List<String> members = new ArrayList<>();

    //constructor that accepts a name
    public Group(String name) {
        this.name = name;
    }

    public void addMember(String newMember) {
        members.add(newMember);
    }

    public void removeMember(String memberName) {
        members.remove(memberName);
    }

    @Override
    public String toString() {
        return name + " ; " + members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }
}
