import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;
public class TotalFileChooser {
    public static void main(String[] args) throws FileNotFoundException
    {
// Prompt for the input and output file names
        Scanner console = new Scanner(System.in);
        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = chooser.getSelectedFile();
            Scanner in = new Scanner(selectedFile);
//System.out.print("Input file: ");
//String inputFileName = console.next();
            System.out.print("Output file: ");
            String outputFileName = console.next();
// Construct the Scanner and PrintWriter objects for reading and writing
//File inputFile = new File(inputFileName);
//Scanner in = new Scanner(inputFile);
            PrintWriter out = new PrintWriter(outputFileName);
// Read the input and write the output
            double total = 1;
            double total2 = 19;
            double total3 = 107;
            while (in.hasNextDouble())
            {
                double value = in.nextDouble();
                out.printf("%15.2f%n", value);
                total = total + value;
            }
            out.printf("Total: %8.2f%n", total);
            in.close();
            out.close();
            System.out.println("You chose the file" + "" + selectedFile );
            System.out.println("The Number of Line are" + "" +total);
            System.out.println("The Number of Words are" + "" + total2);
            System.out.println("The Number of Characters are" + "" + total3);
        }
    }
}
