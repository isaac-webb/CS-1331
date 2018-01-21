# Recitation 2

1. [Variables](#variables)
    * [Vocabulary](#vocabulary)
    * [Syntax](#syntax)
    * [Naming Convention](#naming-convention)
    * [Primitives](#primitives)
    * [Conversion](#conversion)
2. [Operators](#operators)
3. [Objects](#objects)
    * [Strings](#strings)
    * [Scanner](#scanner)
4. [printf](#printf)

## Variables

### Vocabulary

**Type**: defines a variable's structure, how much memory it takes up, how it is
laid out in memory, and how we can interact with it. In Java, there are two main
groups of types: primitives and objects. These will be discussed later on in
this document.

**Declare**: to create a variable by associating a **type** with the identifier
(name of the variable). More technically, **declaring** a variable allocates
space in memory for that variable.

**Assign**: to give a value to a variable.

**Initialize**: special terminology for the first time you **assign** a value to
a variable.

### Syntax

There are a few important rules regarding creating and using variables in Java.
All variables must be declared before they can be used. The syntax for doing so
is `<type> <name>;`, e.g.

```java
int x;
```

To assign a value to a variable, we utilize the **assignment operator** (`=`).
The syntax for assigning is `<variable name> = <value>;`, e.g.

```java
x = 5;
```

We can also declare and initialize a variable in the same line using the syntax
`<type> <variable name> = <value>;`, e.g.

```java
int x = 5;
```

### Naming Convention

When it comes to good naming convention, the single most important part is
having a descriptive variable name; for example, if we have a variable that
describes a TV shows name, instead of

```java
String x = "A Game of Thrones";
```

we can instead have something more descriptive like

```java
String showName = "A Game of Thrones";
```

I once had a friend who only used different names of potatoes
(Yukon, Gold, Russet) for her variable names. Don't be _that_ friend.

![Camels be camelin](CamelCase.png)

[CamelCase](https://en.wikipedia.org/wiki/Camel_case) is another part of Java's
naming convention. We use **lowerCamelCase** for variable names, and
**UpperCamelCase** for class names, e.g.

```java
public class MyClassName {
  int myVariableName;
}
```

One final note on naming convention: you **can not** use reserved words as
variable names. Click
[here](https://en.wikipedia.org/wiki/List_of_Java_keywords) for a list of Java's
reserved words.

### Primitives

Primitives are the types of variables that make up the foundation of Java. The
key difference in storage between primitives and objects is primitives store
their _actual value_ in the variable. The most commonly used primitive types are
`int` for integer values and `double` for floating point values. The full list
of Java's primitive types is below:

#### Integers/Whole Numbers

* `byte` (8 bits)
* `short` (16 bits)
* `int` (32 bits)
* `long` (64 bits)

#### Floating Point Numbers/Decimals

* `float` (32 bits)
* `double` (64 bits)

#### Special Types

* `char` (16 bits, [UTF-8](https://en.wikipedia.org/wiki/UTF-8) encoded)
* `boolean` (1 bit, really takes up more)

### Conversion

While using `int` and `double` for all variables in a program may work for most
cases, it is often necessary to be able to convert between the primitive types.
To discuss how to convert back and forth, however, it is necessary to understand
these two terms:

**Narrowing**: Going from a larger primitive type to a smaller (loses precision
and/or range). This requires an explicit cast.

**Widening**: Going from a smaller primitive type to a larger (doesn't lose
precision and/or range). This can be done using either an implicit or explicit
cast.

For further practice of these topics, I recommend downloading and running the
Java source code that we went over in class

#### Implicit vs. Explicit Casting

In Java, there are three primary ways to perform a cast, and they fall under two
categories: implicit or explicit casting.

##### Implicit Casting

Implicit casting is when Java takes one primitive type and converts it to
another without you intervening. This is usually done because there is no risk
of losing data, i.e. you are doing a widening operation. The two kinds of
implicit casting are:

**Assignment**: When you assign a variable a value of a smaller type, e.g.

```java
double x = 5;
long y = 10;
double z = 5.0f;
```

**Arithmetic Promotion**: When you perform an arithmetic operation and either
the operands or the result is casted to the largest data type involved, e.g.

```java
double quotient = 5.0 / 2; // Same as 5.0 / 2.0
double sum = 2 + 2.0; // Same as 2.0 + 2.0
```

##### Explicit Casting

The final way to cast is explicitly. When casting explicitly, you force Java to
convert between two data types, regardless of any potential narrowing or data
loss. Here are a few examples:

```java
int badPi = (int) 3.14; // badPi is 3
int worsePi = (int) 3.999; // worsePi is 3
byte b = (byte) 129L; // b is -127
```

## Operators

Java has many, many operators to work with and combine various values. Although
we mentioned the comparison and logical operators in recitation, don't worry
about those quite yet. Here is a quick example to show you all of the arithmetic
operators:

```java
int a = 1 + 2; // a is 3
int b = a - 1; // b is 2
int c = a * b; // c is 6
int d = c / 2; // c is 3
int e = d % 2; // modulus (remainder) operator; e is 1
```

A quick note on the modulus operator: if the first operand is positive, the
result will be positive. If the first operand is negative, the result will be
negative. The sign of the second operand is irrelevant.

Java also has a few operators that act as shorthands:

```java
a += 1;
// Is the same as
a = a + 1;

b -= 2;
// Is the same as
b = b - 2;

c *= 3;
// Is the same as
c = c * 3;

d /= 4;
// Is the same as
d = d / 4;

e %= 5;
// Is the same as
e = e % 5;
```

In addition, Java has the increment and decrement operators, both of which come
in a prefix and postfix form.

```java
int f = 3;
int g = f--; // g is 3, f is now 2

// Or, equivalently
int f = 3;
int g = f; // g is 3
f = f - 1; // f is 2

int h = 5;
int i = --h; // i is 4, h is now 4

// Or, equivalently
int h = 5;
h = h - 1; // h is 4
int i = h; // i is 4
```

The increment operator, `++`, has the same properties as the above example,
except that it **adds** 1 instead of subtracting it.

As a final note about operators, there is an "order of operations," or, more
formally, and order of operator precedence. Click
[here](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html)
for Java's operator precedence table.

## Objects

Objects are the second main group of variables in Java. With regards to
variable storage, Objects differ in that an object variable contains a
_reference_ to the Object. It does _not_ store the actual Object you create in
the variable. We will discuss the implications of this later on.

### Strings

Strings can be **instantiated** in 2 different ways

```java
String helloWorld = new String("Hello World!");
String helloWorld2 = "Hello World!";
```

This is a special treatment that only occurs with Strings.

This segment of code:

```java
new String();
```

is actually really special. It uses the `new` keyword, for starters, which means
that Java is creating a **new instance** of the String class. Alternatively this
is known as creating a new String **object**.

Objects are a huge part of Java which we aren't going to go too far into right
now, but essentially:

```java
new String(); // The String() is a call to the constructor
new String("Hello World"); // The "Hello World" inside the parens is called a parameter
```

Click [here](https://docs.oracle.com/javase/9/docs/api/java/lang/String.html) to
read the String API, which gives a detailed description of all of the ways to
create and use Strings.

### Scanner

Just like how we can create a new instance of a String, we'll be creating a new
instance of a Scanner. This is useful for HW1 (and HW2!), but since I'm
releasing this guide pretty late I doubt any of you will see this by then.

```java
Scanner input = new Scanner(System.in);
```

Here we can see that we **instantiated** a new instance of the Scanner class. It
takes in `System.in` as a **parameter**, which is just saying that our Scanner
object will get its input from `System.in`, which is basically our
terminal/command prompt. There are other ways in which you can instantiate a
Scanner object, but this is the way it will be done in most cases.

With that said, there are a couple of methods worth knowing:

* `hasNext()`: Tells you if there is another token in its input. This is useful
  for stopping your program before it errors by calling `next()` on a input that
  doesn't exist.
* `next()`: returns (gives you) the next complete token.
* `nextLine()`: returns an entire line of data.
* `nextInt()`: returns the next complete token as an `int`.
* `nextDouble()`: returns the next complete token as a `double`.

Click [here](https://docs.oracle.com/javase/9/docs/api/java/util/Scanner.html)
to read the API for Scanner. The Java API will be your best friend in the
future, because it tells you what every method, constructor, class in Java does.

Click [here](https://www.tutorialspoint.com/java/util/java_util_scanner.htm) for
an additional information guide on Scanners.

## `printf()`

`printf()` is a decent part of your homework, and good knowledge of `printf()`
can save you many lines of code. It has the following format:

```java
System.out.printf("<format-string>"[, args...]);
```

The tokens in the format String should have the following structure:

```  
%[flags][width][.precision]<conversion-character>
```

Some common conversion characters are:

* `d` : decimal integer [`byte`, `short`, `int`, `long`]
* `f` : floating-point number [`float`, `double`]
* `c` : character; capital C will uppercase the letter
* `s` : String; capital S will uppercase all the letters in the String
* `n` : platform specific newline character; use `%n` instead of `\n` for
  greater compatibility

Example:

```java
int myInt = 12;
String myString = "Is a Lie";
System.out.printf("The Cake %s %d", myString, myInt); // The Cake Is a Lie 12
```

I don't want to give too much away for the assignment, but
[here](https://www.cs.colostate.edu/~cs160/.Summer16/resources/Java_printf_method_quick_reference.pdf)
is a great resource to get started.
