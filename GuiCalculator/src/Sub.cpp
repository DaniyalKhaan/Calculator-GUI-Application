#include <iostream>

int main() {
    double number1, number2;

    // Prompt the user for the first number
    std::cout << "Enter the first number: ";
    std::cin >> number1;

    // Prompt the user for the second number
    std::cout << "Enter the second number: ";
    std::cin >> number2;

    // Calculate the sum
    double sum = number1 + number2;

    // Display the result
    std::cout << "The sum of " << number1 << " and " << number2 << " is " << sum << std::endl;

    return 0;
}
	