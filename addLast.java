import java.util.*;
class addLast{
    public static void main(String args[]){
        //
LinkedList<String> colors=new LinkedList<>();
colors.add("yellow");
colors.add("green");
colors.add("white");
colors.add("pink");
colors.add("blue");   
System.out.println(colors);
//addLast();

colors.addLast("black");
System.out.println(colors);
    }
}