package goshopping;

abstract class ShopFactory{
	public String getNewPrimeAcc (int AccNo,String accNm,float charges,boolean isPrime) {
		return null;
		
	}
	public String getNewNormalAcc (int AccNo,String accNm,float charges,float deliveryCharge) {
		return null;
		
	}
}

public class GSShopFactory extends ShopFactory {
	public String getNewPrimeAcc (int AccNo,String accNm,float charges,boolean isPrime) {
		return "PrimeAcc(Account No: "+ AccNo +" | Account Name : "+accNm+" | Charges: "+charges+" | Is it Prime Account :"+isPrime+")";

		
	}
	public String getNewNormalAcc (int AccNo,String accNm,float charges,float deliveryCharge) {
	
		return "NormalAcc(Account No: "+ AccNo +" | Account Name : "+accNm+" | Charges: "+charges+" | Delivery charges : "+deliveryCharge+")";

	}

	public static void main(String[] args) {
		
		GSShopFactory gssf = new GSShopFactory();
		System.out.println(gssf.getNewNormalAcc(2110812, "shankar", 100, 50));
		System.out.println(gssf.getNewPrimeAcc(234, "shankar", 200, true));

	}

}
