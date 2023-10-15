import java.util.Scanner;

public class RotateArray{

public static void rotate(int arr[],int k)// Rotate Function
{
    int n=arr.length;
    k=k%arr.length;
    if(k<0){
    k=k+arr.length;
    }
    int[] temp = new int[n];
     // Copy elements to the temp array with the right shift
     for (int i = 0; i < n; i++) {
        temp[(i + k) % n] = arr[i];
    }
    // Copy elements back to the original array
    for (int i = 0; i < n; i++) {
        arr[i] = temp[i];
    }
}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter length of the array:");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter the elements in the array before rotation:");
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
System.out.println();
System.out.println("Enter number of rotations:");
int k=sc.nextInt();
rotate(arr,k);
System.out.println("The array elements after the rotation:");
for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
}
System.out.println();
}
}