import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class NewFrame extends JFrame{
	
	JTabbedPane tab = new JTabbedPane();
	JPanel personP = new JPanel();
	JPanel carsP = new JPanel();
	JPanel rentP = new JPanel();
	JPanel sprP = new JPanel();
	
	public NewFrame() {
		this.setSize(700,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		tab.add(personP,"Clients");
		tab.add(carsP,"Cars");
		tab.add(rentP,"Rent");
		tab.add(sprP,"Clients Info");
		this.add(tab);
		
		this.setVisible(true);
	}
}
