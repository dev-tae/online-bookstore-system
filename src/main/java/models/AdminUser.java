package models;

public class AdminUser extends User {
    public AdminUser(String username, String hashedPassword, String email) {
        super(username, hashedPassword, email);
    }

    @Override
    public void displayDashboard() {
        // Implementation specific to regular users
        System.out.println("Displaying admin dashboard for user: " + getUsername());
    }


}
