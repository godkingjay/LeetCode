class Solution:
    def validateBinaryTreeNodes(self, n, leftChild, rightChild):
        indegree = [0] * n  

        for i in range(n):
            if leftChild[i] != -1:
                indegree[leftChild[i]] += 1
            if rightChild[i] != -1:
                indegree[rightChild[i]] += 1
  
        root = None
        for i in range(n):
            if indegree[i] == 0:
                if root is None:
                    root = i
                else:
                    return False  
 
        if root is None:
            return False
        
        visited = [False] * n
        queue = deque([root])
        
        while queue:
            node = queue.popleft()
            if visited[node]:
                return False  
            visited[node] = True
            if leftChild[node] != -1:
                queue.append(leftChild[node])
            if rightChild[node] != -1:
                queue.append(rightChild[node])
                
        return sum(visited) == n  