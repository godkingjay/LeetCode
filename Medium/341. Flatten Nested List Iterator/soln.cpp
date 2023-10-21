class NestedIterator {
public:
    NestedIterator(vector<NestedInteger> &nestedList) {
        flatten(nestedList);
        current = 0;
    }

    int next() {
        return flatList[current++];
    }

    bool hasNext() {
        return current < flatList.size();
    }

private:
    vector<int> flatList;
    int current;

    void flatten(const vector<NestedInteger>& nestedList) {
        for (const auto &item : nestedList) {
            if (item.isInteger()) {
                flatList.push_back(item.getInteger());
            } else {
                flatten(item.getList());
            }
        }
    }
};
