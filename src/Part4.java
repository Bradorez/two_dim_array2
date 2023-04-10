import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Part4
{
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the name of the input file: ");
            String inputFile = scanner.nextLine();
            String outputFile = inputFile + ".txt";
            // Get the current working directory
            String currentDir = System.getProperty("user.dir");

            // Print the current working directory
            System.out.println("Current working directory: " + currentDir);

            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                 PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(outputFile))))
            {
                String line;
                int lineNumber = 1;
                while ((line = reader.readLine()) != null)
                    {
                        writer.printf("[%03d] %s%n", lineNumber, line);
                        lineNumber++;
                    }
            } catch (IOException e)
            {
                System.err.println("Error: " + e.getMessage());
            }
        }



}
