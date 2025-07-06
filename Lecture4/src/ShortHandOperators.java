public class ShortHandOperators {
    public static void main(String[] args) {
        int a = 8, b = 5;
        System.out.println("a = "+ a + ", b = "+b);
        a+=b;
        System.out.println("a = "+ a +"a += b = "+ a);
        a-=b;
        System.out.println("a = "+ a +"a -= b = "+ a);
        a*=b;
        System.out.println("a = "+ a + "a *= b = "+ a);
        a/=b;
        System.out.println("a = "+ a +"a /= b = "+ a);
        a%=b;
        System.out.println("a = "+ a +"a %= b = "+ a);

        a++;
        System.out.println("a after a++ = " + a);
        System.out.println("a++ during printing value :" + a++);
        System.out.println("value of a now :"+a);
        System.out.println("++a during printing value"+ ++a);
    }
}
