package group_project2;

public class HelperLinkedList {

	public static void demo2() {
		
		//create an array of ints
		
		Integer[] dataList= new Integer[10];
		
		for(int i=0;i<10;i++)
			dataList[i]=i;
		
		//test constructor for ArrayList
		
		LinkedList<Integer> tester1 = new LinkedList<Integer>(dataList);
		
		//print the list of numbers
		for(int i=0;i<tester1.size();i++)
			System.out.println(tester1.get(i));
	}
}
