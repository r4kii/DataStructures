public class Runner {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(12);
        ll.insert (13);
        ll.insert (11);
        ll.insert (13);
//        ll.insertAtStart(32);
//        ll.insertAtStart(87);
//        ll.insertAtIndex(0,5);
        //ll.show();
       ll.delete(2);
        ll.show();
    }
}
