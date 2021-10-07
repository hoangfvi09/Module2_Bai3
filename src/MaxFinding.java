import java.util.Scanner;

public class MaxFinding {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter array size: ");
            size = scanner.nextInt();
            if (size <= 0 || size > 20) {
                System.out.println("Size is not greater than 20 or less than 1");
            }
        } while (size <= 0 || size > 20);
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element "+i+" : ");
            array[i]=scanner.nextInt();
        }
        int max=array[0];
        int maxIndex=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max=array[i];
                maxIndex=i;
            }
        }
        System.out.println("Max is: "+max+" at position "+maxIndex);
    }
}
