package group_project2;

public class DemoFinal {
	
	public static void demoFinal() {
		
		//Integer testing
		
		Integer[] dataList= new Integer[10];
		
		for(int i=0;i<10;i++)
			dataList[i]=i;
		
		//test constructor for ArrayList
		
		//a linked list ADT
		LinkedList<Integer> linkedList1 = new LinkedList<Integer>(dataList);
		//and array ADT
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>(dataList);
		
		
		//2 Separate listMath classes instantiated with two different ADT's
		ListMath<Integer> link1 = new ListMath<Integer>(linkedList1);
		ListMath<Integer> array1 = new ListMath<Integer>(arrayList1);
		//Note: each uses a different ADT but are able to use all the methods present in the ListMath<E> Class
		
		
		//output the sum and average of the listMath classes link1 and array1
		//NOTE: these methods are only available to listMath class NOT the respective ADT's
		//this is because the listMath class references a collection variable : ListMathInterface<E>
		System.out.println(link1.getSumInteger());
		System.out.println(link1.getAvgInteger());
		System.out.println(array1.getSumInteger());
		System.out.println(array1.getAvgInteger());
		
		
		//Float Testing
		//same as above but now we can use floats instead of integers
		//we only have to code the seperate data types for the ListMath class
		//not each individual ADT (so instead of having 12 methods spread across 2 different ADT's you only have 6 under ListMath)
		//this helps stay organized and when debugging
		//if theres an issue with a method you dont have to hunt through each different ADT and method data type
		
		Float[] dataList2= new Float[10];
		
		
		
		for(int i=0;i<10;i++)
			dataList2[i]= (float) 1.45 + (float) i;
		
		LinkedList<Float> linkedList2 = new LinkedList<Float>(dataList2);
		
		ArrayList<Float> arrayList2 = new ArrayList<Float>(dataList2);
		
		
		ListMath<Float> link2 = new ListMath<Float>(linkedList2);
		
		ListMath<Float> array2 = new ListMath<Float>(arrayList2);
		
		System.out.println(link2.getSumFloat());
		System.out.println(link2.getAvgFloat());
		System.out.println(array2.getSumFloat());
		System.out.println(array2.getAvgFloat());
		
		//Byte Testing
		//same as above now we can use bytes
		Byte[] dataList3= new Byte[10];
		
		for(int i=5;i<15;i++)
			dataList3[i-5]= (byte) i;
		
		LinkedList<Byte> linkedList3 = new LinkedList<Byte>(dataList3);
		
		ArrayList<Byte> arrayList3 = new ArrayList<Byte>(dataList3);
		
		
		ListMath<Byte> link3 = new ListMath<Byte>(linkedList3);
		
		ListMath<Byte> array3 = new ListMath<Byte>(arrayList3);
		
		System.out.println(link3.getSumByte());
		System.out.println(link3.getAvgByte());
		System.out.println(array3.getSumByte());
		System.out.println(array3.getAvgByte());
		
		
	}

}
