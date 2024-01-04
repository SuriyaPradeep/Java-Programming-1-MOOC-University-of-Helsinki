
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment compared){
        int currsq=this.squares;
        int comp=compared.squares;
        if(currsq>comp){
            return true;
        }
        return false;
    }
    public int priceDifference(Apartment compared){
        int curprice=this.princePerSquare*this.squares;
        int compprice=compared.princePerSquare*compared.squares;
        int diff=curprice-compprice;
        return Math.abs(diff);//absoulte function
    }
    public boolean moreExpensiveThan(Apartment compared){
        int curprice=this.princePerSquare*this.squares;
        int compprice=compared.princePerSquare*compared.squares;
        if(curprice>compprice){
            return true;
        }
        return false;
    }

}
