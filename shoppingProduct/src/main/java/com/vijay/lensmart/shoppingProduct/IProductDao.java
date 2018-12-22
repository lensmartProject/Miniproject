package com.vijay.lensmart.shoppingProduct;

import java.util.List;

	public interface IProductDao {
		
		public int add(Product product);
		public int remove(int productId);
		public int update(Product product);
		public List<Product> getAll();
		public Product get(int productId);
		public boolean contains(int productId);

	}

