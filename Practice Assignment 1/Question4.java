class Question4
{

    public static void main (String[] args){

        for (int a = 1; a < 1000; a ++){

            for (int b = 1; b < 1000; b ++){

               double c = (Math.sqrt(a * a + b * b));

                if ( a + b + c == 1000) {
                    int x = (int) (a * b * c);
                    System.out.println (x);
                }
            }
        }

    }
}

