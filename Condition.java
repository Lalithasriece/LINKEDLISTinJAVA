import java.util.*;
class Condition{
    public static void main(String args[]){
        
LinkedList<String> tech=new LinkedList<>();
tech.add("HTML");
tech.add("CSS");
tech.add("JS");
tech.add("React");
tech.add("SQL");   
System.out.println(tech);
if(tech.contains("SQL")){

    System.out.println("SQL is listed in tech");
}
else{
    System.out.println("Not Listed");
}
if(tech.contains("PHP")){
    System.out.println("PHP is listed");
}
else{
    System.out.println("PHP is not listed");
}
    }
}
/*OUTPUT:
[HTML, CSS, JS, React, SQL]
SQL is listed in tech
PHP is not listed*/
