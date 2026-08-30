import java.util.Scanner;

// Takes marks input from user
public class StudentMarksAnalyticsSystem {
    static int[] takeInputs(Scanner sc, int size) {
        int[] marks = new int[size];
        for(int i = 0; i < marks.length; i++) {
         System.out.println("Enter marks for student " + (i + 1) + ": ");
         marks[i] =sc.nextInt();
        }
        return marks;
    }

    // Displays all students marks
    static void displayMarks(int[] marks) {
        for(int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        
    }

    //  Finds the highest mark
    static int findMax(int[] marks) {
         int max = marks[0];
         for(int i = 1; i < marks.length; i++) {
            if(marks[i] > max) {
                max = marks[i];
            }
        
         }
         return max;
    }

    // Finds the lowest mark
    static int findMin(int[] marks) {
        int min = marks[0];
        for(int i = 1; i < marks.length; i++) {
            if(min > marks[i]) {
                min = marks[i];
            }
        }
        return min;
    } 

    // Calculates the average mark
    static double calculateAverage(int[] marks) {
       int sum = 0;
     for(int i = 0; i < marks.length; i++) {
        sum += marks[i];
        
     }
     return (double) sum / marks.length;
    }
    
    // Finds the index of a target mark
    static int linearSearch(int[] marks, int target) {
        for(int i = 0; i < marks.length; i++) {
            if(marks[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Counts occurrence of a target marks
    static int countOccurrences(int[] marks, int target) {
        int count = 0;
        for(int i = 0; i < marks.length; i++) {
            if(marks[i] == target) {
                count++;
            }
        }
        return count;
    }

    // Reverse the marks array
    static void reverseMarks(int[] marks) {
         int left = 0;
         int right = marks.length - 1;
         while(left < right) {
            int temp = marks[left];
            marks[left] = marks[right];
            marks[right] = temp;

            left++;
            right--;
         }
         
    }

    // Searchs for a target mark using binary search
    static int binarySearch(int[] marks,int target) {
       int left = 0;
       int right = marks.length - 1;
     while(left <= right) {
        int mid = (left + right) / 2;
        if(marks[mid] == target) {
            return mid;
        } else if (marks[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
     }
     return -1;
    }

    // Sorts marks in ascending order
    static void sortMarks(int[] marks) {
        for(int i = 0; i < marks.length - 1; i++) {
            for(int j = 0; j < marks.length - 1 - i; j++) {
              if(marks[j] > marks[j + 1]){
                int temp = marks[j];
                marks[j] = marks[j + 1];
                marks[j + 1] = temp;
            }
        }
        }
    }

    // Finds the second highest distinct mark
    static int findSecondLargest(int[] marks) {
        int largest = marks[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < marks.length; i++) {
        if(marks[i] > largest) {
            secondLargest = largest;
            largest = marks[i];
         } else if(marks[i] > secondLargest && marks[i] != largest) {
            secondLargest = marks[i];
         }
       }
       return secondLargest;
    }

    // Takes subject-wise marks for multiple students
    static int[][] takeMatrix(Scanner sc, int students, int subjects) {
        int[][] marksMatrix = new int[students][subjects];
        for(int i = 0; i < students; i++) {
            for(int j = 0; j < subjects; j++) {
            System.out.println(
                "Enter marks for Student " + (i + 1) + 
                ", Subjects " + (j + 1) + ": "
            );
            marksMatrix[i][j] = sc.nextInt();
            }
        }
        return marksMatrix;
    }

    // Display subject-wise marks
    static void displayMatrix(int[][] marksMatrix) {
        for(int i = 0; i < marksMatrix.length; i++) {
            for(int j = 0; j < marksMatrix[i].length; j++) {
                System.out.print(marksMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Calculates total marks for each student
    static int[] totalMatrix(int[][]  marksMatrix) {
       int[] totals = new int[marksMatrix.length];
       for(int i = 0; i < marksMatrix.length; i++) {
        int sum = 0;
        for(int j = 0; j < marksMatrix[i].length; j++) {
            sum += marksMatrix[i][j];
        }
        totals[i] = sum;
       }
       return totals;
    }

    // Calculates average marks for each subject
    static double[] calculateSubjectAverages(int[][] marksMatrix) {
        double[] averages = new double[marksMatrix[0].length];
        for(int j = 0; j < marksMatrix[0].length; j++) {
            int sum = 0;
            for(int i = 0; i < marksMatrix.length; i++) {
                sum += marksMatrix[i][j];
            }
             averages[j] = (double) sum / marksMatrix.length;
        }
        return averages;
    }

    // Transposes the marks matrix
    static int[][] transposeMatrix(int[][] marksMatrix) {
        int[][] transpose = new int[marksMatrix[0].length][marksMatrix.length];
        for(int i = 0; i < marksMatrix.length; i++) {
            for(int j = 0; j < marksMatrix[i].length; j++) {
                transpose[j][i] = marksMatrix[i][j];
            }
        }
        return transpose;
    }

    // Searchs for target in marks matrix
    static boolean searchInMatrix(int[][] marksMatrix, int target) {
        for(int i = 0; i < marksMatrix.length; i++) {
            for(int j = 0; j < marksMatrix[i].length; j++) {
                if(marksMatrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;

    }
    // Calculates the sum of both daigonals
    static int diagonalSum(int[][] marksMatrix) {
        int sum = 0;
        for(int i = 0; i < marksMatrix.length; i++) {
            sum += marksMatrix[i][i];
            if(i != marksMatrix.length - 1 - i) {
                sum += marksMatrix[i][marksMatrix.length - 1 - i];
            }
        }
        return sum;
    }
    static int findTopStudent(int[] totals) {
        int highestIndex = 0;
        for(int i = 0; i < totals.length; i++) {
            if(totals[i] > totals[highestIndex]) {
                highestIndex = i;
            }
        }
        return highestIndex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //   Takes no of student & size marks as input from user
        System.out.print("Enter number of student :");
        int size = sc.nextInt();
        int[] marks = takeInputs(sc, size);

        // Display all student marks
      displayMarks(marks);

    //   Finds and displays highest mark
    int max = findMax(marks);
    System.out.println("Highest marks: " + max);

    // finds and displays lowest marks
    int min = findMin(marks);
    System.out.println("Lowest marks: " + min);

    // Calculates and displays the average marks
    double average = calculateAverage(marks);
    System.out.printf("Average mark: %.2f%n" , average);

    // Takes a target mark to search 
    System.out.println("Enter mark to search: ");
    int target = sc.nextInt();

    // Search for the target mark
    int index = linearSearch(marks, target);
    if(index != -1) {
        System.out.println("Marks found at index: " + index);
    } else {
        System.out.println("Marks not found");
    }


//   Count occurrences of the target mark
int count = countOccurrences(marks, target);
System.out.println("Target occurs: " + count + " time(s)");

System.out.println("Reversed marks: ");
// Reverses the marks array
reverseMarks(marks);
// Displays reversed marks
displayMarks(marks);


// Sort marks in ascending order
   sortMarks(marks);
   System.out.println("Sorted Marks: ");
   displayMarks(marks);

//    Searches for the target mark using binary search
int binaryIndex = binarySearch(marks, target);
if(binaryIndex != -1) {
    System.out.println("Target found at index: " + binaryIndex);
} else {
    System.out.println("Target not found");
}


// Finds and displays the second highest mark
int secondLargest = findSecondLargest(marks);
System.out.println("Second Highest Mark: " + secondLargest);

System.out.print("Enter number of students for 2D marks: ");
int students = sc.nextInt();

System.out.print("Enter number of subjects: ");
int subjects = sc.nextInt();

// Takes subject-wise marks matrix
int[][] marksMatrix = takeMatrix(sc, students, subjects);
// Displays the marks matrix
System.out.println("Student marks matrix: ");
displayMatrix(marksMatrix);

// Calculates total marks for each student
int[] totals = totalMatrix(marksMatrix);

System.out.println("Student-wise Totals: ");
for(int i = 0; i < totals.length; i++) {
    System.out.print("Students " + (i + 1) + ": " + totals[i]);
}

// Calculates average marks for each subject
double[] subjectAverages = calculateSubjectAverages(marksMatrix);

System.out.println("Subject-wise Averages: ");
for(int i = 0; i < subjectAverages.length; i++) {
    System.out.printf("subject %d: %2f%n", subjectAverages[i]);
}

// Transposes the marks matrix
int[][] transposedMatrix = transposeMatrix(marksMatrix);

System.out.println("Transposed Matrix: ");
displayMatrix(transposedMatrix);


System.out.print("Enter mark to search in matrix: ");
int matrixTarget = sc.nextInt();
// Searches for target mark in the matrix
boolean foundInMatrix =searchInMatrix(marksMatrix, matrixTarget);
if(foundInMatrix) {
    System.out.println("Mark found in matrix");
} else {
    System.out.println("Mark not found in matrix");
}

// Calculates and displays the diagonal sum for a square matrix
if(marksMatrix.length == marksMatrix[0].length) {
    int diagonalSum = diagonalSum(marksMatrix);
    System.out.println("Diagonal Sum: " + diagonalSum);
} else {
    System.out.println("Diagonal sum requires a square matrix.");
}

// Finds and displays the top-performing student
int topStudent = findTopStudent(totals);

System.out.println("Top Student: student " + (topStudent + 1));
System.out.println("Total Marks: " + totals[topStudent]);

sc.close();
    }
    
}
