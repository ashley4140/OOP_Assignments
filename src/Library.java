public class Library {
    public static void main(String[] args) {
        Book bk1 = new Book();
        Book bk2 = new Book("Ask and the Answer","14713564", 567,5.99f);
        System.out.println(bk1.toString());
        System.out.println(bk2.toString());
    }
}
