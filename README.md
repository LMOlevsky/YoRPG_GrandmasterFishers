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
* Class Pc
  * Add level attribute. Stats (strength, defense, offense) correspond to level.
  * Give class Pc inventory:
    * Create class: Item
    * Instantiate Item array in Pc to hold different Item objects
      * Index 0 is Health Potions
      * Index 1 is Mana Potions
      * Index 2 is Strength Potions
      * etc.

* Class: Item +abstract. Attributes:
  * Type (Healing/Mana/Strength)
  * Quantity

* Class Merchant: Sells Pc potions for gold

* Class Monster
  * Add level attribute.
    * Stats (strength, defense, offense) correspond to level.
  * Drop gold with amount corresponding to level

* Figure out priorities

## Priorities

1. Finish this list...
