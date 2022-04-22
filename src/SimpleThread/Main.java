package SimpleThread;

public class Main {
    
    public static void main(String[] args) {
        
        try{
            System.out.println("Ola mundo");
            Thread.sleep(5000);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
