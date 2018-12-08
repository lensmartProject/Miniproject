package com.capgemini.lensmart;

import java.util.Arrays;

public class ImageDetailsPojo {
	 private Long id;
	    private String name;
	    private byte[] imageData;
	    private String imageFileName;
	    
	    public ImageDetailsPojo(){
	    	
	    }
	    
		public ImageDetailsPojo(Long id, String name, byte[] imageData,
				String imageFileName) {
			super();
			this.id = id;
			this.name = name;
			this.imageData = imageData;
			this.imageFileName = imageFileName;
		}
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public byte[] getImageData() {
			return imageData;
		}
		public void setImageData(byte[] imageData) {
			this.imageData = imageData;
		}
		public String getImageFileName() {
			return imageFileName;
		}
		public void setImageFileName(String imageFileName) {
			this.imageFileName = imageFileName;
		}
		@Override
		public String toString() {
			return "ImageDetailsPojo [id=" + id + ", name=" + name
					+ ", imageData=" + Arrays.toString(imageData)
					+ ", imageFileName=" + imageFileName + "]";
		}
	    
	    
	 
}
