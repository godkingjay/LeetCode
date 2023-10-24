class RandomizedSet {
    //Declare class variables
    Map<Integer, Integer> map;
    List<Integer> list;
    Random random;

    //Constructor to initialize variables
    public RandomizedSet(){
        this.map = new HashMap<Integer, Integer>();
        this.list = new ArrayList<Integer>();
        this.random = new Random();
    } 

    public boolean insert(int val) {
        //Insert if map does not contain value then return true, else false
        if(!map.containsKey(val)){
            list.add(val);
            //put value to the end of the list
            map.put(val, list.size() - 1);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        //Remove if map contains value
        if(map.containsKey(val)){
            //Declare a variable index to hold the removed value 
            int index = map.remove(val);
            //Declare a variable lastValue to hold removed last value in the list
            int lastValue = list.remove(list.size() - 1);
            if(lastValue != val){
                list.set(index, lastValue);
                map.put(lastValue, index);
            }
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        //Get random value from the list
        int rand = random.nextInt(list.size());
        return list.get(rand);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */