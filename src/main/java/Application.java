
public class Application {
    public static void main(String args[]){

        String aName = "World";
        if (args.length == 1){
            aName = args[0];
        }

        System.out.println("Hello " + aName);
    }
}