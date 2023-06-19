// make first class as Address
class Address{
     String city;
     String state;
     String country;

    // create constructor
       public Address(String city,String state,String country){
                   this.city = city;
                   this.state = state;
                   this.country = country;
       }
   }
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
   // make second class as emp

public class Emp {

        int ID;
        String Name;
        // Address is class
        Address address;

        // create constructor
        public Emp(int ID,String Name,Address address){
            this.ID = ID;
            this.Name = Name;
            this.address = address;
        }
        public void display(){
            System.out.println(ID+" "+Name);
            System.out.println(address.city +" "+ address.state +" "+ address.country);
        }


        public static void main(String[] args) {

            Address A1 = new Address("Pathankot","pubjab","India");
            Address A2 = new Address("xyz2","up","India");

            Emp e1 = new Emp(1,"Deepak", A1);
            Emp e2 = new Emp(2,"Divyam",A2);

            e1.display();
            e2.display();

        }
    }
