package JavaSession14;
class Parent{
 public void hairColor(){
 }
}
class Child extends Parent{
 @Override
 public void hairColor() {
 System.out.println("Grey");
 }
}
public class HandlingClassCastException {
 public static void main(String[] args) {
 try{
 Parent p = new Child();
 Child c = (Child) new Parent();
 c.hairColor();
 }
 catch (Exception e){
 System.out.println(e);
 }
 }
}
/*
Output:
java.lang.ClassCastException: JavSession14.Parent cannot be cast to JavaSession14.Child
*/
