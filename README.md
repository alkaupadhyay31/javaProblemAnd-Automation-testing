## Problem-Solving & QA Automation Testing Task

- Table of Contents
- Problem-Solving Task
- Problem Statement
- Code Implementation & Solution Explanation
- How to Run
- QA Automation Testing Task
- Scenario
- Test Script Explanation
- Test Script Implementation
- How to Run
- Technologies Used
- Author

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

##  Problem-Solving Task
Problem Statement You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's. Increment the large integer by one and return the resulting array of digits.

Example:

Input: digits = [1, 2, 3] Output: [1, 2, 4] Explanation: The array represents the integer 123. Incrementing by one gives 123 + 1 = 124. Thus, the result should be [1, 2, 4]. Solution Explanation The problem is solved by iterating from the last digit to the first:

If the current digit is less than 9, increment it and return the array. If the digit is 9, set it to 0 and continue to the next digit. If all digits are 9, a new digit (1) is added at the front of the array. This approach ensures that the solution handles edge cases like [9, 9, 9].

## Code Implementation

![image](https://github.com/user-attachments/assets/1b06d155-25bf-449b-8a98-0f2c5d95194b)


## How to Run
- Compile and run the Java program in your preferred IDE or command line. 
- The program will output the incremented array.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## QA Automation Testing Task

## Scenario
- You need to test the search functionality on a web page with the following elements:

- A search input field with the id searchBox

- A search button with the id searchButton

- A results area with the id results

The task is to ensure that when a user enters a search term into the search box and clicks the search button, the results area displays the expected outcome.

## Test Script Explanation
The Selenium test script performs the following steps:

- Initializes the WebDriver and opens the website.
- Locates the search input field and enters the search term.
- Clicks the search button to initiate the search.
- Verifies that the results area displays the expected text.
- Test Script Implementation

  ![image](https://github.com/user-attachments/assets/2e92bdd9-d8b0-4f72-8efe-204cdcf9fece)


## How to Run

- Set up Selenium WebDriver in your development environment.
- Update the path to your ChromeDriver if needed.
- Execute the test script using TestNG.
  
## Technologies Used

- Java
- Selenium WebDriver
- TestNG
  
## Author
Alka 

Feel free to connect with me on LinkedIn or check out my other projects on GitHub.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
