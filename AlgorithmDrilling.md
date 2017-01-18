**How to Solve a problem Quick**  
1. Understand the question, better visualize the question.  
2. What type of data structure fit/assist to solve the problem? ArrayList, Queue, Stack?   
3. Pay attention to nameing convention.  
4. Contrive sound test cases.   
5. Have the ability to talk about pros and cons for the algorithms chosen. 

**What is D&C algorithm?**   
**A:**D&C refers to Divide&Conquer. A divide and conquer algorithm works by recursively breaking down a problem into two or more sub-problems of the same or related type, until these become simple enough to be solved directly. The solutions to the sub-problems are then combined to give a solution to the original problem.

**Q:What is on-line algorithm? or online property for an algorithm?**  
**A:**an **online** algorithm is one that can only process its input piece-by-piece in a serial fashion, i.e., in the order that the input is fed to the algorithm, without having the entire input available from the start.  
In contrast, an offline algorithm is given the whole problem data from the beginning and is required to output an answer which solves the problem at hand.  
For example, sorting algorithm of **election sort** and **insertion sort**, with former one having offline property and latter one with online property.  

**Cache Related Algorithm: LFU/LRU?**  
**A:**   
1, LFU algorithm will O(1) run-time complexity, with [explanation](http://dhruvbird.com/lfu.pdf) and [source code](https://svn.apache.org/repos/asf/activemq/trunk/activemq-kahadb-store/src/main/java/org/apache/activemq/util/LFUCache.java).   
2, For LRU, please refer [my own code](https://github.com/ppwatchic/JobHunting/blob/master/LRUCache.java) which features generic type and thread-safe. 

**Find the pattern and express it in code**  
**A**: Leetcode [counting bits](https://leetcode.com/problems/counting-bits/)  
This type of problem requires observation from the input and generate the output. 

## Thought Model 
1. Ask for clarification about the problem.   
For example, do I consider it as case-sensitive? or multiple spaces allowed in the input? or size of the input?   
2. Talk about the methodology that occupy this algorithms. like: DFS, BFS, backtracking, dynamicProgram, etc.

3. My thought process is:  
3.1 Mention the main process. (Base cases, main process, return value).   
3.2 Note down the skeleton of the progress before dipping into detail.  
3.3 Go into the actual process and write down the algorithms.  
At the same time, ask for clarification about the problem.  
For example, do I consider it as case-sensitive? or multiple spaces allowed in the input? or size of the input?   
3.5 Double-check the process once done.  
3.6 Ask if he has any question for the whole process.  

4 Go through one test cases step by step.   
4.1 Go and write down some test cases.   

### Others   
1. Keep talking.    


