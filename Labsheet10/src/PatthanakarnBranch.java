
public class PatthanakarnBranch extends Product{
	
 private int payunit() {
	 return super.getUnit() / 2;
 }
 private int freeUnit() {
	 return super.getUnit() - this.payunit();
 }
 public int getTotalprice() {
	 return this.payunit() * 100;
 }
 public String toString() {
	 return "You buy " + this.payunit() +" Unit, get free " + this.freeUnit() + " unit (" + this.getTotalprice() + ")";
 }
}
