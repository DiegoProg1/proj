import javax.swing.*;

public class tela extends JFrame {
    public tela(){
        setTitle("Tela Inicial");
        JOptionPane.showMessageDialog(this, "Resolvi Bugs");
        setVisible(true);
        setSize(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
