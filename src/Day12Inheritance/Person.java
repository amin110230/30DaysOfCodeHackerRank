package Day12Inheritance;

class Person {

    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                + "\nID: " + idNumber);
    }

}

class Student extends Person {

    private int[] testScores;
    private int sum = 0;
    double avg;

    Student(String fn, String ln, int id, int[] testScore) {
        super(fn, ln, id);
        this.testScores = testScore;
    }

    char calculate() {
        for (int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }
        avg = sum / (testScores.length);

        if (avg >= 90) {
            return 'O';
        } else if (avg >= 80) {
            return 'E';
        } else if (avg >= 70) {
            return 'A';
        } else if (avg >= 55) {
            return 'P';
        } else if (avg >= 40) {
            return 'D';
        } else {
            return 'T';
        }
    }

}
