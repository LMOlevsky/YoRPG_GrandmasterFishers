# YoRPG_GrandmasterFishers

Order of the Grandmaster Fishers:
Levee Olevsky, Areef Roktim, Youki Wu

Repository for Team Grandmaster Fishers

## Current Features 

* Stats (Offense, Defense, Hp)
* Attack Types (Normalize, Specialize)
* Character Types
  * Character
    * Healer
    * Mage
    * Warrior
    * Rogue
    * Archer
    * Monster

## Plans

* Change class heirarchy to such:
  * Character
    * Pc (playable charcters) +abstract
      * Healer 	   // We need to balance these characters
      * Mage	   // Change their hp, strength, etc. to both fit the role
      * Warrior	   // and not be over/under-powered
      * Rogue
      * Archer
    * Npc (non-playable charcters) +abstract
      * Monster
      * Merchant
  * Item


---


* Gameplay
  * Show your stats (hp/defense/offense) after each move
  * Show enemy hp


---


* Class Character
  * Add level and xp (experience) attributes. Stats (strength, defense, offense) correspond to level.

* Class Pc 
  * Increase level by collecting xp
  * Let player choose between different kinds of attacks including using potions
  * Give class Pc inventory:
    * Create class: Item
    * Instantiate Item array in Pc to hold different Item objects

* Class: Item +abstract. Attributes:
  * Type (Healing/Mana/Strength)
  * Quantity

* Class Merchant: Sells Pc potions for gold

* Class Monster
  * Drop gold and experience with amount corresponding to level
  * Class Pc can collect dropped gold to buy things and xp to level up

* Figure out priorities

## Priorities

1. Finish this list...
