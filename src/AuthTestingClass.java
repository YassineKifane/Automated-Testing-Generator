import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AuthTestingClass extends JFrame {

    // ---- Variables declaration ----
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel label2;
    private JLabel label3;
    private JLabel label5;
    private JButton button2;
    private JLabel label7;
    private JLabel label8;
    private JButton button6;
    private JButton button3;
    private JButton button5;
    // ---- End of variables declaration -----

    // ---- constructor initialization ----
    public AuthTestingClass() {
        this.setSize(800,350);
        this.setVisible(true);
        this.setResizable(false);
        initComponents();
    }

    // ----- Component initialization ----
    private void initComponents() {

        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label2 = new JLabel();
        label3 = new JLabel();
        label5 = new JLabel();
        button2 = new JButton();
        label7 = new JLabel();
        label8 = new JLabel();
        button6 = new JButton();
        button3 = new JButton();
        button5 = new JButton();

        //======== this ========
        setTitle("Authentification");
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(null);
            dialogPane.setAlignmentX(-0.0F);
            dialogPane.setAlignmentY(0.0F);

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

                //---- Tests de connexion ----
                label7.setText("Tests de connexion");
                label7.setFont(label7.getFont().deriveFont(label7.getFont().getSize() + 2f));
                label7.setForeground(Color.black);
                contentPanel.add(label7);
                label7.setBounds(new Rectangle(new Point(105, 175), label7.getPreferredSize()));

                //---- Autre Tests ----
                label8.setText("Autre tests");
                label8.setFont(label8.getFont().deriveFont(label8.getFont().getSize() + 2f));
                label8.setForeground(Color.black);
                contentPanel.add(label8);
                label8.setBounds(new Rectangle(new Point(395, 175), label8.getPreferredSize()));

                //---- Champs Remplis ----
                button2.setBackground(new Color(204, 204, 204));
                button2.setForeground(Color.black);
                button2.setText("Champs Remplis");
                contentPanel.add(button2);
                button2.setBounds(105, 205, 210, 40);
                button2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dispose();
                        new FilledFieldsTestingClass();
                    }
                });

                //---- Champs Vides ----
                button6.setText("Champs Vides");
                button6.setBackground(new Color(204, 204, 204));
                button6.setForeground(Color.black);
                contentPanel.add(button6);
                button6.setBounds(105, 260, 210, 40);
                button6.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dispose();
                        new EmptyFieldsTestingClass();
                    }
                });

                //---- Mot de passe oublié ----
                button3.setText("Mot de passe oubli\u00e9");
                button3.setBackground(new Color(204, 204, 204));
                button3.setForeground(Color.black);
                contentPanel.add(button3);
                button3.setBounds(395, 205, 210, 40);
                button3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dispose();
                        new ForgottenPasswordTestingClass();
                    }
                });

                //---- Cree Compte ----
                button5.setText("Cr\u00e9e compte");
                button5.setBackground(new Color(204, 204, 204));
                button5.setForeground(Color.black);
                contentPanel.add(button5);
                button5.setBounds(395, 260, 210, 40);
                button5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dispose();
                        new CreateAccountTestingClass();
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