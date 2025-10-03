# Logical Operators

Java uses three core logical operators on boolean expressions. The NOT operator "!" flips a condition, so "!(age >= 18)" is "true" only when "age" is under 18. The AND operator "&&" requires both sides to be true, making "(age > 12) && (age < 20)" succeed only for teens. The OR operator "||" returns "true" when either side is true, so "(act >= 21) || (sat >= 980)" signals success once either score meets the cutoff.

Operator precedence runs from "!" (highest) to "&&" and finally "||". Both "&&" and "||" short-circuit, meaning evaluation stops as soon as the result is determined.

Try updating "Exercise01.java" to read inputs and print which of these logical rules evaluates to "true" or "false" for the data provided.
