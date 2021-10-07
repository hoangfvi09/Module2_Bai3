import java.util.Scanner;

public class ElementAdding {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter element to be added: ");
        int elementAdd = scanner.nextInt();
        System.out.println("Position to be add new element: ");
        int positionAdd = scanner.nextInt();
        if (positionAdd>=0||positionAdd<=10) {
            int[] newArray = addElement(positionAdd, array,elementAdd);
            System.out.println("New array: ");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + "\t");
            }
        } else {
            System.out.println("Position is not less than 0 or greater than 10.");
        }
    }

    public static int[] addElement(int indexAdd,int[] array, int elementAdd){
        for(int i=1;i<array.length-indexAdd;i++){
            array[array.length-i]=array[array.length-i-1];
        }
        array[indexAdd]=elementAdd;
        return array;
    }
}
