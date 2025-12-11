public class Main {
    public static void main(String[] args) {
        String datasetType = "small";  // Can be changed to Large in order to execute larger dataset

        StudentLinkedList list = new StudentLinkedList();

        if (datasetType.equals("small")) {
            System.out.println(" Running with SMALL dataset (students.csv) \n");
            FileReaderUtil.readCSV("students.csv", list);
        } else if (datasetType.equals("large")) {
            System.out.println("  Running with LARGE dataset (largedata.csv) \n");
            FileReaderUtil.readCSV("largedata.csv", list);
        } else {
            System.out.println("Invalid dataset type. Use 'small' or 'large'");
            return;
        } 

        System.out.println("Initial list size: " + list.getSize());
        System.out.println();

        System.out.println(" Testing Add Operations ");
        long start, end;
        
        start = System.nanoTime();
        list.addFirst("Bob Brown", "CS200", 3, 88.5, 3.50);
        end = System.nanoTime();
        System.out.println("addFirst() time: " + (end - start) + " ns");

        start = System.nanoTime();
        list.addLast("Alice Tan", "CS201", 4, 92.0, 3.80);
        end = System.nanoTime();
        System.out.println("addLast() time: " + (end - start) + " ns");
        
        start = System.nanoTime();
        list.insertAt(1, "Charlie Lim", "CS202", 3, 80.0, 3.20);
        end = System.nanoTime();
        System.out.println("insertAt(1) time: " + (end - start) + " ns");
        System.out.println("After adding 3 students, size: " + list.getSize());
        System.out.println();


        System.out.println(" Current List ");
        list.display();
        System.out.println();


        System.out.println(" Testing Delete Operations ");
        start = System.nanoTime();
        list.deleteFirst();
        end = System.nanoTime();
        System.out.println("deleteFirst() time: " + (end - start) + " ns");
        System.out.println("After deleteFirst(), size: " + list.getSize());

        start = System.nanoTime();
        list.deleteLast();
        end = System.nanoTime();
        System.out.println("deleteLast() time: " + (end - start) + " ns");
        System.out.println("After deleteLast(), size: " + list.getSize());

        start = System.nanoTime();
        list.deleteAt(0);
        end = System.nanoTime();
        System.out.println("deleteAt(0) () time: " + (end - start) + " ns");
        System.out.println("After deleteAt(0), size: " + list.getSize());
        System.out.println();
        


        System.out.println("--- Testing Search Operation ---");
        start = System.nanoTime();
        int index = list.search("Kumar");
        end = System.nanoTime();
        System.out.println("search() time: " + (end - start) + " ns");
        System.out.println("Search for student: " + (index >= 0 ? "Found at index " + index : "Not found"));
        System.out.println();

        System.out.println("Traversing dataset");
        System.out.println("Final list size: " + list.getSize());
    }

}
