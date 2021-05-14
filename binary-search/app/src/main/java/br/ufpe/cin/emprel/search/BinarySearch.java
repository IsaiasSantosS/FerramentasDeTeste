package br.ufpe.cin.emprel.search;

public class BinarySearch implements SearchAlgorithm {
    @Override
    public int search(int[] arr, int element) {
        int begin = 0;
        int end = arr.length - 1;
        int middle;
        while (begin <= end) {
            middle = (begin + end) / 2;
            if (arr[middle] < element) {
                begin = middle + 1;
            } else if (arr[middle] > element) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        //return -1;
        throw new ElementNotFoundException();
    }
}