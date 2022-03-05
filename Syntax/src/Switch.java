public class Switch {

	public static void main(String[] args) {

		int j = 3;
		String str = null;

		switch (j) {
		case 1:
			str = "one";
			break;
		case 2:
			str = "two";
			break;
		case 3:
			str = "three";
			break;
		default:
			str = "unknown";
		}

		System.out.println(str);

		String string = "blank";

		switch (string) {
		case "test":
		case "":
			string = "failure";
			break;
		case "nothing":
		case "blank":
			string = "sucess";
			break;
		default:
			string = "unknown";
		}
		System.out.println(string);
	}
}
