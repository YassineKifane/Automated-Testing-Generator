import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class CreateAccountTestingClass extends JFrame{

    // ---- Variables declaration ----
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JButton button1;
    private JButton button2;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    // ---- End of variables declaration ----

    // ---- Constructor Initialization ----
    public CreateAccountTestingClass(){
        this.setSize(800,350);
        this.setVisible(true);
        this.setResizable(false);
        initComponents();
    }

    // ---- Component initialization ----
    private void initComponents() {

        dialogPane = new JPanel();
        contentPanel = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();

        //======== this ========
        setTitle("Crée Compte");
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(null);
            dialogPane.setAlignmentX(-0.0F);
            dialogPane.setAlignmentY(0.0F);

            dialogPane.setLayout(new BorderLayout());
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    dispose();
                }
            });
            //======== contentPanel ========
            {
                contentPanel.setBackground(Color.white);
                contentPanel.setForeground(Color.black);
                contentPanel.setLayout(null);

                //---- Titre ESTO ----
                label1.setIcon(new ImageIcon(getClass().getResource("Images/title.png")));
                contentPanel.add(label1);
                label1.setBounds(new Rectangle(new Point(243, 85), label1.getPreferredSize()));

                //---- LOGO UMP ----
                label2.setIcon(new ImageIcon(getClass().getResource("Images/logo.png")));
                contentPanel.add(label2);
                label2.setBounds(325, 10, 65, 70);

                //---- Adresse Mail existante ----
                button1.setText("Adresse Mail existante");
                button1.setBackground(new Color(204, 204, 204));
                button1.setForeground(Color.black);
                contentPanel.add(button1);
                button1.setBounds(222, 190, 275, 40);
                button1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dispose();
                        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tchic\\Downloads\\chromedriver.exe");
                        WebDriver driver = new ChromeDriver();
                        driver.get("http://automationpractice.com/");
                        driver.manage().window().maximize();
                        driver.findElement(By.className("login")).click();
                        String at= driver.getTitle();
                        String et= "Login - My Store";
                        if(at.equalsIgnoreCase(et)){
                            System.out.println("Test succesful");
                        }
                        else {
                            System.out.println("Test failed");
                        }
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException interruptedException) {
                            interruptedException.printStackTrace();
                        }
                        driver.findElement(By.id("email_create")).sendKeys("test2025@gmail.com");
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException interruptedException) {
                            interruptedException.printStackTrace();
                        }
                        driver.findElement(By.id("SubmitCreate")).click();
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException interruptedException) {
                            interruptedException.printStackTrace();
                        }
                        at=driver.findElement(By.xpath("//*[@id=\"create_account_error\"]/ol/li")).getText();
                        et="An account using this email address has already been registered. Please enter a valid password or request a new one.";
                        if(at.equalsIgnoreCase(et)){
                            new TestingSuccessAlert();
                        }
                        else {
                            new TestingFailedAlert();
                        }
                        driver.close();
                    }
                });

                //---- Nouvelle adresse mail ----
                button2.setBackground(new Color(204, 204, 204));
                button2.setForeground(Color.black);
                button2.setText("Nouvelle adresse mail");
                contentPanel.add(button2);
                button2.setBounds(222, 255, 275, 45);

                button2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new SignUpFormTestingClass();
                        dispose();
                    }
                });

                //---- Copyright ----
                label3.setText("Copyright \u00a9 2021 All rights reserved. ");
                label3.setForeground(Color.black);
                contentPanel.add(label3);
                label3.setBounds(new Rectangle(new Point(252, 370), label3.getPreferredSize()));

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < contentPanel.getComponentCount(); i++) {
                        Rectangle bounds = contentPanel.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = contentPanel.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    contentPanel.setMinimumSize(preferredSize);
                    contentPanel.setPreferredSize(preferredSize);
                }
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(735, 435);
        setLocationRelativeTo(getOwner());
        // ---- End of component initialization ----
    }

}
