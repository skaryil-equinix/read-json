import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;
import java.util.ArrayList; // import the ArrayList class


        public class Main {

            static ArrayList<Person> allPersons = new ArrayList<Person>(); // Create an ArrayList object

            public static void displayPersons(ArrayList<Person> persons){
                for(int i=0; i<persons.size(); i++){
                    persons.get(i).display();
                    System.out.println("");
                }

            }
            public static void main(String[] args) {
                JSONParser parser = new JSONParser();

                //read the json file into ArrayList
                try {
                    Object obj = parser.parse(new FileReader("src/person.json"));
                    JSONObject jsonObject = (JSONObject)obj;
                    JSONArray persons = (JSONArray)jsonObject.get("persons");
//                    System.out.println("persons:");
                    Iterator iterator = persons.iterator();
                    while (iterator.hasNext()) {
                        JSONObject person = (JSONObject) iterator.next();
                        String name = (String) person.get("name");
                        String email = (String) person.get("email");
//                        Integer age =  ((Integer) person.get("age"));
//                        String[] adddr = (String[]) person.get("address");

                        Person p = new Person(name, 12, email, null);
                        allPersons.add(p);

                    }
                } catch(Exception e) {
                    e.printStackTrace();
                }


                //print All the person details read into the ArrayList
                displayPersons(allPersons);
            }
        }
