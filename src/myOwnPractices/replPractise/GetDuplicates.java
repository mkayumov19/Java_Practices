package myOwnPractices.replPractise;

public class GetDuplicates {
    public static void main(String[] args) {
        String[] strs = {"8", "1", "g", "aabb", "7","7","2","aa","7"};
        System.out.println(getDup(strs));
    }

    public static int getDup(String[] r) {
        int dup = 0;
        String checked = "";

        for (int i = 0; i < r.length; i++) {
            int count = 0;
            if (checked.contains(r[i])) {
                continue;
            }
            for (int j = 0; j < r.length; j++) {
                if (r[j].equals(r[i])) {
                    count++;
                }
            }
            checked += r[i];
            if (count > 1) {
                dup = count;
            }

        }
        return dup;
    }
}
