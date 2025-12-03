public class Exercise4_6_Multadd {
Multadd metodu: a * b + c islemini gerceklestirir
    public static double multadd(double a, double b, double c) {
        return 0.0;
    }


    
    public static double expSum(double x) {
      // e^(-x) terimini birden fazla kullandigimiz icin hesaplayip bir degiskene atayalim.
       double e_to_neg_x = Math.exp(-x);
       double first_term = x * e_to_neg_x;
       double second_term = Math.sqrt(1.0 - e_to_neg_x);
        return first_term + second_term;
    }

    public static void main(String[] args) {
        double test1_result = multadd(2.0, 3.0, 4.0); 
        System.out.println("Test 1 (2 * 3 + 4): " + test1_result);
        double pi_over_4 = Math.PI / 4.0;    
        double expression_I = multadd(0.5, Math.cos(pi_over_4), Math.sin(pi_over_4));
        System.out.println("sin(π/4) + cos(π/4)/2 = " + expression_I);
        double log10 = Math.log(10) / Math.log(10); 
        double log20 = Math.log(20) / Math.log(10);
        double log10_val = Math.log10(10); 
        double log20_val = Math.log10(20);
        double expression_II = multadd(1.0, log10_val, log20_val); 
        System.out.println("log10(10) + log10(20) = " + expression_II);
        double x_value = 1.0;
        double expSum_result = expSum(x_value);
        System.out.println("expSum(" + x_value + "): " + expSum_result);
    }
}
        
    }
}
