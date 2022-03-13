package goshopping;

abstract class NormalAcc extends ShopAcc{
	 private final float  deliverycharges;
	 public NormalAcc(int accNo, String accNm, float charges,float deliverycharges ) {
	super(accNo, charges, accNm);
	 this.setAccNo(accNo);
	 this.setAccNo(accNo);
	 this.deliverycharges =50;
	 }
	 public void bookProduct(float deliveryCharge) {
		 System.out.println("Your delevery charge is :"+deliveryCharge);
	 
	 }
	public String toString() {
		return "NormalAcc(Account No: "+ getAccNo() +" | Account Name : "+getAccNm()+" | Charges: "+getcharges()+" | Delivery charges : "+deliverycharges+")";
	}
	 
}

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accNo, String accNm, float charges, float deleveryCharge) {
		super(accNo, accNm, charges, deleveryCharge);
	}

	public static void main(String[] args) {
		 GSNormalAcc gsn =new GSNormalAcc(555, "shankar", 150, 60);
		gsn.toString();
		gsn.bookProduct(400);
		System.out.println(gsn.toString());
	}

}
