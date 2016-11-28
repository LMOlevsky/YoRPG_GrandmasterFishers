# YoRPG_GrandmasterFishers

Order of the Grandmaster Fishers:
Levee Olevsky, Areef Roktim, Youki Wu

# How to Play

## Setup
When you run the game, the game will ask you for a number between 1 and 3, 1 being the easiest mode and 3 being the hardest mode. Choose your difficulty and then hit enter. The game will then ask you to enter your desired name and role. To choose a role, enter the name of the role (example: "Warrior"). To get information about a role, put the word About before the role (example: "About Warrior").

## The Game
### Inventory
When you encounter a monster, the game will display your health and gold, and the monster's health. The game will show you your inventory and give you the opportunity to use an item from it by entering a number from 0 to 9, or to not use an item by entering -1.

### Special and Normal attacks
The game will then prompt you if you feel lucky. Here you can enter either 1 or 2.
If you enter 1, you will do a normal attack. If you enter 2, you will do a special attack. The special attack will cause you to do more damage, but when hit, you will take more damage.

### Monster Drops
Monsters drop a random amount of money. They also drop experience based on your level. Money can be used to buy potions later on. Your level is increased by slaying monsters. What powerful abilities would you unlock by increasing your level? Uhh nothing sorry.

### Buying Items
After slaying a monster, you are given the choice to buy something. Enter yes to buy something.
The only item in the game is a health potion, which costs $50. Enter yes to buy it and it will be placed in the first empty inventory slot.

# New Features
The player now has an inventory from which they can choose to use items.
Added class Item and class Potion extends Item.
Monsters also drop gold and xp when slayed.
Players can use the gold to buy a potion in a shop after slaying a monster.
Player hp and gold is shown after each attack. The monster's hp is also shown.

# Code Restructurings
We moved all playable classes to be subclasses of class Pc (Playable character). Class Pc is an abstract subclass of class Character.
