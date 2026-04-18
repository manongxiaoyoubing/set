abstract  class set {
    public int size;
    public int max_size;
    public Object []arr;

    abstract void add(Object obj);
    abstract void remove (Object obj);
    abstract Boolean contain(set obj);
    abstract Boolean equals(set obj);
    abstract int size();
    abstract Boolean isEmpty();




}
