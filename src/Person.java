import java.util.ArrayList;
public class Person {

    String name;
    int age;
    ArrayList<String> addr;
    String email;

    Person(){
        name = "no name";
        age=0;
        email = "noemail@gamil.com";
        addr = null;
    }
    Person(String name, int age, String email, String[] addr){
        this.name = name;
        this.age = age;
        this.email = email;
        for(int i=0; addr!=null && i<addr.length; i++){
            this.addr.add(addr[i]);
        }
    }

    public void display(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("email: "+email);
        if(addr != null){
            System.out.println("address: ");
            for(int i=0;i<addr.size(); i++){
                System.out.println(addr.get(i));
            }
        }
        }

}
