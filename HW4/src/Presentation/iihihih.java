/**

@author Bora OZSOY - Salih Atacan KARAGOZ, 220201027 - 210201055
*/
package Presentation;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import java.awt.Component;
import javax.swing.JLabel;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import java.awt.Dimension;

public class iihihih {

	private JFrame frame;
	private JTextField weightTextField;
	private JTextField ageTextField;
	private JTextField heightTextField;
	private JLabel lblWeight;
	private JLabel lblHeight;
	private JLabel lblAge;
	private JButton btnOk;
	private JTextField result;
	private JLabel lblOptimumCalorie;
	private JRadioButton rdbtnBreakfast;
	private JRadioButton rdbtnLunch;
	private JRadioButton rdbtnDinner;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					iihihih window = new iihihih();
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
	public iihihih() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		frame.getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				GridBagLayout gridBagLayout = new GridBagLayout();
				gridBagLayout.columnWidths = new int[] {77, 50, 86, 23};
				gridBagLayout.rowHeights = new int[] {14, 20, 23, 30, 23, 0, 30, 30, 0};
				gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0};
				gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0};
				frame.getContentPane().setLayout(gridBagLayout);
				
						
						
						lblWeight = new JLabel("Weight");
						GridBagConstraints gbc_lblWeight = new GridBagConstraints();
						gbc_lblWeight.insets = new Insets(0, 0, 5, 5);
						gbc_lblWeight.gridx = 1;
						gbc_lblWeight.gridy = 0;
						frame.getContentPane().add(lblWeight, gbc_lblWeight);
				
				lblHeight = new JLabel("Height");
				GridBagConstraints gbc_lblHeight = new GridBagConstraints();
				gbc_lblHeight.insets = new Insets(0, 0, 5, 5);
				gbc_lblHeight.gridx = 2;
				gbc_lblHeight.gridy = 0;
				frame.getContentPane().add(lblHeight, gbc_lblHeight);
				
				lblAge = new JLabel("Age");
				GridBagConstraints gbc_lblAge = new GridBagConstraints();
				gbc_lblAge.insets = new Insets(0, 0, 5, 5);
				gbc_lblAge.gridx = 3;
				gbc_lblAge.gridy = 0;
				frame.getContentPane().add(lblAge, gbc_lblAge);
				
				JComboBox comboBox = new JComboBox();
				
						comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Female", "Male"}));
						GridBagConstraints gbc_comboBox = new GridBagConstraints();
						gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
						gbc_comboBox.insets = new Insets(0, 0, 5, 5);
						gbc_comboBox.gridx = 0;
						gbc_comboBox.gridy = 1;
						frame.getContentPane().add(comboBox, gbc_comboBox);
				
				weightTextField = new JTextField();
				GridBagConstraints gbc_weightTextField = new GridBagConstraints();
				gbc_weightTextField.fill = GridBagConstraints.HORIZONTAL;
				gbc_weightTextField.insets = new Insets(0, 0, 5, 5);
				gbc_weightTextField.gridx = 1;
				gbc_weightTextField.gridy = 1;
				frame.getContentPane().add(weightTextField, gbc_weightTextField);
				weightTextField.setColumns(10);
				
				heightTextField = new JTextField();
				GridBagConstraints gbc_heightTextField = new GridBagConstraints();
				gbc_heightTextField.fill = GridBagConstraints.HORIZONTAL;
				gbc_heightTextField.insets = new Insets(0, 0, 5, 5);
				gbc_heightTextField.gridx = 2;
				gbc_heightTextField.gridy = 1;
				frame.getContentPane().add(heightTextField, gbc_heightTextField);
				heightTextField.setColumns(10);
				
				ageTextField = new JTextField();
				GridBagConstraints gbc_ageTextField = new GridBagConstraints();
				gbc_ageTextField.fill = GridBagConstraints.HORIZONTAL;
				gbc_ageTextField.insets = new Insets(0, 0, 5, 5);
				gbc_ageTextField.gridx = 3;
				gbc_ageTextField.gridy = 1;
				frame.getContentPane().add(ageTextField, gbc_ageTextField);
				ageTextField.setColumns(10);
				
				btnOk = new JButton("OK");
				btnOk.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						double calculated = 0;
						String sex=(String) comboBox.getItemAt(comboBox.getSelectedIndex());
						String weight=weightTextField.getText();
						String height=heightTextField.getText();
						String age=ageTextField.getText();
										
						if (sex=="Female") {
							calculated= 10*Integer.parseInt(weight)+6.25*Integer.parseInt(height)-5*Integer.parseInt(age)-161;
						}
						else if (sex=="Male"){
							calculated= 10*Integer.parseInt(weight)+6.25*Integer.parseInt(height)-5*Integer.parseInt(age)+5;
						}
						result.setText(Double.toString(calculated));
						
					
					}
				});
				GridBagConstraints gbc_btnOk = new GridBagConstraints();
				gbc_btnOk.insets = new Insets(0, 0, 5, 0);
				gbc_btnOk.gridx = 4;
				gbc_btnOk.gridy = 1;
				frame.getContentPane().add(btnOk, gbc_btnOk);
		
		lblOptimumCalorie = new JLabel("Optimum Calorie:");
		GridBagConstraints gbc_lblOptimumCalorie = new GridBagConstraints();
		gbc_lblOptimumCalorie.anchor = GridBagConstraints.EAST;
		gbc_lblOptimumCalorie.insets = new Insets(0, 0, 5, 5);
		gbc_lblOptimumCalorie.gridx = 1;
		gbc_lblOptimumCalorie.gridy = 2;
		frame.getContentPane().add(lblOptimumCalorie, gbc_lblOptimumCalorie);
		
		result = new JTextField();
		result.setEditable(false);
		GridBagConstraints gbc_result = new GridBagConstraints();
		gbc_result.fill = GridBagConstraints.HORIZONTAL;
		gbc_result.insets = new Insets(0, 0, 5, 5);
		gbc_result.gridx = 2;
		gbc_result.gridy = 2;
		frame.getContentPane().add(result, gbc_result);
		result.setColumns(10);
		
		rdbtnBreakfast = new JRadioButton("Breakfast");
		rdbtnBreakfast.setMinimumSize(new Dimension(53, 23));
		rdbtnBreakfast.setMaximumSize(new Dimension(53, 23));
		GridBagConstraints gbc_rdbtnBreakfast = new GridBagConstraints();
		gbc_rdbtnBreakfast.anchor = GridBagConstraints.NORTHWEST;
		gbc_rdbtnBreakfast.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnBreakfast.gridx = 1;
		gbc_rdbtnBreakfast.gridy = 3;
		frame.getContentPane().add(rdbtnBreakfast, gbc_rdbtnBreakfast);
		
		String[] columnNames = {"Name",
                "Unit",
                "Cal"
                };
		//String[] data = DataAccesLayer.getData;
		//JTable table = new JTable(data, columnNames);
		JTable table_1 = new JTable();
		GridBagConstraints gbc_table_1 = new GridBagConstraints();
		gbc_table_1.gridheight = 3;
		gbc_table_1.gridwidth = 2;
		gbc_table_1.insets = new Insets(0, 0, 5, 5);
		gbc_table_1.fill = GridBagConstraints.BOTH;
		gbc_table_1.gridx = 2;
		gbc_table_1.gridy = 3;
		frame.getContentPane().add(table_1, gbc_table_1);
		
		rdbtnLunch = new JRadioButton("Lunch");
		GridBagConstraints gbc_rdbtnLunch = new GridBagConstraints();
		gbc_rdbtnLunch.anchor = GridBagConstraints.WEST;
		gbc_rdbtnLunch.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnLunch.gridx = 1;
		gbc_rdbtnLunch.gridy = 4;
		frame.getContentPane().add(rdbtnLunch, gbc_rdbtnLunch);
		
		rdbtnDinner = new JRadioButton("Dinner");
		GridBagConstraints gbc_rdbtnDinner = new GridBagConstraints();
		gbc_rdbtnDinner.anchor = GridBagConstraints.WEST;
		gbc_rdbtnDinner.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnDinner.gridx = 1;
		gbc_rdbtnDinner.gridy = 5;
		frame.getContentPane().add(rdbtnDinner, gbc_rdbtnDinner);
	}

}
