/*11. Print cubes of numbers from 1 to 10
Output: 1 8 27 64 125 216 343 512 729 1000
*/

package assignments.student_submissions.DevSquadX.nilesh_mungase.loop_assignment;

public class CubeOfNumbersOneToTen {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * " + i + " * " + i + " = " + i * i * i);
		}
	}

}
