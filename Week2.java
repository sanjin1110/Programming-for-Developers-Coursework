public class Week2 {

    int lenOfArr;
    int[] a;

    Week2(int lenOfArr, int[] a) {

        this.lenOfArr = lenOfArr;
        // this.a = a;
        int length = 0;
        int[] send = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            boolean push = false;
            for (int j = 0; j < a.length; j++) {
                if (i >= j) {
                    if (i == a.length - 1) {
                        push = true;
                        break;
                    }
                    continue;
                }

                if (a[i] == a[j]) {
                    push = false;
                    break;
                } else if (a[i] != a[j]) {
                    push = true;
                }
            }
            if (push) {
                send[length] = a[i];
                push = false;
                length++;
            }
        }

        int[] passReal = new int[length];

        for (int i = 0; i < length; i++) {
            passReal[i] = send[i];

        }

        this.a = passReal;

    }

    void findResult() {

        // Compilation of whole required functions or steps

        int[][] resultVal = primeFind(a);
        int[] primeVal = resultVal[0];
        int iteratePrime = resultVal[1][0];
        if (iteratePrime == lenOfArr) {

            for (int i = 0; i < iteratePrime; i++) {
                System.out.println(primeVal[i]);
            }
        } else {

            int[] extra = searchOther(primeVal, iteratePrime);
            // System.out.println(extra[0]);
            for (int i = 0; i < lenOfArr; i++) {
                if (i >= iteratePrime) {
                    int num = i - iteratePrime;
                    System.out.println(extra[num]);
                } else {
                    System.out.println(primeVal[i]);
                }

            }
        }

    }

    int[] searchOther(int[] primes, int primeItterator) {

        int[] extra = new int[lenOfArr];
        int extraIn = 0;
        boolean skip = false;
        for (int i = 0; i < a.length; i++) {
            for (int ext = 0; ext < primes.length; ext++) {
                if (a[i] == primes[ext]) {
                    skip = true;
                    break;
                }
            }
            if (skip) {
                skip = false;
                continue;
            }

            boolean push = true;

            for (int j = 0; j < primeItterator; j++) {

                if (primes[j] == 1) {
                    continue;
                } else {
                    // System.out.println(a[i]);
                    float checkval = (float) a[i] / (float) primes[j];
                    if (checkval == Math.floorDiv(a[i], primes[j])) {
                        push = false;
                    }
                }
            }

            if (push) {
                extra[extraIn] = a[i];
                extraIn++;
            }

        }

        return extra;

    }

    int[][] primeFind(int[] arr) {
        // Find out Prime numbers among element of given array arr

        int[] ourPrimeElements = new int[lenOfArr];
        int itePrime = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                continue;
            } else if (arr[i] == 1) {
                ourPrimeElements[itePrime] = 1;
                itePrime++;

            } else if (arr[i] == 2) {
                ourPrimeElements[itePrime] = 2;
                itePrime++;
            } else if (arr[i] == 3) {
                ourPrimeElements[itePrime] = 3;
                itePrime++;
            }

            else {

                boolean prime = true;
                // int element = Math.floorDiv(arr[i], 2);
                int divideLimit = Math.floorDiv(arr[i], 2);
                for (int j = 2; j <= divideLimit; j++) {

                    float check = (float) a[i] / j;


                    if (check == Math.floorDiv(a[i], j)) {

                        prime = false;

                    }
                }

                if (prime) {

                    ourPrimeElements[itePrime] = a[i];
                    itePrime++;
                }

            }

        }

        int[][] returner = { ourPrimeElements, { itePrime } };

        return returner;

    }

    public static void main(String[] args) {

        int[] input = { 10, 10, 5, 0, 2, 1, 2, 5 };

        Week2 sub = new Week2(3, input);
        sub.findResult();
    }

}
