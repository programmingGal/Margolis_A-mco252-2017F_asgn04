

// Observer #1 favors the republican candidate

public class RepFavoringReporter1 extends BasicReporter 
{  
	public RepFavoringReporter1 (ElectionData electionData)
    {  
    	
		super(electionData); 
    	// call strategies that favor republican candidates
    	
   	 popVote = new PopularVoteStrategy1();
   	 electVote = new ElectoralCollege1StateRepubStrategy1();
   	 reporterNum = 1;
    }
	
	
	
	
	
    
    
   
    
}
