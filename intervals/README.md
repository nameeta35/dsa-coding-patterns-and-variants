## Important clarifying questions
Are the intervals already sorted?

Can intervals have the same start/end? e.g. [1,3], [1,5]

What does overlap mean?

What should I return if the requirement is impossible?

If n <= 100 consider O(n^2) complexity solution

If n is between 1000 to  10^5 priortize O(NlogN) solution 

Clarify if input is closed intervals or half-open intervals

## Pattern Recognition Flowchart 

```text
                    INTERVALS
                        |
          +-------------+-------------+
          |             |             |
       OVERLAP        SELECT        COVER
          |             |             |
     +----+----+        |         Furthest
     |         |        |           reach
   merge    count       |
     |         |     earliest
     |         |        END
     |      heap/
     |      sweep
     |
 sort by START

MERGE
→ sort by START

SCHEDULE / SELECT
→ sort by END

COUNT CONCURRENT
→ heap / sweep line

INTERSECTION
→ two pointers

COVER RANGE
→ greedy + furthest END




