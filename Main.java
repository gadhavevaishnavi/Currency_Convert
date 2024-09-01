// Main.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The main application class with the GUI.
 */
public class Main {
    private JFrame frame;
    private JTextField fromCurrencyField;
    private JTextField toCurrencyField;
    private JTextField amountField;
    private JButton convertButton;
    private JLabel resultLabel;

    /**
     * Constructs a new Main object.
     */
    public Main() {
        createGUI();
    }

    /**
     * Creates the GUI components.
     */
    private void createGUI() {
        frame = new JFrame("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        fromCurrencyField = new JTextField(5);
        toCurrencyField = new JTextField(5);
        amountField = new JTextField(10);
        convertButton = new JButton("Convert");
        resultLabel = new JLabel("Result: ");

        frame.add(new JLabel("From Currency:"));
        frame.add(fromCurrencyField);
        frame.add(new JLabel("To Currency:"));
        frame.add(toCurrencyField);
        frame.add(new JLabel("Amount:"));
        frame.add(amountField);
        frame.add(convertButton);
        frame.add(resultLabel);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fromCurrency = fromCurrencyField.getText();
                String toCurrency = toCurrencyField.getText();
                double amount = Double.parseDouble(amountField.getText());
                CurrencyConverter converter = new CurrencyConverter();
                double result = converter.convert(fromCurrency, toCurrency, amount);
                resultLabel.setText("Result: " + result);
            }
        });

        frame.pack();
        frame.setVisible(true);
    }

    /**
     * The main entry point.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }
}