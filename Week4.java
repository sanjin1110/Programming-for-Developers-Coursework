
public class Week4 {
    // function to sort an arr
    private static void sortArr(int arr[]) {
        // looping through the elements of the arr provided in the parameter
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            int a = arr[i];

            // comparing the current element with the previous element
            while ((j > 0) && (arr[j - 1] > a)) {
                arr[j] = arr[j - 1]; // swapping the current element with the previous element
                j--; // decrement j
            }
            arr[j] = a; // assigning the current element to the index where the previous element was
            // swapped
        }
    }

    public static void findTotalContainers(int arr[]) {
        // sorting the arr
        sortArr(arr);

        int previousVal = 0; // storing element before the current element
        int CurrentVilContainer = 0; // number of containers used for the current village
        int totalContainer = 0; // variable to store total number of containers

        // looping through the elements of the sorted arr
        for (int i = 0; i < arr.length; i++) {
            // execute if statement if the current element is not same as the previous
            // element
            if (arr[i] != previousVal) {
                previousVal = arr[i];
                CurrentVilContainer += 1;
                totalContainer += CurrentVilContainer;
            }
            // execute else statement if the curret element is same as the previous element
            else {
                previousVal = arr[i];
                totalContainer += CurrentVilContainer;
            }
        }

        System.out.println(totalContainer);
    }

    public static void main(String[] args) {
        // initializing an array
        int array[] = { 5, 2, 4,4,6 };

        // calling the function to find total number of containers
        findTotalContainers(array);
    }
}

