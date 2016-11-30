package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import models.Watch;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrderWatchInterface extends JFrame {

	private JPanel contentPane;
	private MainWindow previousWindow;
	private Watch watch;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public OrderWatchInterface(Watch watch, MainWindow previousMenu) {
		this.previousWindow=previousMenu;
		this.watch= watch;
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

				SucessOrderInterface sucessInterface = new SucessOrderInterface(previousMenu);
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
				previousMenu.setEnabled(true);
				previousMenu.setVisible(true);
			}
		});
		btnCancel.setBounds(171, 170, 97, 25);
		contentPane.add(btnCancel);
		
		JLabel lblWatchSelected = new JLabel("Watch Selected:");
		lblWatchSelected.setBounds(27, 23, 123, 25);
		contentPane.add(lblWatchSelected);
		
		JLabel lblWatchName = new JLabel(watch.name + " - " + watch.model);
		lblWatchName.setBounds(27, 70, 168, 16);
		contentPane.add(lblWatchName);
		
		JLabel lblUSD = new JLabel("USD");
		lblUSD.setBounds(233, 49, 56, 16);
		contentPane.add(lblUSD);
		
		JLabel lblUSDPrice = new JLabel("0,00");
		lblUSDPrice.setBounds(233, 70, 56, 16);
		contentPane.add(lblUSDPrice);
		
		JLabel lblGBP = new JLabel("GBP");
		lblGBP.setBounds(283, 49, 56, 16);
		contentPane.add(lblGBP);
		
		JLabel lblGBPPrice = new JLabel("0,00");
		lblGBPPrice.setBounds(283, 70, 56, 16);
		contentPane.add(lblGBPPrice);
		
		JLabel lblEUR = new JLabel("EUR");
		lblEUR.setBounds(351, 49, 56, 16);
		contentPane.add(lblEUR);
		
		JLabel lblEURPrice = new JLabel(watch.price + "");
		lblEURPrice.setBounds(351, 70, 56, 16);
		contentPane.add(lblEURPrice);
	}
}
