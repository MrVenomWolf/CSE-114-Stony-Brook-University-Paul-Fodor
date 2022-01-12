private double width=1;
		private double height =1;
		
		private String color ="white";
		
		public rectangle() {
			
		}
		
		
		public rectangle(double width, double height) {
			this.width=width;
			this.height=height;	
		}
		
		public double getwidth() {
			return width;
		}
		
		public double getheight( ) {
			return height;	
		}
		
		public String getcolour( ) {
			return colour;
		}
		
		public void setwidth(double width) {
			this.width = width;
		}
		
		public void setweight(double height) {
			this.height = height;
		}
		
		public void setcolour(String colour) {
			this.colour = colour;
		}
		
		
		public double getarea() {
			return width*height;	
		}
		
		public double getperimeter() {
			return 2*width + 2*height;
		}
		
		public String tostring( ) {
			return "width=" + getwidth() + " , height=" + getheight() + " , colour=" + getcolour();
		}
		
		
		
		public static void main(String[] args) {
		 
			Rectangle rectangle1= new Rectangle(4, 40);
			Rectangle rectangle2= new Rectangle(3.5,35.9);
			
			rectangle1.setcolour("Red");
			rectangle2.setcolour("Red");
		
			System.out.println(rectangle1);
			System.out.println(rectangle2);
			
			System.out.println("area of rectangle1 =" + rectangle1.getarea() + " Perimeter of rectangle1 = " + rectangle1.getperimeter());
			System.out.println("area of rectangle2 =" + rectangle2.getarea() + " Perimeter of rectangle2 = " + rectangle2.getperimeter());
					
		}
			
			
}