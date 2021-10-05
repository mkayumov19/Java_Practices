package myOwnPractices.mixedPractices;

import java.util.*;

public class ArrayExamples {
    public static void main(String[] args) {

        int[] num1 = {1, 2, 3, 4, 5, 6};
        int[] num2 = new int[6];
        int[] num3 = new int[5];

        for (int i = 0; i < 6; i++) {
            num2[i] = num1[i];
        }

        num3[0] = num1[0];
        num3[1] = num1[1];
        num3[2] = num1[2];
        num3[3] = num1[3];
        num3[4] = num1[4];

        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
        System.out.println(Arrays.toString(num3));

        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 6, 7, 8, 9));
        List<Integer> nums2 = new ArrayList<>();
        nums2.addAll(nums1);

        System.out.println("num1 = " + Arrays.toString(num1));
        System.out.println("num2 = " + Arrays.toString(num2));

//        =============================================================
    }

    static class IteratorEample {
        public static void main(String[] args) {

            List<Map<String, Integer>> studentId = new ArrayList<>();
            String name1 = "Aygun";
            String name2 = "Halida";
            String name3 = "Max";
            int id1 = 01;
            int id2 = 02;
            int id3 = 03;

            Map<String, Integer> nameId = new HashMap<>();
            nameId.put(name1, id1);
            studentId.add(nameId);

            //TODO:
            // Iterator<String> idIterator = nameId.keySet().iterator();
            // while (idIterator.hasNext()) {
            // String id = idIterator.next();
            // Integer name = nameId.get(id);
            // System.out.println(id + " -> " + name);
            // System.out.println("studentId = " + studentId);
            // }

//            for (
//                    Integer key : teacherID.keySet()) {
//                String value = teacherID.get(key);
//                System.out.println(key + " -> " + value);
//            }
        }
    }
}