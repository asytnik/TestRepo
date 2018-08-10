package enumsamples;

public class PlayMembers {

	public static void main(String[] args) {

		Members n = Members.BOBBY;

		if (n.equals(Members.JERRY))
			System.out.println("Jerrry!");
		if (n == Members.BOBBY)
			System.out.println("Rat Dog !!!");

	}

}
