public class IntegerSet {
    private ArrayList<Integer> set;

    public IntegerSet() {
        this.set = new ArrayList<>();
    }

    public void add(int item) {
        if (!this.set.contains(item)) {
            this.set.add(item);
        }
    }

    public void remove(int item) {
        this.set.remove(Integer.valueOf(item));
    }

    public boolean contains(int item) {
        return this.set.contains(item);
    }

    public int largest() throws Exception {
        if (this.set.isEmpty()) {
            throw new Exception("Set is empty.");
        }
        return Collections.max(this.set);
    }

    public int smallest() throws Exception {
        if (this.set.isEmpty()) {
            throw new Exception("Set is empty.");
        }
        return Collections.min(this.set);
    }

    public IntegerSet union(IntegerSet otherSet) {
        IntegerSet result = new IntegerSet();
        result.set.addAll(this.set);
        for (int item : otherSet.set) {
            result.add(item);
        }
        return result;
    }

    public IntegerSet intersect(IntegerSet otherSet) {
        IntegerSet result = new IntegerSet();
        for (int item : this.set) {
            if (otherSet.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }

    public IntegerSet diff(IntegerSet otherSet) {
        IntegerSet result = new IntegerSet();
        for (int item : this.set) {
            if (!otherSet.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }

    public IntegerSet complement(IntegerSet universeSet) {
        return universeSet.diff(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IntegerSet)) return false;
        IntegerSet that = (IntegerSet) o;
        return this.set.containsAll(that.set) && that.set.containsAll(this.set);
    }

    @Override
    public String toString() {
        return "IntegerSet{" + "set=" +