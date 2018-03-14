package calculateage;

import java.util.Date;

/**
 *
 * @author Daniel Gurbiel
 */
public class CalculationOfAge {
    private String date_of_birth;
    private Date date;
    private PersonAge person;


    public CalculationOfAge(String date_of_birth) {
        this.date_of_birth = date_of_birth;
        date = new Date();
        person = new PersonAge(Integer.parseInt(date_of_birth.substring(0, 4)), 
                Integer.parseInt(date_of_birth.substring(5, 7)),
                Integer.parseInt(date_of_birth.substring(8, 10)));
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }
    
    public void showHowOld(){
        System.out.println("\nYou are: \n" + showYears() + "\n" + showMonths());   
    }
    
    public String showYears(){
        String years = "";
        if(person.getMonth() > date.getMonth()+1){
            years = (date.getYear() + 1899 - person.getYear() + " years old.");
        }
        else{
            if(person.getMonth() == date.getMonth()+1){
                if(person.getDay() > date.getDate()) years = (date.getYear() + 1899 - person.getYear() + " years old.");
                else years = (date.getYear() + 1900 - person.getYear() + " years old.");
            }
            else years = (date.getYear() + 1900 - person.getYear() + " years old.");  
        }
        return years;
    }
    /*
    jezeli urodzilem sie w 1994 a jest 2018 to (2018-1994) * 12 + jesli obecny dzien jest wiekszy 
    niz lub rowny niz dzien moich urodzin to + obecna ilosc miesiecy w tym roku, a jesli nie to ilosc miesiaca w roku -1;
    14 20
    */
    public String showMonths(){
        String months = "";
        if(date.getDate() < person.getDay()) //niepelny miesiac
            months = "or " + (((date.getYear() + 1900 - person.getYear()) * 12) - ((person.getMonth()- date.getMonth()))) + " months old.";
        else //pelny miesiac
            months = "or " + (((date.getYear() + 1900 - person.getYear()) * 12) - ((person.getMonth()- date.getMonth() - 1))) + " months old.";
                
        return months;
    }
}
