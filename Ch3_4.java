/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20240227;

/**
 *
 * @author 蓮
 */
public class Ch3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] array1 = new int[2][3];
        int[][] array4 = {{12,33,45},{6,7,8}};
        int[][] array5 = new int[][]{{1,2},{3,4},{5,6}};
        for(int i = 0; i < array4.length; i++){
            for(int j = 0; j < array4[i].length; j++){
                System.out.print(array4[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("==========");
        for(int[] a : array5){
            for(int b : a){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
    
}
