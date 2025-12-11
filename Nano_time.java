public class Nano_time {
    public static void main(String[] args) {

        StudentLinkedList bigList = new StudentLinkedList();

        System.out.println("---- LOADING STUDENTS ----");

        long start = System.nanoTime();
        FileReaderUtil.readCSV("largedata.csv", bigList);
        long end = System.nanoTime();

        System.out.println("Load time: " + (end - start) + " ns");
        System.out.println("Total students loaded: " + bigList.getSize());

        System.out.println("\n---- SEARCH TEST ----");

        start = System.nanoTime();
        bigList.search("John Doe");
        end = System.nanoTime();

        System.out.println("Search time: " + (end - start) + " ns");

        System.out.println("\n---- DELETE LAST TEST ----");

        start = System.nanoTime();
        bigList.deleteLast();
        end = System.nanoTime();

        System.out.println("Delete last time: " + (end - start) + " ns");
    }
}