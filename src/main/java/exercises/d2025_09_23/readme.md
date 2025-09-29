# Reflection: Input & Formatting

## Identifier Rules

-   Identifiers must start with a letter, "\_", or "$"; digits come later.
-   Reserved words like `this` are off limits.
-   No spaces or punctuation such as hyphens.

```java
String firstChoice;   // valid
String monthly_total; // valid
String second-time;   // invalid, hyphen not allowed
```

---

## Scanner Basics

-   `Scanner` reads console input; close it when done.
-   `nextLine()` grabs a whole line, `next()` stops at whitespace.
-   Parse numeric text with `Integer.parseInt` or direct `nextInt()`.

```java
Scanner in = new Scanner(System.in);
String name = in.nextLine();
int age = Integer.parseInt(in.nextLine().trim());
```

---

## Tabular Output

-   Build simple layouts with tabs and string concatenation.
-   Combine the same inputs in multiple formats to compare spacing.

```java
System.out.println(w1 + "\t" + w2);
```

---

## Constants & Formatting

-   Store conversion factors and tax rates in `static final` constants.
-   Use `printf` for currency and decimal precision.

```java
static final float TAX_RATE = 0.13f;
float totalCost = cost + cost * TAX_RATE;
System.out.printf("$%,.2f%n", totalCost);
```

---

## Unit Conversion Practice

-   Reuse `Scanner` inputs to convert between inches, centimeters, or currencies.
-   Stick to float math for straightforward calculations.

```java
static final float CM_PER_INCH = 2.54f;
float heightInCm = heightInInches * CM_PER_INCH;
```
