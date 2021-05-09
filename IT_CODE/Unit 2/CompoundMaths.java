public class CompoundMaths{
    public static void main(String[] args){
        int x;
        int a = 2;
        int b = 3;
        int c = 4;
        
        x =  a + 2*b + 3*a*c;
        System.out.println(x);
        
        int n = 3;
        n= n++;// DO NOT DO THIS
        n++; // just do that
        System.out.println(n);
        
        System.out.println("---------------------");
        
        int valueToAdd = 5;
        int value = 4;
        value  = value + valueToAdd; // long version
        value += valueToAdd; // does the same as previous line.
        System.out.println(value);
        
        int w = 4;
        int r = 3;
        w *= r; // w = w * r;
        System.out.println(w);
        // we can also use -= or /=  or %=
        
        int mod = 0;
        int q = 5;
        int p = 2;
        int k = 5;
        int t = 2;
        
        k %= t; 
        mod = q%p;
        
        System.out.println(k + " " + mod);
        
        
        
        
        
    }
}   