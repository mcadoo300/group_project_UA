package group_project2;

public class HelperArrayList {
	
	public static void arrayDemo() {
		
		//create an array of ints
		
		Integer[] dataList= new Integer[10];
		
		for(int i=0;i<10;i++)
			dataList[i]=i;
		
		//test constructor for ArrayList
		
		ArrayList<Integer> tester1 = new ArrayList<Integer>(dataList);
		
		//print the list of numbers in two different ways
		for(int i=0;i<tester1.size();i++)
			System.out.println(tester1.get(i));
		
		System.out.println(tester1.get(0));
		while(tester1.getCurrPos()<tester1.size()-1) {
			System.out.println(tester1.getNext());
		}
		
		
			
	}

}
