package JavaBasics.day_48_constructors_static;

import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {

        Group group1 = new Group("Cyberbugs");
        System.out.println("List size before setting values: " + group1.getMembers().size());
        group1.addMember("A");
        group1.addMember("B");
        group1.addMember("C");
        group1.addMember("D");
        group1.addMember("E");
        group1.addMember("F");
        group1.addMember("G");
        group1.addMember("H");
        System.out.println("List size after setting values: " + group1.getMembers().size());
        System.out.println(group1.toString());

        Group group2 = new Group("StaticGroup");
        group2.setMembers(Arrays.asList("Max","Fikret","Aygun","Halide","Abigail","Aghabe","Mariam","Rod","Subide"));
        group2.getMembers().forEach(member-> System.out.println(member));

        if (group2.getMembers().contains("Mariam")){
            System.out.println("Mariam is group member");
        }else{
            System.out.println("Mariam is Not group member");
        }

        group1.removeMember("B");
        group1.removeMember("E");
        System.out.println(group1);
    }
}
