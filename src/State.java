
public class State 
{
	

	
		// This class stores data about each of the states we're reporting on
	  private String stateName;
	  private  int democratVotes;
	  private int republicanVotes;
	  private int electoralVotes;
	   
	   public State (String stateName)
	   {
		   this.stateName = stateName;
	   }

	public int getDemocratVotes() {
		return democratVotes;
	}

	public void setDemocratVotes(int democratVotes) {
		this.democratVotes = democratVotes;
	}

	public int getRepublicanVotes() {
		return republicanVotes;
	}

	public void setRepublicanVotes(int republicanVotes) {
		this.republicanVotes = republicanVotes;
	}

	public int getElectoralVotes() {
		return electoralVotes;
	}

	public void setElectoralVotes(int electoralVotes) {
		this.electoralVotes = electoralVotes;
	}
	
	public String getStateName()
	{
		return stateName;
	}
	   
	   
	   
	   
	   
	}


