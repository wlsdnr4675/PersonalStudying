package Fourth;



import java.util.ArrayList;
import java.util.Scanner;


public class Exercise01 {
    static ArrayList record = new ArrayList();
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            switch (displayMenu()) {
                case 1:
                    inputRecord();
                    break;
                case 2:
                    displayRecord();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다");
                    System.exit(0);
            }
        }
    }

    static int displayMenu() {
        System.out.println("******************************");
        System.out.println("성적관리프로그램");
        System.out.println("******************************");
        System.out.println();
        System.out.println("1. 학생성적 입력기");
        System.out.println();
        System.out.println("2. 학생성적 보기");
        System.out.println();
        System.out.println("3. 프로그램 종료");
        System.out.println();
        System.out.print("원하는 메뉴를 선택하세요(1~3): ");
        int menu = 0;
        do {
            try {
                menu = Integer.parseInt(s.nextLine().trim());
                if (1 <= menu && menu <= 3) {
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("메뉴를 잘못 선택하셨습니다. 다시 입력해주세요.");
                System.out.print("원하는 메뉴를 선택하세요(1~3): ");
            }
        } while (true);
        return menu;
    }

    static void inputRecord() {
        System.out.println("1. 학생성적 입력하기");
        System.out.println("이름,반,번호,국어성적,영어성적,수학성적 의 순서로 공백없이 입력하세요");
        System.out.println("입력을 마치려면 q를 입력하세요 메인메뉴로 돌아갑니다");
        while (true) {
            System.out.println(">>");
            try {
                String input = s.nextLine().trim();
                if (!input.equalsIgnoreCase("q")) {
                    // Scanner를 이용해서 화면으로 부터 데이터를 입력받는다(','을 구분자)
                    Scanner s2 = new Scanner(input).useDelimiter(",");
                    record.add(new Student(s2.next(), s2.nextInt(), s2.nextInt(), s2.nextInt(), s2.nextInt(), s2.nextInt()));
                    System.out.println("입력이 잘 되었습니다 입력을 마치려면 q를 입력하세요");
                } else {
                    return;
                }
            } catch (Exception e) {
                System.out.println("입력오류입니다 이름, 반, 번호, 국어성적, 영어성적, 수학성적, 순으로 입력하세요");
            }
        }
    }

    static void displayRecord() {
        int koreanTotal = 0;
        int englisthTotal = 0;
        int mathTotal = 0;
        int total = 0;
        int length = record.size();
        if (length > 0) {
            System.out.println("이름 반 번호 국어 영어 수학 총점 평균 전교 등수 반 등수");
            System.out.println("=========================================");
            for (int i = 0; i < length; i++) {
                Student student = (Student) record.get(i);
                System.out.println(student);
                koreanTotal += student.kor;
                englisthTotal += student.eng;
                mathTotal += student.math;
                total += student.total;
            }
            System.out.println("=========================================");
            System.out.println("총점:" + koreanTotal +  " "  + englisthTotal + " " + mathTotal + " " + total);
            System.out.println();
        } else {
            System.out.println("=========================================");
            System.out.println("데이터가 없습니다.");
            System.out.println("=========================================");
        }
    }

    static class Student implements Comparable {
        String name;
        int ban;
        int no;
        int kor, eng, math;
        int schoolRank;
        int classRank;
        int total;

        public Student(String name, int ban, int no, int kor, int eng, int math) {
            this.name = name;
            this.ban = ban;
            this.no = no;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
            total = kor + eng + math;
        }

        int getTotal() {
            return total;
        }

        float getAverage() {
            return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
        }


        @Override
        public int compareTo(Object o) {
            if (o instanceof Student) {
                Student tmp = (Student) o;
                return tmp.total - total;
            } else {
                return -1;
            }
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", ban=" + ban +
                    ", no=" + no +
                    ", kor=" + kor +
                    ", eng=" + eng +
                    ", math=" + math +
                    ", schoolRank=" + schoolRank +
                    ", classRank=" + classRank +
                    ", total=" + total +
                    '}';
        }
    }
}
