package calculateage;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Daniel Gurbiel
 */

public class CalculationOfAge {
    private Date date;
    private PersonAge person;

    public CalculationOfAge(String s_date) {
        date = new Date();
        person = new PersonAge(Integer.parseInt(s_date.substring(0, 4)), 
                Integer.parseInt(s_date.substring(5, 7)),
                Integer.parseInt(s_date.substring(8, 10)));
    }

    public void showHowOld(){
        System.out.println("\nYou are: \n" + showYears() + "\n" + showMonths() + "\n");   
    }
    
    public String showYears(){
        String years = "";
        if(person.getDate_of_birth().getMonth() > date.getMonth()+1){
            years = (date.getYear() + 1899 - person.getDate_of_birth().getYear() + " years old.");
        }
        else{
            if(person.getDate_of_birth().getMonth() == date.getMonth()+1){
                if(person.getDate_of_birth().getDate() > date.getDate()) years = (date.getYear() + 1899 - person.getDate_of_birth().getYear() + " years old.");
                else years = (date.getYear() + 1900 - person.getDate_of_birth().getYear() + " years old.");
            }
            else years = (date.getYear() + 1900 - person.getDate_of_birth().getYear() + " years old.");  
        }
        return years;
    }

    public String showMonths(){
        String months = "";
        if(date.getDate() < person.getDate_of_birth().getDate()) //niepelny miesiac
            months = "or " + (((date.getYear() + 1900 - person.getDate_of_birth().getYear()) * 12) - ((person.getDate_of_birth().getMonth()- date.getMonth()))) + " months old.";
        else //pelny miesiac
            months = "or " + (((date.getYear() + 1900 - person.getDate_of_birth().getYear()) * 12) - ((person.getDate_of_birth().getMonth()- date.getMonth() - 1))) + " months old.";
                
        return months;
    }
}
