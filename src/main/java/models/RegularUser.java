package models;

public class RegularUser extends User {
    public RegularUser(String username, String hashedPassword, String email) {
        super(username, hashedPassword, email);
    }

    @Override
    public void displayDashboard() {
        // Implementation specific to regular users
        System.out.println("Displaying dashboard for regular user: " + getUsername());
    }
}
