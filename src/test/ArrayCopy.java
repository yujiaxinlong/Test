package test;

public class ArrayCopy {
	public static void main(String args[]){
		//test2d
		int[][] intArray = {{1,2},{3,7,6},{8,2}};
		int[][] inArrayBak= new int[3][];
		System.arraycopy(intArray,0,inArrayBak,0,intArray.length);
		System.out.println("**************2d*************** ");
		inArrayBak[2][1]=100;
		for(int i =0;i<intArray.length;i++)
				for(int j=0;j<intArray[0].length;j++)
					System.out.println(intArray[i][j]+" ");
		
		//test1d
		int[] intArray1d = {1,2,8,2};
		int[] inArrayBak1d= new int[4];
		System.arraycopy(intArray,0,inArrayBak,0,intArray.length);
		
		inArrayBak1d[1]=100;
		System.out.println("**************1d*************** ");
		for(int i =0;i<intArray1d.length;i++){
				//for(int j=0;j<intArray[0].length;j++)
					System.out.println(intArray1d[i]+" ");
		}
		
		//test obj
		testObj[] objArray = {new testObj(), new testObj()};
		testObj[] objArrayBak= new testObj[2];
		System.arraycopy(objArray,0,objArrayBak,0,objArray.length);
		objArrayBak[1].value = 10;
		System.out.println("**************obj*************** ");
		System.out.println(objArray[1].value);
	 }
}

class testObj{
	int value;
}