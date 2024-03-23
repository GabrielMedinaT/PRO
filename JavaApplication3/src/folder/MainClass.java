package folder;

import javax.swing.JFrame;

public class MainClass {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mi Aplicación");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        NewJPanel panel = new NewJPanel();
        
      
        frame.getContentPane().add(panel);
        

        frame.pack();
        frame.setVisible(true);
    }
}

