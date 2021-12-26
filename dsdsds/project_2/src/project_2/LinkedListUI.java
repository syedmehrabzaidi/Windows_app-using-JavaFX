package project_2;
	import javax.swing.*;
	import java.awt.event.*;
	import java.awt.*;

	public class LinkedListUI extends JFrame{
	 
	   JTextField txtNumber;
	   JLabel lblDisplay;
	   JButton btnAdd,btnDelete;
	   JPanel  panel1, panel2;
	   String opt[] = {"Add to First", "Add to Last"};
	   LinkedList1 list = new LinkedList1();
	   public LinkedListUI(){
	      super("Linked List *GUI");
	      txtNumber = new JTextField(20);
	      panel1 = new JPanel();
	      panel2 = new JPanel();
	      lblDisplay = new JLabel();
	      btnAdd = new JButton("Add");
	      btnAdd.addActionListener(new ActionListener(){
	          
	    	  public void actionPerformed(ActionEvent e){
	                 boolean isNumeric = false;
	                  try {
	                     int item = getData();
	                     isNumeric = true;
	                  } catch(NumberFormatException nfe) { isNumeric = false; }
	                  if(isNumeric == false) {
	                     JOptionPane.showMessageDialog(null, "This is not a number", "ERROR", JOptionPane.ERROR_MESSAGE);
	                  }
	                  else {
	                      list.add(getData());
	                  }
	                  lblDisplay.setText(list.toString()); 
	                  txtNumber.setText("enter any number");
	               }
	            });
	      btnDelete = new JButton("Delete");
	      btnDelete.addActionListener(
	            new ActionListener(){
	               public void actionPerformed(ActionEvent e){
	                  boolean isNumeric = false;
	                  try {
	                     int item = getData();
	                     isNumeric = true;
	                  } catch(NumberFormatException nfe) { isNumeric = false; }
	                  if(isNumeric) {
	                     list.delete(getData());
	                  }
	                  else {
	                     JOptionPane.showMessageDialog(null, "This is not a number", "Warning", JOptionPane.WARNING_MESSAGE);
	                  }
	                  lblDisplay.setText(list.toString());
	                  txtNumber.setText("");
	               }
	            });
	      
	    
	
	      JLabel background = new JLabel(new ImageIcon("C:\\Users\\yasir\\Downloads\\meh.png"));
	      Container pane = this.getContentPane();
	      setLayout(new GridLayout(2,1));
	      panel1.add(new JLabel("Add number:"));
	      panel1.add(txtNumber);
	      panel1.add(btnAdd);
	      panel1.add(btnDelete);
	      panel1.add(background);
	      panel2.setLayout(new GridLayout(2,4));
	      panel2.add(new JLabel("set contains:"));
	      panel2.add(lblDisplay);
	     
	      pane.add(panel1);
	      pane.add(panel2);
	
	   
	      setVisible(true);
	      setSize(500,400);
	      setDefaultCloseOperation(EXIT_ON_CLOSE);
	   //  pack();
	   }

	   int getData(){
	      int item = Integer.parseInt(txtNumber.getText());
	      return item;
	   }

	   public static void main(String [] args){
	      new LinkedListUI();
	   }
	}

