import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------GPA Calculator-------------------");

        System.out.print("Number of courses offered: ");
        Scanner scanCourses = new Scanner(System.in);
        int noCourses = scanCourses.nextInt();


        if (noCourses == 0 || noCourses < 0) {
            System.out.println("Error! GPA can't be calculated if you don't offer any course!!\n\n");
            String[] call = {"call"};
            Main.main(call);
        }

        String[] courseName = new String[noCourses];
        int[] courseUnit = new int[noCourses];
        int[] courseGrade = new int[noCourses];
        int[] scoreUnit = new int[noCourses];
        String[] courseScore = new String[noCourses];
        int unitAdd;
        int unitBuffer = 0;
        int scoreBuffer = 0;

        for (int i = 0; i < noCourses; i++) {
            System.out.print("Course " + (i + 1) + " Name: ");
            Scanner scanName = new Scanner(System.in);
            courseName[i] = scanName.nextLine();


            System.out.print("Course " + (i + 1) + " Unit: ");
            Scanner scanUnit = new Scanner(System.in);
            courseUnit[i] = scanUnit.nextInt();


            System.out.print("Course " + (i + 1) + " Grade: ");
            Scanner scanScore = new Scanner(System.in);
            courseScore[i] = scanScore.nextLine();

            switch (courseScore[i]) {
                case "A":
                    courseGrade[i] = 5;
                    break;
                case "B":
                    courseGrade[i] = 4;
                    break;
                case "C":
                    courseGrade[i] = 3;
                    break;
                case "D":
                    courseGrade[i] = 2;
                    break;
                case "E":
                    courseGrade[i] = 1;
                    break;
                case "F":
                    courseGrade[i] = 0;
                    break;
                default:
                    courseGrade[i] = 0;
                    break;
            }

            /*if (courseScore[i].equals("A")) {
                courseGrade[i] = 5;
            } else if (courseScore[i].equals("B")) {
                courseGrade[i] = 4;
            } else if (courseScore[i].equals("C")) {
                courseGrade[i] = 3;
            } else if (courseScore[i].equals("D")) {
                courseGrade[i] = 2;
            } else if (courseScore[i].equals("E")) {
                courseGrade[i] = 1;
            } else if (courseScore[i].equals("F")) {
                courseGrade[i] = 0;
            } else {
                courseGrade[i] = 0;
            }*/

            scoreUnit[i] = (courseUnit[i] * courseGrade[i]) + scoreBuffer;
            scoreBuffer = scoreUnit[i];


            unitAdd = courseUnit[i] + unitBuffer;
            unitBuffer = unitAdd;

            System.out.print("\n");
        }


        double gpa = (double)scoreBuffer / unitBuffer;

        System.out.println(gpa);


    }

    /*public static int oneUnit(int one) {
        int unitOne = one;
        return unitOne;
    }

    public static int twoUnit(int two) {
        int unitTwo = two * 2;
        return unitTwo;
    }

    public static int threeUnit(int three) {
        int unitThree = three * 3;
        return unitThree;
    }*/
}