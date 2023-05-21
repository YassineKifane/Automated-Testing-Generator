import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import javax.swing.border.*;

public class SignUpFormTestingClass extends JFrame {

    // ---- Variables declaration ----
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel label2;
    private JLabel label3;
    private JLabel label5;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JLabel label14;
    private JLabel label15;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JPasswordField passwordField1;
    private JButton button4;
    // ---- End of variables declaration ----

    // --- Constructor initialization ----
    public SignUpFormTestingClass() {
        this.setResizable(false);
        this.setVisible(true);
        initComponents();
    }

    // ---- Component initialization ----
    private void initComponents() {

        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label2 = new JLabel();
        label3 = new JLabel();
        label5 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        label14 = new JLabel();
        label15 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        textField5 = new JTextField();
        textField6 = new JTextField();
        passwordField1 = new JPasswordField();
        button4 = new JButton();

        //======== this ========
        setTitle("Formulaire d'inscription");
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(null);
            dialogPane.setAlignmentX(-0.0F);
            dialogPane.setAlignmentY(0.0F);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    dispose();
                }
            });

            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setBackground(Color.white);
                contentPanel.setForeground(Color.black);
                contentPanel.setLayout(null);

                //---- Logo UMP ----
                label2.setIcon(new ImageIcon(getClass().getResource("Images/logo.png")));
                contentPanel.add(label2);
                label2.setBounds(237, 5, 65, 70);

                //---- Titre ESTO ----
                label5.setIcon(new ImageIcon(getClass().getResource("Images/title.png")));
                contentPanel.add(label5);
                label5.setBounds(162, 80, 225, 60);

                //---- Nom ----
                label8.setText("Nom");
                label8.setFont(label8.getFont().deriveFont(label8.getFont().getSize() + 2f));
                label8.setForeground(Color.black);
                contentPanel.add(label8);
                label8.setBounds(new Rectangle(new Point(110, 160), label8.getPreferredSize()));

                //---- Prénom ----
                label9.setText("Pr\u00e9nom");
                label9.setFont(label9.getFont().deriveFont(label9.getFont().getSize() + 2f));
                label9.setForeground(Color.black);
                contentPanel.add(label9);
                label9.setBounds(110, 200, 55, 16);

                //---- Mot de passe ----
                label10.setText("Mot de passe");
                label10.setFont(label10.getFont().deriveFont(label10.getFont().getSize() + 2f));
                label10.setForeground(Color.black);
                contentPanel.add(label10);
                label10.setBounds(110, 405, 110, 16);

                //---- Adresse ----
                label11.setText("Adresse");
                label11.setFont(label11.getFont().deriveFont(label11.getFont().getSize() + 2f));
                label11.setForeground(Color.black);
                contentPanel.add(label11);
                label11.setBounds(110, 240, 60, 20);

                //---- Ville ----
                label12.setText("Ville");
                label12.setFont(label12.getFont().deriveFont(label12.getFont().getSize() + 2f));
                label12.setForeground(Color.black);
                contentPanel.add(label12);
                label12.setBounds(110, 285, 50, 16);

                //---- Code postal ----
                label13.setText("Code postal");
                label13.setFont(label13.getFont().deriveFont(label13.getFont().getSize() + 2f));
                label13.setForeground(Color.black);
                contentPanel.add(label13);
                label13.setBounds(110, 325, 100, 16);

                //---- Telephone ----
                label14.setText("T\u00e9lephone");
                label14.setFont(label14.getFont().deriveFont(label14.getFont().getSize() + 2f));
                label14.setForeground(Color.black);
                contentPanel.add(label14);
                label14.setBounds(110, 365, 80, 16);

                //---- Alert Champ Vide ----

                label15.setForeground(Color.red);
                contentPanel.add(label15);
                label15.setBounds(233, 470, 220, 16);

                //---- Champ Nom ----
                textField1.setBorder(new LineBorder(Color.lightGray));
                textField1.setBackground(Color.white);
                textField1.setForeground(Color.black);
                contentPanel.add(textField1);
                textField1.setBounds(235, 160, 180, 25);

                //---- Champ Prénom ----
                textField2.setBorder(new LineBorder(Color.lightGray));
                textField2.setBackground(Color.white);
                textField2.setForeground(Color.black);
                contentPanel.add(textField2);
                textField2.setBounds(235, 200, 180, 26);

                //---- Champ Adresse ----
                textField3.setBorder(new LineBorder(Color.lightGray));
                textField3.setBackground(Color.white);
                textField3.setForeground(Color.black);
                contentPanel.add(textField3);
                textField3.setBounds(235, 240, 180, 26);

                //---- Champ Ville ----
                textField4.setBorder(new LineBorder(Color.lightGray));
                textField4.setBackground(Color.white);
                textField4.setForeground(Color.black);
                contentPanel.add(textField4);
                textField4.setBounds(235, 280, 180, 26);

                //---- Champ Code postal ----
                textField5.setBorder(new LineBorder(Color.lightGray));
                textField5.setBackground(Color.white);
                textField5.setForeground(Color.black);
                contentPanel.add(textField5);
                textField5.setBounds(235, 320, 180, 26);

                //---- Champ Telephone ----
                textField6.setBorder(new LineBorder(Color.lightGray));
                textField6.setBackground(Color.white);
                textField6.setForeground(Color.black);
                contentPanel.add(textField6);
                textField6.setBounds(235, 360, 180, 26);

                //---- Champ Mot de passe ----
                passwordField1.setBorder(new LineBorder(Color.lightGray));
                passwordField1.setBackground(Color.white);
                passwordField1.setForeground(Color.black);
                contentPanel.add(passwordField1);
                passwordField1.setBounds(235, 400, 180, 25);

                //---- Envoyer ----
                button4.setText("Envoyer");
                button4.setBackground(new Color(204, 204, 204));
                contentPanel.add(button4);
                button4.setBounds(235, 445, 180, 25);
                button4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String FName = textField1.getText();
                        String LName = textField2.getText();
                        String Pwd  = passwordField1.getText();
                        String Addr = textField3.getText();
                        String City = textField4.getText();
                        String PC = textField5.getText();
                        String MP = textField6.getText();
                        if(textField1.getText().trim().isEmpty() || textField2.getText().trim().isEmpty() || textField3.getText().trim().isEmpty() || textField4.getText().trim().isEmpty() || textField5.getText().trim().isEmpty() || textField6.getText().trim().isEmpty() || passwordField1.getText().trim().isEmpty()){
                            label15.setText("Veuillez remplir tout les champs");
                        }
                        else {

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
                                Thread.sleep(2000);
                            } catch (InterruptedException interruptedException) {
                                interruptedException.printStackTrace();
                            }
                            driver.findElement(By.id("email_create")).sendKeys("testas2@gmail.com");
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException interruptedException) {
                                interruptedException.printStackTrace();
                            }
                            driver.findElement(By.id("SubmitCreate")).click();
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException interruptedException) {
                                interruptedException.printStackTrace();
                            }
                            try {
                                driver.findElement(By.id("customer_firstname")).sendKeys(FName);
                            }catch(org.openqa.selenium.NoSuchElementException e1){
                                new TestingFailedAlert();
                                driver.close();
                            }
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException interruptedException) {
                                interruptedException.printStackTrace();
                            }
                            driver.findElement(By.id("customer_lastname")).sendKeys(LName);
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException interruptedException) {
                                interruptedException.printStackTrace();
                            }
                            driver.findElement(By.id("passwd")).sendKeys(Pwd);
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException interruptedException) {
                                interruptedException.printStackTrace();
                            }
                            driver.findElement(By.id("address1")).sendKeys(Addr);
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException interruptedException) {
                                interruptedException.printStackTrace();
                            }
                            driver.findElement(By.id("city")).sendKeys(City);
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException interruptedException) {
                                interruptedException.printStackTrace();
                            }

                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException interruptedException) {
                                interruptedException.printStackTrace();
                            }
                            Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"id_state\"]")));
                            dropdown.selectByValue(String.valueOf(6));

                            driver.findElement(By.id("postcode")).sendKeys(PC);
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException interruptedException) {
                                interruptedException.printStackTrace();
                            }
                            driver.findElement(By.id("phone_mobile")).sendKeys(MP);
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException interruptedException) {
                                interruptedException.printStackTrace();
                            }
                            driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
                            try {
                                Thread.sleep(3500);
                            } catch (InterruptedException interruptedException) {
                                interruptedException.printStackTrace();
                            }

                            at = driver.getTitle();
                            et = "My account - My Store";
                            if (at.equalsIgnoreCase(et)) {
                                new TestingSuccessAlert();
                            } else {
                                new TestingFailedAlert();
                            }
                            driver.close();
                        }
                    }
                });

                //---- Copyright ----
                label3.setText("Copyright \u00a9 2021 All rights reserved. ");
                label3.setForeground(Color.black);
                contentPanel.add(label3);
                label3.setBounds(new Rectangle(new Point(165, 515), label3.getPreferredSize()));

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
        setSize(560, 575);
        setLocationRelativeTo(getOwner());
        // ---- End of component initialization ----
    }

}
