# Reflection: Geometry Calculators

## Parsing Input

-   Prompt users for values with `Scanner` and `nextLine().trim()`.
-   `Double.parseDouble` converts the cleaned text to `double`.

```java
Scanner in = new Scanner(System.in);
double radius = Double.parseDouble(in.nextLine().trim());
```

---

## Circle Measurements

-   Area uses `Math.PI * r * r` and circumference uses `2 * Math.PI * r`.
-   `printf` formats decimal output to a fixed number of places.

```java
System.out.printf("Area: %.2f%n", Math.PI * r * r);
System.out.printf("Circumference: %.2f%n", 2 * Math.PI * r);
```

---

## Rectangle Calculations

-   Compute area with `length * width` and perimeter with `2 * (length + width)`.
-   `Math.round` gives whole-number results when decimals are unnecessary.

```java
double area = length * width;
double perimeter = 2 * (length + width);
System.out.println("Area: " + Math.round(area));
```

---

## Clean Resource Use

-   Always close the `Scanner` once the program finishes reading input.

```java
in.close();
```
