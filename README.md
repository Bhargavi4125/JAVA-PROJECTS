Simple ATM System (Java)
Overview

This is a console-based ATM simulation system developed using Java. It allows users to perform basic banking operations such as checking balance, depositing money, withdrawing money, and viewing transaction history after PIN authentication.

Features
PIN-based login authentication
Check account balance
Deposit money
Withdraw money
Transaction history tracking
Input validation using exception handling
Basic error handling for incorrect PIN and insufficient balance
Technologies Used
Java
java.util (Scanner, ArrayList)
How to Run

Compile the program:

javac SimpleATM.java

Run the program:

java SimpleATM
Default Credentials
PIN: 1234
Initial Balance: 5000
Project Structure

SimpleATM.java → Main source code file

How It Works
User enters PIN
If PIN is correct, ATM menu is displayed
User selects an operation: check balance, deposit, withdraw, or view history
Transactions are updated and stored during runtime
Output

The program runs in the console and shows:

Login success or failure
Updated balance after each transaction
Transaction history
Error messages for invalid inputs
Future Improvements
Multiple user accounts
File/database storage
Forgot PIN option
GUI-based ATM system
Author

Bhargavi Bethireddy
