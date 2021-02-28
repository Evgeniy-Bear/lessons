import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Person person1= new Person("Белый");
       Person person2= new Person("кролик");
        List<Person> list= new ArrayList<>();
        list.add(person1);
        list.add(person2);
        Person person1FromCollection = list.get(0);
        Person person2FromCollection = list.get(1);
        System.out.println(person1FromCollection);
        System.out.println(person2FromCollection);
        boolean remove= list.remove(person1);
        System.out.println(remove);
        System.out.println(person2FromCollection);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(person2));//проверяет есть ли данный объект в коллекции

        Iterator<Person> iterator = list.iterator();



        while (iterator.hasNext()){ //есть ли в данной колекции следующий элемент
            Person iterPerson = iterator.next();//дай нам этот элемент
            iterator.remove();//удаляем элемент из данной колекции



            }
            List <String> list1=new ArrayList <>();
            list1.add("List1");
            list1.add("List2");
            list1.add("List3");
            list1.add("List4");
           Predicate<String> predicate = s -> { //лямда
               return s.startsWith("A");// если слово начинается с А
           };
            list1.removeIf(predicate);// если слово начинается с А будем удалять


        List<String> list2=new LinkedList<>();
        Map <String,String> map=new HashMap<>();
        map.put("1","odin");
        System.out.println(map.get("1"));








        }

    }

