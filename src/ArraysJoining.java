public class ArraysJoining {
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5};
        int[] array2={6,7,8,9,10};
        int[] newArray=joinArrays(array1,array2);
        System.out.println("New array after being joined:");
        for(int i=0;i<newArray.length;i++){
            System.out.println(newArray[i]+"\t");
        }

    }
    public static int[] joinArrays(int[] arr1,int[] arr2){
        int[] newArray=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            newArray[i]=arr1[i];
            newArray[arr1.length+i]=arr2[i];
        }
        return newArray;
    }
}
