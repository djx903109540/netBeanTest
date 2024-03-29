/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20240227;

/**
 *
 * @author 蓮
 */
public class Ch3_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] array = new int[3][];
        array[0] = new int[]{2, 5};
        array[1] = new int[3];
        array[2] = new int[]{7, 8, 9, 10};
        
        for(int i = 0; i < array.length; i++){
            for(int k = 0; k < array[i].length; k++){
                System.out.print(array[i][k] + " ");
            }
            System.out.println();
        }
    }
    
}
