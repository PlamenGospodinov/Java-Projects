import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	JPanel upPanel = new JPanel();
	JPanel midPanel = new JPanel();
	JPanel botPanel = new JPanel();
	
	JLabel fnameL = new JLabel("First name: ");
	JLabel lnameL = new JLabel("Last name: ");
	JLabel genderL = new JLabel("Gender: ");
	JLabel ageL = new JLabel("Age: ");
	JLabel salaryL = new JLabel("Salary: ");
	
	JTextField fnameTF = new JTextField();
	JTextField lnameTF = new JTextField();
	JTextField ageTF = new JTextField();
	JTextField salaryTF = new JTextField();
	
	String[] item = {"Man","Woman"};
	JComboBox<String> genderCombo = new JComboBox(item);
	
	JButton addBtn = new JButton("Add");
	JButton deleteBtn = new JButton("Delete");
	JButton editBtn = new JButton("Edit");
	
	public MyFrame() {
		this.setSize(500,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(3,1));
		
		upPanel.setLayout(new GridLayout(5,2));
		upPanel.add(fnameL);
		upPanel.add(fnameTF);
		upPanel.add(lnameL);
		upPanel.add(lnameTF);
		upPanel.add(genderL);
		upPanel.add(genderCombo);
		upPanel.add(ageL);
		upPanel.add(ageTF);
		upPanel.add(salaryL);
		upPanel.add(salaryTF);
		this.add(upPanel);
		
		midPanel.add(addBtn);
		midPanel.add(deleteBtn);
		midPanel.add(editBtn);
		this.add(midPanel);		
		
		addBtn.addActionListener(new AddAction());
		
		this.setVisible(true);
	}
	
	public void clearForm() {
		fnameTF.setText("");
		lnameTF.setText("");
		ageTF.setText("");
		salaryTF.setText("");
	}
	
	class AddAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println(fnameTF.getText() + " " + lnameTF.getText() + " " + genderCombo.getSelectedItem() + " " + ageTF.getText() + " " + salaryTF.getText());
			clearForm();
		}
		
	}
}
