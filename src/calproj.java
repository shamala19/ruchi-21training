public class calproj {

    public static void main(String args[]) {

        int num1 = 15, num2 = 2, sum, sub, mul, div;
        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        System.out.println("Sum of these numbers: " + sum + " " + sub + "" + mul + " " + div);

        int a = 5;
        int b = 21;
        int c = 0;
        c = a & b;
        System.out.println("a & b = " + c);
        c = a / b;
        System.out.println("a / b = " + c);
        c = b ^ a;
        System.out.println("a ^ b = " + c);
        c = ~a;
        System.out.println("~a = " + c);


        int R = 40;
        int S = 30;
        System.out.println("R == S = " + (R == S));
        System.out.println("R != S= " + (R != S));
        System.out.println("R > S = " + (R> S));
        System.out.println("R < S = " + (R< S));
        System.out.println("R >= S = " + (R >= S));
        System.out.println("R <= S = " + (R <= S));

        //*unary operator//*


        int i = 8, j;
        j = i++;
        j = ++i;
        j = --i;
        j = i--;
        System.out.println(i);
        System.out.println(j);

    }

}






