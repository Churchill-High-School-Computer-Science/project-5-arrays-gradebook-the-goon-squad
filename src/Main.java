public class Main {
    public static void main(String[] args) {

        String[][] data1 = {
                { "Borjigin", "Temüjin", "85.0", "90.0", "80.0", "88.0", "75.0", "80.0", "70.0", "85.0", "90.0", "95.0",
                        "85.0", "78.0", "88.0", "92.0" },
                { "Jadran", "Jamukha", "78.0", "82.0", "85.0", "80.0", "88.0", "90.0", "92.0", "95.0", "85.0", "87.0",
                        "90.0", "93.0", "88.0", "85.0" },
                { "Khereid", "Toghrul", "92.0", "88.0", "91.0", "89.0", "84.0", "86.0", "85.0", "82.0", "88.0", "90.0",
                        "91.0", "89.0", "90.0", "93.0" }
        };

        String[][] data2 = {
                { "Rostov", "Nikolai", "88.0", "92.0", "78.0", "85.0", "80.0", "83.0", "85.0", "90.0", "88.0", "87.0",
                        "85.0", "89.0", "90.0", "86.0" },
                { "Bolkov", "Andrei", "95.0", "87.0", "89.0", "91.0", "93.0", "90.0", "88.0", "85.0", "92.0", "94.0",
                        "89.0", "92.0", "90.0", "93.0" },
                { "Kuragin", "Anatole", "76.0", "80.0", "72.0", "70.0", "78.0", "75.0", "77.0", "74.0", "79.0", "73.0",
                        "81.0", "76.0", "78.0", "72.0" },
                { "Bezukhov", "Pierre", "90.0", "85.0", "82.0", "84.0", "88.0", "87.0", "85.0", "83.0", "86.0", "89.0",
                        "90.0", "91.0", "89.0", "88.0" },
                { "Rostova", "Natasha", "92.0", "89.0", "85.0", "88.0", "90.0", "89.0", "91.0", "88.0", "92.0", "90.0",
                        "88.0", "87.0", "90.0", "91.0" },
                { "Drubetskoy", "Boris", "84.0", "80.0", "78.0", "81.0", "82.0", "79.0", "84.0", "83.0", "85.0", "82.0",
                        "80.0", "86.0", "83.0", "84.0" },
                { "Dolokhov", "Fyodor", "89.0", "85.0", "88.0", "84.0", "83.0", "87.0", "90.0", "85.0", "88.0", "86.0",
                        "84.0", "89.0", "85.0", "86.0" },
                { "Karagin", "Helene", "78.0", "82.0", "80.0", "79.0", "81.0", "80.0", "83.0", "85.0", "84.0", "82.0",
                        "81.0", "79.0", "80.0", "84.0" },
                { "Bolkonsky", "Andrei", "93.0", "89.0", "90.0", "91.0", "88.0", "87.0", "92.0", "89.0", "90.0", "92.0",
                        "93.0", "91.0", "92.0", "89.0" },
                { "Bolkonskaya", "Maria", "85.0", "88.0", "86.0", "84.0", "83.0", "82.0", "87.0", "85.0", "86.0",
                        "88.0", "85.0", "89.0", "88.0", "86.0" }
        };

        Gradebook testBook1 = new Gradebook(data1);
        Gradebook testBook2 = new Gradebook(data2);


        // Change a grade
        String assnName = "Test1";
        testBook1.changeGrade("Borjigin", assnName, 100);
        testBook2.changeGrade("Rostova", assnName, 100);

        System.out.println(assnName + " average: " + testBook1.findAssignmentAverage(assnName));
        System.out.println(assnName +" average: " + testBook2.findAssignmentAverage(assnName));

        // Find the student's average
        System.out.println("Temüjin Borjigin's average: " + testBook1.findStudentAverage("Borjigin"));
        System.out.println("Natasha Rostova's average: " + testBook2.findStudentAverage("Rostova"));

        // Print student's info
        System.out.println("Temüjin Borjigin's info:");
        testBook1.printStudentInfo("Borjigin");

        System.out.println("Natasha Rostova's info:");
        testBook2.printStudentInfo("Rostova");


    }
}
