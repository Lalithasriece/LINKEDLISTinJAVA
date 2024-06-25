import java.util.*;
class RemoveFirst{
    public static void main(String args[]){
        //
LinkedList<String> colors=new LinkedList<>();
colors.add("yellow");
colors.add("green");
colors.add("white");
colors.add("pink");
colors.add("blue");   
System.out.println(colors);
//RemoveFirst();

colors.removeFirst();
System.out.println(colors);
    }
}

/*OUTPUT:
[yellow, green, white, pink, blue]
[green, white, pink, blue]
    */
