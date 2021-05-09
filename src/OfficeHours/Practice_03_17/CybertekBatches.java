package OfficeHours.Practice_03_17;

public class CybertekBatches {
    public static void main(String[] args) {

        String batchType = "US";
        if (batchType.equals("US") || batchType.equals("us")){
         boolean isMorning = false;
            if (isMorning){                         //isMorning available only for this inner if block
                System.out.println("Class times are: 10-5pm EST. M, T, W, TH, F");
            }else{
                System.out.println("Class times are: 7pm-10pm EST. M, T, W, TH; 10am-5pm Sa, Su");
            }
        }else if( batchType.equals("EU") || batchType.equals("eu")){
            System.out.println("Class times are: 10-5pm EST. M, T, W, TH, F");
        }else{
            System.out.println("Invalid batch");
        }
    }
}
//    In Cybertek we have three batch types: US morning, US evening, EU.
//        Depending on a batch type (String) print information about the batch.
//        First figure out is is a US batch or EU batch
//        - for US batches:
//        Figure out is it a morning batch or evening batch
//        morning - print: Class times are 10-5 EST. M, T, Th, F.
//        evening - print: Class times are 7-10 EST. M, T, W, Th, S, S
//
//        - for EU batches:
//
//        print: Class times are  10-5 EST. M, T, W, Th, F.