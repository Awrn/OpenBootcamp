package swingTax;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class swingTax {
    private JTextField pricePane;
    private JTextField taxPane;
    private JTextField totalPane;
    private JButton calculate_b;
    private JPanel swingPanel;


    public static void main(String[] args) {

        JFrame frame = new JFrame("Swing Tax");
        frame.setContentPane(new swingTax().swingPanel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public ActionListener botonPulsado() {

        return null;
    }

    public swingTax() {

        calculate_b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                double p = Double.parseDouble(pricePane.getText());
                double t = Double.parseDouble(taxPane.getText());

                double result = p + (p/100 * t);
                totalPane.setText(Double.toString(result));

            }


        });


        pricePane.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                String valorPrecio= pricePane.getText() ;
                pricePane.setText(valorPrecio);
            }
        });


    }
}
