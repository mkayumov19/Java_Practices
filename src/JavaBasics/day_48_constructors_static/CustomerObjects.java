package JavaBasics.day_48_constructors_static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1.toString());     //print with default values that are set in no-args constructor
        cs1.setName("Bob");
        cs1.setId(9);
        System.out.println(cs1);

        Customer cs2 = new Customer("Mitchel", 5);
        Customer cs3 = new Customer("Mariya", 7);
        System.out.println(cs2);
        System.out.println(cs3);

//        cs1 = cs2;
//        System.out.println(cs1);

        //Array of Customers:
        Customer[] allCustomers = {cs1, cs2, cs3, new Customer("Bashir", 5)};

        System.out.println(allCustomers[0]);
        System.out.println(allCustomers[1]);
        System.out.println(Arrays.asList(allCustomers));

        //ArrayList of Customer objects:
        List<Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Maruf", 65));
        customerList.add(new Customer("Akbar", 45));

        System.out.println(customerList.get(0).toString());
        System.out.println(customerList.get(1).toString());
        System.out.println(customerList);

        System.out.println("===============FOR LOOP===============");
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));
        }
        System.out.println("============FOR EACH LOOP============");
        for(Customer eachCustomer : customerList){
            System.out.println(eachCustomer);
        }

        System.out.println("============LAMBDA->NAMES=============");
        customerList.forEach(eachName -> System.out.println(eachName.getName()));

        System.out.println("============LAMBDA->IDS=============");
        customerList.forEach(eachId -> System.out.println(eachId.getId()));



    }
}
