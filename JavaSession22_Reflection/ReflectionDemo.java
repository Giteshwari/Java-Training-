package JavaSession22_Reflection;

import java.lang.reflect.*;

class Shape{
    Shape() {
        System.out.println("Default");
    }
}
class Circle extends Shape{
    //field
    public  int radius;
    //field2
    public String s;
    //constructor
    public Circle(){
        System.out.println("Default Constructor circle");
    }
    Circle(int r){
        System.out.println("Parameterised constructor::"+r);
    }

    //methods
    public void area(int r){
        float area= (float) (Math.PI*r*r);
        System.out.println("Result is::"+area);
    }
    public void show(){
        System.out.println("I am show Circle");
    }

    private void name(String nm){
        System.out.println("Your name is: "+nm);
    }
}
public class ReflectionDemo {
    public static void main(String args[]) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {

        //step1:object of class
        Circle c=new Circle();
        Circle c1=new Circle(2);
        c1.show();
        ReflectionDemo r=new ReflectionDemo();

        //step2:class Details ,create an instance of Class
        Class obj=c.getClass();
        Class obj_r=r.getClass();

        //name: of the class
        String name= obj.getName();
        System.out.println("Class name is::"+name);
        System.out.println("Canonical name of class: "+obj.getCanonicalName());

        //modifier of the class
        int modifier=obj.getModifiers();
        // String mod= Modifier.toString(modifier);
        System.out.println("Modifier of Circle is::"+modifier);

        System.out.println("********************");
        int modifier1=obj_r.getModifiers();
        String mod1= Modifier.toString(modifier1);
        System.out.println("Modifier of ReflectionDemo is::"+mod1);

        System.out.println("********************");
        //superclass
        Class superclass=obj.getSuperclass();
        System.out.println("Superclass of Circle is::"+superclass);

        System.out.println("********************");

        //Constructor
        Constructor[] constructor =obj.getDeclaredConstructors();
        for (Constructor c12:constructor) {
            //constructor name
            System.out.println("Constructor name is::"+c12.getName());

            //modifier
            int modifier2=c12.getModifiers();
            String mod2= Modifier.toString(modifier1);
            System.out.println("Modifier od ReflectionDemo is::"+mod2);

            //parameter
            System.out.println("Parameters are ::"+c12.getParameterCount());
            System.out.println(" ");
        }

        Method[] method=obj.getMethods();
        for (Method m1:method) {
            //Method name
            System.out.println("Method name is::"+m1.getName());


            System.out.println("********DeclaredMethod***********");
            Method m2=obj.getDeclaredMethod("area",int.class);
            m2.invoke(c,2);
            Method m3 = obj.getDeclaredMethod("name",
                    String.class);
            m3.setAccessible(true);
            m3.invoke(c,"Gita");
            System.out.println("********Declared_Method_end***********");

            //modifier
            int modifier2=m1.getModifiers();
            String mod2= Modifier.toString(modifier1);
            System.out.println("Modifier od ReflectionDemo is::"+mod2);

            //parameter
            System.out.println("Parameters are ::"+m1.getParameterCount());
            System.out.println(" ");
        }
        System.out.println("********************");
        Field field1=obj.getField("radius");
        //field1.setAccessible(true);//for private
        field1.set(c,4);

        //getter
        int typeValue = (int) field1.get(c);
        System.out.println("Value of radius is::"+typeValue);

        //modifier
        int modifier3=field1.getModifiers();
        String mod3= Modifier.toString(modifier3);
        System.out.println("Modifier of Field is::"+mod3);
        System.out.println("*************---New Field---***************");
        Field field2=obj.getField("s");
//        field2.setAccessible(true);//for private
        field2.set(c,"Gita");

        //getter
        String typeValue1 = (String) field2.get(c);
        System.out.println("Value of String  is::"+typeValue1);

        //modifier
        int modifier4=field2.getModifiers();
        String mod4= Modifier.toString(modifier4);
        System.out.println("Modifier of Field is::"+mod4);


    }
}