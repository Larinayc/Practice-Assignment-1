
class Question3{
    
    public static void main (String[] args){
        
        int total1 = 0;
        int total2 = 0;
        int b = 0;
        
        for ( int i = 1; i <= 100; i ++){
           int a = i * i;
           total1 = total1 + a;
           
           b = b + i;
           
        }
        total2 = b * b;
        int ans = total2 - total1;
        System.out.println (ans);
    }
    
}
