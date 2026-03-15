class B {
    public int toDecimal(String s) {
        int n = s.length();
        int decimalValue = 0;
        for(int i = 0; i < n; i++) {
            char bit = s.charAt(n - 1 - i);
            if(bit == '1') {
                decimalValue += Math.pow(2, i);
            }
        }
        System.out.println(decimalValue);
        return decimalValue;
    }
    public static void main(String[] args) {
        
    }
}