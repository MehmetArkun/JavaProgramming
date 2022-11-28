package day11_Switch_Scanner;

public class Browser {

    public static void main(String[] args) {

        String browser ="Edge";
        String result = "";

        result = (browser=="Chrome" ||browser=="Firefox" ||browser=="Opera"||browser=="Safari"||browser=="Edge")?
                (browser == "Chrome")? "Chrome browser is selected"
                :(browser=="Firefox")? "Firefox Browser is selected"
                :(browser=="Opera")? "Opera browser is seelected"
                :(browser=="Safari")? "Safari browser is selected" :"Edge browse is selected"
                :"Invalid Browser Name";

        System.out.println(result);

    }
}

/*
1. Create a class called Browser. Write a program that can display the name of selected browser
	        1. declare a String variable named browserName
	        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge
	        3. if the browser name does not match with the valid browsers' names,
	        out put should be: Invalid Browser Name
	        Ex:
	        	String browser = "chrome";
	    	Output:
	    		Chrome Browser is selected
			Note: MUST use nested if
 */