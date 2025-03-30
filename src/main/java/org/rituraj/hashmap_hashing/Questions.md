# Hash Map & Hash Function Problems

## 1. Find All Subarrays with Zero Sum
**Problem:** Given an array, find all subarrays whose elements sum up to zero.

**Hint:** Use a hash map to store the cumulative sum and its frequency. If a sum repeats, a zero-sum subarray exists.

---

## 2. Check for a Pair with Given Sum in an Array
**Problem:** Given an array and a target sum, find if there exists a pair of elements whose sum is equal to the target.

**Hint:** Store visited numbers in a hash map and check if `target - current_number` exists in the map.

---

## 3. Longest Consecutive Sequence
**Problem:** Given an unsorted array, find the length of the longest consecutive elements sequence.

**Hint:** Use a hash map to store elements and check for consecutive elements efficiently.

---

## 4. Implement a Custom Hash Map
**Problem:** Design and implement a basic hash map class with operations for insertion, deletion, and retrieval.

**Hint:** Use an array of linked lists to handle collisions using separate chaining.

---

## 5. Two Sum Problem
**Problem:** Given an array and a target sum, find two indices such that their values add up to the target.

**Hint:** Use a hash map to store the index of each element as you iterate. Check if `target - current_element` exists in the map.
