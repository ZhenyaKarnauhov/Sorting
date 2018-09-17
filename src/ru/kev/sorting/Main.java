package ru.kev.sorting;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        int[] arr = {6, 6, 6, 6, 6, 6, 6, 666666, 6, 6, 6, 6, 6, 643, 543, 5, 34, 5, 34};

        int l = arr.length;
        int max = 0;
        int[] array = new int[l];
        for (int i = 0; i < l; i++) {
            array[i] = (array[i] > 0) ? array[i] : 0;
            for (int j = 0; j < l; j++) {
                if (arr[j] == arr[i]) {
                    array[i]++;
                    if (max < array[i]) max = array[i];
                }
            }
        }

        for (int m = max; m > 0; m--) {
            for (int i = 0; i < l; i++) {
                if (array[i] == m) {
                    System.out.println(arr[i] + " -> " + m);
                        if (m > 1) break;
                    }
                }
            }
        }
    }




//        try (
//                BufferedReader reader = new BufferedReader(new FileReader("src\\ru\\kev\\sorting\\input.txt"));
//                BufferedWriter writer = new BufferedWriter(new FileWriter("src\\ru\\kev\\sorting\\output.txt", false))) {
//
//            String string;
//
//            ArrayList<Integer> array = new ArrayList<>();
//            while ((string = reader.readLine()) != null) {
//                String[] split = string.split(" ");
//                for (int i = 0; i < split.length; i++) {
//                    array.add(Integer.parseInt(split[i]));
//                    writer.write(split[i]);
//                }
//            }
//            System.out.println(array);
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
//}