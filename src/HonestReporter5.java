
//Observer #5 reports the popular vote and electoral vote honestly.

public class HonestReporter5 extends BasicReporter
{
   public HonestReporter5(ElectionData electionData)
   {
	   super (electionData);
	   
	   popVote = new PopularVoteStrategy3();
	   electVote = new ElectoralCollegeHonestStrategy5();
	   reporterNum = 5;
   }
}
