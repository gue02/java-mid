package collection.list;

public class BatchProcesserMain {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        BatchProcesser processer = new BatchProcesser(list);
        processer.logic(50_000);
    }
}
