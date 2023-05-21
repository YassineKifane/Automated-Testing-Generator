import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class SearchTestingClass extends JFrame {

    // ---- Variables declaration ----
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JComboBox<String> comboBox1;
    private JButton button1;
    private JLabel label5;
    // ---- End of variables declaration ----

    // ---- Constructor initialization
    public SearchTestingClass() {
        this.setTitle("Recherche");
        this.setSize(800,350);
        this.setVisible(true);
        this.setResizable(false);
        initComponents();
    }

    // ---- Component initialization -----
    private void initComponents() {
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        comboBox1 = new JComboBox<>();
        button1 = new JButton();
        label5 = new JLabel();

        //======== this ========
        setTitle("Recherche");
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
                label2.setBounds(325, 10, 65, 70);

                //---- Titre ESTO ----
                label5.setIcon(new ImageIcon(getClass().getResource("Images/title.png")));
                contentPanel.add(label5);
                label5.setBounds(243, 80, 225, 60);

                //---- Catégorie à rechercher ----
                label4.setText("Cat\u00e9gorie \u00e0 rechercher :");
                label4.setForeground(Color.black);
                label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 4f));
                contentPanel.add(label4);
                label4.setBounds(new Rectangle(new Point(265, 180), label4.getPreferredSize()));

                //---- Liste Deroulante ----
                comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                        "Casual Dresses",
                        "Evening Dresses",
                        "Summer Dresses",
                        "T-shirts",
                        "Blouses"
                }));
                comboBox1.setForeground(Color.black);
                comboBox1.setBackground(new Color(204, 204, 204));
                comboBox1.setFont(comboBox1.getFont().deriveFont(comboBox1.getFont().getStyle() & ~Font.BOLD, comboBox1.getFont().getSize() + 2f));
                comboBox1.setMaximumRowCount(5);
                contentPanel.add(comboBox1);
                comboBox1.setBounds(222, 220, 270, 40);

                //---- Valider ----
                button1.setText("Valider");
                button1.setBackground(new Color(204, 204, 204));
                button1.setForeground(Color.black);
                contentPanel.add(button1);
                button1.setBounds(302, 285, 100, 30);
                button1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String a = (String) comboBox1.getSelectedItem();
                        dispose();
                        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tchic\\Downloads\\chromedriver.exe");
                        WebDriver driver = new ChromeDriver();
                        driver.get("http://automationpractice.com/");
                        driver.manage().window().maximize();
                        String at= driver.getTitle();
                        String et= "My Store";
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

                        driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys(a);
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException interruptedException) {
                            interruptedException.printStackTrace();
                        }

                        driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();

                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException interruptedException) {
                            interruptedException.printStackTrace();
                        }
                        at=driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span[1]")).getText();
                        et="\""+ ((String) comboBox1.getSelectedItem()).toUpperCase()+"\"";

                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException interruptedException) {
                            interruptedException.printStackTrace();
                        }

                        if(at.equalsIgnoreCase(et)){
                            new TestingSuccessAlert();
                        }
                        else {
                            new TestingFailedAlert();
                        }

                        driver.close();
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

