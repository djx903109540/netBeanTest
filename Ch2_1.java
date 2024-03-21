/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ch2_20240222;

/**
 *
 * @author 蓮
 */
public class Ch2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //可傳參數類型: byte short int char String enum
        final int PLAY = 1, STOP = 2, EXIT = 3, OTHER = 4;
        int action = OTHER;
        switch(action){
            case PLAY: //必須是常數,名稱習慣全大寫,使用final修飾符
                System.out.println("Play");
                break;
            case STOP:
                System.out.println("Stop");
                break;
            case EXIT:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
    
}
