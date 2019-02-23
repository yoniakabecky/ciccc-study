package Week1.Variables;

public class YourSchedule {
    public static void main(String[] args) {
        String[] course = {"English III", "Precalculus", "Music Theory", "Biotechnology",
                            "Principles of Technology I", "Latin II", "AP US History",
                            "Business Computer Infomation Systems"};
        String[] teacher = {"Ms. Lapan", "Mrs. Gideon", "Mr. Davis", "Ms. Palmer",
                            "Ms. Garcia", "Mrs. Barnett", "Ms. Johannessen", "Mr. James"};

        printLine();

        // print schedule
        for (int j = 0; j < 8; j++) {
            System.out.printf("| %d | %36s | %15s |\n", j+1, course[j], teacher[j]);
        }

        printLine();
    }

    public static void printLine() {
        System.out.print("+");
        for (int i = 0; i < 60; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}


