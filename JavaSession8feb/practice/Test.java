package JavaSession15;

public class Test {
    public static void main(String args[]){
        RegisterUser obj_r=new RegisterUser();
        try {
            try {
                obj_r.validate(16, "Indian");
            } catch (InvalidAgeException e) {
                System.out.println("Invalidate Exception occurred::" + e.getMessage());
            }
            obj_r.validate(19,"Russian");
        }
        catch (InvalidCitizenshipException e){
            e.getMessage();
        }
        catch (InvalidAgeException e) {
            e.getMessage();
        }
    }
}

/*
output:
Parameter String:: Constructor==>You are Minor
Invalidate Exception occurred::null
Parameter String:: Constructor==>Citizenship should be INDIAN

 */