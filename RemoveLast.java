import java.util.*;
class RemoveLast{
    public static void main(String args[]){
        //
LinkedList<String> colors=new LinkedList<>();
colors.add("yellow");
colors.add("green");
colors.add("white");
colors.add("pink");
colors.add("blue");   
System.out.println(colors);
//removeLast();

colors.removeLast();
System.out.println(colors);
    }
}

/*OUTPUT:
[yellow, green, white, pink, blue]
[yellow, green, white, pink]
    */
