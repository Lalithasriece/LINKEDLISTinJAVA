import java.util.*;
class AddFirst{
    public static void main(String args[]){
        //
LinkedList<String> colors=new LinkedList<>();
colors.add("yellow");
colors.add("green");
colors.add("white");
colors.add("pink");
colors.add("blue");   
System.out.println(colors);
//addFirst();

colors.addFirst("brown");
System.out.println(colors);
    }
}

/*OUTPUT:
[yellow, green, white, pink, blue]
[brown, yellow, green, white, pink, blue]*/
