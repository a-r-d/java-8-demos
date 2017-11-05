import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import pojo.ProductInfo;

public class Java8ReduceExample {

	public static void main(String[] args) {

		ProductInfo info = new ProductInfo("apples", "123", 1.00, 5);
		ProductInfo info2 = new ProductInfo("pear", "345", 2.00, 10);
		ProductInfo info3 = new ProductInfo("banana", "653", 0.33, 20);
		ProductInfo info4 = new ProductInfo("onions", "222", 0.89, 15);
		
		List<ProductInfo> products = new ArrayList<>(
				Arrays.asList(new ProductInfo [] {info, info2, info3, info4})
		);
		
		System.out.println(products);
		
		Integer sum = products.stream()
			.map(ProductInfo::getQuantity)
			.reduce(0, (a, b) -> {
				return a + b;
			});
		
		System.out.println(sum);
	}
	

}
