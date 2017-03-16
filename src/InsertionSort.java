import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class InsertionSort {

	public static void main(String[] args) {
		int temp, j;
		List<Integer> unsortedArray = new ArrayList<Integer>();
		unsortedArray.addAll(Arrays.asList(2,3,4,5,1));
		int size = unsortedArray.size();
		if(size == 1){
			System.out.println("Sorted array" + unsortedArray.get(0));
		}
		else{
			System.out.print("Unsorted array: ");
			for(int k: unsortedArray){
				System.out.print(k);
			}
			System.out.println("\n");
			for(int i=1;i<size;i++){
				if(unsortedArray.get(i) < unsortedArray.get(i-1)){
					temp = unsortedArray.get(i);
					unsortedArray.set(i, unsortedArray.get(i-1));
					unsortedArray.set(i-1, temp);
					j = i-1;			
					while((j>0) && (unsortedArray.get(j-1) > unsortedArray.get(j))){
						temp = unsortedArray.get(j);
						unsortedArray.set(j, unsortedArray.get(j-1));
						unsortedArray.set(j-1, temp);
						j--;
					}
				}
			}
			System.out.print("Sorted array: ");
			for(int k: unsortedArray){
				System.out.print(k);
			}
		}
	}

}
