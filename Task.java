

	//import java.util.Date;
	import java.util.Objects;

	public class Task {
	    private int id;
	    private String title;
	    private String description;
	    private String status;
	   // private Date dueDate;

	    //Date dueDate
	    public Task(int id, String title, String description, String status) {
	        this.id = id;
	        this.title = title;
	        this.description = description;
	        this.status = status;
	      //  this.dueDate = dueDate;
	    }

	    // Getters and setters
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

	    public String getStatus() {
	        return status;
	    }

	    public void setStatus(String status) {
	        this.status = status;
	    }

	  /*  public Date getDueDate() {
	        return dueDate;
	    }

	    public void setDueDate(Date dueDate) {
	        this.dueDate = dueDate;
	    }
*/
	    @Override
	    public String toString() {
	        return "Task [id=" + id + ", title=" + title + ", description=" + description + ", "
	        		+ "status=" + status + " ]"; //dueDate=" + dueDate +
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Task task = (Task) o;
	        return id == task.id && Objects.equals(title, task.title) && Objects.equals(description, task.description) 
	        		&& Objects.equals(status, task.status);
	        		
	        		//&& Objects.equals(dueDate, task.dueDate);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(id, title, description, status); // dueDate
	    }
	}



