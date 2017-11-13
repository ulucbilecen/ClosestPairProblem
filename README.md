ClosestPairProblem

Algorithm Approach
The aim of this approach is to calculate the distance between each point to find minimum distance and the closest pair among the given set of points. In order to achieve this for “n” points, this needs "n2-n" calculations for one dimensions. In our case this take "d*(n2-n)" for “d” dimensions. By using brute-force algorithm this can be solved O(n2) time

Instructions
From command line:
In the beginning, classpath should be set to the directory where closestvector and test folder are located
Windows CMD: set CLASSPATH=%classpath%;/some/directory

Unix Terminal: export CLASSPATH = $CLASSPATH:/some/directory/

ex. for unix terminal: export CLASSPATH=/Users/deloittemac/Desktop/yusp/
Navigate to the closestvector folder in which the source files are located than compile the java source files.

Command: javac *.java
To run this application:

Command: java closestvector.Main
Menu
1) Run selected input file

Algorithm is executed by selecting one of the input files listed

See. Add new file section

2) Run test cases

Algorithm is executed with the predefined test scenarios are run.

See. Predefined test scenarios section

3) Create random file and run

The application creates random n dimension input file and the algorithm is executed with this file.

0) Exit

Exit from the application.

Error Message
Could not find any point for the calculation: Application give this error when there are no point in input file.

At least 2 points needed for calculation: Application give this error when there are only one point in input file.



Limitations


Comments
Add new file: The prepared tsv extension input file is added under / InputFiles / folder

Predefined test scenarios:

Blank file: If there are no points in input file, application gives “Could not find any point for the calculation." error
Dimension Problem: If the sizes of the points are not equal, the system skip the relevant line and continues to calculate.
One point: If there is only one point in the input file, the application gives "At least 2 points needed for calculation."
Two point: If there are only two points in the file, the application will return these two points as a result.
