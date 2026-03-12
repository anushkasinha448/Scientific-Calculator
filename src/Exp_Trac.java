import javax.swing.*;
import java.awt.*;

public class Exp_Trac extends JFrame {

    public Exp_Trac() {
        // Frame setup
        setTitle("Personal Expense Tracker");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window
        setLayout(new BorderLayout());

        // Top Panel (Header)
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel titleLabel = new JLabel("Personal Expense Tracker");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        topPanel.add(titleLabel);
        add(topPanel, BorderLayout.NORTH);

        // Left Panel (Menu)
        JPanel leftPanel = new JPanel(new GridLayout(5, 1, 5, 5));
        JButton addExpenseBtn = new JButton("Add Expense");
        JButton viewExpensesBtn = new JButton("View Expenses");
        JButton reportsBtn = new JButton("Reports");
        JButton settingsBtn = new JButton("Settings");
        leftPanel.add(addExpenseBtn);
        leftPanel.add(viewExpensesBtn);
        leftPanel.add(reportsBtn);
        leftPanel.add(settingsBtn);
        add(leftPanel, BorderLayout.WEST);

        // Center Panel (Tabbed Pane)
        JTabbedPane tabbedPane = new JTabbedPane();

        // Summary Tab
        JPanel summaryTab = new JPanel();
        summaryTab.setLayout(new GridLayout(3, 1));
        summaryTab.add(new JLabel("Total Income: $0"));
        summaryTab.add(new JLabel("Total Expenses: $0"));
        summaryTab.add(new JLabel("Balance: $0"));
        tabbedPane.addTab("Summary", summaryTab);

        // Expense Table Tab
        JPanel tableTab = new JPanel(new BorderLayout());
        String[] columns = {"Date", "Category", "Description", "Amount"};
        Object[][] data = {}; // Empty initially
        JTable expenseTable = new JTable(data, columns);
        JScrollPane tableScroll = new JScrollPane(expenseTable);
        tableTab.add(tableScroll, BorderLayout.CENTER);
        tabbedPane.addTab("Expenses", tableTab);

        // Add Expense Tab
        JPanel addTab = new JPanel(new GridLayout(5, 2, 10, 10));
        addTab.add(new JLabel("Description:"));
        JTextField descField = new JTextField();
        addTab.add(descField);

        addTab.add(new JLabel("Amount:"));
        JTextField amountField = new JTextField();
        addTab.add(amountField);

        addTab.add(new JLabel("Category:"));
        JComboBox<String> categoryBox = new JComboBox<>(new String[]{"Food", "Transport", "Entertainment", "Utilities"});
        addTab.add(categoryBox);

        JButton saveBtn = new JButton("Save");
        JButton cancelBtn = new JButton("Cancel");
        addTab.add(saveBtn);
        addTab.add(cancelBtn);

        tabbedPane.addTab("Add Expense", addTab);

        add(tabbedPane, BorderLayout.CENTER);

        // Bottom Panel (Status Bar)
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel statusLabel = new JLabel("Ready");
        bottomPanel.add(statusLabel);
        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Exp_Trac::new);
    }
}
