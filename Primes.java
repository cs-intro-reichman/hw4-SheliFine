public class Primes {
    public static void main(String[] args) {
        int untilNumber = Integer.parseInt(args[0]);

        boolean[] arr = new boolean [untilNumber + 1];

        for (int i = 2; i <= untilNumber; i++) {
            arr[i] = true;
        }
        
        // Changes multifications of prime num to false and skips them.
     for (int i = 2; i <= untilNumber; i++) {
        if (arr[i] == true){
            for (int j = 2; i * j < arr.length; j++) {
                    arr[i * j] = false;
            }
    }
}
    System.out.println("Prime numbers up to " + untilNumber + ":");
    
    int countPrimes = 0;
    
    for (int i = 2; i < arr.length; i++) {
        if (arr[i] == true){
        System.out.println(i);
        countPrimes++;
             }
        }

        int percentPrime = (int) (((double) countPrimes/untilNumber) * 100);

    System.out.println("There are " + countPrimes + " primes between 2 and " + untilNumber +
    " (" + percentPrime + "% are primes)");    
    }
}