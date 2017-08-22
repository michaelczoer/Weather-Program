package helloworld;	//Michael Czoer

import java.util.Scanner;	//CSAM SICTC

public class WeatherReport {	//Weather Report project 8/22/17

		public static void main(String[] args) 
		{
		
		System.out.println("Welcome, please enter the temperature in degrees F.");
			
		Scanner cin = new Scanner(System.in); //to insert the given temperature in degreed F

		int far = cin.nextInt();	//define far as the temperature given in 
				
		int tem = (5*far-160)/9;	//equation to go from fahrenheit to centigrade
		
		System.out.println("The temperature is " +tem+ " degrees in Centigrade.");	//Tell the user the temperature
		
		if(tem<=0)	//if it's colder than 32 degrees F/ 0 degrees C then it will tell the user it's cold
		{
			System.out.println("Baby, it's cold outside!");
		}
		else if(tem>=32.2)	//if it's hotter than 90 degrees F/32.2 degrees C then it will tell the user it's hot
		{
			System.out.println("It's hot Don");
		}
		else	//if it;'s inbetween the two temperatures than its neither hot nor cold so don't say anything
		{
			System.out.println("Have a nice day!");
		}
		cin.close();
		}
}

		