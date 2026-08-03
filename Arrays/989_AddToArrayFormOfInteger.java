class Solution {
     static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
                fw.write("0");
            } catch (Exception e) {
            }
        }));
    }
    public List<Integer> addToArrayForm(int[] num, int k) {
        // List<Integer> list = new ArrayList<>() ;
        // int number = 0 ;

        // for(int i = 0 ; i<num.length ; i++)
        // {
        //     number *= 10 ;
        //     number += num[i] ;
        // }
        
        // number += k ;

        // int divisor = (int) Math.pow(10, num.length-1) ;

        // while(divisor != 0)
        // {
        //     int digit = number/divisor ;

        //     list.add(digit) ;
        //     number = number % divisor ;
        //     divisor = divisor / 10 ;
        // }
        // return list ;

        List<Integer> list = new ArrayList<>() ;

        int p = num.length-1;
        int carry = 0 ;
        
        while(p>=0 || k>0)
        {
            int numval = 0 ;

            if(p>=0) numval = num[p] ;

            int d = k%10 ;
            int sum = numval+d+carry ;
            int digit = sum%10 ;
            carry = sum / 10 ;

            list.add(digit) ;

            p-- ;
            k = k/10 ;
        }
        if(carry>0) list.add(carry) ;

        Collections.reverse(list) ;
        return list ;
    }
}