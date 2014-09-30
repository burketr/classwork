import java.util.Scanner;
public class TemperatureChanger{
        public static void main(String[]args){
       System.out.println("Please enter the temperature you wish to convert, and the captilized unit.");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        String temp = input.substring(0,input.length()-1);	
	if ((input.substring(input.length()-1,input.length())).equals("C")){
		System.out.println(Double.parseDouble(temp)*1.8+32);
		}else{
		System.out.println((Double.parseDouble(temp)-32)/1.8);	 
}
}
}
