import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ETransferPage extends JFrame implements ActionListener
{
    static final int WIDTH = 1920;
    static final int LENGTH = 1080;

    HomePage home;
    CA customer;
    public ETransferPage(HomePage home, CA customer)
    {
        this.setTitle("Account Home");
        this.setLayout(null);
        this.home = home;
        this.customer = customer;

        Font labels = new Font("Raleway", Font.BOLD, 25);
        Border emptyBorder = BorderFactory.createEmptyBorder();
        Border topBorder = BorderFactory.createMatteBorder(1,0,0,0,Color.GRAY);
        Color bg = new Color(214, 215, 215);
        Color buttonColor = Color.BLACK;

        this.getContentPane().setBackground(bg);
        this.setSize(WIDTH, LENGTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void paint(Graphics g)
    {
        super.paint(g);

        Graphics2D g2 = (Graphics2D) g;
        Color myRed = new Color(230, 30, 30);
        Color myBlack = new Color(160, 32, 32);
        GradientPaint redToBlack = new GradientPaint(0, 0, myRed, 0, 150, myBlack);
        g2.setPaint(redToBlack);
        g2.fillRect(0, 0, WIDTH+1, 150);

        Font regFont = new Font("Raleway", Font.BOLD, 60);
        g2.setFont(regFont);
        g2.setColor(new Color(250, 185, 60));
        g2.drawString("E-Transfer to contact", 25, 110);
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {

    }
}