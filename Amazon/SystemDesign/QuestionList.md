## ATM Machine
1. Time: Dec 20, 2016
2. Request: Design an ATM machine system.   
3. [Answer](https://www.careercup.com/question?id=5747801813155840). 

## Generate IDs Senior SDE
1. Oct 18 2016
2. Design a service to generate unique 64bit IDs. 
3. [Discussion](https://www.careercup.com/question?id=5700380391374848). 

## Fraud credit card SDE2
1. Oct 14 2016
2. Given that an external service gives a list of credit cards that have become fraud, design a fraud management system for 
a shopping website for bookings with fraud credit cards.  
3. [Discussion](https://www.careercup.com/question?id=6217926366461952) 

## Cameras 
1. July 31 2016
2. 10,000 cameras, 100 hours of vidio each. 30fps. Police need to input a plate number and find the path of a suspicious vehicle. 
(Estimate the size of the video, e.g. blueray disc is 2 hours and 20 GB. No need to scan all of the videos. Estimate the time 
that a vehicle can be seen between 2 traffic cameras, e.g., 0.3 miles and 30 miles per hour, then select 1 out of 100). 
Web client, load balancer, servers, db. 
3. [discussion](https://www.careercup.com/question?id=5651635687653376). 
Assuming each camera captures 640 x 480 p video & all data stored in a raw format, its easy to do calculation that 
per camera storage requirement is around 10 GB of data per hour. The given spec matches. So we are good. 

30 miles per hour of speed == 0.5 miles per sec. Since cameras are placed at 0.3 mile, a moving vehicle will 
always be captured every sec by a new camera.

Db Design - Either cameras are doing OCR to figure out numbers at camera level, or the video is being stored on a 
central server where OCR is being done. For every frame, if a vehicle is identified, the number plate, timestamp & camera id 
is stored. I will index the DB on number plate. So for a given number, 
query can be done such that all rows with the number plate can be fetched ordered by timestamp. 
This way, the path of the number plate can be easily traced.

## Autocomplete feature on Kindle Senior SDE
1. July 13 2015 UK
2.1 Design the (content) search autocomplete feature on Kindle. 
2.2 Given a dependency list of libraries (where an item is: library X depends on library Y) generates a list
describing the order in which libraries should be loaded.   
Additional Request: detect circular dependencies. 
3.1 [Discussion](https://www.careercup.com/question?id=5695181485506560) 
3.2 [Discussion](https://www.careercup.com/question?id=5134681810927616)  

## Hops between you and another person in LinkedIn SE
1. July 13 2015 UK
2. How would you design the feature in LinkedIn where it computes how many hops there are between you and another person? 
3. [Discussion](https://www.careercup.com/question?id=5174144037552128) 
4. BFS or bidirectional bfs


## Architect a world-wide video distribution system
1. July 13 2015 UK


## Concurrency problem
1. April 22 2015 US
2. We've 1 book left in the inventory. and two people are trying to get the same book (say person x and person y). Person X has
added book to the cart and about to make payment and person y has also added book to the cart. 
How would you solve this concurrency problem? 
3. [Discussion](https://www.careercup.com/question?id=5696069105090560) 

## Design a TinyURL like Service. 

## Write program for a Dictionary which has functionality of lookup and insert
1. Feb 5 2014 US
2. Write program for a Dictionary which has functionality of lookup and insert. The program should be able to add words on the fly. 











## References
1. [Career Cup](https://www.careercup.com/page?pid=system-design-interview-questions). 
2. [Github](https://github.com/checkcheckzz/system-design-interview) 
3. [Desing a shorten URL](https://www.hiredintech.com/system-design/the-system-design-process/) 
