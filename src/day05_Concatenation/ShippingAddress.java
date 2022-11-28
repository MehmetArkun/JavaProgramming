package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {
        /*
        String name = "Mehmet Ali Arkun";
        String buildingNumber = "48B";
        String streetName = "Alexander Road";
        String city = "London";
        String state = "UK";
        String zipCode = "N19 3PQ";

        System.out.println(name + "\n"+buildingNumber + " "+ streetName + "\n"+city+
        ", "+state+" "+zipCode);

         */

    /*
    to create various variables of the same kind, we can use coma (,)
    instead of semi-colon (;)
     */

        String name = "Mehmet Ali Arkun",
                buildingNumber = "48B",
                streetName = "Alexander Road",
                city = "London",
                state = "UK",
                zipCode = "N19 3PQ";

       // System.out.println(name + "\n"+buildingNumber + " "+ streetName + "\n"+city+ ", "+state+" "+zipCode);

                String address = name + "\n"+buildingNumber + " "+ streetName + "\n"+city+ ", "+state+" "+zipCode;

                System.out.println(address);


    }
}

/*
Declare the following variables:
    name
    buildingNumber
    streetName
    city
    state
    zipCode
Use concatenation to print the full shipping address
    EX:
		Jimmy Joe
		7925 Jones Branch Dr
		McLean, VA 20125
 */
