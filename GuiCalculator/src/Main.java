import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;


public class Main implements ActionListener, KeyListener {

    JFrame frame;
    JPanel panel;
    JTextField textfield;
    JLabel label = new JLabel();
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[10];
    JButton subButton, addButton, divButton, mulButton;
    JButton decButton, delButton, clrButton, equButton, negButton, sqrButton;
   
//    JPanel functionPanel;
//    Border border = BorderFactory.createLineBorder(Color.GREEN, 4);

    Font myfont = new Font("Harlow Solid Italic", Font.ITALIC, 25);
    double num1=0, num2=0, result=0;
    char operator;



Main (){
    frame = new JFrame("Calculator");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(320, 530);
    frame.setLayout(null);
    frame.getContentPane().setBackground(new Color(30,30,30));
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    frame.requestFocusInWindow();
   

    textfield = new JTextField("0");
    textfield.setBounds(0, 43, 300, 95);
    textfield.setFont(new Font("Harlow Solid Italic", Font.PLAIN,40));
    textfield.setHorizontalAlignment(SwingConstants.RIGHT);
    textfield.setBackground(new Color(30, 30, 30));
    textfield.setForeground(new Color(255,255,255));
    textfield.setEditable(false);
    textfield.setBorder(BorderFactory.createBevelBorder(3));
    
    label.setBounds(0,5,304,40);
//    textfield.setFont(myfont);
    textfield.setFont(new Font("Harlow Solid Italic", Font.PLAIN,40));
    label.setHorizontalAlignment(SwingConstants.RIGHT);
    label.setBackground(new Color(90,90,30));
    label.setBackground(new Color(30,30,30));
    label.setForeground(new Color(255,255,255));
    label.setBorder(BorderFactory.createBevelBorder(3));
    label.setOpaque(true);
    

    subButton = new JButton("–");
    addButton = new JButton("+");
    divButton = new JButton("÷");
    mulButton = new JButton("×");
    decButton = new JButton("•");
    delButton = new JButton("");
    clrButton = new JButton("C");
    equButton = new JButton("=");
    negButton = new JButton("±");
    sqrButton = new JButton("<html>x<sup>2</sup></html>");
//    sqrButton = new JButton("x\u00B2");
    
    

    functionButtons[0] = subButton;
    functionButtons[1] = addButton;
    functionButtons[2] = divButton;
    functionButtons[3] = mulButton;
    functionButtons[4] = decButton;
    functionButtons[5] = delButton;
    functionButtons[6] = clrButton;
    functionButtons[7] = equButton;
    functionButtons[8] = negButton;
    functionButtons[9] = sqrButton;
    


    for (int i=0; i<10; i++) {
        functionButtons[i].addActionListener(this);
        functionButtons[i].setFont(new Font("Cooper Black", Font.BOLD,25));

        functionButtons[i].setFocusable(false);
//        functionButtons[i].setBackground(new Color(245,164, 11));
        functionButtons[i].setBackground(new Color(60,60, 60));
        functionButtons[i].setForeground(new Color(255,255,255));
        functionButtons[i].setBorder(BorderFactory.createBevelBorder(3));
        
    }
    for ( int i=0; i<10; i++){
        numberButtons[i] = new JButton(String.valueOf(i));
        numberButtons[i].addActionListener(this);
        numberButtons[i].setFont(myfont);
        numberButtons[i].setFocusable(false);
        numberButtons[i].setBackground(new Color(60, 60, 60));
        numberButtons[i].setForeground(new Color(255,255,255));
        
//        numberButtons[i].setBorder(BorderFactory.createEtchedBorder());
        numberButtons[i].setBorder(BorderFactory.createBevelBorder(3));
     
//        numberButtons[i].setBorder(BorderFactory.createDashedBorder(null));
        
        
        
        
    }
//    delButton.setBounds(115, 96, 111, 68);
    delButton.setFont(new Font("Wingdings", Font.BOLD,20));
    delButton.setBackground(new Color(60, 60, 60));
    delButton.setForeground(new Color(245,164, 11));
    
    sqrButton.setFont(new Font("Forte", Font.PLAIN, 19));

////    
////    clrButton.setBounds(3, 96, 110, 68);
////    clrButton.setForeground(new Color(255,0,0));
    clrButton.setBackground(new Color(60, 60, 60));
    clrButton.setFont(new Font("Arial", Font.PLAIN, 20));
//    
    equButton.setBackground(new Color(245,164, 11));
    addButton.setBackground(new Color(245,164, 11));
    subButton.setBackground(new Color(245,164, 11));
    mulButton.setBackground(new Color(245,164, 11));
    divButton.setBackground(new Color(245,164, 11));
    
    
    
    
//    equButton.setForeground(new Color(0,0,0));
    
//    decButton.setBackground(new Color(60, 60, 60));
    decButton.setFont(new Font("Georgia", Font.BOLD,18));
    
//    negButton.setBackground(new Color(60, 60, 60));
    

    panel = new JPanel();
    panel.setBounds(3, 140, 298, 349);
    panel.setLayout(new GridLayout(5, 4, 2, 2));
    panel.setBackground(new Color(25, 25, 25));
    panel.setForeground(new Color(255, 255, 255));
   
    
    
    panel.add(functionButtons[9]);
    panel.add(functionButtons[6]);
    panel.add(functionButtons[5]);
    panel.add(functionButtons[2]);
    
    
    
    
    
    

    panel.add(numberButtons[7]);
    panel.add(numberButtons[8]);
    panel.add(numberButtons[9]);
    panel.add(functionButtons[3]);

    panel.add(numberButtons[4]);
    panel.add(numberButtons[5]);
    panel.add(numberButtons[6]);
    panel.add(functionButtons[0]);

    panel.add(numberButtons[1]);
    panel.add(numberButtons[2]);
    panel.add(numberButtons[3]);
    panel.add(functionButtons[1]);
    
    panel.add(negButton);
    panel.add(numberButtons[0]);
    panel.add(decButton);
    panel.add(functionButtons[7]);
    
    
    textfield.setFont(new Font("Calibri", Font.PLAIN,40));
    
    
//    functionPanel = new JPanel();
//    functionPanel.setBounds(228, 95, 73, 350);
//    functionPanel.setLayout(new GridLayout(5, 1, 2, 2));
//    functionPanel.setBackground(new Color(30, 30, 30));
//    functionPanel.setForeground(new Color(255, 255, 255));
//    
//    functionPanel.add(divButton);
//    functionPanel.add(mulButton);
//    functionPanel.add(subButton);
//    functionPanel.add(addButton);
//    functionPanel.add(equButton);
//    functionPanel.add(sqrButton);
    
    frame.add(panel);
    frame.add(label);
//    frame.add(functionPanel);
//    frame.add(delButton);
//    frame.add(clrButton);
    frame.add(textfield);
    frame.setVisible(true);
    frame.addKeyListener(this);



}
    public static void main(String[] args) {
        Main cal = new Main();
        
    }
    public void actionPerformed ( ActionEvent e) {
    	 String command = e.getActionCommand();
    	 char inputChar = command.charAt(0);

        for( int i=0; i<10; i++) {
            if (e.getSource() == numberButtons[i]){
//                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            	if (textfield.getText().equals("0")) {
                    textfield.setText(Character.toString(inputChar));
                } else {
                    textfield.setText(textfield.getText() + inputChar);
                }
          
            }
        }
        if (e.getSource() == decButton) {
        	String currentText = textfield.getText();
        	if (!currentText.contains(".")) {
        		
        		textfield.setText(currentText + ".");
        	}
        	
       
        } if( e.getSource()== addButton) {
        	String str = textfield.getText();
        	num1 = Double.parseDouble(textfield.getText());
        	operator = '+';
        	textfield.setText("");
        	label.setText(str + "+");
       
        } if( e.getSource()== subButton) {
        	num1 = Double.parseDouble(textfield.getText());
        	operator = '-';
        	textfield.setText("");
       
        } if( e.getSource()== mulButton) {
        	num1 = Double.parseDouble(textfield.getText());
        	operator = '*';
        	textfield.setText("");
       
        } if( e.getSource()== divButton) {
        	num1 = Double.parseDouble(textfield.getText());
        	operator = '/';
        	textfield.setText("");
       
        } if(e.getSource()== equButton) {
        	num2 = Double.parseDouble(textfield.getText());
        	
        	switch(operator) {
        	case'+':
        		result = num1+num2;
        		break;
        	case'-':
        		result = num1-num2;
        		break;
        	case'*':
        		result = num1*num2;
        		break;
        	case'/':
        		result = num1/num2;
        		break;
        	}      	      	
        		if (Double.toString(result).endsWith(".0")) {
        			textfield.setText(Double.toString(result).replace(".0",""));
        		} else {
        			textfield.setText(String.valueOf(result));
        		}
        	
        	label.setText("");
        	num1=result;       	       	        	
          	}
        
        
            if (e.getSource()== clrButton) {
            label.setText("");
            textfield.setText("0");
           
            }
            
