/*The Interpreter design pattern is a behavioral pattern that specifies how to understand and evaluate language grammar or phrases.
It allows you to build a grammatical version for a language and an interpreter to handle the grammar, which is useful in situations where you need to understand and execute statements or commands in a domain-specific language (DSL). */

/*The code showcases the Memento design pattern in Java, which allows you to create snapshots of an object's state.
The TextEditor class represents the object whose state is being recorded, and it has methods for setting and retrieving text, as well as saving and restoring state. 
The Memento class saves a snapshot of the TextEditor object's state, while the History class works as the caretaker by preserving several snapshots. 
The Main2 class shows how to apply the Memento pattern by creating instances of TextEditor and History, setting the starting text, saving the state, and restoring the text to a prior state.
The Main2 class returns "Restored text: Hello, Universe!" which indicates that the TextEditor object's state has been successfully restored. */

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// Originator class
class StringEditor {
    // The string is being edited
    private String string;

    // Set the string
    public void setString(String string) {
        this.string = string;
    }

    // Get the string
    public String getString() {
        return string;
    }

    // Save the current state of the string editor to a Memento object
    public Memento save() {
        return new Memento(string);
    }

    // Restore the string editor to a previous state from a Memento object
    public void restore(Memento memento) {
        string = memento.getString();
    }
}

// Memento class
class Memento {
    // The saved string
    private String string;

    // Create a Memento object with the given string
    public Memento(String string) {
        this.string = string;
    }

    // Get the saved string
    public String getString() {
        return string;
    }
}

// Caretaker class
class History {
    // A list of Memento objects
    private List<Memento> mementos = new ArrayList<>();

    // Save single Memento object to the history
    public void saveMemento(Memento memento) {
        mementos.add(memento);
    }

    // Get a Memento object from the history using index
    public Memento getMemento(int index) {
        return mementos.get(index);
    }
}

// Client code
public class BehavMain2 {
    public static void main(String[] args) {
        // Create a StringEditor object
        StringEditor stringEditor = new StringEditor();
        // Create a History object to store different states
        History history = new History();

        // Set the initial string
        stringEditor.setString("Good Morning!");
        // Save the initial state to the history
        history.saveMemento(stringEditor.save());

        // Change the string
        stringEditor.setString("Good Afternoon!");
        // Save the newest state to the history
        history.saveMemento(stringEditor.save());

        // Changes the string
        stringEditor.setString("Good Evening!");
        // Save the newest state to the history
        history.saveMemento(stringEditor.save());

        // Restore to a previous state (i.e., the second state)
        stringEditor.restore(history.getMemento(1));
        System.out.println("Restored String: " + stringEditor.getString());
    }
}