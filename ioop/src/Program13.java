package src;
// Define a mixer class

import java.util.Scanner;

class Mixer {
    int arr[];

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int tempArr[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            tempArr[i] = sc.nextInt();
        }

        bubbleSort(tempArr, n);
        arr = removeDuplicates(tempArr, n);
    }

    private void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    private int[] removeDuplicates(int[] s_arr, int n) {
        int uq = 1;
        
        for (int i = 1; i < n; i++) {
            if (s_arr[i] != s_arr[i - 1]) {
                uq++;
            }
        }

        int[] uq_arr = new int[uq];
        uq_arr[0] = s_arr[0];
        int idx = 1;

        for (int i = 1; i < n; i++) {
            if (s_arr[i] != s_arr[i - 1]) {
                uq_arr[idx++] = s_arr[i];
            }
        }

        return uq_arr;
    }

    Mixer mix(Mixer A) {
        Mixer res = new Mixer();
        res.arr = mergeSortedArrays(this.arr, this.arr.length, A.arr, A.arr.length);
        return res;
    }

    private int[] mergeSortedArrays(int[] arr1, int n1, int[] arr2, int n2) {
        int merged[] = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            }
            else if (arr1[i] > arr2[j]) {
                merged[k++] = arr2[j++];
            }
            else {
                merged[k++] = arr1[i++];
                j++;
            }
        }

        while (i < n1) merged[k++] = arr1[i++];
        while (j < n2) merged[k++] = arr2[j++];

        int[] final_arr = new int[k];
        for (int x = 0; x < k; x++) {
            final_arr[x] = merged[x];
        }

        return final_arr;
    }

    void display() {
        System.out.print("Array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Program13 {
    public static void main(String[] args) {
        Mixer m1 = new Mixer();
        Mixer m2 = new Mixer();

        System.out.println("Enter elements for first array:");
        m1.accept();

        System.out.println("Enter elements for second array:");
        m2.accept();

        System.out.println("\nFirst Array:");
        m1.display();

        System.out.println("\nSecond Array:");
        m2.display();

        Mixer merged = m1.mix(m2);
        System.out.println("\nMerged Array:");
        merged.display();
    }
}
