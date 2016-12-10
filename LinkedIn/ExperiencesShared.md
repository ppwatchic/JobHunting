## 2016-11-19
1. Phone Interview
实现binary search tree 要求有find insert delete . 
2. onsite
2.1 communication 介绍做过的project 然后问有什么难点
2.2 hiring manager 基本就是聊聊过去的experience
2.3 design web游戏hangman
2.4 coding  一个pizza 切n刀 问最多能切几块 注意不一定要所有切线都在同一个交点.  
              leetcode98 valid binary search tree
              实现一个maxstack 功能有pop peek peekMax popMax, popMax要求O(1) 应该是挂在这上了 最后没想出来popMax O(1)怎么做
2.5  coding reverse words in a string 和 nestedlist iterator
3. Discussion  
3.1 Question: 請問design hangman到底要怎麼破啊 很常看到不知道思路  
3.2 一开始什么要求都没有 就问我知不知道猜词游戏 解释了一下 说让设计一个web上玩的  
于是一开始我就写了一个hangman的class 这个网上一搜有很多.     
然后面试官问这个code放在哪里 我说用户开始游戏 就把code下载到本地   
每猜对或者猜错一个字母 都在本地更新  
只有这轮游戏输了才发request到server更新用户的score  
然后面试官问那这样如果用户想作弊 在前台就能看到是什么词了   
我说是的 那看你想让这游戏多serious了 如果就是给用户玩着玩的 那他想作弊就作吧.  
面试官说那假设挺serious的呢
我说那就只能存server上了 用户猜一个发一个request 面试官表示可以
然后就讨论了一下database怎么设计 我就说一个user table一个word table
然后选了sql database
然后面试官问假设500m+用户了.   
我给他算了算qps 发现不是很大 就说那现在的设计没什么问题.   
面试官说那假设超级popular qps特别大
就扯了memcached 多台服务器 多台数据库blahblah
基本上把自己知道的东西都往上扯 数据库sharding replica server用master slave啥的  
面试官感觉你起码有这个概念 聊聊时间就过去了  

## [Glassdoor](https://www.glassdoor.com/Interview/LinkedIn-Software-Engineer-In-Test-Interview-Questions-EI_IE34865.0,8_KO9,34.htm)  Sofeware Engineer in Test June 2016 (San Francisco, CA)
1. Interview Questions  
HR Screening -  
Talk about your resume and previous work experience
2.  Why LinkedIn?
Basic Java questions -
3. How do you make a class/ method thread-safe?
3.1 Use synchronized keyword 
3.2 Use AtomicInteger to ensure atomic operation on data. 
4. How do you make sure a class is not instantiated? And why we would have to do that? 
4.1 with a private constructor. 
4.2 There are some reasons for that. 
4.2.1 When a class holds only static methods or fields, there will be no constructor availabe;
4.2.2 To disallow direct instantiation and instead provide a factory method to return and if necessary create instances;
5. Can we instantiate an abstract class? 
[Answer is here](http://stackoverflow.com/questions/13670991/interview-can-we-instantiate-abstract-class).  
6. Technical Phone screen -
First 20 - 30 minutes - Discuss projects on your resume, Basic Java questions (Singleton class,  
mutable and immutable,   
difference between string literal  
and new String(),   
mock objects)  
Remaining 30 - 40 minutes - Coding problem
Given the following relationships:
```
Child Parent IsLeft
15 20 true
19 80 true
17 20 false
16 80 false
80 50 false
50 null false
20 50 true
```
You should return the following tree:
```
                 50
               / \
            20 80
           / \ / \
        15 17 19 16  
```
        
## Glassdoor Oct 19, 2015 Test Engineer 
1. Try to debug a situation in which you try to login to platform and it shows a blank page after hitting submit. 
Reference Answer: Try to analyze using Firebug or any network tool if the request is getting processed or failed ,
the URL might be unavailable might be the deployment issue.


## Glassdoor Senior Software Engineer in Test Feb 11 2016
1. Interview Questions
singleton, binary trees  

## Glassdoor Senior Software Engineer in Test Sep 20 2015
2.  The coding question (using collabedit) is something like "Search a sorted array for the first element larger than k."  
I had studied Data Structures and Algorithms extensively and know binary search by heart. So this is pretty easy for me.

## Glassdoor Senior Software Engineer in Test Oct 1 2015 
1. A user logs in to a website with proper credentials and the user is taken to a blank page. How would you troubleshoot that?  
2. Coding: Create a stack with the usual push() & pop(), but with an additional function getMiddle() 
that returns the middle element of the stack in constant time.  

## Glassdoor Senior Software Engineer in Test March 1 2013
1. Called me and asked me a few technical questions. 
Lots of big O questions. Was asked to code an algorithm to find if there exists 2 numbers in an array that sum up to 
a specific "s" and then find the big O of this. 
Got it right but they never responded after my interview because they filled up all their positions just before 
(but the interviewer was unaware of that). 

## Glassdoor Software Engineer in Test Nov 2014 on-site 
1.  The in-person interview was 3 rounds. First was Q&A and coding, then test strategy, 
then a final round of coding and testing. 
2. Examine the inbox feature of LinkedIn, read over the given spec, and design a test suite for it. 

## Glassdoor Software Test Engineer April 2015
1. Phone Interview Questions  
Write a program to replace 0s with 5 in a given number. 
1.1 Test cases: 
Use 120096045  
Negative int (-1)  
0->5    
"abcd"   
integer max  
max+1 exception    
double  
float   
null    
[Source](https://www.glassdoor.com/Interview/LinkedIn-Software-Test-Engineer-Interview-Questions-EI_IE34865.0,8_KO9,31.htm)

## Glassdoor on-site Aug 2013
In person was done by 6 people. Which involved coding, leadership, people management , cross functional etc.
For example, How can you manage cross functional teams when there is a release ?? 

## Glassdoor phone/onsite? not clear Feb 2016
Interview Questions
1) Asked to implement Java Iterable interface to read a file.  
2) Asked the usages of different HTTP status code.  
3) Asked about Ruby test framework that I was using.    

## Onsite 
1. 2 rounds of coding session. 
2. A test question.
3. A code analysis question. 
4. A lunch. 
5. A meeting with Hiring manager. 
6. One test design and analysis. 

## June 2016 Senior Software Engineer in Test
1. Find indices start and end for a particular value in a sorted integer array with duplicates. 

## Software Engineer in Test, San Jose CA, Oct 2016, On-site
1. Being asked about OS concepts, multi threading, thread pool etc. 
2. String manipulation, What are your challenges, Test Strategy Plan, Code Analysis etc. 

## Test Engineer Interview October 2015 
1. Try to debug a situation in which you try to login to platform and it shows a blank page after hitting submit.  
2. Given two (dictionary) words as Strings, determine if they are isomorphic. Two words are called isomorphic  
if the letters in one word can be remapped to get the second word. Remapping a letter means replacing all  
occurrences of it with another letter while the ordering of the letters remains unchanged. No two letters  
may map to the same letter, but a letter may map to itself.
3. 

## Career Cups
1. Given a sorted array with duplicates and a number, find the arrange in the form of (startInded, endIndex) of that number. For example 
findRange({0 2 3 3 3 10 10}, 3) should return (2, 4). 

## Career Cups
1. If we have all the variables and methods are as static, So would that class be thread safe? 



## [Career Cups](https://www.careercup.com/page?pid=linkedin-interview-questions)




