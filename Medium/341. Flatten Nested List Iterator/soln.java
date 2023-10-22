import java.util.*;

public class NestedIterator {
    private List<Integer> flatList;
    private int current;

    public NestedIterator(List<NestedInteger> nestedList) {
        flatList = new ArrayList<>();
        current = 0;
        flatten(nestedList);
    }

    public int next() {
        int result = flatList.get(current);
        current++;
        return result;
    }

    public boolean hasNext() {
        return current < flatList.size();
    }

    private void flatten(List<NestedInteger> nestedList) {
        for (NestedInteger item : nestedList) {
            if (item.isInteger()) {
                flatList.add(item.getInteger());
            } else {
                flatten(item.getList());
            }
        }
    }
}
