/*
2. Написать программу, удаляющую из целочисленного массива A размерности N элементы, равные
целому числу X. В результате должен получиться массив не большей размерности. На экран должны
выводиться как оригинальное состояние массива, так и итоговое.
*/
import java.util.Scanner;
public class lab4 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int arraySize = 0;

		System.out.print("Enter the length of the array: ");
		while (!in.hasNext("quit")) {
            if (in.hasNextInt()) {
                arraySize = in.nextInt();
                break;
            } else {
                System.out.println("Error type!");
                in.next();
            }
		}
		int[] array = new int[arraySize];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter the " + i + " element: ");
			array[i] = in.nextInt();
		}

		//Вывод оригинального состояния:
	    for (int i = 0;i<array.length; i++) {
		     System.out.print(array[i] + " ");
		}
        System.out.println();

		int x;
		System.out.print("Enter the element to be removed from the array: ");
		x = in.nextInt();
		//Вывод итогового состояния:
		for (int i = 0;i<array.length; i++) {
		    if (array[i] != x) {
		        System.out.print(array[i] + " ");
		    }
		}



		in.close();
	}
}
