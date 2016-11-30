package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class SucessOrderInterface extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SucessOrderInterface frame = new SucessOrderInterface();
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
	public SucessOrderInterface() {
		setTitle("Sucess");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblYourWatchHas = new JLabel("Your Watch has been successfully bought");
		lblYourWatchHas.setHorizontalAlignment(SwingConstants.CENTER);
		lblYourWatchHas.setBounds(0, 97, 432, 36);
		contentPane.add(lblYourWatchHas);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(163, 169, 97, 25);
		contentPane.add(btnOk);
	}

}
