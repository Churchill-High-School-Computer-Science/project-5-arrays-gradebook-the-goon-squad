public class Gradebook {

    String[] labels = { "Last", "First", "Test1", "Test2", "Quiz1", "Quiz2", "Homework1", "Homework2", "Homework3",
            "Homework4", "Homework5", "Homework6", "Homework7", "Homework8", "Homework9", "Homework10" };

    String[][] book;

    public Gradebook(String[][] b) {
        if (b.length > 0 && b[0].length == 16) {
            book = b;
        }

        else {
            System.out.println("Gradebook is not the right size. Ensure that formatting is correct.");
            book = new String[1][16];
        }
    }

    public boolean changeGrade(String lastName, String assnName, int newGrade) {
        int colIndex = -1;

        for (int i = 0; i < labels.length; i++) {
            if (labels[i].equalsIgnoreCase(assnName)) {
                colIndex = i;
                break;
            }
        }
    
        for (String[] book1 : book) {
            if (book1[0].equalsIgnoreCase(lastName)) {
                book1[colIndex] = String.valueOf(newGrade);
                return true;
            }
        }
    
        System.out.println("Student not found.");
        return false;
    }

    public double findAssignmentAverage(String assnName) {
        int colIndex = -1;

        for (int i = 0; i < labels.length; i++) {
            if (labels[i].equalsIgnoreCase(assnName)) {
                colIndex = i;
                break;
            }
        }
    
        double total = 0;
        int count = 0;
    
        for (String[] book1 : book) {
                total += Double.parseDouble(book1[colIndex]);
                count++;
            }

        return total / count;
    }

    public double findStudentAverage(String lastName) 
    {
        // Your code here
        int sigma = 0;
        int antisigma = 0;
        for (String[] book1 : book) 
        {
            
            {
                if (book1[0].equalsIgnoreCase(lastName)) 
                {
                    for (int j = 0; j < book1.length; j++) 
                    {
                        if (antisigma >= 2) 
                        {
                            Double gyat = Double.parseDouble(book1[j]);  
                     
                        sigma += gyat; 
                        }
                        antisigma += 1; 
                    }
                }           
                  
            }      
            
        }
        return (double)sigma / 12;
    }

    

            
                    
            
      
            
        
       
    

    public void printStudentInfo(String lastName) {
        for (String[] book1 : book) {
            if (book1[0].equalsIgnoreCase(lastName)) {
                for (int j = 0; j < book1.length; j++) {
                    System.out.println(labels[j] + ": " + book1[j]);
                }
                System.out.println("---------");
                return;
            }
        }
    }

}
