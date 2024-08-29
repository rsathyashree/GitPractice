package InterviewQuestions;

public class BubbleSort {
	public static void main(String[] args) {
	 int[] arr = {45,6,23,9,12,88};
     int temp=0;
     System.out.println(arr.length);
     for(int i=0; i<arr.length-1; i++)
     {
         if(arr[i] > arr[i+1])
         {
             temp = arr[i];
             arr[i] = arr[i+1];
             arr[i+1] = temp;
         }
         System.out.println(arr[i]);
     }
  }
}

