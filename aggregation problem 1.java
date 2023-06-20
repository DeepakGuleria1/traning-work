public class Calculation 
{
 int calArea(int length, int breadth){
  return (length * breadth);	 
 }
}
public class Rectangle {  
 Calculation cal; // Use of Aggregation.
 
int area(int length, int breadth){
  cal = new Calculation();
  int areaRec = cal.calArea(length, breadth); // code reusability.
  return areaRec;
 }
}
public class Test {
public static void main(String[] args) 
{
 Rectangle rec = new Rectangle();
 int result = rec.area(25, 60);
 System.out.println("Area of rectangle: " +result);

 }
}