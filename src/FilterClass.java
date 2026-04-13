public class FilterClass {

    static void main() {
        int[] numberArr = {1, 0, 3, 4, 0, 6, 7, -8};
        int[] evenResult = filterEven(numberArr);
        System.out.print("Четные числа: ");
        for (int element : evenResult) {
            System.out.print(element + ", ");
        }
        int[] multiplyResult = multiplyBy(numberArr, 2);
        System.out.println();
        System.out.print("Перемноженные числа: ");
        for (int element : multiplyResult) {
            System.out.print(element + ", ");
        }
        int[] withoutZero = removeZeros(numberArr);
        System.out.println();
        System.out.print("Без 0: ");
        for (int element : withoutZero) {
            System.out.print(element + ", ");
        }
    }


    public static int[] filterEven(int[] arr) {
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] != 0) {
                number++;
            }
        }
        int[] newArr = new int[number];
        int index = 0;
        for (int element : arr) {
            if (element % 2 == 0 && element != 0) {
                newArr[index] = element;
                index++;
            }
        }
        return newArr;
    }

    public static int[] multiplyBy(int[] arr, int factor) {
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                number++;
            }
        }

        int[] newArr = new int[number];
        int index = 0;
        for (int element : arr) {
            if (factor != 0 && element != 0) {
                newArr[index] = element * factor;
                index++;
            }
        }
        return newArr;
    }

    public static int[] removeZeros(int[] arr) {
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                number++;
            }
        }
        int[] newArr = new int[number];
        int index = 0;
        for (int element : arr) {
            if (element != 0) {
                newArr[index] = element;
                index++;
            }
        }
        return newArr;
    }
}

