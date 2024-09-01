package pharmacyproject;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

// The `DrugCategory` enum represents different categories of drugs in the pharmacy.
enum DrugCategory {
    COSMETICS,
    PRESCRIPTION,
    OTHER
}
/**
 * The `Drug` class represents a pharmaceutical drug with properties such as name, ID, price, category, and available quantity.
 */
class Drug {
    private String name;
    private int id;
    private double price;
    private DrugCategory category;
    private int availableQuantity;
    /**
     * Constructs a new `Drug` object with the specified parameters.
     */
    public Drug(String name, int id, double price, DrugCategory category, int availableQuantity) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.category = category;
        this.availableQuantity = availableQuantity;
    }
    // Getter methods for the drug properties

    /**
     * Gets the name of the drug.
     */
    public String getName() {
        return name;
    }
    /**
     * Gets the ID of the drug.
     */
    public int getId() {
        return id;
    }
    /**
     * Gets the price of the drug.
     */
    public double getPrice() {
        return price;
    }
    /**
     * Gets the category of the drug.
     */
    public DrugCategory getCategory() {
        return category;
    }
    /**
     * Gets the available quantity of the drug.
     */
    public int getAvailableQuantity() {
        return availableQuantity;
    }
    /**
     * Sets the available quantity of the drug.
     */
    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
    /**
     * Calculates the unit price of the drug based on its category.
     */
    public double calculateUnitPrice() {
        double unitPrice = getPrice();

        switch (getCategory()) {
            case COSMETICS:
                unitPrice *= 1.2;
                break;
            // case PRESCRIPTION or OTHER: No additional charge
        }

        return unitPrice;
    }
}
/**
 * The `Pharmacy` class represents a pharmacy with a list of drugs, capacity, and total sales.
 */
class Pharmacy {
    private List<Drug> drugs;
    private int capacity;
    private double totalSales;
    /**
     * Constructs a new `Pharmacy` object with the specified capacity.
     */
    public Pharmacy(int capacity) {
        this.capacity = capacity;
        this.drugs = new ArrayList<>();
        this.totalSales = 0.0;
    }
    /**
     * Adds a drug to the pharmacy if there is available space.
     */
    public boolean addDrug(Drug drug) {
        if (drugs.size() < capacity) {
            drugs.add(drug);
            return true;
        } else {
            return false; // Pharmacy is full
        }
    }
    /**
     * Removes a drug from the pharmacy based on its ID.
     */
    public void removeDrug(int id) {
        drugs.removeIf(drug -> drug.getId() == id);
    }
    /**
     * Finds a drug in the pharmacy based on its ID.
     */
    public Drug findDrugById(int id) {
        return drugs.stream()
                .filter(drug -> drug.getId() == id)
                .findFirst()
                .orElse(null);
    }
    /**
     * Places an order for a specified quantity of a drug, updating total sales and available quantity.
     */
    public void placeOrder(Drug drug, int quantity) {
        double unitPrice = drug.calculateUnitPrice();
        double totalPrice = quantity * unitPrice;
        totalSales += totalPrice;
        drug.setAvailableQuantity(drug.getAvailableQuantity() - quantity);
    }
    /**
     * Gets the total sales for the pharmacy.
     */
    public double getTotalSales() {
        return totalSales;
    }
}
/**
 * The `PharmacyProject` class represents the main application, which extends `JFrame` for GUI functionality.
 */
