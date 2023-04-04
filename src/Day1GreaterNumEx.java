public class Day1GreaterNumEx {
    public static void main(String args[]){
        int a=45,b=23,c=12,d=1,e=44;
        if ((a >= b) && (a >= c) && (a >= d) && (a >= e)) {
            System.out.println (a);
        } else if ((b >= c) && (b >= d) && (b >= e)) {
            System.out.println ( b);
        } else if ((c >= d) && (c >= e)) {
            System.out.println ( c);
        } else if (d >= e) {
            System.out.println ( d);
        } else {
            System.out.println (e);
        }
    }
}
