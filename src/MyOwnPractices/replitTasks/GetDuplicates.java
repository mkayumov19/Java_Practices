package MyOwnPractices.replitTasks;

public class GetDuplicates {
    public static void main(String[] args) {
        String[] strs = {"1", "2", "aa", "1"};
        System.out.println(getDup(strs));
    }

    public static int getDup(String[] r) {
        int dup = 0;
        String checked = "";

        for (int i = 0; i < r.length; i++) {
            int count = 0;
            if (checked.equals(r[i])) {
                continue;
            }
            for (int j = 0; j < r.length; j++) {
                if (r[i].equals(r[j])) {
                    count++;
                }
                checked = r[j];
            }
            if (count > 1) {
                dup += count;
            }

        }
        return dup;
    }
}
