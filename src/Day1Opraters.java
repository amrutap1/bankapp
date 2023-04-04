public class Day1Opraters {
    public static void main(String [] args){

        int a=2;
        int b=10;
        int c=3;
        int y =a+b;
        int x=a+++(b--)*c++;
        System.out.println(x);
        System.out.println("Addition of "+ a +" & "+ b +" is:"+y);
        System.out.println(a>b);
        System.out.println(a/b);
        System.out.println(c++);
        System.out.println((2>4)?true:false);
        System.out.println(a+=3);
        System.out.println(a&b);
        System.out.println(a|b);
        /*
        unary -
        -2
        Binary
        Arithmetic :+ ,-, *, %,/
        relational :<,>,<=,>=,=,!=,==
        logical :&& ,||
        bitwise : & ,^,|
        shift :<<, >>,>>>
        assignment :=,=+,-=,*=,/=
        increment & decrement  :++,--
        Ternary: () ?
         */
    }
}
