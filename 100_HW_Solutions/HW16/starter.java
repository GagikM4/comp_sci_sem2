import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Clothing clothing = new Clothing(0.00, "");
		Socks socks = new Socks(3.99,"long");
		Pants pants = new Pants(59.99, 28);
		Shirts shirts = new Shirts(14.99, "Cotton");
		DesignerShirts designerShirts = new DesignerShirts("Gold" , "Gucci + Burberry + Northface + Toyota collab");
		
		socks.getType();
		pants.getLength();
		shirts.getMaterial();
		designerShirts.getBrand();
	}
}
