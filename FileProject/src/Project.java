
import java.io.*;
import java.util.TreeSet;
import java.util.Scanner;
public class Project {
	
	


	public static void userOperations() {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Choose an option:");
			System.out.println("1. Add a File");
			System.out.println("2. Delete File");
			System.out.println("3. Search File");
			System.out.println("4. Navigate to main menu.");
			
			int option=sc.nextInt();
			
			switch(option) {
			case 1:AddFile();
				   break;
			
			case 2:DeleteFile();
			       break;
			
			case 3:searchFile();
			       break;
			       
			case 4:
				   mainMenu();
				   break;
		       
			default:
		           System.out.println("ERROR: Invalid Selection");
		           break;
			
			
			}
			sc.close();
		
		
		
	}
	
	public static void getFileName() {
		 
		TreeSet<String> results = new TreeSet<String>();


		File[] files = new File("C:\\Users\\dhath\\OneDrive\\Desktop\\SimpliLearn").listFiles();
		//If this pathname does not denote a directory, then listFiles() returns null. 

		for (File file : files) {
		    if (file.isFile()) {
		        results.add(file.getName());
		    }
		}
		if(results.size()==0) {
			System.out.println("No Files in Current Directory");
		}else {
			for(String s:results) {
				System.out.println(s);
			}
		}
		
		
	}
	
	public static void AddFile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter File to add:");
		String name=sc.next();
		File newFile=new File("C:\\Users\\dhath\\OneDrive\\Desktop\\SimpliLearn"+"\\"+name);
		try {
			if(newFile.createNewFile()){
				System.out.println("File created successfully");
				System.out.println("File created at "+newFile.getCanonicalPath());
			}else {
				System.out.println("File already exist at location: "+newFile.getCanonicalPath());  
			}
		}
		catch (IOException e)   
		{  
		e.printStackTrace();     
		}       
		sc.close();
		
	}
	
	public static void DeleteFile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter File to delete:");
		String name=sc.next();
		File file=new File("C:\\Users\\dhath\\OneDrive\\Desktop\\SimpliLearn"+"\\"+name);
			
			if(file.delete()) {
				System.out.println(file.getName() + " deleted");
			}else {
				System.out.println("File not found");
			}
			
			    
		sc.close();
		
	}	     
		
		
		
	
	
	public static void searchFile() {
		
		 
		 Scanner sc=new Scanner(System.in);
		 String name1=sc.next();
		 
		 File file = new File("C:\\Users\\dhath\\OneDrive\\Desktop\\SimpliLearn"+"\\"+name1);
		 
		 if(file.exists()) {
			 System.out.println("File exists in the directory");
		 }else {
			 System.out.println("File does not exist in the directory");
		 }
	      sc.close();
	}
	
	
	public static void mainMenu() {
		
		System.out.println("*****************************************************");
		System.out.println("*******************LockedMe.com**********************");
		System.out.println("*****************************************************");
		
		
		
		
		System.out.println("Choose an option:");
		System.out.println("1. Get File Names");
		System.out.println("2. Add, Delete or Search File");
		System.out.println("3. Close Application");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		
		switch(option) {
			case 1:getFileName();
				   break;
			
			case 2:userOperations();
			       break;
			
			case 3:System.exit(0);;
			       break;
			default:
		           System.out.println("ERROR: Invalid Selection");
		           break;
		}
		sc.close();
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		mainMenu();
		sc.close();
		
	}

}
