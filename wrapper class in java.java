class Main{
   public static void main(String args[]){
      // to convert the primitive data type to wrapper obj
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