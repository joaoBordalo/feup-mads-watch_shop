package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrderWatchInterface extends JFrame {

	private JPanel contentPane;
	//private MainWindow previousWindow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderWatchInterface frame = new OrderWatchInterface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OrderWatchInterface(/* Watch watch*/) {
		setTitle("Watch Order");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBuy = new JButton("Buy");
		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				SucessOrderInterface sucessInterface = new SucessOrderInterface();
				setEnabled(false);
				sucessInterface.setVisible(true);
			}
		});
		btnBuy.setBounds(296, 170, 97, 25);
		contentPane.add(btnBuy);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				//previousMenu.setEnabled(true);
				//previousMenu.setVisible(true);
			}
		});
		btnCancel.setBounds(171, 170, 97, 25);
		contentPane.add(btnCancel);
		
		JLabel lblWatchSelected = new JLabel("Watch Selected:");
		lblWatchSelected.setBounds(27, 23, 123, 25);
		contentPane.add(lblWatchSelected);
		
		JLabel lblWatchName = new JLabel("Watch"/*watch.getName()*/);
		lblWatchName.setBounds(37, 70, 56, 16);
		contentPane.add(lblWatchName);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(233, 49, 56, 16);
		contentPane.add(lblNewLabel);
	}
}
