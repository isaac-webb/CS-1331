# Recitation 2

1. [Variables](#variables)
    * [Vocabulary](#vocabulary)
    * [Naming Convention](#naming-convention)
    * [Primitives](#primitives)
    * [Conversion, Narrow/Widening, Explicit/Implicit] (#Conversion,-Narrow/Widening,-Explicit/Implicit)
2. [Objects](#objects)
3. [Printf](#printf)

## Variables

#### Vocabulary

**Type**: defines the variables structure, how much memory a variable can take up, how the variable is laid out, and how we can interact with the variable.

**Declare**: creates the variable by associating a **type** to the identifier (name of the variable).

**Assign**: gives a value to the variable.

**Initialize**: the first time you assign a variable.

All variables must be **declared** with their type before use.
* ex. {type} {name};

to **assign** a value to a variable, we do: 
* {variable name} = {value};

First assignment is called **initialization**

We can declare and initialize a variable in the same line if we want like so:
```
<type> <variable name> = <value>;
```

#### Naming Convention

When it comes to good naming convention, the single most important part is having a descriptive variable name. So for example if we have a variable that describes a TV shows name, instead of:
```
String x = "A Game of Thrones";
```
we can instead have something more descriptive like:
```
String showName = "A Game of Thrones";
```
I once had a friend who only used different names of potatoes (Yukon, Gold, Russet) for her variable names. Don't be *thaat* friend.

**CamelCase** is also another part of java naming convention.
**UpperCamelCase** looks like so, and **lowerCamelCase** looks like this.

we use **lowerCamelCase** for variable names, and **UpperCamelCase** for class names.

#### Primitives
byte (8 bits) 

short (16 bits)

int (32 bits)

long (64 bits)

**float** (32 bits)

**double** (64 bits)

**bold** = decimal numbers

char (16 bits)

boolean (8 bits?)

#### Conversion, Narrow/Widening, Explicit/Implicit
For further practice of these topics, I recommend downloading and running the java source code that we went over in class.

**Narrowing**: Bigger goes to smaller (loses precision)
this requires an explicit cast.
    
**Widening**: Smaller goes to bigger (doesn't lose precision)
this is an implicit cast.


## Objects

#### Strings
Strings can be **instantiated** in 2 different ways
```
String helloWorld = new String("Hello World!");
String helloWorld2 = "Hello World!";
```
This is special only to strings.

this segment of code:
```
new String();
```
is actually really special. It uses the **new** keyword for starters, which means that java is creating a **new instance** of the String class. Alternatively this is known as creating a new String **object**.

Objects are a huge part of java which we aren't going to go too far into right now. but essentially:
```
new String(); // The String() is a call to the constructor
new String("Hello World"); // The "Hello World" inside the parens is called a parameter
```

#### Scanner
Just like how we can create a new instance of a String, we'll be creating a new instance of a Scanner. This is useful for HW1, but since I'm releasing this guide pretty late I doubt any of you will see this by then.

```
Scanner input = new Scanner(System.in);
```
Here we can see that we **instantiated** a new instance of the Scanner class. It takes in System.in as a **parameter**, which is basically just saying that our Scanner object will get its input from System.in - which is basically our terminal/cmd prompt. 

With that said, there are a couple of methods worth knowing:

hasNext(): Tells you if there is another token in its input. This is useful for stopping your program before it errors by calling next() on a input that doesn't exist.

next(): returns (gives you) the next complete token.

nextLine(): returns an entire line of data.

nextInt(): returns the next complete token as an int.

nextDouble(): returns the next complete token as a double.

Here is a link to the java docs for scanner. 

https://docs.oracle.com/javase/9/docs/api/java/util/Scanner.html

The java docs will be your best friend in the future, because it basically tells you what every method, constructor, class in the java library does.


Here is a link to additional information on scanners:
https://www.tutorialspoint.com/java/util/java_util_scanner.htm

## Printf
Printf is a decent part of your homework, and good knowledge of printf can save you many lines of code. 

printf has the following format:
```
System.out.printf("format-string", arg1, arg2, arg3, ..., argn);
```
The format String should follow the following format:       
% [flags] [width] [.precision] conversion-character

some common conversion characters:
d : decimal integer [byte, short, int, long]

f : floating-point number [float, double]

c : character Capital C will uppercase the letter

s : String Capital S will uppercase all the letters in the string

n : newline Platform specific newline character- use %n instead of \n for greater compatibility

example:
```
int myInt = 12;
String myString = "Is a Lie";
printf("The Cake %s %d", myString, myInt);
```
I don't want to give too much away for the assignment, but here is a great resource to get started:
https://www.cs.colostate.edu/~cs160/.Summer16/resources/Java_printf_method_quick_reference.pdf

