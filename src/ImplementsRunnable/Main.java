package ImplementsRunnable;

public class Main {
    
    public static void main(String[] args) {
        
        ImplementsRunnable thread1 = new ImplementsRunnable("Primeiro thread");
        Thread i_thread1 = new Thread(thread1);
        i_thread1.start();
        
        ImplementsRunnable thread2 = new ImplementsRunnable("Segundo thread");
        Thread i_thread2 = new Thread(thread2);
        i_thread2.start();
        
        
    }
}
