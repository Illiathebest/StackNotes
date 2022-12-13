package stacknotes;
import java.util.ArrayList;

public class StackNotes {
    
    public static void main(String[] args) {
        
    }
    
    private ArrayList<String> notes= new ArrayList<String>();

    private int head = -1;

    public void push(String note) {
        head++;
        notes.add(head, note);
    }

    public String pop() {
        if (head != -1) {
            String note = notes.get(head);
            notes.remove(head);
            head--;
            return note;
        } else
            return "Stack is empty";
    }

    public boolean is_empty() {
        return head == -1;
    }
}
