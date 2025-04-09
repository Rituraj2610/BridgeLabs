# Multithreading Problems

## 1. Print Numbers 1 to 5 Using Thread Class
**Task:** Create a class that extends `Thread` and prints numbers from 1 to 5 with a 1-second delay between each number.

**Hint:** Override the `run()` method and use `Thread.sleep(1000)` for the delay.

---

## 2. Runnable to Print Thread Name
**Task:** Create a class that implements `Runnable` and prints the current thread name. Start 3 threads using this runnable.

**Hint:** Use `Thread.currentThread().getName()` inside the `run()` method.

---

## 3. Synchronize Shared Counter
**Task:** Create two threads that access a shared counter. Synchronize access to avoid race conditions.

**Hint:** Use the `synchronized` keyword on the method that modifies the counter.

---

## 4. Simulate and Fix Deadlock
**Task:** Write code to simulate a deadlock scenario using two resources and two threads. Then fix it by changing the locking order.

**Hint:** Deadlock occurs when two threads hold one lock each and wait for the other's lock. Prevent it by acquiring locks in the same order.

---

## 5. Producer-Consumer Using wait() and notify()
**Task:** Simulate the producer-consumer problem using a shared buffer. Use `wait()` and `notify()` for synchronization.

**Hint:** Use synchronized blocks and proper checks to wait when the buffer is full/empty.

---

## 6. Parallel Processing with Fixed Thread Pool
**Task:** Use `Executors.newFixedThreadPool()` to run multiple tasks in parallel.

**Hint:** Submit `Runnable` or `Callable` tasks to the executor and manage shutdown using `shutdown()` or `awaitTermination()`.