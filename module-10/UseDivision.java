// Alexis Mitchell
// September 28, 2025
// This program creates two instances of InternationalDivision and DomesticDivision classes
// and displays their information

public class UseDivision {
    public static void main(String[] args) {
        // InternationalDivision objects
        InternationalDivision intDiv1 = new InternationalDivision(
                "Quantum Solutions", 4501, "England", "English");
        InternationalDivision intDiv2 = new InternationalDivision(
                "Pacific Trade", 5624, "Philipines", "Taglog");

        // DomesticDivision objects
        DomesticDivision domDiv1 = new DomesticDivision(
                "Midwest Logistics", 2658, "Minnesota");
        DomesticDivision domDiv2 = new DomesticDivision(
                "Southern Tech Operations", 9842, "Texas");

        // Display all divisions
        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}
