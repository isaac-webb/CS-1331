# Checkstyle

Checkstyle is a program we use to encourage students to employ good code
formatting. It is simply a Java program (packaged into a JAR) which checks your
code's formatting and commenting. You can download it and read more about how
your code should be formatted
[here](http://cs1331.gatech.edu/cs1331-style-guide.html). The following are a
few tips for running Checkstyle.

## Running Code and JavaDocs Checkstyle

To run Checkstyle on both your code formatting and JavaDoc commenting, run:

```sh
java -jar checkstyle-6.2.2.jar -a *.java
```

This will run both kinds of Checkstyle on all of the Java files in your current
directory.

## Using Spaces Over Tabs

To avoid having to constantly type spaces, configure your editor to use spaces
instead of tabs. A quick Google search should lead you to instructions on how to
do this for the editor of your choice.
