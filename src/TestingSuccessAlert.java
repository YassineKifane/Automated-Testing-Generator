import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class TestingSuccessAlert extends JFrame {

    // ---- Variables declaration ----
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JButton button4;
    private JButton button5;
    private JLabel label8;
    // ---- End of variables declaration ----

    // ---- Constructor initialization
    public TestingSuccessAlert() {
        this.setResizable(false);
        this.setVisible(true);
        initComponents();
    }

    // ---- Component initialization ----
    private void initComponents() {
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        button4 = new JButton();
        button5 = new JButton();
        label8 = new JLabel();

        //======== this ========
        setTitle("test réussi");
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

                //---- Message de succès ----
                label8.setFont(label8.getFont().deriveFont(label8.getFont().getSize() + 11f));
                label8.setForeground(Color.BLUE);
                label8.setText("Test effectué avec Succès");
                contentPanel.add(label8);
                label8.setBounds(55, 40, 335, 65);

                //---- Quitter ----
                button4.setText("Quitter");
                button4.setBackground(new Color(204, 204, 204));
                contentPanel.add(button4);
                button4.setBounds(215, 130, 170, 30);
                button4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        dispose();
                    }
                });
                //---- Revenir ----
                button5.setText("Revenir");
                button5.setBackground(new Color(204, 204, 204));
                contentPanel.add(button5);
                button5.setBounds(25, 130, 165, 30);
                button5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new HomeClass();
                        dispose();
                    }
                });

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
        setSize(445, 225);
        setLocationRelativeTo(getOwner());
        // ---- End of component initialization ----
    }

}
