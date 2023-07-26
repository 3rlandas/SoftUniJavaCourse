import java.util.List;
import java.util.ListIterator;

public class Commands {

    private List<String> names;
    private String command;

    public Commands(List<String> listOfPeople, String command) {
        this.names = listOfPeople;
        this.command = command;
    }

    public void StartsWith(String command, String addOrDelete){

        ListIterator<String> allNames = names.listIterator();

        while (allNames.hasNext()){
            String name = allNames.next();
            if(name.startsWith(command)){
                if(addOrDelete.equals("Double")){
                    allNames.add(name);
                } else if (addOrDelete.equals("Remove")) {
                    allNames.remove();
                }
            }
        }
    }

    public void EndsWith(String command, String addOrDelete) {

        ListIterator<String> allNames = names.listIterator();

        while (allNames.hasNext()){
            String name = allNames.next();
            if(name.endsWith(command)){
                if(addOrDelete.equals("Double")){
                    allNames.add(name);
                } else if (addOrDelete.equals("Remove")) {
                    allNames.remove();
                }
            }
        }
    }

    public void Length(int number, String addOrDelete) {

        ListIterator<String> allNames = names.listIterator();

        while (allNames.hasNext()){
            String name = allNames.next();
            if(name.length() == number){
                if(addOrDelete.equals("Double")){
                    allNames.add(name);
                } else if (addOrDelete.equals("Remove")) {
                    allNames.remove();
                }
            }
        }
    }
}
