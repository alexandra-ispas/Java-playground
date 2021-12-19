package challenge2;

/**
 * three rods (A, B, and C) and n disks.
 * Initially, all the disks are
 * placed in ascending order on a single rod (the largest disk is on the bottom (disk n), a
 * smaller one sitting on it (n-1), and so on (n-2, n-3, ...) until the smallest disk is on the top
 * (disk 1). The aim is to move all the disks from this rod to another rod while respecting the
 * following rules:
 * • Only one disk can be moved at a time.
 * • A move means to slide the upper disk from one rod to another rod.
 * • A disk cannot be placed on top of a smaller disk.
 */
public class Hanoi {
    public static void TowerOfHanoi(int n, char origin, char target, char helper) {
        if(n <= 0) return;

        // move top n - 1 disks from origin to intermediate,
        // using target as an intermediate
        TowerOfHanoi ( n - 1, origin, helper, target );

        System.out.println ("Moving disk " + n + " from " + origin + " to " + target);

        // move top n - 1 disks from intermediate to target,
        // using origin as an intermediate
        TowerOfHanoi ( n - 1, helper, target, origin );
    }
}
