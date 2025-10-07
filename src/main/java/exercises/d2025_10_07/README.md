# Selection Statements Recap

This lesson highlights how "if", "else if", and "else" guide decision-making in Java programs. Each condition evaluates to a boolean; only the matching block runs, so braces keep multi-line branches safely grouped. Avoid dangling semicolons or missing braces—they can make code run unexpectedly.

## Quick Lesson Notes

-   "if (condition) { … }" executes the block only when the condition is "true".
-   Without braces, only the first statement belongs to the "if".
-   A stray semicolon after "if (condition);" ends the statement early and the next block always runs.
-   "if / else" lets you choose between two paths, while "if / else if / else" chains handle multiple comparisons in order.
-   Once any branch in an "if / else if / else" chain succeeds, the rest are skipped.

### Sample Patterns

```java
if (number > 0) {
    System.out.println("The number is positive.");
}

if (answer.equalsIgnoreCase("yes")) {
    System.out.println("You agreed.");
} else {
    System.out.println("You disagree!");
}

if (score >= 90) {
    System.out.println("Grade: A");
} else if (score >= 80) {
    System.out.println("Grade: B");
} else {
    System.out.println("Grade: D or below");
}
```

## Exercises Overview

-   **Exercise01.java** prompts for age and coupon status, then uses nested "if" blocks to decide the movie ticket price and prints a friendly summary.
-   **Exercise02.java** reads a score and classifies it as an "A", "B", or "C" via nested conditionals.
-   **Exercise03.java** checks a hardcoded username/password pair with nested "if" statements to mimic a simple login flow.
-   **PredictTheOutput.java** captures the expected console output for provided selection and logical expression snippets.
