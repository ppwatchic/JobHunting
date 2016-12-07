## Software Engineer in Test, March 2016.
1.1 Phone Interview
The Person who interviewed me for the phone screen had a strange accent and started off directly with a technical questions right   
off the bat without any introduction. He started of with some testing questions for 5 minutes and quickly moved on to the coding part   
in next 10 mins. The coding part was a simple java problem - (No Worries if you are very good at programming).   
I discussed multiple approaches to solve the problem and every reply i received was like - no big deal just solve the problem.   
I wasn't able to complete the problem on time, but i tried explained the logic i had coded.   
Then we moved on to writing test cases for the code i wrote.   
I wrote a lot of them covering different areas - positive, negative, edge, security, load etc.  
1.2 Questions
Function to return sum of 2 very Large numbers ( Around 10000 digits). 

## Software Engineer in Test, Aug 2015
Interview Questions  
1. Tell me about yourself.
2. Implement Queue using stacks.
3. Find first non-repeated character in a given string.  
```
class MyStack {
    // Push element x onto stack.
    List q1 = new LinkedList();
    List q2 = new LinkedList();
    public void push(int x) {
        if(q1.isEmpty()){
            q1.add(x);
            while (!q2.isEmpty()){
                q1.add(q2.remove(0));
            }
        }else{
            q2.add(x);
            while(!q1.isEmpty()){
                q2.add(q1.remove(0));
            }
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        if(q1.isEmpty()){
            q2.remove(0);
        }else{
            q1.remove(0);
        }
    }

    // Get the top element.
    public int top() {
        if(q1.isEmpty()){
            return q2.get(0);
        } else{
            return q1.get(0);
        }
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}
```

## Software Engineer in Test June 2015 
1. Interview Questions
Implement a stack using a queue. 
2. Now implement a queue using a stack.  
3. You have an unsorted list of consecutive integers. One of them is missing, find it. Write test cases for it.  
```
int findMissingNum(int[] nums){
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        for (int num : nums){
            if (nummax){
                max = num;
            }
        }
        int sum = max*(max+1)/2 - (min-1)*(min)/2;
        for (int num : nums){
            sum -= num;
        }
        return sum;
    }
```

## Software Engineer in Test, May 2015
Interview  
There were 4 rounds of interview:  
(1)HR round - normal questions like interests,location and preference etc.HR was very helpful too.  
(2)Hiring manager -1 //interview -1  
Given string is palindrome or not(Inlace without using extra buffer)    
(3)Hiring manager -2 //interview -2  
Given a number n - give me the first n prime numbers  
(4)On-site interview for continuously 5 hours with 5 different persons  

Interview Questions  
(1)Given string is palindrome or not(Inlace without using extra buffer)  
(2)Given a number n - give me the first n prime numbers (Improve efficiency of code)  
(3)Fizz-buzz type question  
(4)Given a string(for e.g.,abc) and an array of strings(s1,s2,....sn)   
return an array of boolean values based on if a string s1 can be made from the characters of string(abc)  
(5)Find the duplicates in an array.  
(6)Given an architecture of an application - find the best ways to test it and make sure that how can we deliver quality products.  
(7)Behavioral questions like conflict with a team-member etc.   

## Apr 2015 
As we worked through the coding exercise, I hadn't had a lot of familiarity with the Queue class in .Net and  
was asking questions to try to implement it correctly, since there was no intellisense in the online tool we were using.   
His tone to my questions grew more condescending in nature as the interview went on. I kept my temper down,   
but it is not encouraging to try to answer a question when you have someone ask about your experience in a demeaning way.   
### Interview Questions
Implement a Stack using the Queue class with given methods Enqueue, Dequeue and Count.  

## Software Engineer in Test, Feb 2015, Chicago
Firstly, there was 2 phone screening interview, they basically ask data structure and algorithm questions.   
The first one was to find second most frequent number in the array and second one was the word ladder problem.      
Then, I was invited to on -site and there was 5 round , each round was almost an hour.   
They have asked many testing questions,agile and algorithm problems.

remove duplicates in an array in-place, 
dynamic programming, spiral matrix, 
median of two sorted array and clone graph question.  

## Software Engineer in Test July 2013 
Interview Questions
Ranged from writing test cases and sample automation for deals page, 
sign on page to writing code for finding the middle element in a file and some data mining questions. 

## Software Engineer in Test, Chicago, Dec 2012 
1. The first two SDET have been there for less than 6 months and were pretty clueless when it came to the interview. 
Asked me how I would test some service that they use at Groupon. Their questions were pretty vague and pointless.
Asked about recursion and design patterns. 
2. Second round with VP of engineering was a great conversation about algorithms
 - how would you select 100 random lines from a file with a 1 million lines. Cant read the file into memory
 - given an int array with ints from 1 -1000. Some of the numbers are missing. Find those numbers
 
## Canada Oct 2014 
Design an autocomplete algorithm. 

## 2013
interview Questions  
how to test some service model 

## Career Cup 
[Groupon Interview Questions](https://www.careercup.com/page?pid=groupon-interview-questions). 




