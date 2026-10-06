
public class Tarraysecoundmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50};

        int max = arr[0];
        int secondmax=0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
            	secondmax=max;
                max = arr[i];
            }
        }

        System.out.println("2nd Max in array = " + secondmax);

	}

}
