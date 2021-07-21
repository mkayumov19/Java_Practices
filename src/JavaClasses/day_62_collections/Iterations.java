package JavaClasses.day_62_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterations {
    public static void main(String[] args) {
        List<String> jobIds=new ArrayList<>();
        jobIds.add("John");
        jobIds.add("Mahliya");
        jobIds.add("Nevzat");
        jobIds.add("Mariia");
        jobIds.add("Abbas");

        List<String> jobIds2= Arrays.asList("Mariia","Nevzat","John");
        System.out.println(jobIds2);
        for(int i=0;i<jobIds.size();i++){
            System.out.println(jobIds.get(i));
        }
        System.out.println("===========FOR EACH=======");
        for(String jobId : jobIds){
            System.out.println(jobId);
        }
        System.out.println("===========ITERATOR=======");
        Iterator<String> jobIdIterator=jobIds.iterator();
        while(jobIdIterator.hasNext()){
            String id=jobIdIterator.next();
            if(id.equals("Mahliya")){
                jobIdIterator.remove();
            }else{
                System.out.println(id);
            }
        }
        System.out.println(jobIds);


        //System.out.println("===========ITERATOR MODIFY=======");
        //Below code is bad , because forEach loop does not let modification
//	    for(String jobId : jobIds){
//    			if(jobId.equals("SM")){
//    				jobIds.remove(jobId);
//    			}else{
//    				System.out.println(jobId);
//    			}
//	    }

//	    Iterator<String> jobIdIterator2=jobIds.iterator();
//	    while(jobIdIterator2.hasNext()){
//	      //String id=jobIdIterator.next();
//	      if(jobIdIterator2.next().equals("PO")){
//	    	  	jobIdIterator2.remove();
//	      }else{
//	    	  	System.out.println(jobIdIterator2.next());
//	      }
//	    } //when we use without variable why it is not working properly?


    }

}
