import java.util.Scanner;

public class ColumnSumCalculating {
    public static void main(String[] args) {
        int[][] array={{1,2,3},{4,5,6},{7,8,9}};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Column to calculate sum: ");
        int colNumber=scanner.nextInt();
        int sum=0;
        for (int i=0;i< array.length;i++){
            sum+=array[i][colNumber];
        }
        System.out.println("Sum of column "+colNumber+" is: "+sum);
    }
}
