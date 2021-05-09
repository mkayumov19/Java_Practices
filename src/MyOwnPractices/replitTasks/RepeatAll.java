package MyOwnPractices.replitTasks;
import java.util.*;

public class RepeatAll {
    public static void main(String[] args) {
        ArrayList<Boolean> list = new ArrayList<>(Arrays.asList(true, false, false));
        System.out.println(repeatAll(list));

    }

    public static ArrayList<Boolean> repeatAll(ArrayList<Boolean> isRepeat) {
        ArrayList<Boolean> hasRepeat = new ArrayList<Boolean>();
        ArrayList<Boolean> isCopy = new ArrayList<Boolean>();
        for (int i = 0, j = isRepeat.size()-1; i < isRepeat.size(); i++,j++) {
            hasRepeat.add(isRepeat.get(i));
            isCopy.add(isRepeat.get(i));
        }
        hasRepeat.addAll(isCopy);

        return hasRepeat;
    }
}