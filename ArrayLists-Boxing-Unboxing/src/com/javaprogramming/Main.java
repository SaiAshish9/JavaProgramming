package com.javaprogramming;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner scanner=new Scanner(System.in);
	private static GroceryList groceryList=new GroceryList();


	public static void main(String[] arg){
     boolean quit=false;
     int choice=0;
     print();
     System.out.println("sai".equalsIgnoreCase("Sai"));
     while(!quit){
        System.out.println("Enter your choice");
        choice=scanner.nextInt();
        scanner.nextLine();

        switch (choice){
        	case 0:
			    print();
			    break;
			case 1:
				groceryList.print();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modify();
				break;
			case 4:
				remove();
				break;
			case 5:
				search();
				break;
			case 6:
//				System.exit(0);
				quit=true;
				break;
		}
	 }
	}

	public static void print(){
		System.out.println("Option :");
	}

	public static void addItem(){
		System.out.println("Enter grocery item ");
		groceryList.addGroceryItem(scanner.nextLine());
	}

	public static void modify(){
		System.out.println("Enter item number");
		int itemNo=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter replacement item:");
		String newItem=scanner.nextLine();
		groceryList.modify(newItem);
	}

	public static void remove(){
      System.out.println("Enter item number");
      String itemNo=scanner.nextLine();
      scanner.nextLine();
      groceryList.remove(itemNo);
	}

	public static void search(){
        System.out.println("Enter no");
        String searchItem=scanner.nextLine();
        if(groceryList.onFile(searchItem)){
        	System.out.println("found"+searchItem);
		}else{
        	System.out.println("not found");
		}
	}

    public static int[] getIntegers(int number){
		System.out.println("Enter " + number +" values\r");
		int[] values=new int[number];
		for(int i=0;i<values.length;i++){
			values[i]=scanner.nextInt();
		}
		return values;
	}

	public static double getAverage(int[] array){
		int sum=0;
		for(int i=0;i<array.length;i++)
		sum+=array[i];
		return (double) sum /(double)(array.length);
	}

	public  static  void processArrayList(){



	    ArrayList<String> newArray=new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());
        ArrayList<String > nextArray=new ArrayList<String>(groceryList.getGroceryList());
        String[] myArray=new String[groceryList.getGroceryList().size()];
        myArray=groceryList.getGroceryList().toArray(myArray);

    }

}


//	private static Scanner scanner=new Scanner(System.in);
//	public static void main(String[] args) {
//	int[] a;
//	a=new int[10];
//	a[5]=20;
//	int[] c={1,2,3};
//	double[] b=new double[10];
//	int[] myIntegers=getIntegers(5);
//	for(int i=0;i<myIntegers.length;i++){
//		System.out.println(myIntegers[i]);
//	}
//	int[] arrays= Arrays.copyOf(myIntegers,myIntegers.length);
//	System.out.println(getAverage(arrays));
//	int[] x=new int[5];
//	int[] y=x;
//	x[0]=1;
//	System.out.println(Arrays.toString(y));
