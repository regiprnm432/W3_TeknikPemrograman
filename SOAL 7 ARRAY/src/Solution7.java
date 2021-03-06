/**
 * Program untuk merubah array satu dimensi menjadi array tiga dimensi
 * @author Regi Purnama
 * @version 1
 * @since 19/02/2022
 */

public class Solution7
{
    public static void main(String[] args)
    {
        //Array satu dimensi
        int[] fisrtArray = {2, 5, 3};      
        int[] secondArray = {9, 5, 3};    
        int[] thirdArray = {2, 4, 9};    
        int[] fourthArray = {10, 11, 12};    
        int[] fifthArray = {13, 14, 15};    
        int[] sixthArray = {16, 17, 18};    
        int[] seventhArray = {19, 20, 21};    
        int[] eighthArray = {22, 23, 24};    
        int[] ninthArray = {25, 26, 27};    
 
        //Array dua dimensi
        int[][] twoDimensionalArray1 = {fisrtArray, secondArray, thirdArray}; 
        int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
        int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};
 
        //Array tiga dimensi
        int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};
 
        //Looping untuk menampilkan elemen array tiga dimensi
        for (int i = 0; i < threeDimensionalArray.length; i++)
        {
            System.out.print("{");
            for (int j = 0; j < threeDimensionalArray[i].length; j++)
            {
                System.out.print("{");
                for (int k = 0; k < threeDimensionalArray[i][j].length; k++)
                {
                    System.out.print(threeDimensionalArray[i][j][k] +"\t");
                }
                System.out.print("} ");
            }
            System.out.print("}");
            System.out.println();
        }
    }
}