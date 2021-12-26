package com.cursor;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        {
            // task 1 b
            System.out.print("\n task 1: Заповнити масив тільки парними числами\n");
            int[] arr1 = new int[5];
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = 2 * i;
                System.out.println(arr1[i]);
            }
        }
        {
            // task 2
            System.out.print("\n task 2: Заповнити масив рандомними числами\n");
            Random random = new Random();
            int Array[] = new int[5];
            for (int j = 0; j < Array.length; j++) {
                Array[j] = random.nextInt();
                System.out.println(Array[j]);
            }
            {
                // task 3
                System.out.print("\n task 3: Вивести середнє значення масиву\n");
                int num[] = {-51, -9, 1, 18, 107, -19, 25, 4};
                double sum = 0;
                for (int x : num)
                    sum += x;
                System.out.println("середнє значення: " + sum / num.length);
            }
            {
                // task 4
                System.out.print("\n task 4: Вивести суму всіх значень кратних 3\n");
                int summ = 0;
                for (int i = 0; i < 15; i++)
                    if (i % 3 == 0) summ += i;
                System.out.println("Cума всіх значень кратних 3: " + summ);
            }
            {
                // task 5
                System.out.print("\n task 5: Вивести значення всіх парних індексів масиву\n");
                //int[] arr2 = new int[10];
                int[] arr2 = new int[]{52, 45, 32, 7, 64, 12, 87, 78, 98, 23};
                for (int i = 0; i < arr2.length; i++) {
                    if (i % 2 == 0) {
                        //arr2[i] = i;
                        System.out.println(arr2[i]);
                    }
                }
                {
                    // task 6
                    System.out.print("\n task 6: Просортувати масив в порядку зростання\n");
                    int[] arr = new int[]{52, 45, 32, 7, 64, 12, 87, 78, 98, 23};
//                    Arrays.sort(arr);
                    for (int i = 0; i < arr.length - 1; i++) {
                        for (int j = 0; j < arr.length - i - 1; j++) {
                            if (arr[j] > arr[j + 1]) {
                                int t = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = t;
                            }
                        }
                    }
                    System.out.println(Arrays.toString(arr));
                }
                {
                    // task 7
                    System.out.print("\n task 7: Вивести найменше значення в масиві\n");
                    int[] nums = new int[]{52, 45, 32, 7, 64, 12, 87, 78, 98, 23};
                    int min = nums[0];
                    for (int num : nums) {
                        if (num < min) {
                            min = num;
                        }
                    }
                    System.out.println("Min: " + min);
                    {
                        // task 8
                        System.out.print("\n task 8: Вивести найбільше значення масиву\n");
                        int[] nums1 = new int[]{52, 45, 32, 7, 64, 12, 87, 78, 98, 23};
                        int max = nums[0];
                        for (int num : nums) {
                            if (num > max) {
                                max = num;
                            }
                        }
                        System.out.println("Max: " + max);
                        {
                            // task 9
                            System.out.print("\n task 9: Вивести суму значень всіх парних індексів\n");
                            int[] array = new int[]{52, 45, 32, 7, 64, 12, 87, 78, 98, 23};
                            int sum_parn = 0;
                            for (int i = 0; i < array.length; i++) {
                                if (i % 2 == 0) {
                                    sum_parn += array[i];
                                }
                            }
                            System.out.println("Сума значень всіх парних індексів: " + sum_parn);
                        }
                        {
                            // task 10
                            System.out.print("\n task 10: Вивести перших 20 символів з таблиці ASCI \n");
                            for (char i = 32; i < 52; i++) {
                                System.out.print((char) i + " ");
                            }
                            System.out.println();
                            {
                                // task *
                                System.out.print("\n task *: Заповнити масив рандомними числами, вивести їх, потім поміняти місцями парні з непарними \n");
                                int[] arr = new int[4];
                                for (int i = 0; i < arr.length; i++) {
                                    arr[i] = random.nextInt();
                                }
                                System.out.println(Arrays.toString(arr));
                                for (int i = 0; i < arr.length; i += 2) {

                                    int t = arr[i];
                                    arr[i] = arr[i + 1];
                                    arr[i + 1] = t;
                                }
                                System.out.println(Arrays.toString(arr));

                            }
                        }
                    }
                }
            }
        }
    }
}

//        * (завдання з зірочкою)
//        Заповнити масив рандомними числами, вивести їх, потім поміняти місцями парні з непарними