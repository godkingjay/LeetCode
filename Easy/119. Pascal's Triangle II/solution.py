class Solution(object):
    def getRow(self, rowIndex):

        pascal_triangle = [[] for _ in range(rowIndex + 1)]

        pascal_triangle[0].append(1)
        

        for current_row in range(1, rowIndex + 1):
    
            pascal_triangle[current_row].append(1)
            
            for j in range(1, len(pascal_triangle[current_row - 1])):
                sum_val = pascal_triangle[current_row - 1][j] + pascal_triangle[current_row - 1][j - 1]
                pascal_triangle[current_row].append(sum_val)

            pascal_triangle[current_row].append(1)
        
        return pascal_triangle[rowIndex]