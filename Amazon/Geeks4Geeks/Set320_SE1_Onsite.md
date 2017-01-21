## First Round 
Two colors are given(yellow, blue), we have to color such that no consecutive blue color is painted
Given the arrival and departure time of various trains in a station. Calculate the minimum number of platforms required such that no train has to wait for another train to vacate the platform.
The question basically means calculate the maximum number of trains that would be present in the platform at any given time.

**Answer**
sort the arrival time and sort the departure time, keep a count initialized to 0. compare the first element of the arrival time with the first of departure, increase the value of count if the value at current Index at arrival is less than the value index at departure and increment the arrival index, and vice versa. Keep the maximum count that you see.

## Second Round 
Implement stack using queue  
http://www.geeksforgeeks.org/implement-a-stack-using-single-queue/  
Reverse linked list form n occurence ————–not so good
http://www.geeksforgeeks.org/reverse-a-list-in-groups-of-given-size/ 1->2->3->4->5->6->7->8  
if k=3;  
3->2->1->6->5->4  

## Third Round  

Design elevator in OO perspective.   
How class is loading in JVM:- Discussed about eden, perm space. using graph and BSF & DFS.   
Clone the binary tree.   
