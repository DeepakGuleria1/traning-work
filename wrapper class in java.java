// to convert the primitive type to wrapper object

class Main{
   public static void main(String args[]){
      
        int a = 5;
        double g = 6.554;

        Integer aobj = Integer.valueOf(a);
        Double gobj = Double.valueOf(g);

        if(aobj instanceof Integer){
           
            // instance of basically an operator which checks that either object belong to It's class or not
           
            System.out.println("An object of integer is created:");
        }
        if(gobj instanceof Double){
            System.out.println("An object of double is created:");
        }
    }
}

------------------------------------------------------------------------------------------------------------------------------------
// To convert the wrapper object   to primitive type:

    class Main{
   public static void main(String args[]){

      
       Integer aobj = Integer.valueOf(5);
       Double bobj = Double.valueOf(4.5);

       int a = aobj.intValue();  // using corresponding method:(intValue())
       double b = bobj.doubleValue();

       System.out.println("a = " + a);
       System.out.println("b = " + b);

    }
}
