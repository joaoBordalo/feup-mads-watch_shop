package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SucessOrderInterface extends JFrame {

	private JPanel contentPane;
	private MainWindow previousWindow;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public SucessOrderInterface(MainWindow previousMenu) {
		
		this.previousWindow=previousMenu;
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
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				previousMenu.setEnabled(true);
				previousMenu.setVisible(true);
			}
		});
		btnOk.setBounds(163, 169, 97, 25);
		contentPane.add(btnOk);
	}

}
