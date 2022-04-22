package ImplementsRunnable;

public class ImplementsRunnable implements Runnable{

    private String text;
    
    public ImplementsRunnable(String text) {
        
        this.text = text;
    }
    
    @Override
    public void run() {
        
        try{
            
            for(int i = 0; i < 10; i++) {
                System.out.println(i + " - " + this.getText());
                Thread.sleep((long) (Math.random() * 1000));
            }
            System.out.println("Finalizando " + this.getText());
        }catch(Exception e) {
            
            e.printStackTrace();
        }
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
