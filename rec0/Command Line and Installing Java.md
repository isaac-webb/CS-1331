## Installing Java
### Mac
**Note: If you had the "command not found" issue while running jshell, try pasting and running this command into your terminal (and restarting terminal)**
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
