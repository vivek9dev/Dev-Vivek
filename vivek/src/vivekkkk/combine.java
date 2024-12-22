package vivekkkk;

import java.util.Scanner;

public class combine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your choice:- \n1.Fibonacci \n2.Factorial \n3.While \n4.Do While \n5.For loop \n6.Greater no \n7.Even Odd ");
		
		int a=sc.nextInt();
		
		int c=1, b=5;
		
		switch(a)
		{
		case 1:
			int n1=0,n2=1, n3, d=10;
			
			for(int i=1;i<=b;i++)
			{
				n3=n1+n2;
				System.out.println(n3);
				
				n1=n2;
				n2=n3;
			}
			break;
			
		case 2:
			int e=5, f=1;
			
			for(int i=1;i<=e;i++) 
			{
				f=f*i;  
				System.out.println(f); 
			}
			
			break;
			
		case 3:
			int g=1;
			
			while(g<10) 
			{
				System.out.println(a); 
				g++; 
			}
			break;
			
		case 4:
			int h=1;
			
			do
			{
				System.out.println(b); 
			 h++; 
			}
			while(h<=10);  
			break;
			
		case 5:	
			for(int i=1; i<=10; i++)
			{
				System.out.println(i);
			}
			break;
			
		case 6:
			System.out.print("Enter two numbers: ");
	        int num1 = sc.nextInt();
	        int num2 = sc.nextInt();

	        if (num1 > num2) {
	            System.out.println("The greater number is: " + num1);
	        } else {
	            System.out.println("The greater number is: " + num2);
	        }
	        break;
	        
		case 7:
			 System.out.print("Enter a number: ");
		        int num = sc.nextInt();

		        if (num % 2 == 0) {
		            System.out.println(num + " is Even");
		        } else {
		            System.out.println(num + " is Odd");
		        }
		       break;
			
			default:
				System.out.println("Invalid Choice..");
				break;
		}
		
		
	}

}