            if (e.getSource()==delButton) {
           	String del = textfield.getText();
          	textfield.setText("");
          	
          	
          	if (!del.equals("0")) {
          	if (del.length()>1) {
          		for (int i =0; i<del.length()-1;i++) {
         			textfield.setText(textfield.getText()+del.charAt(i));
          		}
          	} else {
          		textfield.setText("0");
          	}
             
            	
          	}		
           }
             
            
            if (e.getSource()==negButton) {
                	   double temp = Double.parseDouble(textfield.getText());
                	   temp*= -1;
                	   textfield.setText(String.valueOf(temp));
                	  
            }   
                   
            
            
          

    }
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
//		switch(e.gete.getKeyChar()() ) {
//		case 'a':
//			textfield.setText("");
//		}
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
//		char e.getKeyChar() = e.gete.getKeyChar()();
		

	    if (Character.isDigit(e.getKeyChar()) ) {
	    	
	    	
//  	        textfield.setText(String.valueOf(e.getKeyChar()));
//	    		textfield.setText("");
	    	
	    	if (textfield.getText().equals("0")) {
	    		textfield.setText(Character.toString(e.getKeyChar()));
	    	} else
	    		
	    	textfield.setText(textfield.getText().concat(String.valueOf(e.getKeyChar())));
	    } 
	    
	    
	    
	    
	    
	    else if (e.getKeyChar() == '.') {
	    	
	    	if (!textfield.getText().contains(".")) {
	    		textfield.setText(textfield.getText().concat("."));
		    }
	    	}
	        
	    
	    else if (e.getKeyChar() == '+') {
	        num1 = Double.parseDouble(textfield.getText());
	        operator = '+';
	        textfield.setText("");
	        label.setText(num1 + "+");
	    } else if (e.getKeyChar() == '-') {
	        num1 = Double.parseDouble(textfield.getText());
	        operator = '-';
	        textfield.setText("");
	    } else if (e.getKeyChar() == '*') {
	        num1 = Double.parseDouble(textfield.getText());
	        operator = '*';
	        textfield.setText("");
	    } else if (e.getKeyChar() == '/') {
	        num1 = Double.parseDouble(textfield.getText());
	        operator = '/';
	        textfield.setText("");
	    } else if (e.getKeyChar() == '=' || e.getKeyChar() == KeyEvent.VK_ENTER ) {
	        num2 = Double.parseDouble(textfield.getText());

	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                break;
	            case '-':
	                result = num1 - num2;
	                break;
	            case '*':
	                result = num1 * num2;
	                break;
	            case '/':
	                result = num1 / num2;
	                break;
	        }

	        if (Double.toString(result).endsWith(".0")) {
	            textfield.setText(Double.toString(result).replace(".0", ""));
	        } else {
	            textfield.setText(String.valueOf(result));
	        }

	        label.setText("");
	        num1 = result;
	    } else if (e.getKeyChar() == 'c' || e.getKeyChar() == 'C') {
	        textfield.setText("0");
	    } else if (e.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
	        String del = textfield.getText();
	        textfield.setText("");
	        label.setText("");

	        if (!del.equals("0")) {
	            if (del.length() > 1) {
	                for (int i = 0; i < del.length() - 1; i++) {
	                    textfield.setText(textfield.getText() + del.charAt(i));
	                }
	            } else {
	                textfield.setText("0");
	            }
	        }
	    } else if (e.getKeyChar() == 'n' || e.getKeyChar() == 'N') {
	        double temp = Double.parseDouble(textfield.getText());
	        temp *= -1;
	        textfield.setText(String.valueOf(temp));
	    }
	
		
		
		
		
		
//		switch (e.getKeyChar()) {
//        case '+':
//            textfield.setBackground(Color.WHITE);
//            break;
//        case 's':
//            textfield.setBackground(Color.WHITE);
//            break;
//        case '-':
//        	textfield.setBackground(Color.BLUE);
//            break;
//        case '/':
//        	textfield.setBackground(Color.YELLOW);
//        	textfield.setText(null);
//            break;
//		}
	
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
  

}
