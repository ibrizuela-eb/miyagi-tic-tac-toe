# Tic-tac-toe

The famous tic-tac-toe game written in Kotlin language.

![tictactoe](https://user-images.githubusercontent.com/80478831/154754611-2bfd683f-cccc-466c-b42d-88ca3114128f.jpeg)

## Class diagram

```mermaid
classDiagram
    class Interface{
        +create_game()
        +execute_action()
        +penalize()
        +end_game()
    }

    class Game{
        +List~str~ : players
        +int : turn
        +str : board
    }

    class Player{
        +str : name
        +str : team
    }
    
    class Storage{
    }
    
    Interface .. Game
    Game .. Player
    Game .. Storage
```

## Project

This is the Miyagi Project.

A project created for the Mentorship program at Eventbrite.

## Authors✒️

⌨️[@ibrizuela-eb](https://github.com/ibrizuela-eb)