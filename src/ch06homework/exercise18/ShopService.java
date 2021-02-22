package ch06homework.exercise18;

public class ShopService {

	private static ShopService shopService = new ShopService();	//ΩÃ±€≈Ê
	
	private ShopService() {
		
	}
	static ShopService getInstance() {
		return shopService;
	}
	
}
