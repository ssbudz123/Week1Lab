
public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int availablePlaneSeats = 5;
double costOfGroceries = 110.57;
char middleInitial = 'S';
boolean isHotOutside = true;
boolean isColdOutside = false;
String firstName = "Shawn";
String streetAddress = "Wayford Lane";
System.out.println("Available seats left on the plane: " + availablePlaneSeats);
System.out.println(costOfGroceries + " is the price for groceries.");
System.out.println("The person's middle initial is " + middleInitial);
System.out.println("It is hot outside - " + isHotOutside);
System.out.println("It is cold outside - " + isColdOutside);
System.out.println("The customer's first name is " + firstName);
System.out.println("The street address is " + streetAddress);

//availablePlaneSeats = availablePlaneSeats - 2;
availablePlaneSeats -=2;
System.out.println(availablePlaneSeats);

costOfGroceries +=2.15;
System.out.println(costOfGroceries);

middleInitial = 'F';
System.out.println(middleInitial);

isHotOutside = false;
System.out.println(isHotOutside);

String fullName = "Shawn S Budzinski";
System.out.println(fullName);

System.out.println(fullName + " lives at " + streetAddress);



	}

}
