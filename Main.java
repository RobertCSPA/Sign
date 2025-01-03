public class Main{

    public static void main(String[] args){
        int x;
        Sign sign1 = new Sign("ABC222DE", 3);
        x = sign1.numberOfLines();
        System.out.println(x);

        String str;
        str = sign1.getlines();
        System.out.println(str);

        Sign sign2 = new Sign("ABCD", 10);
        x = sign2.numberOfLines();
        System.out.println(x);
        str = sign2.getlines();
        System.out.println(str);
    }
}
