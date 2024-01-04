
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    public Money plus(Money addition){
        Money newmoney=new Money(addition.euros+this.euros,addition.cents+this.cents);
        return newmoney;
    }
    public boolean lessThan(Money compared){
        if(this==compared){
            return false;
        }
        if(this.euros<compared.euros){
            return true;
        } else if(this.euros==compared.euros){
            if(this.cents<compared.cents){
                return true;
            }
        }
        return false;
    }
    public Money minus(Money decreaser){
        int e=this.euros-decreaser.euros;
        int c=this.cents-decreaser.cents;
        if(c<0){
            e=e-1;
            c=100+c;
        }
        if(e<0){
            e=0;
            c=0;
        }
        Money newmoney=new Money(e,c);
        return newmoney;
    }

}
