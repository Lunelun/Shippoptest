import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShippopTest {

	public static void linearSearch(ArrayList<Integer> list, int point) {
		for (Integer data : list) {

			if (data == point) {
				System.out.println("Round" + (list.indexOf(data) + 1) + "====>" + data + "==" + point + " found !");
				break;
			} else {
				System.out.println("Round" + (list.indexOf(data) + 1) + "====>" + data + "!=" + point);
			}
		}
	}

	public static void binarySearch(ArrayList<Integer> list, int start, int stop, int point, int round) {
		
		Collections.sort(list);
		//int midindex = (int) Math.ceil((start + (stop)) / 2.0);
		
//		if (list.get(midindex) == point) {
//			System.out.println("Round" + (round) + "====>" + list.get(midindex) + " == " + point + " found !");
//			return 0;
//		} else if (list.get(midindex) > point) {
//			System.out.println("Round" + (round) + "====>" + list.get(midindex) + " != " + point);
//			return binarySearch(list, start, midindex-1, point, round);
//		} else if (list.get(midindex) < point) {
//			System.out.println("Round" + (round) + "====>" + list.get(midindex) + " != " + point);
//			return binarySearch(list, midindex+1, stop, point, round);
//		}
//
//		return -1;
		int midindex = (start+stop)/2;
		while(start <= stop) {
			round++;
			if (list.get(midindex) == point) {
				System.out.println("Round" + (round) + "====>" + list.get(midindex) + " == " + point + " found !");
				break;
			}
			else if (list.get(midindex) > point) {
				System.out.println("Round" + (round) + "====>" + list.get(midindex) + " != " + point);	
				stop = midindex-1 ;
			} 
			else if (list.get(midindex) < point) {
				System.out.println("Round" + (round) + "====>" + list.get(midindex) + " != " + point);
				start = midindex+1 ;
			}
			midindex = (start + stop)/2;
		}
	}

	

	public static void bubbleSearch(ArrayList<Integer> list, int point) {

	}

	public static void main(String[] args) {
		int method = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("input : ");
		String input[] = sc.next().split(",");
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < input.length; i++) {
			try {
				list.add(Integer.parseInt(input[i]));
			} catch (NumberFormatException e) {
			}
			;
		}
		System.out.print("Search : ");
		int searchNum = sc.nextInt();

		while (method != 1 && method != 2 && method != 3) {
			System.out.println("Select your search method ");
			System.out.println("1 : Linear search , 2 : Binary search , 3 : Bubble search");
			System.out.print("Selected Method : ");
			method = sc.nextInt();
			if (method == 1) {
				linearSearch(list, searchNum);
			} else if (method == 2) {

				binarySearch(list, 0, list.size() - 1, searchNum, 0);
			} else if (method == 3) {
				System.out.println((2 + 3) / 2);
			} else {
				System.out.println("Invaild input . Please try again");
			}
		}
	}

}
