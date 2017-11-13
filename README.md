# ClosestPairProblem 

### Algorithm Approach
The aim of this approach is to calculate the distance between each point to find minimum distance and the closest pair among the given set of points. In order to achieve this for “n” points, this needs "n2-n" calculations for one dimensions. In our case this take "d*(n2-n)" for “d” dimensions. By using brute-force algorithm this can be solved O(n2) time

### Instructions
<b>From command line:</b>
*In the beginning, classpath should be set to the directory where closestvector and test folder are located

<b>Windows CMD:</b> `set CLASSPATH=%classpath%;/some/directory` </br>
<b>Unix Terminal:</b> `export CLASSPATH = $CLASSPATH:/some/directory/` </br>
<b>ex. for unix terminal:</b> `export CLASSPATH=/Users/deloittemac/Desktop/yusp/` </br>

*Navigate to the closestvector folder in which the source files are located than compile the java source files.
<b>Command:</b> `javac *.java`

*To run this application:
<b>Command:</b> `java closestvector.Main`

#### Menu

<b> 1. Run selected input file</b>

Algorithm is executed by selecting one of the input files listed

<b>See.</b> Add new file section

<b> 2. Run test cases</b>

Algorithm is executed with the predefined test scenarios are run.

<b>See.</b> Predefined test scenarios section

<b> 3. Create random file and run</b>

The application creates random n dimension input file and the algorithm is executed with this file.

<b> 0. Exit</b>

Exit from the application.

### Error Message

* <b> Could not find any point for the calculation: </b> Application gives this error when there are no point in input file.

* <b> At least 2 points needed for calculation: </b> Application gives this error when there are only one point in input file.

* <b> You need to specify a input file: </b> Application gives this error when user presses enter key on menu without any input.

* <b> Please select in range: </b> Application gives this error when user makes a input file selection out of range.

### Limitations

* Input text file should contain one point per line. For each line, coordinate values should be separated by "\t".

* For each point in input file should contain exactly same number of coordinates.

* The input file must have at least two point.

* No restriction for dimension.

* No maximum limit for points.

### Comments

<b> Add new file: </b> The prepared tsv extension input file is added under / InputFiles / folder

<b> Predefined test scenarios: </b>

  * <b> Blank file: </b> If there are no points in input file, application gives “Could not find any point for the calculation." error
  * <b> Dimension Problem: </b> If the sizes of the points are not equal, the system skip the relevant line and continues to calculate.
  * <b> One point: </b> If there is only one point in the input file, the application gives "At least 2 points needed for calculation."
  * <b> Two point: </b> If there are only two points in the file, the application will return these two points as a result.
