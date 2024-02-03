public class FindOdd {
	public static int findIt(int[] a) {
  	int check = 0;
	int sum =0;
	for(int i =0; i<a.length;i++){
		for(int j =0; j<a.length;j++){
			if (a[i] == a[j]){
				sum++;
			}
		}
		if(sum%2!=0 && sum!=check){
			check = a[i];
		}
		sum =0;
	}
	return check;
  }
  public static void main(String[] args) {
	int[] arr ={20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
	System.out.println(findIt(arr));
	
  }
}