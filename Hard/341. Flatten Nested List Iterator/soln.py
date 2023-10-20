class NestedIterator:
    def __init__(self, nestedList):
        self.flatList = []
        self.current = 0
        self.flatten(nestedList)

    def next(self):
        result = self.flatList[self.current]
        self.current += 1
        return result

    def hasNext(self):
        return self.current < len(self.flatList)

    def flatten(self, nestedList):
        for item in nestedList:
            if item.isInteger():
                self.flatList.append(item.getInteger())
            else:
                self.flatten(item.getList())