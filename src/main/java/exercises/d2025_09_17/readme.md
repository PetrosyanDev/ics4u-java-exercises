# Reflection: String Patterns

## Concatenation Order

-   Java evaluates "+" left to right.
-   Numeric expressions inside parentheses compute before concatenation.
-   Mixing numbers and strings can change results.

```java
System.out.println("3" + 3 + 3);   // 333
System.out.println(3 + 3 + "3");   // 63
System.out.println("5*6=" + (5 * 6));
```

---

## Escape Sequences

-   `\n` adds new lines, `\t` adds tabs, `\\` prints backslashes.
-   Combine escape sequences to shape multi-line output.

```java
System.out.println("The^answer^is:^^\n" + "\\\\\\n2+3");
System.out.println("big\nNew\nYork\n");
```

---

## Repetition Helpers

-   `String.repeat(int count)` duplicates characters or words.
-   Useful for aligning headers or building simple ASCII art.

```java
System.out.println("^".repeat(3) + 3);
System.out.println("Num" + "^".repeat(3) + "Square");
```
