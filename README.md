# DSA Coding Patterns & Variants - A Problem Solving Playbook for Coding Interviews

This repository is my collection of **Data Structures & Algorithms (DSA) coding patterns, their variants, clarifying questions that help recognize the pattern, coding template to speed up implementation under time constraint and pressure, important test cases and edge cases that help accurate implementation**.

The goal is to develop the ability to look at an unfamiliar problem and ask:

**What pattern is this? Which variant applies? What invariant should I maintain?**

## The Approach

I am organizing problems as:

```text
Problem
   ↓
Pattern
   ↓
Variant
   ↓
Recognition Signals
   ↓
Template
   ↓
Representative Problems
```

For example, instead of treating every two-pointer problem as the same technique:

```text
Two Pointers
├── Opposite-End Pointers
├── Same-Direction Pointers
├── Fast & Slow Pointers
├── Three Pointers
├── Partitioning
├── Two Sorted Arrays
└── Backward Processing
```

The important question becomes:

> **How do I recognize which variant I need?**

---

# 📚 Coding Patterns

| Pattern                                         | Variants / Concepts                               | Status |
| ----------------------------------------------- | ------------------------------------------------- | ------ 
| [Two Pointers](./02-two-pointers)               | Opposite-end, fast/slow, 3 pointers, partitioning | 🚧     |
| [Sliding Window](./03-sliding-window)           | Fixed, variable, frequency-based                  | 🚧     |
| [Binary Search](./04-binary-search)             | Exact match, boundaries, feasibility              | 🚧     |
| [Intervals](./05-intervals)                     | Merge, heap, sweep line, scheduling               | 🚧     |
| [Stack](./06-stack)                             | Monotonic stack, expression problems              | 🚧     |
| [Heap](./07-heap)                               | Top-K, K-way merge, scheduling                    | 🚧     |
| [Trees](./09-trees)                             | DFS, BFS, recursion, tree DP                      | 🚧     |
| [Graphs](./10-graphs)                           | BFS, DFS, topological sort, shortest path         | 🚧     |
| [Backtracking](./11-backtracking)               | Subsets, permutations, combinations               | 🚧     |
| [Dynamic Programming](./12-dynamic-programming) | 1D, 2D, knapsack, string DP                       | 🚧     |


---

# 🔍 How to Use This Repository

For each pattern, the goal is to answer five questions:

### 1. What does the pattern solve?

Understand the type of problem the pattern is designed for.

### 2. What are its variants?

The same pattern can have very different implementations depending on the problem.

### 3. How do I recognize the variant?

Look for specific **problem signals, constraints, and wording**.

### 4. What problems reinforce the pattern?

Problems are included as examples of the underlying technique rather than as isolated solutions to memorize.

---

# 🧩 Example: Binary Search

Binary search is more than:

```text
while (left <= right)
```

It can appear as several different patterns:

```text
Binary Search
├── Exact Match
├── Lower Bound
├── Upper Bound
└── Binary Search on Answer
```

The important recognition question for **Binary Search on Answer** is:

> Can I write a function `isFeasible(x)` that tells me whether `x` is possible?

If yes, the problem may be transformed into a binary search over the answer space.

Examples include:

* Minimum capacity
* Minimum speed
* Minimum time
* Maximum possible minimum distance
* Minimize the maximum value

---

# 🧩 Example: Intervals

"Interval problem" does not automatically mean "merge intervals."

Depending on the question, different techniques may be appropriate:

```text
Intervals
├── Sort by Start
├── Sort by End
├── Merge Intervals
├── Heap
├── Sweep Line
└── Greedy Scheduling
```

---

# 🗺️ Pattern Recognition

One of the main goals of this repository is building a mental checklist for unfamiliar problems.

For example:

### Seeing a sorted array?

Ask:

```text
Can two pointers solve this?
Can I eliminate half the search space?
Do I need a boundary?
```

### Seeing intervals?

Ask:

```text
Do I need to merge?
Do I need the minimum number of resources?
Do I need to process start/end events?
Do I need greedy scheduling?
```

### Seeing "minimum possible" / "maximum possible"?

Ask:

```text
Can I define a feasibility function?

isFeasible(x) → true / false
```

If feasibility is monotonic, consider **binary search on the answer**.

---


# 🎯 Goals

This repository is a work in progress.

The long-term goal is to build a practical reference covering:

* Common DSA patterns
* Important pattern variants
* Recognition signals
* Reusable templates
* Common traps
* Representative interview problems
* Decision frameworks

Eventually, the repository should make it possible to go from:

> **"I've never seen this exact problem."**

to:

> **"I recognize the structure. This is a variant of X."**

---

## ⭐ If This Helps

If you find the pattern/variant approach useful for your own interview preparation, consider **starring the repository** and sharing it with someone preparing for coding interviews.

Contributions, corrections, and additional problem examples are welcome.

---

## 🚧 Work in Progress

This repository is continuously evolving as I study and refine these patterns.

New patterns, variants, examples, and recognition techniques will be added over time.

**Learn the pattern. Understand the variant. Derive the solution.**
