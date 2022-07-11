import java.util.*;
import java.util.stream.Collectors;
class User{
    String name;
    int id;
    
    
   
    public User(String id,int name){
        this.name=id;
        this.id=name;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
}
class HelloWorld {
    public static void  comparing(List<User> userList){
        List<User> sortedList = userList.stream()
        .sorted(Comparator.comparing(User::getId).reversed())
        .collect(Collectors.toList());
        for(User u: sortedList){
            System.out.println(u.getId()); 
        }
    }
    public static void  grouping(List<User> userList){
        Map<String,List<User>> groupedList = userList.stream()
        .collect(Collectors.groupingBy(m->m.getName()));
        for(Map.Entry<String,List<User>> u: groupedList.entrySet()){
            System.out.println(u.getKey()); 
        }
    }
    public static void main(String[] args) {
        
        List<User> userList = new ArrayList<>(Arrays.asList(
        new User("John", 33), 
        new User("Robert", 260), 
        new User("Mark", 26), 
        new User("Brandon", 42),
        new User("Robert", 261), 
        new User("Mark", 216),
        new User("Brandon", 412)));

        comparing(userList);
        grouping(userList);
        }
    
}