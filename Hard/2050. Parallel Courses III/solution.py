class Solution(object):
    def minimumTime(self, n, relations, time):
        graph = [[] for _ in range(n)]

        for prev, next in relations:
            graph[prev - 1].append(next - 1)

        memo = [-1] * n

        def calculateTime(course):
            if memo[course] != -1:
                return memo[course]

            if not graph[course]:
                memo[course] = time[course]
                return memo[course]

            max_prerequisite_time = 0
            for prereq in graph[course]:
                max_prerequisite_time = max(max_prerequisite_time, calculateTime(prereq))

            memo[course] = max_prerequisite_time + time[course]
            return memo[course]

        overall_min_time = 0
        for course in range(n):
            overall_min_time = max(overall_min_time, calculateTime(course))

        return overall_min_time
        