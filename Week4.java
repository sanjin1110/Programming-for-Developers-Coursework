public class Week4 {
    int arr[];
    Week4(int arr[]){
        this.arr=arr;
    }
    int containerRequired() {

        int count=0;
        for (int i = 0; i < arr.length; i++) {
            count++;
            count=count+i;
        }

        return count;
    }

    public static void main(String[] args) {
        int a[]=new int[]{5,2,6};
        Week4 obj = new Week4(a);
        System.out.println(obj.containerRequired());
    }
}
