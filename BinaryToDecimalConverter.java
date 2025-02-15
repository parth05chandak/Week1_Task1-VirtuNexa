package task1;
import java.awt.*;
import java.awt.event.*;

public class BinaryToDecimalConverter extends Frame implements ActionListener
{
    private Label label;
    private TextField binaryInput;
    private Button convertButton;
    private TextField decimalOutput;

    public BinaryToDecimalConverter() 
    {
        setTitle("Binary to Decimal Converter");
        setSize(500, 200);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        setVisible(true);
    
        label = new Label("Enter binary number:");

        binaryInput = new TextField(20);
        
        convertButton = new Button("Convert");
        
        decimalOutput = new TextField(20);
        decimalOutput.setEditable(false); 
        
        add(label);
        add(binaryInput);
        add(convertButton);
        add(new Label("Decimal output:"));
        add(decimalOutput);
        
        convertButton.addActionListener(this);
        
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent ae) 
    {
        try 
        {
            String binaryStr = binaryInput.getText();
            int decimal = Integer.parseInt(binaryStr, 2);
            decimalOutput.setText(String.valueOf(decimal));
        } 
        catch (NumberFormatException e) 
        {
            decimalOutput.setText("Invalid binary input");
        }
    }

    public static void main(String[] args) 
    {
        new BinaryToDecimalConverter();  
    }
}
