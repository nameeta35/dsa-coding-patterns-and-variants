## First Think: How Should I Sort?

When you see **overlapping intervals**, your first instinct should be:

> **Can I sort by start time and process the intervals from left to right?**

For many interval problems, sorting by start lets you reason about the current interval relative to the previous one.

```text
[1, 3]
   [2, 6]
      [5, 8]
```
Sort by start → scan left to right → detect overlap → merge/process

## Pattern 1. Merge Overlapping Intervals
**Pattern:** Sort by start → scan → merge.

```text
Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

List<int[]> result = new ArrayList<>();
int[] curr = intervals[0];

for (int i = 1; i < intervals.length; i++) {
    if (intervals[i][0] <= curr[1]) {
        curr[1] = Math.max(curr[1], intervals[i][1]);
    } else {
        result.add(curr);
        curr = intervals[i];
    }
}

result.add(curr);


```

## Pattern 2. Insert Interval
**Pattern:**
1. intervals completely BEFORE new interval
2. intervals OVERLAPPING new interval
3. intervals completely AFTER new interval

```text

// Before
while (i < n && intervals[i][1] < newInterval[0]) {
    result.add(intervals[i]);
    i++;
}

// Overlap
while (i < n && intervals[i][0] <= newInterval[1]) {
    newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
    newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
    i++;
}

result.add(newInterval);

// After
while (i < n) {
    result.add(intervals[i]);
    i++;
}