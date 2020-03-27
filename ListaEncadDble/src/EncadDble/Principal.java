package EncadDble;

public class Principal {
	
	public static void main(String[] args) {
		EncadDouble list = new EncadDouble();
		list.add(10, null);
		list.add(20, 10);
		list.add(30, 10);
		list.add(40, 30);
		list.print();
		System.out.println("List size is " + list.size());
		list.remove(30);
		list.print();
		list.remove(20);
		list.print();
		if(list.search(10)) {
			System.out.print("Existe\n");
		}
		else {
			System.out.print("N existe\n");
		}
	}

}
