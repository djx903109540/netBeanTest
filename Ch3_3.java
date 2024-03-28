/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20240227;

/**
 *
 * @author 蓮
 */
public class Ch3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] array = new int[3][2];
        array[1][0] = 79;
        array[1][1] = 87;
        array[2][0] = 72;
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++) {
                System.out.print(array[r][c] + " ");
            }
            System.out.println();
        }
        
        System.out.println("==========");
        //forEach
        for(int[] k : array){
            for(int v : k){
                System.out.print(v + " ");
            }
            System.out.println();
        }
        
    }
    
}
