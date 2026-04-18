public class Text {
    public static void main(String[] args) {
        // 1. 初始化两个集合，最大容量设为 10
        SimpleSet setA = new Myset(10);
        SimpleSet setB = new Myset(10);
        SimpleSet setC = new Myset(10);

        System.out.println("测试 1: 添加元素与大小 ");
        setA.add("Apple");
        setA.add("Banana");
        setA.add("Orange");

        System.out.println("集合 A 的大小: " + setA.size());
        System.out.println("集合 A 是否为空: " + setA.isEmpty());

        System.out.println("\n--- 测试 2: 删除元素 ---");
        setA.remove("Banana");
        System.out.println("删除 Banana 后，A 的大小: " + setA.size());
        //删除不存在的元素
        setA.remove("kkkkk");

        System.out.println("\n--- 测试 3: 准备集合 B 和 C 用于比较 ---");

        setB.add("Apple");
        setB.add("Orange");
        setB.add("Apple");

        // 我们给 C 添加不同的元素
        setC.add("Apple");
        setC.add("Grape");

        System.out.println("\n--- 测试 4: 测试 contain (包含) ---");

        System.out.println("A 包含 B 吗? " + setA.contain(setB));

        System.out.println("A 包含 C 吗? " + setA.contain(setC));

        System.out.println("\n--- 测试 5: 测试 equals (相等) ---");
        System.out.println("A 等于 B 吗? " + setA.equals(setB));
        System.out.println("A 等于 C 吗? " + setA.equals(setC));

        System.out.println("\n--- 测试 6: 测试集合满的情况 ---");
        SimpleSet setd = new Myset(1);
        setd.add(2);
        setd.add(8);
        setd.add(14);
        setd.add(90);



    }
}
