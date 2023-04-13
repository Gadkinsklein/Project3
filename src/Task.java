import java.util.Collections;
import java.util.Iterator;

class Task implements Comparable<Task>,Iterable<Task>{
    private String title;
    private String desc;
    private int priority;

    public Task(String title, String desc, int priority) {
        this.title = title;
        this.desc = desc;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "task{" +
                "title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", priority=" + priority +
                '}';
    }

    @Override
    public int compareTo(Task other) {
        int compareResult = this.title.compareTo(other.title);


        if(compareResult==0) {
            if(this.priority< other.priority){
                return -1;
            }
        }
        return compareResult;


    }

    @Override
    public Iterator<Task> iterator() {
        return this.iterator();
    }
}
