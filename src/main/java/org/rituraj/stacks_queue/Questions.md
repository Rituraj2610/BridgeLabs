# Stack and Queue Problems

## 1. Implement a Queue Using Stacks
**Problem:** Design a queue using two stacks such that enqueue and dequeue operations are performed efficiently.

**Hint:** Use one stack for enqueue and another stack for dequeue. Transfer elements between stacks as needed.

---

## 2. Sort a Stack Using Recursion
**Problem:** Given a stack, sort its elements in ascending order using recursion.

**Hint:** Pop elements recursively, sort the remaining stack, and insert the popped element back at the correct position.

---

## 3. Stock Span Problem
**Problem:** For each day in a stock price array, calculate the span (number of consecutive days the price was less than or equal to the current day's price).

**Hint:** Use a stack to keep track of indices of prices in descending order.

---

## 4. Sliding Window Maximum
**Problem:** Given an array and a window size `k`, find the maximum element in each sliding window of size `k`.

**Hint:** Use a deque (double-ended queue) to maintain indices of useful elements in each window.

---

## 5. Circular Tour Problem
**Problem:** Given a set of petrol pumps with petrol and distance to the next pump, determine the starting point for completing a circular tour.

**Hint:** Use a queue to simulate the tour, keeping track of surplus petrol at each pump.

