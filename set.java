import java.util.*;
class set{
    public static void main(String args[]){
        //
LinkedList<String> colors=new LinkedList<>();
colors.add("yellow");
colors.add("green");
colors.add("white");
colors.add("pink");
colors.add("blue");   
System.out.println(colors);
//set();

colors.set(2,"grey");
System.out.println(colors);
    }
}