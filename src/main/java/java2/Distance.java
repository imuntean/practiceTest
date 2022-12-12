package java2;

import java.util.Vector;

public class Distance {

    static int findMinDistance(int arr[]) {

        int min_dist = Integer.MAX_VALUE;
        int index = 0;
        // calculate minimum difference between any two consecutive indexes
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i + 1; j <= arr.length -1; j++) {
                if (min_dist > (arr[i] - arr[j])) {
                    min_dist = arr[i] - arr[j];
                    index = i;
                }
            }

            return index;
        }
        return index;
    }

        public static void main (String args[]){
            int arr[] = {4, 8, 6, 1, 2, 9, 4};
            int size = arr.length;
            System.out.println(findMinDistance(arr));
        }
    }

