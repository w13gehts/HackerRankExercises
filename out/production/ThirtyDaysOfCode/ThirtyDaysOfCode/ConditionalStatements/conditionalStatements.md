**Objective**
In this challenge, we learn about conditional statements. Check out the [Tutorial](https://www.hackerrank.com/challenges/30-conditional-statements/tutorial) tab for learning materials and an instructional video.

**Task**
Given an integer, N, perform the following conditional actions:

- If N is odd, print `Weird`
- If N is even and in the inclusive range of 2 to 5, print `Not Weird`
- If N is even and in the inclusive range of 6 to 20, print `Weird`
- If N is even and greater than 20, print `Not Weird`

Complete the stub code provided in your editor to print whether or not N is weird.

**Input Format**

A single line containing a positive integer, N.

**Constraints**

- 1< N < 100

**Output Format**

Print `Weird` if the number is weird; otherwise, print `Not Weird`.

**Sample Input 0**

```
3
```

**Sample Output 0**

```
Weird
```

**Sample Input 1**

```
24
```

**Sample Output 1**

```
Not Weird
```

**Explanation**

*Sample Case 0:* N = 3
N is odd and odd numbers are weird, so we print `Weird`.

*Sample Case 1:* N = 24 
N > 20 and N is even, so it is not weird. Thus, we print `Not Weird`.

