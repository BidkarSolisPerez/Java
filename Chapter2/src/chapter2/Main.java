/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;

import java.util.Scanner;

/**
 *
 * @author Enrique Solis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
        2.1 Fill in the blanks in each of the following statements:
        * A(n) left curve parenthesis and a(n) right curve parenthesis begin and end the body of every method.
          You can use the if statement to make decisions.
          // begins an end-of-line comment.
          space character ,new line and tab  are called white space.
          Keywords are reserved for use by Java.
          Java applications begin execution at method main.
          Methods System.out.println(), Syste.out.prinf() and System.out.print() display information in a command window.
        2.2 State whether each of the following is true or false. If false, explain why.
          Comments cause the computer to display the text after the // on the screen when the program executes. False
          All variables must be given a type when they’re declared. True
          Java considers the variables number and NuMbEr to be identical. False
          The remainder operator (%) can be used only with integer operands. False
          The arithmetic operators *, /, %, + and - all have the same level of precedence. False
          The identifier _ (underscore) is valid in Java 9. False
        2.3 Write statements to accomplish each of the following tasks:
          Declare variables c, thisIsAVariable, q76354 and number to be of type int and initialize each to 0.
          * int c = 0, int thisIsAVariable = 0, int q76354 = 0 and int number =0;
          Prompt the user to enter an integer.
          * System.out.println("Enter an integer value:");
          Input an integer and assign the result to int variable value. Assume Scanner variable input can be used to read a value from the keyboard.
          * int value = input.nextInt(); 
          Print "This is a Java program" on one line in the command window. Use method System.out.println.
          * System.out.println(This is a Java program);
          Print "This is a Java program" on two lines in the command window. The first line should end with Java. Use method System.out.printf and two %s format specifiers.
          * System.out.printf("%s%n%s%n","This is a","Java program");
          If the variable number is not equal to 7, display "The variable number is not equal to 7".
          * if(number =! 7){System.out.println("The variable number is not equal to 7")};
        2.4 Identify and correct the errors in each of the following statements:
          if (c < 7); { System.out.println("c is less than 7");} if statement was enclosed without the code block
          if (c => 7) { System.out.println("c is equal to or greater than 7"); } the relational operator is wrong, must to be >=
        2.5 Write declarations, statements or comments that accomplish each of the following tasks:
          State that a program will calculate the product of three integers.
          Create a Scanner called input that reads values from the standard input.
          Prompt the user to enter the first integer.
          Read the first integer from the user and store it in the int variable x.
          Prompt the user to enter the second integer.
          Read the second integer from the user and store it in the int variable y.
          Prompt the user to enter the third integer.
          Read the third integer from the user and store it in the int variable z.
          Compute the product of the three integers contained in variables x, y and z, and store the result in the int variable result.
          Use System.out.printf to display the message "Product is" followed by the value of the variable result.
        */    
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int x = input.nextInt();
        System.out.print("Enter second integer: ");
        int y = input.nextInt();
        System.out.print("Enter thrid integer: ");
        int z = input.nextInt();
        int result = x * y * z;
        System.out.printf("Product is %d%n", result);
        /**
        2.6 Using the statements you wrote in Exercise 2.5 , write a complete program that calculates and prints the product of three integers.
        */
        
        /**
         * 
         * 2.7 Fill in the blanks in each of the following statements:
            Comments are used to document a program and improve its readability.
            A decision can be made in a Java program with a(n) if statement                .
            The arithmetic operators with the same precedence as multiplication are division and module.
            When parentheses in an arithmetic expression are nested, the inner set of parentheses is evaluated first.
            A location in the computer’s memory that may contain different values at various times throughout the execution of a program is called a(n) variable               
        * 2.8 Write Java statements that accomplish each of the following tasks:
            Display the message "Enter an integer: ", leaving the cursor on the same line.
            Assign the product of variables b and c to the int variable a.
            Use a comment to state that a program performs a sample payroll calculation.    
        * 2.9 State whether each of the following is true or false. If false, explain why.

            Java operators are evaluated from left to right.

            The following are all valid variable names: _under_bar_, m928134, t5, j7, her_sales$, his_$account_total, a, b$, c, z and z2.

            A valid Java arithmetic expression with no parentheses is evaluated from left to right.

            The following are all invalid variable names: 3g, 87, 67h2, h22 and 2h.

            2.10 Assuming that x = 2 and y = 3, what does each of the following statements display?

            System.out.printf("x = %d%n", x);

            System.out.printf("Value of %d + %d is %d%n", x, x, (x + x));

            System.out.printf("x =");

            System.out.printf("%d = %d%n", (x + y), (y + x));

            2.11 Which of the following Java statements contain variables whose values are modified?

            int p = i + j + k + 7;

            System.out.println("variables whose values are modified");

            System.out.println("a = 5");

            int value = input.nextInt();

            2.12 Given that y=ax3+7, which of the following are correct Java statements for this equation?

            int y = a * x * x * x + 7;

            int y = a * x * x * (x + 7);

            int y = (a * x) * x * (x + 7);

            int y = (a * x) * x * x + 7;

            int y = a * (x * x * x) + 7;

            int y = a * x * (x * x + 7);

            2.13 State the order of evaluation of the operators in each of the following Java statements, and show the value of x after each statement is performed:

            int x = 7 + 3 * 6 / 2 - 1;

            int x = 2 % 2 + 2 * 2 - 2 / 2;

            int x = (3 * 9 * (3 + (9 * 3 / (3))));

            2.14 Write an application that displays the numbers 1 to 4 on the same line, with each pair of adjacent numbers separated by one space. Use the following techniques:

            Use one System.out.println statement.

            Use four System.out.print statements.

            Use one System.out.printf statement.

            2.15 (Arithmetic) Write an application that asks the user to enter two integers, obtains them from the user and prints their sum, product, difference and quotient (division). Use the techniques shown in Fig. 2.7 .

            2.16 (Comparing Integers) Write an application that asks the user to enter two integers, obtains them from the user and displays the larger number followed by the words "is larger". If the numbers are equal, print the message "These numbers are equal". Use the techniques shown in Fig. 2.15 .

            2.17 (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques shown in Fig. 2.15 . [Note: The calculation of the average in this exercise should result in an integer representation of the average. So, if the sum of the values is 7, the average should be 2, not 2.3333….]

            2.18 (Displaying Shapes with Asterisks) Write an application that displays a box, an oval, an arrow and a diamond using asterisks (*), as follows:



            2.19 What does the following code print?

            System.out.printf("*%n**%n***%n****%n*****%n");
            2.20 What does the following code print?

            System.out.println("*");
            System.out.println("***");
            System.out.println("*****");
            System.out.println("****");
            System.out.println("**");
            2.21 What does the following code print?

            System.out.print("*");
            System.out.print("***");
            System.out.print("*****");
            System.out.print("****");
            System.out.println("**");
            2.22 What does the following code print?

            System.out.print("*");
            System.out.println("***");
            System.out.println("*****");
            System.out.print("****");
            System.out.println("**");
            2.23 What does the following code print?

            System.out.printf("%s%n%s%n%s%n", "*", "***", "*****");
            2.24 (Largest and Smallest Integers) Write an application that reads five integers and determines and prints the largest and smallest integers in the group. Use only the programming techniques you learned in this chapter.

            2.25 (Odd or Even) Write an application that reads an integer and determines and prints whether it’s odd or even. [Hint: Use the remainder operator. An even number is a multiple of 2. Any multiple of 2 leaves a remainder of 0 when divided by 2.]

            2.26 (Multiples) Write an application that reads two integers, determines whether the first is a multiple of the second and prints the result. [Hint: Use the remainder operator.]

            2.27 (Checkerboard Pattern of Asterisks) Write an application that displays a checkerboard pattern, as follows:



            2.28 (Diameter, Circumference and Area of a Circle) Here’s a peek ahead. In this chapter, you learned about integers and the type int. Java can also represent floating-point numbers that contain decimal points, such as 3.14159. Write an application that inputs from the user the radius of a circle as an integer and prints the circle’s diameter, circumference and area using the floating-point value 3.14159 for π. Use the techniques shown in Fig. 2.7 . [Note: You may also use the predefined constant Math.PI for the value of π. This constant is more precise than the value 3.14159. Class Math is defined in package java.lang. Classes in that package are imported automatically, so you do not need to import class Math to use it.] Use the following formulas (r is the radius):

            diameter=2rcircumference=2πrarea=πr2
            Do not store the results of each calculation in a variable. Rather, specify each calculation as the value that will be output in a System.out.printf statement. The values produced by the circumference and area calculations are floating-point numbers. Such values can be output with the format specifier %f in a System.out.printf statement. You’ll learn more about floating-point numbers in Chapter 3 .

            2.29 (Integer Value of a Character) Here’s another peek ahead. In this chapter, you learned about integers and the type int. Java can also represent uppercase letters, lowercase letters and a considerable variety of special symbols. Every character has a corresponding integer representation. The set of characters a computer uses together with the corresponding integer representations for those characters is called that computer’s character set. You can indicate a character value in a program simply by enclosing that character in single quotes, as in ‘A’.

            You can determine a character’s integer equivalent by preceding that character with (int), as in

            (int) ‘A’
            An operator of this form is called a cast operator. (You’ll learn about cast operators in Chapter 4 .) The following statement outputs a character and its integer equivalent:

            System.out.printf("The character %c has the value %d%n", ‘A’, ((int) ‘A’));
            When the preceding statement executes, it displays the character A and the value 65 (from the Unicode® character set) as part of the string. The format specifier %c is a placeholder for a character (in this case, the character ‘A’).

            Using statements similar to the one shown earlier in this exercise, write an application that displays the integer equivalents of some uppercase letters, lowercase letters, digits and special symbols. Display the integer equivalents of the following: A B C a b c 0 1 2 $ * + / and the blank character.

            2.30 (Separating the Digits in an Integer) Write an application that inputs one number consisting of five digits from the user, separates the number into its individual digits and prints the digits separated from one another by three spaces each. For example, if the user types in the number 42339, the program should print

            4 2 3 3 9
            Assume that the user enters the correct number of digits. What happens when you enter a number with more than five digits? What happens when you enter a number with fewer than five digits? [Hint: It’s possible to do this exercise with the techniques you learned in this chapter. You’ll need to use both division and remainder operations to “pick off ” each digit.]

            2.31 (Table of Squares and Cubes) Using only the programming techniques you learned in this chapter, write an application that calculates the squares and cubes of the numbers from 0 to 10 and prints the resulting values in table format, as shown below.

            number   square   cube
            0        0        0
            1        1        1
            2        4        8
            3        9        27
            4        16       64
            5        25       125
            6        36       216
            7        49       343
            8        64       512
            9        81       729
            10       100      1000
            2.32 (Negative, Positive and Zero Values) Write a program that inputs five numbers and determines and prints the number of negative numbers input, the number of positive numbers input and the number of zeros input.
                     * 
         * 
         */
    }
    
}
