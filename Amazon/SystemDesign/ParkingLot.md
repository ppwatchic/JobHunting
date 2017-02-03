## Question Description
Design an OO parking lot. What classes and functions will it have.   
It should say, full, empty and also be able to find spot for Valet parking.   
The lot has 3 different types of parking: **regular**, **handicapped** and **compact**.   

## [Thought Process](http://stackoverflow.com/questions/764933/amazon-interview-question-design-an-oo-parking-lot) 
1. First, Let's think about the components that will appear in a parking zone: 
1.1 A parking zone has one/multiple parking lot;   Or a parking zone has a few floors.  
1.2 Each Parking lot has a few parking spaces.  
1.3 There is parking indicator which tells full/empty/or direction to parking lot.  
1.4 There are Parkers who park or unpark cars.   
1.5 Parkers can drive different cars: regular, handicapped, or compact.  
1.6 There is entrance(or more) to parking lots.  
1.7 **Valet** is a special Parker.   
1.8 Parkers will have tickets.   
1.9 We can go further to design an Operator. He/She should provide help for bill problem, direction problem, etc.  
2. Classes review
2.1 ParkingLot is a class.  
2.1.1 It **has a** member of ParkingSpace. We can have two arrays to keep track of ParkingSpace: empty or occupied.   
2.1.2 It **has a** member of Entrance.  
2.1.3 It **has a** member of ParkingLotSign.   
2.1.4 It **has a** counter to count the spaced that is occupied.  
2.1.5 It **has a** capacity indicator.  
2.1.6 It has a public method `findVacantSpaceNearestEntrance(CarType carType)`.  
2.2 ParkingSpace is a class. 
2.2.1 ParkingSpace has state indicator which is enum type: Empty or Occupied, which comes with a method `isEmpty()`. 
2.2.2 ParkingSpace has subclasses: HandicappedParkingSpace; RegularParkingSpace; CompactParkingSpace. 
2.3 Entrance is a class. 
2.3.1 Entrance **has a** bill system.  
2.3.2 Entrance **has a** bar to open or close the entrance.   
2.3.3 It has methods `entering()` or `exiting()`.  
2.4 ParkingLotSign is a class.   
2.4.1 It can display: Full, Empty, or Normal  
2.5 Parker is a class.   
2.5.1 It can call `park()` or `unpark()`. 
2.5.2 It **has a** member of `ParkingSpace`. 
2.6 Ticket is a class.  
2.6.1 Ticket has a timestamp.  
2.6.2 Ticket has a ParkingLot ID.  
2.6.3 Ticket has a ParkingSpace ID.    
2.7 Operator is a class.   
2.7.1 Manager can be a subclass of Operator.   


## Questions to considered
1. Does the indicator have to display prices? 
2. Do we need data analysis for parking lot usages? 
3. What if we think about scaling problem? 

## Procedures to answer the questions 
1. Walk through an example: suppose we want to park a car in the parking lot, what components will we have in touch with?  
2. Then scope the use case and constraints for the system.  
3. Then outline the classes in mind.  
Make points clear: class/subclass, class/interface, **is-a**, **has-a**. 
4. Add more detail in it: members, fields.   
