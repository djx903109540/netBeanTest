/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20240227;

import java.util.Arrays;
import java.util.List;
/**
 *
 * @author 蓮
 */
public class Ch3_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = new int[]{8, 7, 5, 16, 3};
        Arrays.sort(array);
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
        //小写 > 大写 > 数字
        String[] array1 = {"ab", "Zv", "az", "Ac", "1234567"};
        Arrays.sort(array1);
        for(String s : array1){
            System.out.print(s + " ");
        }
        System.out.println();
        
        int[] array2 = Arrays.copyOf(array, array.length);
        for(int s : array2){
            System.out.print(s + " ");
        }
        System.out.println();
        
        
    }
    
}
