package presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JTable;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.DefaultComboBoxModel;
import domain.Frequency;
import domain.ActivityList;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class Grid {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grid window = new Grid();
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
	public Grid() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {160, 160, 160, 160, 160};
		gridBagLayout.rowHeights = new int[] {30, 50, 50, 250, 50, 250, 50, 50};
		gridBagLayout.columnWeights = new double[]{1.0};
		gridBagLayout.rowWeights = new double[]{Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblStartdate = new JLabel("Start Date (dd.mm.yyyy)");
		GridBagConstraints gbc_lblStartdate = new GridBagConstraints();
		gbc_lblStartdate.insets = new Insets(0, 0, 5, 5);
		gbc_lblStartdate.gridx = 0;
		gbc_lblStartdate.gridy = 1;
		frame.getContentPane().add(lblStartdate, gbc_lblStartdate);
		
		JLabel lblEndDateddmmyyyy = new JLabel("End Date (dd.mm.yyyy)");
		GridBagConstraints gbc_lblEndDateddmmyyyy = new GridBagConstraints();
		gbc_lblEndDateddmmyyyy.insets = new Insets(0, 0, 5, 5);
		gbc_lblEndDateddmmyyyy.gridx = 1;
		gbc_lblEndDateddmmyyyy.gridy = 1;
		frame.getContentPane().add(lblEndDateddmmyyyy, gbc_lblEndDateddmmyyyy);
		
		JLabel lblHobbies = new JLabel("Activities");
		GridBagConstraints gbc_lblHobbies = new GridBagConstraints();
		gbc_lblHobbies.insets = new Insets(0, 0, 5, 5);
		gbc_lblHobbies.gridx = 2;
		gbc_lblHobbies.gridy = 1;
		frame.getContentPane().add(lblHobbies, gbc_lblHobbies);
		
		JLabel lblNewLabel = new JLabel("Frequency");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 1;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		JButton btnPostpone = new JButton("Postpone");
		GridBagConstraints gbc_btnPostpone = new GridBagConstraints();
		gbc_btnPostpone.insets = new Insets(0, 0, 5, 0);
		gbc_btnPostpone.gridx = 4;
		gbc_btnPostpone.gridy = 1;
		frame.getContentPane().add(btnPostpone, gbc_btnPostpone);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		GridBagConstraints gbc_formattedTextField = new GridBagConstraints();
		gbc_formattedTextField.insets = new Insets(0, 0, 5, 5);
		gbc_formattedTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_formattedTextField.gridx = 0;
		gbc_formattedTextField.gridy = 2;
		frame.getContentPane().add(formattedTextField, gbc_formattedTextField);
		
		JFormattedTextField TextField = new JFormattedTextField();
		GridBagConstraints gbc_TextField = new GridBagConstraints();
		gbc_TextField.insets = new Insets(0, 0, 5, 5);
		gbc_TextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_TextField.gridx = 1;
		gbc_TextField.gridy = 2;
		frame.getContentPane().add(TextField, gbc_TextField);
		
		JFormattedTextField showDateTextField = new JFormattedTextField();
		showDateTextField.setEditable(false);
		GridBagConstraints gbc_showDateTextField = new GridBagConstraints();
		gbc_showDateTextField.insets = new Insets(0, 0, 5, 5);
		gbc_showDateTextField.fill = GridBagConstraints.BOTH;
		gbc_showDateTextField.gridwidth = 3;
		gbc_showDateTextField.gridx = 1;
		gbc_showDateTextField.gridy = 3;
		
		frame.getContentPane().add(showDateTextField, gbc_showDateTextField);
		
		JComboBox comboBox2 = new JComboBox();
		comboBox2.setModel(new DefaultComboBoxModel(Frequency.values()));
		GridBagConstraints gbc_comboBox2 = new GridBagConstraints();
		gbc_comboBox2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox2.gridx = 3;
		gbc_comboBox2.gridy = 2;
		frame.getContentPane().add(comboBox2, gbc_comboBox2);
		
		
		JButton btnAddNewActivity = new JButton("Add New Activity");
		btnAddNewActivity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String startDateString = formattedTextField.getText();
				DateFormat df = new SimpleDateFormat("dd.mm.yyyy"); 
				try {
				    Date startDate = df.parse(startDateString);

				} catch (ParseException e) {
				    e.printStackTrace();
				}
				
				String endDateString = TextField.getText();
				DateFormat dateFormat = new SimpleDateFormat("dd.mm.yyyy"); 
				try {
				    Date endDate = dateFormat.parse(endDateString);

				} catch (ParseException e) {
				    e.printStackTrace();
				}
				
				Frequency frequency=(Frequency) comboBox2.getItemAt(comboBox2.getSelectedIndex());
				

			}
		});
		GridBagConstraints gbc_btnAddNewActivity = new GridBagConstraints();
		gbc_btnAddNewActivity.insets = new Insets(0, 0, 5, 0);
		gbc_btnAddNewActivity.gridx = 4;
		gbc_btnAddNewActivity.gridy = 2;
		frame.getContentPane().add(btnAddNewActivity, gbc_btnAddNewActivity);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(ActivityList.values()));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 2;
		frame.getContentPane().add(comboBox, gbc_comboBox);
		
		
		JButton btnPrevious = new JButton("Previous");
		GridBagConstraints gbc_btnPrevious = new GridBagConstraints();
		gbc_btnPrevious.insets = new Insets(0, 0, 5, 5);
		gbc_btnPrevious.gridx = 0;
		gbc_btnPrevious.gridy = 4;
		frame.getContentPane().add(btnPrevious, gbc_btnPrevious);
		
		JButton btnNext = new JButton("Next");
		GridBagConstraints gbc_btnNext = new GridBagConstraints();
		gbc_btnNext.insets = new Insets(0, 0, 5, 0);
		gbc_btnNext.gridx = 4;
		gbc_btnNext.gridy = 4;
		frame.getContentPane().add(btnNext, gbc_btnNext);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		GridBagConstraints gbc_formattedTextField_1 = new GridBagConstraints();
		gbc_formattedTextField_1.insets = new Insets(0, 0, 0, 5);
		gbc_formattedTextField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_formattedTextField_1.gridx = 1;
		gbc_formattedTextField_1.gridy = 7;
		frame.getContentPane().add(formattedTextField_1, gbc_formattedTextField_1);
		
		JLabel lblDateInput = new JLabel("Date input");
		GridBagConstraints gbc_lblDateInput = new GridBagConstraints();
		gbc_lblDateInput.anchor = GridBagConstraints.SOUTH;
		gbc_lblDateInput.insets = new Insets(0, 0, 5, 5);
		gbc_lblDateInput.gridx = 1;
		gbc_lblDateInput.gridy = 6;
		frame.getContentPane().add(lblDateInput, gbc_lblDateInput);
		
		JButton btnSetDate = new JButton("Set Current Date");
		GridBagConstraints gbc_btnSetDate = new GridBagConstraints();
		gbc_btnSetDate.insets = new Insets(0, 0, 0, 5);
		gbc_btnSetDate.gridx = 2;
		gbc_btnSetDate.gridy = 7;
		frame.getContentPane().add(btnSetDate, gbc_btnSetDate);
		
		JButton btnGoToDate = new JButton("Go to Date");
		GridBagConstraints gbc_btnGoToDate = new GridBagConstraints();
		gbc_btnGoToDate.insets = new Insets(0, 0, 0, 5);
		gbc_btnGoToDate.gridx = 3;
		gbc_btnGoToDate.gridy = 7;
		frame.getContentPane().add(btnGoToDate, gbc_btnGoToDate);
	}
	

}
