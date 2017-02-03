## Problem Description 
I was asked to design a meeting scheduler, just like in the Microsoft outlook calendar or the gmail calendar.    
 I proposed that I will create an array of 48 for each day. Every 30 min representing the array entry.     
  
## Thought Processes 
1. Walk through an example to collect use cases or constraints:  
 1.1 Let's assume I(the interviewee, now role change into the HR) am going to arrange a meeting 
 between You(the interviewer) and a candidate.  
 I am having the following information:   
 1) The time to begin and end the meeting.  
 2) Who to join the meeting.  
 3) A possible case: priority for this meeting.   
 Now Let me use the meeting scheduler:  
 1) What has been arranged? (indicates a method `printAllMeeting()`).   
 2) The above question is too broad, Let's make it easier:    
 What has been arranged in this meeting room?  (now indicates a method `printMeetingsInRoom(Room roomId)`.   
 3) Then I want to do my job: book the meeting room. (then `addMeeting(Meeting meeting, TimeSlot timeSlot)`.    
 4) In the future, I may want to cancel/alter the meeting. (then `cancel(Meeting meeting)`, or `change(Meeting meeting)`.  
2. Now comes to the meeting scheduler    
2.1 Meeting is a class.    
2.1.1 Meeting has a TimeSlot.   
2.1.2 Meeting has a MeetingRoom.   
2.1.3 Meeting has an organizer.   
2.2 TimeSlot is a class.   
2.3 MeetingRoom is a class.   
2.3.1 MeetingRoom has a list of TimeSlot.   
2.3.2 MeetingRoom has some other resources, likewhiteboard, video, capacity, etc.   
2.4 Organizer is a class.   
2.5 MeetingScheduler is a class.   
2.5.1 Fields required:  
2.5.1.1 MeetingRoom list.  
2.5.1.2 A HashMap: `Map<MeetingRoom, Meeting> meetings = new HashMap<>()`.   
2.5.2 Methods required:   
2.5.2.1 `public boolean addMeeting(Meeting meeting)`.   
2.5.2.2 `public boolean cancelMeeting(Meeting meeting)`.   
2.5.2.3 `public boolean changeMeeting(Meeting meeting)`.   
2.5.2.4 `public boolean viewMeetingSchedule(MeetingRoom room)`.   
2.5.2.5 `public Meeting searchMeeting(MeetingRoom room)`.   
2.5.2.6 `public Meeting searchMeeting(MeetingRoom room, TimeStamp ts)`.   
2.5.2.7 `public Map<MeetingRoo, TimeSlot> searchAvailable()`.  


 
 
 
 
 
 
 
 
 
