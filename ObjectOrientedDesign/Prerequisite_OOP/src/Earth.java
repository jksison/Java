
public class Earth {

	public static void main(String[] args) {

		Human tom;
		
		tom = new Human();
		tom.name = "Tom";
		tom.eyeColor = "Brown";
		tom.heightInInches = 72;
		tom.age = 5;
		
		tom.speak();
		
		Human human1 = new Human("Tom", 25, 76, "Blue");
		Human human2 = new Human("Joe", 28, 68, "Green");
		
		human1.speak();
		human2.speak();
		
	}

}
