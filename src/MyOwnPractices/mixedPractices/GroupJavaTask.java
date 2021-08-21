package MyOwnPractices.mixedPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupJavaTask {
//  Write a method that can move all zeros to the end of the list of integers.
//  List<Integer> list {0,4,6,10,30,16,39,10,18,0}

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.addAll(Arrays.asList(0, 4, 6, 10, 30, 16, 39, 10, 18, 0));
        System.out.println(moveZerosToTheEnd(list));
    }

    public static List<Integer> moveZerosToTheEnd(List<Integer> list) {

//        List<Integer> temp1 = new ArrayList<>();
//        List<Integer> temp2 = new ArrayList<>();
//        for (int each : list) {
//            if (each != 0){
//                temp1.add(each);
//            } else {
//                temp2.add(each);
//            }
//        }
//        list = Stream.concat(temp1.stream(), temp2.stream()).collect(Collectors.toList());
//        return list;
//    }
//}

        int originalSize = list.size();
        list.removeAll(Arrays.asList(0));
        int newSize = list.size();
        int totalNumberOfZeros = originalSize - newSize;
        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }
        return list;
    }
}
