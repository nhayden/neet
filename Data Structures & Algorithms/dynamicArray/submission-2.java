class DynamicArray {
    int[] arr;
    int capacity;
    int size;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0; // next idx to fill
    }

    public int get(int i) {
        return this.arr[i];
    }

    public void set(int i, int n) {
        this.arr[i] = n;
    }

    public void pushback(int n) {
        if (this.needResize()) {
            resize();
        }
        this.arr[this.size++] = n;
    }

    public int popback() {
        return this.arr[--this.size];
    }

    private boolean needResize() {
        return this.size == this.capacity;
    }

    private void resize() {
        this.capacity *= 2;
        int[] copy = new int[this.capacity];
        for (int i = 0; i < this.arr.length; i++) {
            copy[i] = this.arr[i];
        }
        this.arr = copy;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
