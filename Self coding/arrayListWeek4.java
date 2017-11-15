import java.util.*;

public class arrayListWeek4 {

	public static void main(String[] args) {
		/*
		 * Developed by ValliT
		 * Program to complete ArrayList exercises. 
		 * 
		 */
		
		int inputArray[] = new int[] {1,2,3,4};
		//int inputArray[] = new int[] {8,16,10};
		//int inputArray[] = new int[] {5,0,22};
		//int inputArray[] = new int[] {5,0,-10};
		
		//1.  Count of even numbers in array
		int oSumEven = 0;
		oSumEven = sumEvenIndexes(inputArray);
		System.out.println("SumEvenIndexesB : " + oSumEven);

		
		//2.  Return the count of all the even numbers in the array list.
		int evenCountnumber = 0;
		evenCountnumber = evenCount(inputArray);
		System.out.println(" Count of even numbers : " + evenCountnumber);
		
		//3.Given a string, return an array list that contains
		//  each character of the string in backwards order.
		
		//String strArray[] = backwardChars("Career Center");
		//String strArray[] = backwardChars("football");
		String strArray[] = backwardChars("?");
		System.out.print("[ ");
		for (int i = 0; i < strArray.length; i++)
		{
			System.out.print("\" " + strArray[i] + "   ");
		}
		System.out.println(" ] ");
		
		//4. An array list contains a list of animals. If the animal is a cat
		//(i.e. the animal's descrition contains the word "cat" or "Cat"), then
		//add it to a new array list. Return the new array list of cats.
		//String inputstrArray[] = new String[] {"buffalo", "dog"};
		//String inputstrArray[] = new String[] {"bobcat", "siamese cat", "catbird"};
		String inputstrArray[] = new String[] {"cat", "frog", "mouse"};
		String OutputstrArray[] = catty(inputstrArray);
		System.out.print("[ ");
		for (int i = 0; i < OutputstrArray.length; i++)
		{
			System.out.print(OutputstrArray[i].toString() + "   ");
		}
		System.out.print(" ] ");

	} //end of main

	public static String[] catty(String[] animals) { 

	    ArrayList<String> animalsList = new ArrayList<String>();
	    for (int i=0; i<animals.length; i++)
	    {
	       animalsList.add(animals[i]);
	    }
	    
	    ArrayList<String> catsList = cattyB(animalsList);
	    
	    String cats[] = new String[catsList.size()];
	    for (int i=0; i<catsList.size(); i++)
	    {
	       cats[i]=catsList.get(i);
	    }

	    return cats;
	}

	public static ArrayList<String> cattyB(ArrayList<String> animalsList) 
	{    
		ArrayList<String> catList = new ArrayList<String>();
		CharSequence cat = "cat";
		for (int i = 0; i < animalsList.size(); i++) 
		{
			String s = animalsList.get(i);
			if (s.contains(cat))
			{
				catList.add(s);
				//System.out.print(s);
			}
		}
		//System.out.println(catList);
			return catList;
	}

	public static String[] backwardChars(String str) { 

	    ArrayList<String> charsList = backwardCharsB(str);
	    
	    String chars[] = new String[charsList.size()];
	    for (int i=0; i<charsList.size(); i++)
	    {
	       chars[i]=charsList.get(i);
	       //System.out.println(chars[i]);
	    }
	    //System.out.println(charsList);
	    return chars;
	}

	public static ArrayList<String> backwardCharsB(String str) 
	{    
		ArrayList<String> strList = new ArrayList<String>();
	    for (int i=str.length()-1; i>=0; i--) 
	    {
	    	//System.out.println(str.charAt(i));
	    	String med = Character.toString(str.charAt(i));
	    	strList.add(med);
	    }
	    
	    return strList;
	}

	public static int sumEvenIndexes(int[] nums) { 

	    ArrayList<Integer> numsList = new ArrayList<Integer>();
	    for (int i=0; i<nums.length; i++)
	    {
	       numsList.add(nums[i]);
	    }
	    
	    return sumEvenIndexesB(numsList);
	}

	public static int sumEvenIndexesB(ArrayList<Integer> numsList) 
	{     
		int sumEven = 0;
	    for (int i=0; i<numsList.size()  ; i+=2)
	    {
	      sumEven = sumEven + numsList.get(i);
	    } 
	    return sumEven;
	}
	
	
	public static int evenCount(int[] nums) { 

	    ArrayList<Integer> numsList = new ArrayList<Integer>();
	    for (int i=0; i<nums.length; i++)
	    {
	       numsList.add(nums[i]);
	    }
	    // return 0;
	    return evenCountB(numsList);
	}

	public static int evenCountB(ArrayList<Integer> numsList) 
	{     
		int countEvenNumbers = 0;
		for (int i = 0; i < numsList.size(); i++)	
		{
			int number = numsList.get(i);
			
			if ((number % 2) == 0)
			{
				countEvenNumbers++;
			}
		}
		return countEvenNumbers;
		
	}
	
	

}
