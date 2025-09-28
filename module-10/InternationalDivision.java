// Alexis Mitchell
// September 28, 2025
// This program is a subclass of Division that represents an international division

public class InternationalDivision extends Division {
    private String country;
    private String language;

    // Constructor
    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("International Division: " + getDivisionName()
                + " | Account #: " + getAccountNumber()
                + " | Country: " + country
                + " | Language: " + language);
    }
}