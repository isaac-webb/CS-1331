# Java's Command Line Interface (CLI)

The JDK (Java Developer Kit) is, in essence, a set of command line tools and
applications useful for developers writing code in Java. Of primary interest to
you, as CS 1331 students, are the `javac`, `java`, and `jshell` commands.

## Installing Java
### Mac
**Note: If you had the command not found issue while running jshell, try pasting and running this command into your terminal (and restarting terminal)**
```
echo 'PATH="/Library/Java/JavaVirtualMachines/jdk-9.0.1.jdk/Contents/Home/bin:{$PATH}" export PATH' >> ~/.bash_profile;
```

For installing Java on Mac, we recommend that you use Homebrew to install java. Homebrew can also be a pretty good tool to have for future classes as it can save you a lot of time in installs.

The Homebrew website can be found here:
https://brew.sh/

to install homebrew type this into your terminal:
```
/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```

After installing brew, type this into your terminal:
```
brew cask install java
```
Now you're done! 

### Windows
For installing Java on windows, simply follow these instructions:
https://docs.oracle.com/javase/9/install/installation-jdk-and-jre-microsoft-windows-platforms.htm#JSJIG-GUID-E3C75F92-D3B2-421D-A9BE-933C15F7CD1B


## Java and the Java Virtual Machine (JVM)

Java's key feature, which has kept it alive for a couple decades, is its ability
to run the same source code (the code you write as programmers) on virtually any
computer/operating system, an attribute sometimes referred to as code
portability. Since it is a cross-platform language, we are able to write one
piece of code and run it on any of the major operating systems on computers
today. Java achieves this through the use of the
[Java Virtual Machine (JVM)](https://en.wikipedia.org/wiki/Java_virtual_machine).

Java's Virtual Machine is the reason Java code is cross-platform. As a
[compiled language](https://en.wikipedia.org/wiki/Compiled_language) (meaning
you must compile the source code before it can be executed, as opposed to
interpreted languages like Python or JavaScript), it is similar to languages
like C and C++ which must be compiled on each individual computer before they
can be executed; however, Java circumvents the limitations typically associated
with compiled languages by using
[bytecode](https://en.wikipedia.org/wiki/Bytecode) and the JVM. When you compile
your source code, it is converted into bytecode, which the JVM knows how to
execute at runtime. This means that, as long as a JVM exists for a computer's
OS, it can run any Java bytecode, regardless of the OS the code was written and
compiled on.

You don't have to worry too much about the implementation details of these
concepts, but you should know the general flow from source code to bytecode to
the JVM at runtime. A few links are provided above for further reading, if you
are interested.

## Quick Note About Terminals

In order for the following commands and explanations to work, you must first
navigate to the folder containing the Java files inside of the terminal. To do
this, use the `cd` command. For example, if we wanted to execute a `Hello.java`
file inside of the `Documents` folder, we would first execute `cd Documents`
and then execute the commands detailed below.

## Java Compiler (`javac`)

In order to run a Java program, you must first compile it (into bytecode), as
described above. In order to do this, you execute the following command in a
terminal:

```sh
javac <your class name>.java
```

If any compiler errors occur, they will be printed to the terminal with a
description, the offending line and line number. In this case, you should go
back to your Java file, fix the errors, and try compiling again; however, if no
errors occur, the compiler simply creates a new file in the same directory named
`<your class name>.class`. This is the bytecode file the JVM will execute.

## Java Runtime (`java`)

To run a compiled Java program, i.e. you have already run `javac`, simply
execute the following command in a terminal:

```sh
java <your class name>
```

Note that there is no `.java` or `.class` extension in this command. You might
be tempted to add the extension like you are executing `javac`, but resist! You
will get an error about not being able to load the class.

As a last thought about the `java` command, make sure that, if you make any
changes to your Java file, **recompile first**, and _then_ re-execute. If you
change your Java file and run `java` without running `javac`, you will be
running your old compiled program/bytecode. This is a common mistake to make, so
if you make some changes and find your program isn't doing anything differently,
try recompiling!

## A Simple Example

Consider a file `HelloWorld.java` with the contents:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
```

In order to run this program, we would first execute `javac HelloWorld.java` and
then `java HelloWorld`. You should see the string `Hello, world!` printed to the
terminal. Try deleting a character here and there in this file and recompiling
to see some errors you might receive. Future recitations will cover compiler
errors in more detail.

## Java Shell (`jshell`)

With Java 9, we received a new tool called `jshell` which allows Java code to
be written and executed interactively. It is similar, in many ways, to other
[REPL](https://en.wikipedia.org/wiki/Read–eval–print_loop)'s like IDLE for
Python. To start an instance, simply run `jshell` in a terminal. You will be
presented with a prompt that looks similar to a terminal. Try executing a few
commands:

```java
int x = 1;
int y = 2;
int z = x + y;
```

In addition to executing regular Java code, `jshell` is also able to give you
information about what code and commands you've written, the current variables
and their values, and much more. Below are a few you might find useful. Try
running them after you've run the three commands above.

### List Java Code

To list all of the  code you've written inside of the current `jshell` instance,
run:

```
/list
```

### List Command History

To list all of the code and commands you've run inside of the current instance,
run

```
/history
```

### List Variables and Variable Values

To list all of the variables inside of the current instance, run

```
/vars
```

### Exit Java Shell

To exit the current `jshell` instance, run:

```
/exit
```

### Help

For more commands and information on the above commands, run:

```
/help
```
