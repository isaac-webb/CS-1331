# Recitation 3

1. [Relational/Conditional Operators](#relational-conditional-operators)
    * [Relational Operators](#relational-operators)
    * [Conditional Operators](#conditional-operators)
2. [Conditional Execution](#conditional-execution)

Computers are really nothing more than very, very advanced calculators. For this
reason, writing code which simply runs complex arithmetic is pretty easy;
however, most of the power of coding is derived from **conditionals**. There are
two main topics regarding conditionals: operators and conditional execution.

## Relational/Conditional Operators

Java provides us with a `boolean` type which represents a value that is either
`true` or `false`. Using these `boolean` values, we can decide whether or not
to execute certain blocks of code. Most of the time, we would like to decide
based on other primitive types which are not simply booleans; this is where
relational operators come into play.

### Relational Operators

There are six relational operators you should be familiar with:

* `==` (equals)
* `!=` (not equals)
* `<=` (less than or equal to)
* `>=` (greater than or equal to)
* `<` (less than)
* `>` (greater than)

Here are a few examples for each operator:

```java
1 == 2; // false
1 == 1; // true

2 != 3; // true
2 != 2; // false

3 <= 4; // true
3 <= 3; // true
3 <= 2; // false

4 >= 5; // false
4 >= 4; // true
4 >= 3; // true

5 < 6; // true
5 < 5; // false

6 > 7; // false
6 > 6; // false
6 > 5; // true

int grade = 91;
boolean isAnA = grade >= 90; // true

double height = 47.75;
boolean isTallEnoughToRide = height >= 48; // false :(
```

By using these operators, we can convert other primitive values (`int`, `double`
, etc.) into `boolean` values which will become especially useful later on.

It is _extremely_ important that you do not confused the equals operator with
the assignment operator. They are _not_ interchangeable, and it is an easy
mistake to make! To check equality, use `==`; to change a value/assign a value
to a variable, use `=`.

### Conditional Operators

Another way in which we can extend the usefulness of these `boolean` variables
is through the use of conditional operators. While relational operators make
`boolean` values from other primitive values, conditional operators make
`boolean` values from other `boolean` values. There are three of these
operators you should know, and their
[truth tables](https://en.wikipedia.org/wiki/Truth_table) are listed below.

| a       | b       | `a && b` |
| :-----: | :-----: | :------: |
| `false` | `false` | `false`  |
| `false` | `true`  | `false`  |
| `true`  | `false` | `false`  |
| `true`  | `true`  | `true`   |

| a       | b       | `a \|\| b` |
| :-----: | :-----: | :----------------: |
| `false` | `false` | `false`            |
| `false` | `true`  | `true`             |
| `true`  | `false` | `true`             |
| `true`  | `true`  | `true`             |

| a       | `!a`    |
| :-----: | :-----: |
| `false` | `true`  |
| `true`  | `false` |

As an example of using these conditional operators, consider the following code:

```java
int grade = 91;
boolean isAB = grade >= 80; // true...?!?!
```

Undoubtedly, this would lead to some very upset students, as anyone that gets
an A or a B in a class would be given a B! To fix this, we can use conditional
operators:

```java
int grade = 91;

// You may be inclined to do the following, but Java does not allow it
// boolean isAB = 90 > grade >= 80;
// Do this instead:

boolean isAB = grade < 90 && grade >= 80; // false!
```
