public  class MathsThings{
    public static void main(String[] args){
        /*
            The Math. class is incredibly useful.
            It allows us to do "fancier" maths.
            Than just the 5 basic maths function.
        */
        
        double exp = 2;
        double base = 4;
        // use exponents use Math.pow(base, exp);
        double answer = Math.pow(base, exp);
        System.out.println(answer);
        // to do a square root use Math.sqrt();
        double squareRoot = Math.sqrt(answer);
        System.out.println(squareRoot);
        
        // absolute is simply a positive value of any int.
        
        double num1 = 20;
        double num2 = 40;
        double abs = Math.abs(20-40);
        System.out.println(abs);
        System.out.println(Math.sqrt(-16));
        
        double angle = 30;
        double h = 10;
        double rad = Math.toRadians(angle);
        System.out.println(rad);
        double y =  h * Math.sin(rad);
        System.out.println(y);
        // y = y * 100;
        y = Math.round(y*100)/100;
        // y = y/100;
        System.out.println(y);
        
    }   
}