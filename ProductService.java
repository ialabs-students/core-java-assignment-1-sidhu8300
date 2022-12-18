import java.util.ArrayList;

public class ProductService {

	public static String findNameByCode(int num) {
		for (int i = 0; i < ProductRepository.arr.length; i++) {
			if (ProductRepository.arr[i].getProductCode() == num) {
				return ProductRepository.arr[i].getName();
			}
		}
		return "null";
	}

	public static Product findMaxPriceProduct(String category) {
		double maxPrice = Double.MIN_VALUE;
		int index = -1;
		for (int i = 0; i < ProductRepository.arr.length; i++) {
			
			if (ProductRepository.arr[i].getCategory().equals(category) && ProductRepository.arr[i].getPrice() > maxPrice) {
				
				maxPrice = ProductRepository.arr[i].getPrice();
				index = i;
			}
		}
		if (index == -1) {
			return null;
		} else {
			return ProductRepository.arr[index];
		}
	}

	public static Product[] getProductsByCategory(String category) {
		ArrayList<Product> list=new ArrayList<Product>();
		
		for(int i=0; i<ProductRepository.arr.length; i++) {
			if(ProductRepository.arr[i].getCategory().equals(category)) {
				list.add(ProductRepository.arr[i]);
			}
		}
		if(list.isEmpty()) {
			return null;
		}
		else {
			Product[] arr=list.toArray(new Product[list.size()]);
			return arr;
		}
		
		
	}

}
