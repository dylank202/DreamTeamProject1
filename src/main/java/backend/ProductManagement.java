package backend;/*
   Dream team project 1
   code version 2.0 all view parts tested
 */
import java.io.*;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductManagement {
    private HashMap<String, Category> categories = new HashMap<>();
    private HashMap<String, Subcategory> subcategories = new HashMap<>();
    //private HashMap<String, Product> products = new HashMap<>();
    private boolean exit = false;
    private boolean isCategoriesMenu = true;
    private Category selectedCategory = null;
    private Subcategory selectedSubcategory = null;
    private Encrypt encrypt;

    public ProductManagement() {
        this.encrypt = new Encrypt();
    }

    // Method to read data from the category CSV file
    private void readCategoryData(String csvFile, String csvSplitBy) {
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine(); // skip the first line

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                String categoryId = data[0];
                String categoryName = data[1];

                // Create Category instance and put it in the respective HashMap
                Category category;

                // Check to make sure the category does not exist in the HashMap, then add it
                if (!categories.containsKey(categoryId)) {
                    category = new Category(categoryId, categoryName);
                    categories.put(categoryId, category);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public HashMap<String, Category> getCategories() {
        return categories;
    }

    // Method to read data from the subcategory CSV file
    private void readSubcategoryData(String csvFile, String csvSplitBy) {
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine(); // skip the first line

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                String categoryId = data[0].substring(0, 3);
                String subcategoryId = data[0];
                String subcategoryName = data[1];

                // Get the category object above the subcategory from the category HashMap
                InventoryComponent category = categories.get(categoryId);

                // Create Subcategory instance
                Subcategory subcategory;

                // Check to make sure the subcategory does not exist in the HashMap, then add it
                if (!subcategories.containsKey(subcategoryId)) {
                    subcategory = new Subcategory(subcategoryId, subcategoryName, category);
                    subcategories.put(subcategoryId, subcategory);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read data from the product CSV file
    private void readProductData(String csvFile, String csvSplitBy) {
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine(); // skip the first line

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                String subcategoryId = data[0].substring(0, 6);
                String productId = data[0];
                String productName = data[1];
                String description = data[2];
                double purchasePrice = Double.parseDouble(data[3]);
                String purchaseDate = data[4];

                // Get the subcategory object to which this product belongs from the subcategory HashMap
                InventoryComponent subcategory = subcategories.get(subcategoryId);


                // Create Product instance
                Product product;

                //Check to make sure the product does not exist in the HashMap, then add it
                // if (!products.containsKey(productId)) {
                product = new Product(productId, productName, description, purchasePrice, purchaseDate, subcategory);
                //    products.put(productId, product);
                //}
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to initialize data from CSV files
    private void initializeData() {
        String categoryFile = "categoryData.csv";
        String subcategoryFile = "subcategoryData.csv";
        String productFile = "productData.csv";
        String csvSplitBy = ",";

        // Read data from the category CSV file
        readCategoryData(categoryFile, csvSplitBy);

        // Read data from the subcategory CSV file
        readSubcategoryData(subcategoryFile, csvSplitBy);

        // Read data from the product CSV file
        readProductData(productFile, csvSplitBy);
    }

    private boolean login() throws NoSuchAlgorithmException {

        Scanner sc = new Scanner(System.in);
        // Set your expected username and password
        String expectedUser = "ee11cbb19052e40b07aac0ca060c23ee"; // username user
        String expectedPassword = "5f4dcc3b5aa765d61d8327deb882cf99"; //  password password

        // Perform user login
        return (encrypt.checkUsername(sc, expectedUser) && encrypt.checkPassword(sc, expectedPassword));
    }

    private void viewMenu() throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);

        // If login is successful, proceed with the menu

            while (!exit) {
                if (isCategoriesMenu) {
                    // Display categories menu
                    System.out.println("*********** List of Product Categories **********");
                    System.out.println("Select a number from the list to see subcategories");
                    int i = 1;
                    for (InventoryComponent category : categories.values()) {
                        System.out.println(i++ + "- " + category.getName());
                    }
                    System.out.print("Enter your category number (p to go back, q to quit): ");
                    String input = sc.nextLine();

                    if (input.equalsIgnoreCase("q")) {
                        // User wants to quit

                        exit = true;
                        break;
                    } else if(input.equalsIgnoreCase("p")) {
                        return;
                    }

                    try {
                        // Attempt to parse the user input as an integer
                        int categoryIndex = Integer.parseInt(input) - 1;

                        if (categoryIndex >= 0 && categoryIndex < categories.size()) {
                            // Valid category selection
                            selectedCategory = (Category) categories.values().toArray()[categoryIndex];
                            isCategoriesMenu = false;
                        } else {
                            // Invalid category selection
                            System.out.println("Invalid input. Please select a number from the list.");
                        }
                    } catch (NumberFormatException e) {
                        // User entered non-numeric input
                        System.out.println("Invalid input. Please enter a valid number or 'q' to quit.");
                    }
                }

                if (!isCategoriesMenu) {
                    // Display subcategories menu
                    if (selectedCategory != null) {
                        System.out.println("*********** List of Subcategories **********");
                        System.out.println("Select a number from the list to see the items");
                        int j = 1;
//                        for (InventoryComponent subcategory : subcategories.values()) {
//                            if (subcategory.getCategory().equals(selectedCategory)) {
//                                System.out.println(j++ + "- " + subcategory.getName());
//                            }
//                        }
                        //********refactoring to test new composite data structure!!!!!!!!!!!
                        for (InventoryComponent subcategory : selectedCategory.getComponents()) {
                            System.out.println(j++ + "- " + subcategory.getName());
                        }
                        System.out.print("Enter your subcategory number (p to go back, q to quit): ");
                        String input = sc.nextLine();

                        if (input.equalsIgnoreCase("q")) {
                            // User wants to quit

                            exit = true;
                            break;
                        } else if (input.equalsIgnoreCase("p")) {
                            // User wants to go back to categories menu
                            isCategoriesMenu = true;
                        } else {
                            try {
                                //  parse the user input as an integer
                                int subcategoryIndex = Integer.parseInt(input) - 1;
                                int currentSubcategory = 0;
                                //selectedSubcategory = (Subcategory) selectedCategory.getComponents().get(subcategoryIndex);
                                for (InventoryComponent subcategory : selectedCategory.getComponents()) {
                                    //for (InventoryComponent subcategory : subcategories.values()) {
                                    //if (subcategory.getCategory().equals(selectedCategory)) {
                                    if (currentSubcategory == subcategoryIndex) {
                                        // Valid subcategory selection
                                        selectedSubcategory = (Subcategory) subcategory;


                                        // Display products menu
                                        while (true) {
                                            System.out.println("*********** List of Products **********");
                                            int k = 1;
                                            for(InventoryComponent product : selectedSubcategory.getComponents()) {
                                                //for (InventoryComponent product : products.values()) {
                                                //if (product.getSubcategory().equals(selectedSubcategory)) {
                                                System.out.println(k++ + "- " + product.getName());
                                                //}
                                            }
                                            System.out.print("Enter your item number (p to go back, q to quit): ");
                                            input = sc.nextLine();

                                            if (input.equalsIgnoreCase("q")) {
                                                // User wants to quit
                                                exit = true;
                                                break;
                                            } else if (input.equalsIgnoreCase("p")) {
                                                // User wants to go back to subcategories menu
                                                break;
                                            } else {
                                                try {
                                                    // Attempt to parse the user input as an integer
                                                    int productIndex = Integer.parseInt(input) - 1;
                                                    int currentProduct = 0;

                                                    for(InventoryComponent product : selectedSubcategory.getComponents()) {
                                                        //for (InventoryComponent product : products.values()) {
                                                        //if (product.getSubcategory().equals(selectedSubcategory)) {
                                                        if (currentProduct == productIndex) {
                                                            // Valid product selection
                                                            currentProduct++;
                                                            System.out.println("You've selected: " + product.getName());
                                                            System.out.println("Product ID: " + product.getId());
                                                            System.out.println("Description: " + product.getDescription());
                                                            System.out.println("Price: " + product.getPurchasePrice());
                                                            System.out.println("Purchase Date: " + product.getPurchaseDate());
                                                            break;
                                                        }
                                                        currentProduct++;
                                                        //}
                                                    }
                                                } catch (NumberFormatException e) {
                                                    // User entered non-numeric input for product selection
                                                    System.out.println("Invalid input. Please enter a valid number, 'p' to go back, or 'q' to quit.");
                                                }
                                            }
                                        }

                                        isCategoriesMenu = false;
                                        break;
                                    }
                                    currentSubcategory++;
                                    //}
                                }
                            } catch (NumberFormatException e) {
                                // User entered non-numeric input for subcategory selection
                                System.out.println("Invalid input. Please enter a valid number, 'p' to go back, or 'q' to quit.");
                            }
                        }
                    }
                }
            }


        // Close resources
        System.out.println("Exiting the Product Management System. Goodbye!");
        sc.close();
    }


    private void AddDeleteEditMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        while (!exit) {
            // Display manage inventory menu
            System.out.println("*********** Manage Inventory Menu **********");
            System.out.println("1. Add Inventory");
            System.out.println("2. Delete Inventory");
            System.out.println("3. Edit Inventory");
            System.out.println();

            System.out.print("Enter your item number (p to go back, q to quit): ");
            String inventoryMenuChoice = sc.nextLine();

            switch (inventoryMenuChoice) {
                case "1":
                    // Add Inventory
                    addMenu();
                    break;
                case "2":
                    // Delete Inventory
                    // Implement your logic for deleting inventory here
                    break;
                case "3":
                    // Edit Inventory
                    // Implement your logic for editing inventory here
                    break;
                case "q":
                    // Quit
                    exit = true;
                    //return;
                case "p":
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private void addMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        while (!exit) {
            // Display manage inventory menu
            System.out.println("*********** Add Inventory Menu **********");
            System.out.println("1. Add Category");
            System.out.println("2. Add Subcategory");
            System.out.println("3. Add product");
            System.out.println();

            System.out.print("Enter your item number (p to go back, q to quit): ");
            String input = sc.nextLine();

            switch (input) {
                case "1":
                    // Add Category
                    System.out.print("Enter new category name: ");
                    input = sc.nextLine();
                    input = input.trim();
                    // check new name does not exist in category list
                    //InventoryComponent newCategory = new Category(input);
                    for (InventoryComponent category : categories.values()) {
                        if (category.getName().equalsIgnoreCase(input)) {
                            System.out.println("Category name: " + input + " already exist!!!");
                            break;
                        } else {
                            System.out.println("Are you sure you want to create new category: " + input);
                            System.out.print("Enter y to save new category n to cancel: ");
                            String confirm = sc.nextLine();
                            switch (confirm) {
                                case "y":
                                    InventoryComponent newCategory = new Category(input);
                                    String filePath = "categoryData.csv";
                                    String newData = String.format("%s,%s", newCategory.getId(), newCategory.getName());
                                    //InventoryComponent newCategory = new Category(input);
                                    categories.put(newCategory.getId(), (Category) newCategory);
                                    writeDataToFile(newData, filePath);
                                    System.out.println("New category: " + newCategory.getName() + " Category ID: " + newCategory.getId() + " is created.");
                                    break;
                                case "n":
                                    System.out.println("New category is not created!!! ");
                                    break;
                                default:
                                    System.out.println("Invalid input. New category is not created!!!");
                            }
                            //
                            break;
                        }
                    }
                    break;
                case "2":
                    // Add subcategory
                    // list category to select and create subcategory under selected category
                    System.out.println("To create a new subcategory select a category from the list");
                    int i = 1;
                    for (InventoryComponent category : categories.values()) {
                        System.out.println(i++ + "- " + category.getName());
                    }
                    System.out.print("Enter your category number (p to go back, q to quit): ");
                    input = sc.nextLine();

                    if (input.equalsIgnoreCase("q")) {
                        // User wants to quit

                        exit = true;
                        break;
                    } else if (input.equalsIgnoreCase("p")) {
                        // goes back to previous menu
                        break;
                    }
                    try {

                        //  parse the user input as an integer and find selected category which new subcategory will be created under that
                        int subcategoryNumber = Integer.parseInt(input);
                        i = 1;
                        for (InventoryComponent category : categories.values()) {
                            if (i++ == subcategoryNumber)
                                selectedCategory = (Category) category;
                        }
                    } catch (NumberFormatException e) {
                        // User entered non-numeric input
                        System.out.println("Invalid input. Please enter a valid number (p to go back, q to quit).");
                        break;
                    }
                    // get new subcategory name check for not existing and create
                    System.out.println("Selected category is: " + selectedCategory.getName());
                    System.out.print("Enter new subcategory name: ");
                    input = sc.nextLine().trim();
                    boolean newSubcategoryNotExisted = true;
                    for (InventoryComponent subcategory : selectedCategory.getComponents()) {
                        if(subcategory.getName().equals(input)) {
                            System.out.println("Invalid subcategory name.The new subcategory name already existed.");
                            newSubcategoryNotExisted = false;
                            break;
                        }
                    }
                    if (newSubcategoryNotExisted) {
                        System.out.print("Are you sure you want to create new category " + input + "? ");
                        System.out.print("Enter 'y' to save new subcategory 'n' to cancel: ");
                        String confirm = sc.nextLine().trim();
                        switch (confirm) {
                            case "y":
                                InventoryComponent newSubcategory = new Subcategory(input, selectedCategory);
                                String filePath = "subcategoryData.csv";
                                String newData = String.format("%s,%s", newSubcategory.getId(), newSubcategory.getName());
                                subcategories.put(newSubcategory.getId(), (Subcategory) newSubcategory);
                                writeDataToFile(newData, filePath);
                                System.out.println("New subcategory " + newSubcategory.getName() + " Id: " + newSubcategory.getId() +" created under " +
                                        selectedCategory.getName() + " Id: "+ selectedCategory.getId() +" category.");
                                break;
                            case "n":
                                System.out.println("New subcategory is not created!!!!");
                                break;
                            default:
                                System.out.println("Invalid input. New subcategory is not created!!!");
                        }

                    }
                    break;
                case "3":
                    // Add product
                    // list categories and subcategories to select and create product under selected category and subcategory
                    // first list categories
                    System.out.println("To create a new product select a category from the list below: ");
                    i = 1;
                    for (InventoryComponent category : categories.values()) {
                        System.out.println(i++ + "- " + category.getName());
                    }
                    System.out.print("Enter a category number (p to go back, q to quit): ");
                    input = sc.nextLine();

                    if (input.equalsIgnoreCase("q")) {
                        // User wants to quit

                        exit = true;
                        break;
                    } else if (input.equalsIgnoreCase("p")) {
                        // goes back to previous menu
                        break;
                    }
                    try {
                        //  parse the user input as an integer
                        int subcategoryNumber = Integer.parseInt(input);
                        i = 1;
                        for (InventoryComponent category : categories.values()) {
                            if (i++ == subcategoryNumber)
                                selectedCategory = (Category) category;
                        }
                    } catch (NumberFormatException e) {
                        // User entered non-numeric input
                        System.out.println("Invalid input. Please enter a valid input (q to quit).");
                        break;
                    }
                    // second select a subcategory from the listed available subcategories
                    System.out.println("You have selected category " + selectedCategory.getName());
                    System.out.println("Select a subcategory from the list below: ");
                    i = 1;
                    for (InventoryComponent subcategory : selectedCategory.getComponents()) {
                        System.out.println(i++ + "- " + subcategory.getName());
                    }
                    System.out.print("Enter a subcategory number (p to go back, q to quit): ");
                    input = sc.nextLine();

                    if (input.equalsIgnoreCase("q")) {
                        // User wants to quit

                        exit = true;
                        break;
                    } else if (input.equalsIgnoreCase("p")) {
                        // goes back to previous menu
                        break;
                    }
                    try {
                        //  parse the user input as an integer
                        int subcategoryNumber = Integer.parseInt(input);
                        i = 1;
                        for (InventoryComponent subcategory : selectedCategory.getComponents()) {
                            if (i++ == subcategoryNumber)
                                selectedSubcategory = (Subcategory) subcategory;
                        }
                    } catch (NumberFormatException e) {
                        // User entered non-numeric input
                        System.out.println("Invalid input. Please enter a valid input (q to quit).");
                        break;
                    }
                    System.out.println("The new product will be added under category "+ selectedCategory.getName()
                            + " and subcategory " + selectedSubcategory.getName());
                    boolean isNewName = false;
                    boolean loop = true;
                    System.out.print("Enter new product name: ");
                    input = sc.nextLine().trim();

                        while (loop) {
                            isNewName = true;
                            if (!(selectedSubcategory.getComponents().isEmpty())) {
                                for (InventoryComponent proudct : selectedSubcategory.getComponents()) {
                                    if (input.equals(proudct.getName())) {
                                        System.out.println("Entered new product name already exist!!!!!");
                                        isNewName = false;
                                        System.out.println("Enter a new product name: ");
                                        input = sc.nextLine().trim();
                                        break;
                                    }
                                }
                            }

                            if (isNewName) {
                                loop = false;
                                String productName = input;
                                String description;
                                double purchasePrice;
                                String purchaseDate;
                                System.out.print("Enter new product " + productName + " description: ");
                                description = sc.nextLine().trim();
                                System.out.print("Enter new product " + productName + " purchasePrice: ");
                                purchasePrice = Double.parseDouble(sc.nextLine().trim());
                                System.out.print("Enter new product " + productName + " purchaseDate (mm/dd/yyyy): ");
                                purchaseDate = sc.nextLine().trim();
                                System.out.print("Are you sure you want to create new product " + input + "? ");
                                System.out.print("Enter 'y' to save new product 'n' to cancel: ");
                                String confirm = sc.nextLine().trim();
                                switch (confirm) {
                                    case "y":
                                        InventoryComponent newProduct = new Product(productName, description, purchasePrice, purchaseDate, selectedSubcategory);
                                        String filePath = "productData.csv";
                                        String newData = String.format("%s,%s,%s,%s,%s", newProduct.getId(), newProduct.getName(),
                                                newProduct.getDescription(), newProduct.getPurchasePrice(), newProduct.getPurchaseDate());
                                        writeDataToFile(newData, filePath);
                                        System.out.println("New product " + newProduct.getName() + " Id: " + newProduct.getId() + " created under " +
                                                " subcategory " + selectedSubcategory.getName() + " Id: " + selectedSubcategory.getId() + " category " +
                                                selectedCategory.getName() + " Id: " + selectedCategory.getId());
                                        break;
                                    case "n":
                                        System.out.println("New product is not created!!!!");
                                        break;
                                    default:
                                        System.out.println("Invalid input. New product is not created!!!");
                                }
                            }
                       }
                    break;
                case "q":
                    // Quit
                    exit = true;
                    //return;
                case "p":
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
            continue;
        }
    }

    private void mainMenu() throws NoSuchAlgorithmException, IOException {
        boolean isLoggedIn = login();
        Scanner sc = new Scanner(System.in);
        if (isLoggedIn) {
            while (!exit) {
                // Display main menu
                System.out.println();
                System.out.println("*********** Main Menu **********");
                System.out.println("1. View Inventory");
                System.out.println("2. Add, Delete, or Edit Inventory");
                System.out.println();
                System.out.print("Enter your item number (q to quit): ");
                String mainMenuChoice = sc.nextLine();

                switch (mainMenuChoice) {
                    case "1":
                        // View Inventory
                        viewMenu();
                        break;
                    case "2":
                        // Add, Delete, or Edit Inventory
                        AddDeleteEditMenu();
                        break;
                    case "q":
                        // Quit
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        } else {
        System.out.println("Access denied. Exiting the Product Management System. Goodbye!");
        }
        //System.out.println("Exiting the Product Management System. Goodbye!");
    }

    private static void writeDataToFile(String newData, String filePath) throws IOException {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            // append data to file
            writer.write(newData);
            //add new line for next data entry
            writer.newLine();
            System.out.println("data saved successfully!!!!!!!!!!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // check the id of components and return the biggest id number. start is starting the digit index
    // in the id string and end is the ending digit index
    private int findMacId(ArrayList<InventoryComponent> arrayList, int start, int end) {
        if (arrayList == null || arrayList.isEmpty())
            throw new IllegalArgumentException("List is empty");
        int max = 0;
        for (InventoryComponent component: arrayList) {
            int num = Integer.parseInt(component.getId().trim().substring(start, end));
            if (num > max)
                max = num;
        }
        return max;
    }

    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
        //System.out.println("Current Directory: " + System.getProperty("user.dir"));
        ProductManagement productManagement = new ProductManagement();
        productManagement.initializeData();

        productManagement.mainMenu();

    }
}
