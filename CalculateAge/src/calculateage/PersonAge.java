package calculateage;

import java.util.Date;

/**
 *
 * @author Daniel Gurbiel
 */

public class PersonAge {
    private Date date_of_birth;
    
    public PersonAge(int year, int month, int day){
        date_of_birth = new Date(year, month, day);
    } 

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }
}
