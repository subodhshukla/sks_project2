public class Math {
    int a, b, c;
    public void add(int a, int b){
        System.out.println(c=a+b);
    }
    public void sub(int a, int b){
        System.out.println( c=a-b);
    }
    public void mult(int a, int b){
        System.out.println( c=a*b);
    }

    public static void main(String arg[]){
        Math obj=new Math();
        obj.add(8,9);
        obj.sub(8,9);
        obj.mult(8,9);

    }
    //Test for branch1
}
