#### Problem Statement:
Suppandi is trying to take part in the local village math quiz. In the first round, he is asked about shapes and areas. Suppandi, is confused, he was never any good at math. And also, he is bad at remembering the names of shapes. Instead, you will be helping him calculate the area of shapes.

• When he says rectangle he is actually referring to a square.
• When he says square, he is actually referring to a triangle. • When he says triangle he is referring to a rectangle • And when he is confused, he just says something random. At this point, all you can do is say 0.

Help Suppandi by printing the correct answer in an integer.

#### Sample Input

5 triangle 10 20 square 30 40 rectangle 10 10 glass 8 8 cylinder 9 10   Output

200 600 100 0 0

#### Explanation:

• First line is output of area of rectangle • Then, output of area of triangle • Then output of area square • Finally, something random, so we print 0


#### Input Format

The first line contains the number of test cases T. The following T lines contain:

• Name of shape (always in lower case) • Length of 1 side • Length of other side

```def
Note: In case of triangle, you can consider the sides as height and length of base
```
#### Constraints

-

#### Output Format

• For each test case, print the area of the shape
![](https://github.com/purushothaman7/10-day-JAVA-Contest/blob/main/day1/Screenshot%202022-11-22%20102735.png)


#### Sample input and output:
![](https://github.com/purushothaman7/10-day-JAVA-Contest/blob/main/day1/Screenshot%202022-11-22%20102640.png)
