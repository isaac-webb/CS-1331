# Command Line Instructions and Installing Java

This is a quick tutorial on how to install java and use Command Prompt/Terminal.

## Installing Java

### Mac

To install Java on Mac, we recommend that you use [Homebrew](https://brew.sh/).
Homebrew can also be a pretty good tool to have for future classes as it can
save you a lot of time in installs.

To install Homebrew, or the command `brew`, type this into your terminal:

```sh
/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```

After installing `brew`, type this into your terminal to install Java:

```sh
brew cask install java
```

Now you're done!

#### `jshell: command not found`

If you received `command not found` when running `jshell`, try pasting and
running this command into your terminal (and restarting terminal):

```sh
echo 'PATH="/Library/Java/JavaVirtualMachines/jdk-9.0.1.jdk/Contents/Home/bin:{$PATH}" export PATH' >> ~/.bash_profile;
```

### Windows

For instructions on installing Java on Windows, go
[here](https://docs.oracle.com/javase/9/install/installation-jdk-and-jre-microsoft-windows-platforms.htm#JSJIG-GUID-E3C75F92-D3B2-421D-A9BE-933C15F7CD1B).


## Command Line Instructions

| Windows | Linux / Mac (*nix) | Description | Notes |
| ------- | ---------------- | ---------- | ------- |
| `dir` | `ls` | Lists everything in the current working directory | `ls` stands for list, `dir` stands for directory |
| `cd "<path/to/dir>"`| `cd <path/to/dir>` | Change the current working directory to the specified directory | `cd` stands for change directory |
| `cd ..` | `cd ..` | Move up one directory | |
| `mkdir <name>` | `mkdir <name>` | Create a new directory in the current working directory called “name”. | `mkdir` stands for make directory |
| `cd` | `pwd` | Print the path to the current working directory | `pwd` stands for print working directory |
| `cls` | `clear` | Clear the terminal window | `cls` stands for clear screen |
