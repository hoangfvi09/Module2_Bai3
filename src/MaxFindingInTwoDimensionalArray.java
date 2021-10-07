public class MaxFindingInTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array={{1,2,3},{4,5,6},{7,8,9}};
        int[] resultArray=findMax(array,3,3);
        System.out.println("Max is: "+resultArray[0]+".At position: "+resultArray[1]+"-"+resultArray[2]);
    }
    public static int[] findMax(int[][]array,int col,int row){
        int max=array[0][0];
        int maxRowIndex=0;
        int maxColIndex=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(array[i][j]>max){
                    max=array[i][j];
                    maxColIndex=j;
                    maxRowIndex=i;
                }
            }
        }
        int[] result={max,maxRowIndex,maxColIndex};
        return result;
    }
}
