package myOwnPractices.replPractise;

import java.util.ArrayList;

public class BlogDB {
    public static void main(String[] args) {

        int size = 3;
        String id = "2";
        ArrayList<String[]> list = new ArrayList<>();
        list.add(new String[]{"1","title1","content1"});
        list.add(new String[]{"2","title2","content2"});
        list.add(new String[]{"3","title3","content3"});
        System.out.println(blogDb(list, id));

    }

    public static String blogDb(ArrayList<String[]> r, String id){
        String str = "";
        for (int i = 0; i < r.size(); i++) {
        if (r.get(i)[0].equals(id)){
            System.out.println(r.get(i)[1]);
            str = r.get(i)[2];
           }
        }
        return str;
    }
}
