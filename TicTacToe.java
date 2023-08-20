
/**
 * TicTacToe.java
 * @Sandeep
 * 
 * The program implements the game of tic-tac-toe.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JFrame
{
    private boolean xTurn = true;
    
    
    public TicTacToe()
    {
        setTitle("Tic-Tac-Toe");
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createContents();
        setVisible(true);
    }
    
    
    
    private void createContents()
    {
        JButton button;
        setLayout(new GridLayout(3,3));
        
        for (int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                button = new JButton();
                button.addActionListener(new Listener());
                add(button);
            }
        }
    }
    
    
    private class Listener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JButton btn = (JButton) e.getSource();
            if (btn.getText().isEmpty())
            {
                btn.setText(xTurn?"X":"O");
                xTurn = !xTurn;
            }
        }
    }
    
    public static void main(String args[])
    {
        new TicTacToe();
    }
}