# cannon_game

- Given: I am the user.
- When: I initialize the game.
- Then: I am asked for a user name once.
----

- Given: I have played the game before.
- When: I start the game.
- Then: I load the data from the storage file.

----

- Given: I am a user.
- When: I enter my name.
- Then: I get a welcome message.

- Given: I am a user.
- When: I enter the name Frank.
- Then: I get a message "Welcome Frank".


----
- Given: I am not a new user.
- When: I enter my username.
- Then: I see the leaderboard. 
- And:  I am asked if I would like to play the game again.

----

- Given: I started the game.
- When: I hit the target.
- Then: I save the data.

----

- Given: I start the game or I hit the target.
- When: I display the leaderboard. 
- Then: I see my name, best score, worst score, average score, and number of games played. 

----

- Given: I am playing the game.
- When: I finished the game.
- Then: I am asked whether I would like to play the game again or exit the game.

----

Given: I have a name Ramsha. 
And: The name Ramsha exist
When: I search for Ramsha.
Then: I get my name, my best score, my worst score, my average score, and number of times I played the game. 


Given: I am a user. 
And: I have completed the game with score of 4 and my previous best score was 6
When: I update the best score
Then: my new updated best score is 4. 


Given: I am a user
And: I have completed the game with score of 6 and my previous worst score was 4. 
When: I update the worst score.
Then: My new updated worst score is 6.


Given: I am a user
And: I have completed the game with score of 15 and my previous average was 10 over 4 games.
When: I update my average score. 
Then: The updated average is 11.


Given: I am a user.
And: I have played the game 5th time.
When: I update the number of games played.
Then: the updated number of games is 5. 


Given: I have name Frank 
And: The name Frank exist
When: I search for Frank 
Then: I get nothing back


----

Given: I have total number of games played 7.
When: I completed the game.
Then: I see my the total # of games displayed.





