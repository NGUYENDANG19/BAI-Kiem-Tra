package Basic.dev;
import java.util.Random;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		  // TODO Auto-generated method stub			
		/**câu 1 : a,b,c có phải là 3 cạnh của một tam giác	
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.format("nhập cạnh a : ");
		int a = sc.nextInt();
		System.out.format("nhập cạnh b : ");
		int b = sc.nextInt();
		System.out.format("nhập cạnh c : ");
		int c = sc.nextInt();
		Tamgiac(a, b, c);

		/**câu 2: khai báo mảng số nguyên có 10 phần tử.
		 * a) tạo giá trị ngẫu nhiên
		 * b) xắp xếp tăng dần
		 * c) đếm chẵn,lẽ
		 */
		int A[] = new int[10];
		input(A);
		print(A);
		demChanle(A);
		sapXep(A);

		}

		private static void Tamgiac(int a, int b, int c) {
		  // TODO Auto-generated method stub
		  if ((a + b > c) & (a + c > b) & (b + c > a)) {
		    System.out.println(" a, b, c là 3 cạnh  một tam giác");
		  } else {
		    System.out.println("a, b, c không phải là 3 cạnh của một tam giác");
		  }
		}

		private static void sapXep(int[] A) {
		  // TODO Auto-generated method stub
		  System.out.println();
		  System.out.print("- xắp sếp tăng dần : ");
		  for (int i = 0; i < A.length; i++) {
		    for (int j = i + 1; j < A.length; j++) {
		      if (A[i] > A[j]) {
		        int temp = A[i];
		        A[i] = A[j];
		        A[j] = temp;
		      }
		    }
		    System.out.print(A[i] + "  ");
		  }
		}

		private static void demChanle(int[] A) {
		  // TODO Auto-generated method stub
		  int demChan = 0;
		  for (int i = 0; i < A.length; i++) {
		    if (A[i] % 2 == 0)
		      demChan++;
		  }
		  System.out.format("( mảng có : %d số chẵn ,%d số lẽ)", demChan, A.length - demChan).println();
		}

		private static void print(int[] A) {
		  // TODO Auto-generated method stub
		  System.out.println("\n- Mảng A:\t ");
		  for (int i = 0; i < A.length; i++) {
		    System.out.format("%d", A[i]).print(" \t ");

		  }
		}

		private static void input(int[] A) {
		  // TODO Auto-generated method stub
		  int min = 1;
		  int max = 100;
		  for (int i = 0; i < A.length; i++) {
		    A[i] = randomInteger(min, max);
		  }
		}

		private static int randomInteger(int min, int max) {
		  Random rand = new Random();
		  return rand.nextInt(max + 1 - min) + min;
		}
		}