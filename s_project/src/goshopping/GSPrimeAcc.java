package goshopping;

 abstract class ShopAcc{
	 private int accNo;
	 private float charges;
	 private String accNm;
	
	 public ShopAcc(int accNo,float charges,String accNm) {
		 this.setAccNo(accNo);
		 this.setCharges(charges);
		 this.setAccNm(accNm);
		 
	 }
	 public void bookProduct(float charges) {
		 this.setCharges(charges);
		 
	 }
	 public void items(float charges) {
		 this.setCharges(charges);
	 }
	 public String toString() {
		return "ShopAcc(Account No: "+ getAccNo() +"Charges: "+getcharges()+" Account Name : "+getAccNm()+")";	
	 }
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public float getcharges() {
		return getCharges();
	}
	public void setcharges(int charges) {
		this.setCharges(charges);
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
 }
 abstract class PrimeAcc extends ShopAcc{
	private boolean isPrime;
	 private static final float  deliverycharges=100;
	 public PrimeAcc(int accNo, String accNm, float charges, boolean isprime) {
	 super(accNo, charges, accNm);
	 this.isPrime=isprime;
	 this.setAccNo(accNo);
	 this.setAccNo(accNo);
		}

	 public void bookProduct(float charges) {
		 System.out.println("Your delevery charge is :"+charges);
		 
	 }
	public String toString() {
		return "PrimeAcc(Account No: "+ getAccNo() +" | Account Name : "+getAccNm()+" | Charges: "+deliverycharges+" | Is it Prime Account :"+isPrime+")";
	}
	 
 }
public class GSPrimeAcc extends PrimeAcc {
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isprime) {
		super(accNo, accNm, charges, isprime);
		
	}
	 public static void main(String[] args) {
		GSPrimeAcc gsp =new GSPrimeAcc(6222, "Shankar", 45, true);
		gsp.toString();
		gsp.bookProduct(200);
		System.out.println(gsp.toString());
	}

}
