
public class ElectionReportingProgram 
{
  public static void main (String [] args)
  {  
	  
	  
	  ElectionData electionData = new ElectionData();
	  
	  // need code to pass this object to all observers (instantiate them)
	  /*RepFavoringReporter1 reporter1 = new RepFavoringReporter1(electionData);
	  DemFavoringReporter2 reporter2 = new DemFavoringReporter2(electionData);
	  DemPopularRepElectoralReporter3 reporter3 = new DemPopularRepElectoralReporter3(electionData);
	  FavorDemForPopularReporter4 reporter4 = new FavorDemForPopularReporter4(electionData);
	  HonestReporter5 reporter5 = new HonestReporter5(electionData);*/
	  HonestReporter5 reporter5 = new HonestReporter5(electionData);
	  FavorDemForPopularReporter4 reporter4 = new FavorDemForPopularReporter4(electionData);
	  DemPopularRepElectoralReporter3 reporter3 = new DemPopularRepElectoralReporter3(electionData);
	  DemFavoringReporter2 reporter2 = new DemFavoringReporter2(electionData);
	  RepFavoringReporter1 reporter1 = new RepFavoringReporter1(electionData);
	  
	  
	  // add the rest when make them
      
      // to hold the values for each of the 5 states
      int [] democratVotes = new int [5];
      int [] republicanVotes = new int [5];
      int [] electoralVotes = new int [5];
      
      democratVotes[0] = 122;
      democratVotes[1] = 58;
      democratVotes[2] = 500;
      democratVotes[3] = 100;
      democratVotes[4] = 350;
      
      republicanVotes[0] = 338;
      republicanVotes[1] = 900;
      republicanVotes[2] = 400;
      republicanVotes[3] = 200;
      republicanVotes[4] = 348;
      
      electoralVotes[0] = 29;
      electoralVotes[1] = 14;
      electoralVotes[2]= 29;
      electoralVotes[3] = 38;
      electoralVotes[4] = 10;
      
      
      System.out.println("Reporting in real time! Here are the latest election reports:");
      electionData.setData(democratVotes, republicanVotes, electoralVotes);
      
      
      // change election results
      democratVotes[0] = 98;
      democratVotes[1] = 74;
      democratVotes[2] = 900;
      democratVotes[3] = 1200;
      democratVotes[4] = 1400;
      
      republicanVotes[0] = 100;
      republicanVotes[1] = 78;
      republicanVotes[2] = 800;
      republicanVotes[3] = 1195;
      republicanVotes[4] = 600;
      
      System.out.println("\n\nReporting in real time! Here are the latest election reports:");
      electionData.setData(democratVotes, republicanVotes, electoralVotes);
      
      // change it again:
      
  
      democratVotes[0] = 900;
      democratVotes[1] = 380;
      democratVotes[2] = 180;
      democratVotes[3] = 776;
      democratVotes[4] = 999;
      
      republicanVotes[0] = 500;
      republicanVotes[1] = 480;
      republicanVotes[2] = 160;
      republicanVotes[3] = 190;
      republicanVotes[4] = 700;
      
      System.out.println("\n\nReporting in real time! Here are the latest election reports:");
      electionData.setData(democratVotes, republicanVotes, electoralVotes);
      
	  
  }
}
