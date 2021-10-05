# cannon_game

- Given: I am the user.
- When: I initialize the game.
- Then: I am asked for a user name once.
----

- Given: I never opened the game before.
- When: I start the game.
- Then: I create a storage file. 
----

- Given: I have played the game before.
- When: I start the game.
- Then: I load the data from the storage file.
----

- Given: I am a new user.
- When: I enter my name.
- Then: I get a new user's welcome message.
----

- Given: I am not a new user.
- When: I enter my username.
- Then: I see the leaderboard. 
- And:  I am asked if I would like to play the game.
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



