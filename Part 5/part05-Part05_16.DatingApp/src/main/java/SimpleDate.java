
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
     public void advance() {
        
        if (this.day== 30) {
            if (this.month == 12) {
                this.year++;
                this.month = 1;
            } else {
                this.month++;
            }
            this.day=1;

        } else {
            this.day++;
        }
    }

    public void advance(int howManyDays) {
        
        if (this.day+howManyDays > 30) {
            if (this.month == 12) {
                this.year++;
                this.month = 1;
            } else {
                this.month++;
            }
            this.day=(this.day+howManyDays)-30;

        } else {
            this.day+=howManyDays;
        }
    }
    public SimpleDate afterNumberOfDays(int days){
        SimpleDate date = new SimpleDate(this.day,this.month,this.year);
        if(days>0){
            if (date.day+days > 30) {
            if (date.month == 12) {
                date.year++;
                date.month = 1;
            } else {
                date.month++;
            }
            date.day=(this.day+days)-30;

        } else {
            date.day+=days;
        }
        }
        return date;
    }

}
