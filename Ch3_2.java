/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20240227;

/**
 *
 * @author 蓮
 */
public class Ch3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array1 = {5, 10, 52};    //只能用在声明时
        int[] array2 = new int[]{90, 77, 88, 66};
        for(int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        array1 = new int[]{19, 27};
        for(int k : array1){
            System.out.print(k + " ");
        }
        System.out.println();
    }
    
}
