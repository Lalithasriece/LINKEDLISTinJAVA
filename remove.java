
import java.util.*;
class remove{
    public static void main(String args[]){
        //
LinkedList<String> colors=new LinkedList<>();
colors.add("yellow");
colors.add("green");
colors.add("white");
colors.add("pink");
colors.add("blue");   
System.out.println(colors);
//remove using index
colors.remove(1);
System.out.println(colors);
//remove using objects
colors.remove("pink");
System.out.println(colors);
    }
}

/*OUTPUT:
[yellow, green, white, pink, blue]
blue*/
