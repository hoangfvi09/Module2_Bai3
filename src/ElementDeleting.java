import java.util.Scanner;

public class ElementDeleting {
    public static void main(String[] args) {
        int[] array = {64, 2, 12, 98, 65, 5, 53, 4, 43};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter element to be deleted: ");
        int elementDel = scanner.nextInt();
        int indexDel = (checkExistence(elementDel, array));
        if (indexDel != -1) {
            int[] newArray = deleteElement(indexDel, array);

            System.out.println(elementDel+" is at position "+indexDel);
            System.out.println("New array: ");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + "\t");
            }
        } else {
            System.out.println("Element doesnt exist.");
        }
    }

    public static int checkExistence(int number,int[]array){
        int indexDel=-1;

        for(int i=0;i<array.length;i++){
            if(array[i]==number){
                indexDel=i;
            }
        }
        return indexDel;
    }
    public static int[] deleteElement(int indexDel,int[] array){
        for(int i=indexDel;i<array.length-2;i++){
            array[i]=array[i+1];
        }
        return array;
    }
}
