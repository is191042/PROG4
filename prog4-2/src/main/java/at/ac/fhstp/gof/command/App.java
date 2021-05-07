package at.ac.fhstp.gof.command;

import at.ac.fhstp.gof.command.command.OpenTextFileOperation;
import at.ac.fhstp.gof.command.command.SaveTextFileOperation;
import at.ac.fhstp.gof.command.command.TextFileOperation;
import at.ac.fhstp.gof.command.invoker.TextFileOperationExecutor;
import at.ac.fhstp.gof.command.receiver.TextFile;

public class App {
    public static void main(String[] args) {
        TextFileOperation openTextFileOperation = new OpenTextFileOperation(new TextFile("file1.txt"));
        TextFileOperation saveTextFileOperation = new SaveTextFileOperation(new TextFile("file2.txt"));
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        System.out.println(textFileOperationExecutor.executeOperation(openTextFileOperation));
        System.out.println(textFileOperationExecutor.executeOperation(saveTextFileOperation));
    }
}
