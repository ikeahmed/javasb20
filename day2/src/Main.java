public class Main {

    public static void main(String[] args) {
	Car toyota = new Car();
	Car tesla = new Car();
	toyota.setTires(4);
	tesla.setTires(6);

	System.out.println(tesla.getTires());
    }
}
