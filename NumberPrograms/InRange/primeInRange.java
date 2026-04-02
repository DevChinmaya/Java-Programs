

class primeInRange{
    public static void main(String[] args) {
        Range(1,50,0);
    }
    public static boolean isPrime(int n,int i){
        if(n<=1) return false;
        if(i>n/2) return true;
        if(n%i ==0) return false;
        return isPrime(n,i+1);
            
    }

    public static void Range(int st,int end,int count){
        if(st>end) return;
        if(isPrime(st,2)){
            System.out.println(st);
            return;
        }
        Range(st+1,end,count);
    }
}





















    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the range to find prime numbers:");
    //     int n = sc.nextInt();
    //     int m = sc.nextInt();

    //     for(int i=n; i<=m; i++){
    //         boolean flag = true;
    //         for(int j=2; j<i; j++){
                
    //             if(i%j == 0){
    //                 flag = false;
    //                 break;
    //             }
    //         }
    //         if(i>1 &&flag){
    //             System.out.println(i + " is a prime number.");
    //         }else{
    //             System.out.println(i + " is not a prime number.");
    //         }
    //     }
    