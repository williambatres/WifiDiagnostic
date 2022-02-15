import java.util.Scanner;

/*
 * Class: CMSC203 
 * Instructor: Khandan Monsh
 * Due: 2/04/2021
 * Description: A program to troubleshoot Wifi connection 
 * errors by prompting the user to enter yes or no input
 *  and trying different steps to resolve the issue.
 * Platform/compiler: Java compiler
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: William Batres
*/

public class WiFiDiagnosis {

	public static void main(String[] args) {
		
		//creates a scanner object called userYes_or_No
		//and takes the input from the user through the system 
		//using the keyboard
		Scanner userYes_or_No = new Scanner(System.in);
		
		//Decision terminator variable is set as a flag for the cases
		//later in the code as long as the terminator is true
		// the cases will execute until it is false
		int decisionTerminator = 1; 
		
		// Prints the starting prompt for the Wifi Diagnostic
		System.out.println("If you have a problem with internet "
				+"connectivity, this WiFi Diagnosis might work.");
		System.out.println("First step: reboot your computer");
		System.out.println("Are you able to connect "
				+ "with the internet? (yes or no)");
		
		// Creates a string variable to hold the scanner 
		//objects input from the user
		String userDecision;
		userDecision = userYes_or_No.nextLine();
		//first witch statement executes the code depending on if the user enters
		//yes or no and terminates the code if it is a yes
		switch (userDecision) 
		{
			case "Yes":
			case "yes":
			{
				//Output to the screen showing the resolution 
				System.out.println("Rebooting your computer" +
						" seemed to work");
				//sets the terminator to 0 in order to terminate the code
				//if the user's issue was fixed 
				decisionTerminator = 0;
				break;
			
			}
			case "No":
			case "no":
			{
				System.out.println("Second step: reboot your router" +
					" Now are you able to connect with internet?"
					+ " (yes or no)");
				break;
			
			}
		}
		//if statement to terminate the code if the user's issue  
		//was resolved
		if(decisionTerminator == 1)
		{
			userDecision = userYes_or_No.nextLine();
			//second switch statement executes the code depending on if the user enters
			//yes or no and terminates the code if it is a yes
			switch (userDecision) 
			{
				case "Yes":
				case "yes":
				{
					//Output to the screen showing the resolution
					System.out.println("Rebooting your router" +
						" seemed to work");
					//sets the terminator to 0 in order to terminate the code
					//if the user's issue was fixed 
					decisionTerminator = 0;
					break;
			
				}
				case "No":
				case "no":
				{
					System.out.println("Third step: Make sure the cables connecting" +
							" connecting the router are firmly plugged in and?"
							+ " power is getting to the router");
					System.out.println("Now are you able to connect with" +
								"with internet?");
					break;
			
				}
			}
			
		}
		//if statement to terminate the code if the user's issue  
		//was resolved
		if(decisionTerminator == 1)
		{
			userDecision = userYes_or_No.nextLine();
			//third switch statement executes the code depending on if the user enters
			//yes or no and terminates the code if it is a yes
			switch (userDecision) 
			{
				case "Yes":
				case "yes":
				{
					//Output to the screen showing the resolution
					System.out.println("Connecting the cables" +
						" seemed to work");
					//sets the terminator to 0 in order to terminate the code
					//if the user's issue was fixed 
					decisionTerminator = 0;
					break;
			
				}
				case "No":
				case "no":
				{
					System.out.println("Fourth step: Move the computer closer" +
							" to the router and try to connect");
					System.out.println("Now are you able to connect with" +
							"with internet?");
					break;
			
				}
			}
		}
		//if statement to terminate the code if the user's issue  
		//was resolved
		if(decisionTerminator == 1)
		{
			userDecision = userYes_or_No.nextLine();
			//final switch statement executes the code depending on if the user enters
			//yes or no and terminates the code if it is a yes
			switch (userDecision) 
			{
				case "Yes":
				case "yes":
				{
					//Output to the screen showing the resolution
					System.out.println("Moving the computer closer" +
							" seemed to work");
					//sets the terminator to 0 in order to terminate the code
					//if the user's issue was fixed 
					decisionTerminator = 0;
					break;
				
				}
				case "No":
				case "no":
				{
					System.out.println("Fifth step: Contact your ISP");
					break;
				
				}
			}
		}

	
		
		
	}

}
