In this challenge, we test your knowledge of using *if-else* conditional statements to automate decision-making processes. An if-else statement has the following logical flow:

![Wikipedia if-else flow chart](https://s3.amazonaws.com/hr-challenge-images/13689/1446563087-4ec019a919-332px-If-Then-Else-diagram.svg.png)

Source: [Wikipedia](https://en.wikipedia.org/wiki/Conditional_(computer_programming))

**Task**
Given an integer, N , perform the following conditional actions:

- If N is odd, print `Weird`
- If N is even and in the inclusive range of to , print `Not Weird`
- If N is even and in the inclusive range of to , print `Weird`
- If N is even and greater than , print `Not Weird`

Complete the stub code provided in your editor to print whether or not is weird.

**Input Format**

A single line containing a positive integer, .

**Constraints**

- 1 <= n <= 100

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

*Sample Case 0:*  N = 3
N is odd and odd numbers are weird, so we print `Weird`.

*Sample Case 1:* N = 24
N > 20 and N is even, so it isn't weird. Thus, we print `Not Weird`.