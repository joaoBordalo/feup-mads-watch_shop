package view;

import java.awt.EventQueue;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import main.DummyStore;
import main.Store;
import models.Watch;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {

	private JFrame frame;
	private Label priceS1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		DummyStore store = new DummyStore();
		ArrayList<Watch> watches = (ArrayList<Watch>) store.getWatches();
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 433);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWatches = new JLabel("Watches");
		lblWatches.setHorizontalAlignment(SwingConstants.CENTER);
		lblWatches.setBounds(0, 11, 434, 14);
		frame.getContentPane().add(lblWatches);
		
		JButton btnDetailsSM1 = new JButton("Details");
		btnDetailsSM1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrderWatchInterface order = new OrderWatchInterface(watches.get(0), MainWindow.this);
				setEnabled(false);
				order.setVisible(true);
			}
		});
		btnDetailsSM1.setBounds(91, 110, 65, 14);
		frame.getContentPane().add(btnDetailsSM1);
		
		JButton btnDetailsSM2 = new JButton("Details");
		btnDetailsSM2.setBounds(273, 109, 65, 14);
		frame.getContentPane().add(btnDetailsSM2);
		
		Label label_swatch = new Label("Swatch");
		label_swatch.setBounds(33, 31, 62, 22);
		frame.getContentPane().add(label_swatch);
		
		Label label_quartz = new Label("Quartz");
		label_quartz.setBounds(33, 138, 62, 22);
		frame.getContentPane().add(label_quartz);
		
		JButton btnDetailsQuartz = new JButton("Details");
		btnDetailsQuartz.setBounds(91, 206, 65, 14);
		frame.getContentPane().add(btnDetailsQuartz);
		
		Label label_lg = new Label("LG");
		label_lg.setBounds(33, 243, 62, 22);
		frame.getContentPane().add(label_lg);
		
		Label modelS1 = new Label(watches.get(0).model);
		modelS1.setAlignment(Label.CENTER);
		modelS1.setBounds(91, 59, 62, 22);
		frame.getContentPane().add(modelS1);
		
		priceS1 = new Label(watches.get(0).price + "");
		priceS1.setAlignment(Label.CENTER);
		priceS1.setBounds(91, 82, 62, 22);
		frame.getContentPane().add(priceS1);
	}
}
