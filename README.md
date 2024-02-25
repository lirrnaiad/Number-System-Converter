# Number System Converter

![image](https://github.com/lirrnaiad/Number-System-Converter/assets/99702949/1047eb50-05db-43ff-8944-8e7afc6772e7)

A number system conversion tool

## About

A small project to practice fundamentals, more specifically:
* Object-Oriented Programming
* Unit Testing
* git using git bash

I learned a lot from this small project. They weren't lying when they said that you learn most when creating projects!

## Running it in your own device

### Dependencies

* **JDK 17 or newer**
  * This project was compiled using JDK 21, but JDK 17 will most likely work.
* **IDE (IntelliJ recommended)**
  * This project was written using IntelliJ, not sure if it'll work in other IDEs.

### Installing

1. Click on **"Releases"** on the right of this README.
2. Click **"Assets"** to show the files.
3. Click on **"NumberSystemConverter.zip"** to download the zipped project folder. 
   * I recommend to save it where your IDE's projects folders are located for quick access.

### Executing program
  * **Using IntelliJ**
      * Unzip folder
      * **File** > **Open** > Click on the unzipped folder
      * Press **Alt + 1** to open the Project window
      * Navigate to **src** > **main** > **Main.java**
      * Double click **Main.java** to open it in the code window
      * Run the program by pressing **Shift + F10** or by pressing on the green play button on the top right

  * **Using the program**
      * The command line will prompt you for input:
        * **1** for Decimal, **2** for Binary, **3** for Octal, **4** for Hexadecimal
        * **"quit"** to exit the program
          
      * After choosing what number system to convert from, input the number
        * There are booleans in place to detect if a number from a cetain number system is invalid
        * However, I have not yet added exception handling for values exceeding minimum or maximum values, here are the minimum and maximum for each and feel free to break the program:
          * **Decimal**: -2147483648 to 2147483647
          * **Binary**: -10000000000000000000000000000000 to 1111111111111111111111111111111
          * **Octal**: -20000000000 to 17777777777
          * **Hexadecimal**: -80000000 to 7FFFFFFF


## Version History

* pre-alpha
    * Initial release
    * Working prototype

## Acknowledgments

I wouldn't be able to create this at all without the help of these resources:
  * [University of Helsinki's Java MOOC](https://java-programming.mooc.fi/)
  * [Git guide](https://rogerdudler.github.io/git-guide/)
  * [Javatpoint JUnit Testing](https://www.javatpoint.com/junit-tutorial)
