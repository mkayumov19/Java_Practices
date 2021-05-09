package MyOwnPractices.mixedPractices;

    public class Employee {
        public static void main(String[] args) {
            String firstName = "Makhmudjon", lastName = "Kayumov", companyName = "Max-Tek LTD", jobTitle = "SDET",
                    position = "Manager", address = "1234 Corona Dr, #777. Tampa FL 33626", officeAddress =
                    "7925 Jones Branch Dr, #3300,\n" + "Tysons, VA 22102, USA", degree = "Bachelor's";
            double salary = 145000.0;
            byte birthMonth = 01;
            short birthDay = 19;
            int birthYear = 1984;
            int startYear = 2020, startMonth = 10, startDate =15;
            boolean areTheyFullTime = true;

        System.out.println("---------------- "+companyName+" ---------------");
        System.out.println("Employee Information requested by: "+position+".");
        System.out.println(firstName+" works at "+companyName+" at a position - "+jobTitle+" since "
                +startMonth+"."+startDate+"."+startYear+".\n");
        System.out.println("Employee Personal Data:\nFirst Name:\t\t\t"+firstName+".\nLast Name: \t\t\t"+lastName);
        System.out.println("Date of Birth: \t\t"+birthMonth+"."+birthDay+"."+birthYear+"\nEducation: \t\t\t"+degree);
        System.out.println("Employee address: \t"+address);
        System.out.println("Employee salary: \t$"+salary+
                "\nPosition is full-time: "+areTheyFullTime+"\n");
        System.out.println("Company address: \n"+officeAddress+"\nPrepared by "+companyName+" Admin.");

    }
}
