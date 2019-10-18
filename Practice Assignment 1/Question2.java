
class Question2{
    public static void main (String[] args){
        int a = 0;
        int b = 1;
        int sum = 0;
        int c = 2;
        
        while (c <= 4000000){
            c = a + b;
            if (c % 2 == 0)
                sum = sum + c;
            a = b ;
            b = c;
            
        }
        System.out.println (sum);
    }

}
