public class StudentLinkedList {
    private StudentNode head;
    private int size;

    public StudentLinkedList() {
        head = null;
        size = 0;
    }

    public void addFirst(String name, String course, int credit, double grade, double cgpa) {
        StudentNode newNode = new StudentNode(name, course, credit, grade, cgpa);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(String name, String course, int credit, double grade, double cgpa) {
        StudentNode newNode = new StudentNode(name, course, credit, grade, cgpa);
        if (head == null) {
            head = newNode;
        } else {
            StudentNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void insertAt(int index, String name, String course, int credit, double grade, double cgpa) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index: " + index);
            return;
        }
        if (index == 0) {
            addFirst(name, course, credit, grade, cgpa);
            return;
        }
        StudentNode newNode = new StudentNode(name, course, credit, grade, cgpa);
        StudentNode current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
        size--;
    }


    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            StudentNode current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        size--;
    }

    public void deleteAt(int index) {
        if (index < 0 || index >= size || head == null) {
            System.out.println("Invalid index or empty list");
            return;
        }
        if (index == 0) {
            deleteFirst();
            return;
        }
        StudentNode current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        size--;
    }

    public int search(String name) {
        StudentNode current = head;
        int index = 0;
        while (current != null) {
            if (current.name.equalsIgnoreCase(name)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public void display() {
        StudentNode current = head;
        if (current == null) {
            System.out.println("List is empty!");
            return;
        }
        while (current != null) {
            System.out.println(current.name + " | CGPA: " + current.cgpa);
            current = current.next;
        }
    }

    public int getSize() {
        return size;
    }
}
