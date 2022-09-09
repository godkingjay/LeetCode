# Problem #1996 ([The Number of Weak Characters in the Game](https://leetcode.com/problems/the-number-of-weak-characters-in-the-game/) | Array, Greedy, Monotonic Stack, Sorting, Stack)

You are playing a game that contains multiple characters, and each of the characters has **two** main properties: **attack** and **defense**. You are given a 2D integer array `properties` where `properties[i] = [attackᵢ, defenseⱼ]` represents the properties of the `iᵗʰ` character in the game.

A character is said to be **weak** if any other character has **both** attack and defense levels **strictly greater** than this character's attack and defense levels. More formally, a character `i` is said to be **weak** if there exists another character `j` where `attackⱼ > attackᵢ` and `defenseⱼ > defenseᵢ`.

*Return the number of **weak** characters.*
