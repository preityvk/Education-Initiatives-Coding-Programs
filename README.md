# Education-Initiatives-Coding-Programs (Exercise 1)

I. Behavioral Design Patterns Programs:
1. Strategy Pattern (Sorting Algorithms): The Strategy design pattern, which lets the client select an algorithm at runtime, is demonstrated by this software. Throughout the program, classes that implement the `SortStrategy` interface include implementations of the various sorting algorithms (Bubble Sort, Insertion Sort, and Quick Sort). The `SortingAlgorithm} class serves as a context that enables the client to select and alter various sorting techniques. The client code demonstrates how to use any sorting technique while maintaining the integrity of the underlying client logic.
2. Memento Pattern (Text Editor): The Memento design pattern, which records and saves an object's state for later restoration, is exemplified by this application. The object whose state (string content) is being recorded is represented by the `StringEditor` class. The `History` class takes care of the `StringEditor`, saving and restoring its many states, while the `Memento` class keeps track of its current state. The application shows how to save many `StringEditor` states and then return it to a prior state.

II. Creational Design Patterns Programs:
1. Maze Solver (Depth-First Search): This software uses the Depth-First Search (DFS) method to solve a maze. A 2D array is used to depict the labyrinth, with {1} denoting walls and {0} denoting open areas. The `solveMaze` function iteratively navigates the labyrinth, noting cells that have been visited and retracing steps if needed. The path is printed if the solution is discovered. The software shows how to use recursive backtracking in a DFS algorithm to solve a maze.
2. Circle Circumference Calculation: This little program generates a `Circle` class that takes a radius and returns the circle's circumference. The formula `2 * π * radius} is applied using the `calculateCircumference()` function. The `main` function shows how to create a {Circle} object with a radius of {5} and report the circumference that has been computed.

III. Structural Based Patterns Programs:
1. Adapter Pattern (Bird and Duck):  This application demonstrates the **Adapter design pattern**, which enables the coexistence of two incompatible interfaces. A `Duck} object's behavior may be modified using the `DuckAdapter} class so that it behaves more like a `Bird} interface. The `Duck} may fly and emit a sound ({quack}) when using the `Bird} interface methods thanks to the adaptor. The `main} function shows how to include `Duck` functionality into `Bird} interface expectations by utilizing the adaptor.
2. Bridge Design Pattern: The Bridge design pattern is demonstrated by this software, which separates the abstraction (Vehicle) from the implementation (Engine). The `Car` class is capable of working with several engine types since it accepts a `Engine} object and implements the `Vehicle` interface. Implementations of concrete engines include {DieselEngine~ and {PetrolEngine}, each having a separate `start()} function. Two automobiles with various engines are built in the main function to demonstrate how the car may work with both gasoline and diesel engines without being inextricably linked to a particular implementation.

   
# Education-Initiatives-Coding-Programs (Exercise 2)

Step-by-Step Guide to the Virtual Classroom Manager Program

Collections and Imports To utilize different utility classes like Set, List{, Map}, {HashSet{, ArrayList}, and HashMap{, the program first imports `java.util.*}. The classroom data, including students, assignments, and submissions, are managed using these data structures.

Inner Class (Classroom) The Classroom class is a representation of a virtual classroom that contains all pertinent data, including students, assignments, and their responses. The essential components are as follows:

Features:

{name}: A {String} that serves as the name of the classroom. A {Set} containing distinct student IDs is called `students}. No student may be added more than once thanks to a {Set}.
{assignments}: A {List} containing the list of tasks assigned to students in class.
{submissions}: A {Map<String, Set>} called `submissions} keeps track of which students have turned in which assignments. Every student ID corresponds to a {Set} of tasks that they have turned in.
Constructor: This function creates blank data structures for students, assignments, and submissions and initializes a classroom with its name. Key Methods:

{addStudent}: Initializes a new student's submission record and adds them to the classroom.
{scheduleAssignment}: Appends a new task to the classroom's existing list of assignments.
{submitAssignment}: Ensures that only enrolled students may submit by keeping track of a student's submission for a particular assignment.
{getStudents}: Provides the classroom's set of students back.
{getSubmissions`: Provides a map showing the assignments that students have turned in.
Manager Class for Virtual Classrooms This course offers ways to communicate with other classes and oversees some of them. Features:
{classrooms}: A {Map<String, Classroom>} with the classroom name serving as the key that contains all of the classrooms. Constructor: The constructor creates a blank `HashMap} to hold the classroom data. Key Methods:
{addClassroom}: Adds a new classroom if one does not already exist with the same name.
{addStudent}: Allocates a new pupil to a designated classroom.
{scheduleAssignment}: Arranges a fresh task for a certain classroom.
{submitAssignment}: Permits a pupil to turn in an assignment to a particular class.
{listStudentsInClass}: Shows the full list of students registered in a particular classroom, together with their completed assignments and contributions.
Main Method: The program's entry point, the main method, collects user input via a Scanner. A loop takes orders from the user and executes them repeatedly. Command Handling: After dividing user input into command portions, the software handles the command portions according to the kind of command (e.g., creating a classroom, enrolling students). It enables the user to manage students, assignments, and classes interactively.
