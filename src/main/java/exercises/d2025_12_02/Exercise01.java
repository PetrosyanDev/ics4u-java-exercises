/*
 * Student: © Erik Petrosyan
 * Date: 12/02/2025
 */

package exercises.d2025_12_02;

public class Exercise01 {
    public static void main(String[] args) {
        System.out.println("Exercise01 - 12/02/2025");
        System.out.println("\n=== Task 1: Class Design ===");

        System.out.println("\nQuestion 1: The Student Class");
        System.out.println("Attributes:");
        System.out.println("  - String studentID");
        System.out.println("  - String firstName");
        System.out.println("  - String lastName");
        System.out.println("  - int age");
        System.out.println("  - double gpa");
        System.out.println("  - String major");
        System.out.println("  - boolean isEnrolled");
        System.out.println("  - int creditHours");
        System.out.println("Methods:");
        System.out.println("  - enrollInCourse(String courseCode)");
        System.out.println("  - dropCourse(String courseCode)");
        System.out.println("  - calculateGPA()");
        System.out.println("  - updateMajor(String newMajor)");
        System.out.println("  - getFullName()");
        System.out.println("  - isEligibleForGraduation()");
        System.out.println("  - payTuition(double amount)");
        System.out.println("  - requestTranscript()");

        System.out.println("\nQuestion 2: The Employee Class");
        System.out.println("Attributes:");
        System.out.println("  - String employeeID");
        System.out.println("  - String firstName");
        System.out.println("  - String lastName");
        System.out.println("  - String department");
        System.out.println("  - String position");
        System.out.println("  - double salary");
        System.out.println("  - int yearsOfService");
        System.out.println("  - boolean isFullTime");
        System.out.println("Methods:");
        System.out.println("  - calculatePaycheck()");
        System.out.println("  - requestTimeOff(int days)");
        System.out.println("  - updateSalary(double newSalary)");
        System.out.println("  - transferDepartment(String newDepartment)");
        System.out.println("  - getEmployeeInfo()");
        System.out.println("  - calculateAnnualBonus()");
        System.out.println("  - clockIn()");
        System.out.println("  - clockOut()");

        System.out.println("\nQuestion 3: The WeatherStation Class");
        System.out.println("Attributes:");
        System.out.println("  - double temperature");
        System.out.println("  - double humidity");
        System.out.println("  - double windSpeed");
        System.out.println("  - double pressure");
        System.out.println("  - String location");
        System.out.println("  - String weatherCondition");
        System.out.println("  - int visibility");
        System.out.println("  - long lastUpdateTime");
        System.out.println("Methods:");
        System.out.println("  - updateTemperature(double temp)");
        System.out.println("  - updateHumidity(double humidity)");
        System.out.println("  - getWeatherReport()");
        System.out.println("  - calculateHeatIndex()");
        System.out.println("  - predictWeather()");
        System.out.println("  - recordMeasurement()");
        System.out.println("  - alertSevereWeather()");
        System.out.println("  - resetStation()");

        System.out.println("\nQuestion 4: The BankAccount Class");
        System.out.println("Attributes:");
        System.out.println("  - String accountNumber");
        System.out.println("  - String accountHolderName");
        System.out.println("  - double balance");
        System.out.println("  - String accountType");
        System.out.println("  - double interestRate");
        System.out.println("  - boolean isActive");
        System.out.println("  - String dateOpened");
        System.out.println("  - int transactionCount");
        System.out.println("Methods:");
        System.out.println("  - deposit(double amount)");
        System.out.println("  - withdraw(double amount)");
        System.out.println("  - checkBalance()");
        System.out.println("  - calculateInterest()");
        System.out.println("  - transfer(BankAccount target, double amount)");
        System.out.println("  - closeAccount()");
        System.out.println("  - getAccountStatement()");
        System.out.println("  - updateInterestRate(double newRate)");

        System.out.println("\nQuestion 5: The Book Class");
        System.out.println("Attributes:");
        System.out.println("  - String isbn");
        System.out.println("  - String title");
        System.out.println("  - String author");
        System.out.println("  - String publisher");
        System.out.println("  - int publicationYear");
        System.out.println("  - boolean isAvailable");
        System.out.println("  - String currentBorrower");
        System.out.println("  - int numberOfPages");
        System.out.println("Methods:");
        System.out.println("  - checkOut(String borrowerName)");
        System.out.println("  - returnBook()");
        System.out.println("  - renewLoan()");
        System.out.println("  - isOverdue()");
        System.out.println("  - updateAvailability(boolean available)");
        System.out.println("  - getBookInfo()");
        System.out.println("  - reserve(String borrowerName)");
        System.out.println("  - calculateLateFee()");
    }
}
