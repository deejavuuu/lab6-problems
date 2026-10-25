package problem4;

import java.util.*;

/**
 * Performance Analysis:
 *
 * 1. Random Insertions/Deletions (in the middle):
 *    - ArrayList locates the target index in O(1) time and shifts subsequent elements using System.arraycopy.
 *      Because of CPU cache locality and hardware-accelerated memory block copies, this is relatively fast.
 *    - LinkedList must traverse node-by-node from the head or tail to reach the specified index (O(n) traversal).
 *      Frequent pointer dereferencing and cache misses make LinkedList significantly slower than ArrayList
 *      for insertions/deletions at arbitrary indices.
 *
 * 2. Sequential Insertions/Deletions at Beginning and End:
 *    - LinkedList has direct access  to its first and last nodes (head and tail).
 *      addFirst(), addLast(), removeFirst(), and removeLast() update elements in O(1) time because of direct access.
 *    - ArrayList can append/remove at the end in O(1) time, but add(0, element) and remove(0)
 *      at the beginning require shifting all N existing elements (O(n) time).
 *      Therefore, LinkedList is better than ArrayList when modifying the beginning of the list.
 *
 * 3. Random Access (get(index)):
 *    - ArrayList provides direct memory access via array indexing elementData[index] in O(1) time.
 *    - LinkedList must traverse pointers sequentially from the closest end to reach the index in O(n) time.
 *      As such, ArrayList is faster than LinkedList for random access.
 */
public class ListPerformanceComparison {

    private static final int SIZE = 100_000;
    private static final int OPERATIONS = 10_000;

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("---- Performance Comparison ----");

        System.out.println("---- Populate both lists ----");
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        testRandomInsertDelete(arrayList, "ArrayList");
        testRandomInsertDelete(linkedList, "LinkedList");

        testSequentialInsertDelete(arrayList, "ArrayList");
        testSequentialInsertDelete(linkedList, "LinkedList");

        testRandomAccess(arrayList, "ArrayList");
        testRandomAccess(linkedList, "LinkedList");
    }


    private static void testRandomInsertDelete(List<Integer> list, String name) {
        Random random = new Random();
        long start = System.nanoTime();

        for (int i = 0; i < OPERATIONS; i++) {
            int index = random.nextInt(list.size());
            list.add(index, i);
            index = random.nextInt(list.size());
            list.remove(index);
        }

        long end = System.nanoTime();
        System.out.printf("%s - Random insert/delete: %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }


    private static void testSequentialInsertDelete(List<Integer> list, String name) {
        long start = System.nanoTime();

        if (list instanceof LinkedList) {
            LinkedList<Integer> linkedList = (LinkedList<Integer>) list;
            for (int i = 0; i < OPERATIONS; i++) {
                linkedList.addFirst(i);
                linkedList.addLast(i);
            }
        } else {
            for (int i = 0; i < OPERATIONS; i++) {
                list.add(0, i);
                list.add(i);
            }
        }

        if (list instanceof LinkedList) {
            LinkedList<Integer> linkedList = (LinkedList<Integer>) list;
            for (int i = 0; i < OPERATIONS; i++) {
                linkedList.removeFirst();
                linkedList.removeLast();
            }
        } else {
            for (int i = 0; i < OPERATIONS; i++) {
                list.remove(0);
                list.remove(list.size() - 1);
            }
        }

        long end = System.nanoTime();
        System.out.printf("%s - Sequential insert/delete (start/end): %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }


    private static void testRandomAccess(List<Integer> list, String name) {
        Random random = new Random();
        long start = System.nanoTime();

        long sum = 0;

        for (int i = 0; i < OPERATIONS; i++) {
            sum += list.get(random.nextInt(list.size()));
        }

        long end = System.nanoTime();
        System.out.printf("%s - Random access (get): %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }
}

