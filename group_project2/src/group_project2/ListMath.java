package group_project2;

public class ListMath<E extends Number> {
	
	private ListMathInterface<E> dataList;//any ADT that implements the ListMathInterface<E>
	
	//default constructor
	public ListMath() {
		this.dataList=null;
	}
	
	//augmented constructor
	public ListMath(ListMathInterface<E> numberList) {
		this.dataList = numberList;
	}
	
	//get sum of integers
	public Integer getSumInteger() {
		Integer returnSum=0;
		for(int i=0;i<this.dataList.size();i++) 
			returnSum = returnSum + (Integer)this.dataList.get(i);
		
		return returnSum;
	}
	
	//get average of integers
	public Integer getAvgInteger() {
		Integer returnAvg=0;
		for(int i=0;i<this.dataList.size();i++) 
			returnAvg = returnAvg + (Integer)this.dataList.get(i);
		
		returnAvg = (Integer) (returnAvg/this.dataList.numItems());
		
		return returnAvg;
	}
	
	//get sum of floats
	public Float getSumFloat() {
		float returnSum=(float) 0.0;
		for(int i=0;i<this.dataList.size();i++) 
			returnSum = returnSum + (float) this.dataList.get(i);
		
		return returnSum;
		
	}
	//get average of flaots
	public Float getAvgFloat() {
		float returnAvg=(float) 0.0;
		for(int i=0;i<this.dataList.size();i++) 
			returnAvg = returnAvg + (float) this.dataList.get(i);
		
		returnAvg = (returnAvg/(float)this.dataList.numItems());
		
		return returnAvg;
		
	}
	//get sum of bytes
	public Byte getSumByte() {
		byte returnSum= 0;
		for(int i=0;i<this.dataList.size();i++) 
			returnSum = (byte) (returnSum + (byte) this.dataList.get(i));
		
		return returnSum;
	}
	//get average of bytes
	public Byte getAvgByte() {
		byte returnAvg=(byte) 0.0;
		for(int i=0;i<this.dataList.size();i++) 
			returnAvg = (byte) ( returnAvg + (byte) this.dataList.get(i));
		
		returnAvg = (byte) (returnAvg/(byte)this.dataList.numItems());
		
		return returnAvg;
		
	}

}
