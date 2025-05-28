
package shopping;

public class Shopping {
    public static void main(String[] args) {
       String a="Dress ";
       String b="Grocery";
       String c="Toys";
       String d="Dress ";
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
       System.out.println(d);
       System.out.println();
       
       int length=b.length();
       System.out.println("length of the string: "+length);
       System.out.println();
       
       String concat=a.concat(c);
       System.out.println("concatination: "+concat);
       System.out.println();
       
       
       boolean compare=d.equals(a);
       System.out.println("compare d and a: "+compare);
       System.out.println();
       
       boolean compare1=b.equals(c);
       System.out.println("compare b and c: "+compare1);
       System.out.println();


    }
    
}
