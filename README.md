# ClosestPairProblem
Algorithm Approach

The aim of this approach is to calculate the distance between each point to find minimum distance and the closest pair among the given set of points. In order to achieve this for “n” points, this needs "n2-n" calculations for one dimensions. In our case this take "d*(n2-n)" for “d” dimensions. By using brute-force algorithm this can be solved O(n2) time

Instructions



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


Limitations

Comments

Add new file: The prepared tsv extension input file is added under / InputFiles / folder
Predefined test scenarios: 
1) Blank file: If there are no points in input file, application gives “Point not found" error
2) Dimension Problem: If the sizes of the points are not equal, the system skip the relevant line and continues to calculate.
3) One point: If there is only one point in the input file, the application gives "At least two for calculation"
4) Two point: If there are only two points in the file, the application will return these two points as a result.
