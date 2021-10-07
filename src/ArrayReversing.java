import java.util.Scanner;

public class ArrayReversing {
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
       int[] reversedArray=new int[size];
        for (int i = 0; i < size; i++) {
            reversedArray[i]=array[array.length-i-1];
        }
        System.out.println("Reversed Array: ");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i]+"\t");
        }

    }
}
