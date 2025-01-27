public class gcd {
    public static void main(String[] args) {
        System.out.println(gcd(24,9));
    }    

    static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}
