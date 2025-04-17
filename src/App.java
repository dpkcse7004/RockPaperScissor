import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                //instantiate a RockPaperScissorGUI obj
                RockPaperScissorGUI r = new RockPaperScissorGUI();

                //display the GUI
                r.setVisible(true);
            }
        });
    }
}