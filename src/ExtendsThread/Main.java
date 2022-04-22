/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExtendsThread;

/**
 *
 * @author 20201PF.CC0220
 */
public class Main {
    
    public static void main(String[] args) {
        
        ExtendsThread thread1 = new ExtendsThread("Primeiro Thread");
        thread1.start();
        
        ExtendsThread thread2 = new ExtendsThread("Segundo Thread");
        thread2.start();
    }
}
