import java.util.*;
import java.util.Comparator;
public class Main {
   static List<User> users = new  ArrayList<>();
    public static void main(String[] args) {

        User ivan = new User("Иван",22);
        User petr = new User("Матвей",95);
        User olga = new User("Ольга",35);


        addUser(ivan);
        addUser(petr);
        addUser(olga);


        users.sort(new Comparator<User>() {
            public int compare(User u1, User u2) {
                if (u1.getAge() == u2.getAge())
                    return 0;
                return u1.getAge() < u2.getAge() ? -1 : 1;
            }
        });

        System.out.println(users.get(users.size()-1));


        System.out.println("задача 2");

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Я дома");
        map.put(2, "На улице темнело");
        map.put(3, "Фрукты стали стоить дороже");
        map.put(4, "Ночь улица фонарь");
        map.put(5, "На улице светало");


        int count =0 ;
        for (Map.Entry<Integer,String>  entry : map.entrySet()) {   //Используем форич для того что бы пройтись по элементам мапы
             String value = entry.getValue();
             if(value.length()!=0)
                 count++;
            for ( int t=0; t<value.length(); t++)
                if(value.charAt(t) == ' ') {
               count++;

           }
            System.out.println(count);
            count=0;
        }


    }
    public static  void addUser(User user ){
        if(!users.contains(user)){
            users.add(user);
        }
    }

}