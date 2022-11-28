package week02;

public class ShoppingList {

    public static void main(String[] args) {


                String item1, item2, item3, report;
                double price1, price2, price3, totalPrice;

                item1 = "Tomatoes";
                item2 = "Cheese";
                item3 = "Apples";

                price1 = 5.5;
                price2 = 3.5;
                price3 = 6.3;
                totalPrice = price1 + price2 + price3;

                report = item1+" Price: "+  price1+ ", " +item2+" Price: "+price2+", "
                        + item3 + " Price: "+price3+"\n"+ "Total price: "+totalPrice;

        System.out.println("Report: " + report);


            }
        }