public class PharmacyProject extends JFrame {
    private Pharmacy pharmacy;
    /**
     * Constructs a new `PharmacyProject` object, initializes the pharmacy, and displays a welcome message.
     */
    public PharmacyProject() {
        pharmacy = null;
        displayWelcomeMessage();

        while (true) {
            try {
                int choice = Integer.parseInt(JOptionPane.showInputDialog(getMenu()));
                switch (choice) {
                    case 1:
                        addDrug();
                        break;
                    case 2:
                        removeDrug();
                        break;
                    case 3:
                        placeOrder();
                        break;
                    case 4:
                        displayTotalSales();
                        break;
                    case 5:
                        exitProgram();
                        break;
                    default:
                        JOptionPane.showMessageDialog(
                                null,
                                "Invalid choice. Please try again.",
                                "Error",
                                JOptionPane.ERROR_MESSAGE
                        );
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Invalid input. Please enter a valid integer for the choice.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }
    } // ... (code for GUI initialization and menu handling)

    private void displayWelcomeMessage() {
        try {
            int capacity = Integer.parseInt(JOptionPane.showInputDialog("Enter the capacity of the pharmacy:"));
            if (capacity <= 0) {
                throw new NumberFormatException("Capacity must be a positive integer.");
            }
            pharmacy = new Pharmacy(capacity);
            JOptionPane.showMessageDialog(
                    null,
                    "Welcome to the Pharmacy Ordering System!",
                    "Welcome",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } catch (NumberFormatException | IllegalStateException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Invalid input. " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            System.exit(1);
        }
    }

    private String getMenu() {
        return "<html><body style='width: 300px; padding: 15px;'>" +
                "<h2>Pharmacy Menu</h2>" +
                "<ol>" +
                "<li>Add drug</li>" +
                "<li>Remove drug</li>" +
                "<li>Place an order</li>" +
                "<li>Get total sales for one day</li>" +
                "<li>Exit</li>" +
                "</ol>" +
                "Enter your choice:" +
                "</body></html>";
    }

    private void addDrug() {
        try {
            if (pharmacy == null) {
                throw new IllegalStateException("Pharmacy not initialized.");
            }

            String name = JOptionPane.showInputDialog("Enter drug name:");
            int id = Integer.parseInt(JOptionPane.showInputDialog("Enter drug ID:"));
            double price = Double.parseDouble(JOptionPane.showInputDialog("Enter drug price:"));
            DrugCategory category = chooseDrugCategory();
            int availableQuantity = Integer.parseInt(JOptionPane.showInputDialog("Enter available quantity:"));

            Drug drug = new Drug(name, id, price, category, availableQuantity);
            if (pharmacy.addDrug(drug)) {
                JOptionPane.showMessageDialog(
                        null,
                        "Drug added successfully.",
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Pharmacy is full. Cannot add more drugs.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        } catch (NumberFormatException | IllegalStateException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Invalid input. " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private void removeDrug() {
        try {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Enter the ID of the drug to remove:"));
            pharmacy.removeDrug(id);
            JOptionPane.showMessageDialog(
                    null,
                    "Drug removed successfully.",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Invalid input. Please enter a valid integer for ID.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private void placeOrder() {
        try {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Enter the ID of the drug to order:"));
            int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity:"));

            Drug drug = pharmacy.findDrugById(id);

            if (drug != null && drug.getAvailableQuantity() >= quantity) {
                pharmacy.placeOrder(drug, quantity);
                double totalPrice = quantity * drug.calculateUnitPrice();
                drug.setAvailableQuantity(drug.getAvailableQuantity() - quantity);

                JOptionPane.showMessageDialog(
                        null,
                        "Order placed successfully. Total Price: $" + String.format("%.2f", totalPrice),
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Drug not available or quantity exceeds stock.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Invalid input. Please enter valid numerical values for ID and quantity.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private DrugCategory chooseDrugCategory() {
        int categoryChoice = Integer.parseInt(JOptionPane.showInputDialog(
                "Choose a drug category:\n" +
                        "1. Cosmetics\n" +
                        "2. Prescription drugs\n" +
                        "3. Other"
        ));

        switch (categoryChoice) {
            case 1:
                return DrugCategory.COSMETICS;
            case 2:
                return DrugCategory.PRESCRIPTION;
            case 3:
                return DrugCategory.OTHER;
            default:
                JOptionPane.showMessageDialog(
                        null,
                        "Invalid category choice. Defaulting to 'Other'.",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE
                );
                return DrugCategory.OTHER;
        }
    }

    private void displayTotalSales() {
        JOptionPane.showMessageDialog(
                null,
                "Total sales for one day: $" + String.format("%.2f", pharmacy.getTotalSales()),
                "Total Sales",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    private void exitProgram() {
        JOptionPane.showMessageDialog(
                null, /*the use of null as the parentComponent means that the message dialog is not associated with
                any specific UI component and is displayed as a standalone dialog box. It's a
                       common practice when you want a simple informational message without tying it to a particular part of the UI.*/
                "Thank you for using the Pharmacy Ordering System. Exiting...",
                "Exit",
                JOptionPane.INFORMATION_MESSAGE
        );
        System.exit(0);
    } // ... (methods for displaying messages, getting user input, and performing pharmacy operations)
    /**
     * Main method to start the pharmacy application.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PharmacyProject pharmacyProject = new PharmacyProject();
            pharmacyProject.setSize(500, 400);
            pharmacyProject.setTitle("Pharmacy Ordering System");
            pharmacyProject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            pharmacyProject.setVisible(true); 
            // ... (code to set up and display the GUI)
        });
    }
}