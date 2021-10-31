public class CountLetters
{
  private String[][] grid;

   //load vals into the rows x cols grid randomly
	public CountLetters(int rows, int cols, String[] vals) {
     grid=new String [rows][cols];
     int valLength = vals.length;

    for (int i = 0; i < rows; i++){
      for (int j= 0; j < cols; j++){
        int randNumber = ((int) (Math.random()*(valLength)));
        // System.out.println("random" + randNumber);
        grid [i][j]=vals[randNumber];
      }
    }
  }
  public int getRows(){
    return grid.length;
}
  public int getCols(){
    return grid[0].length;
}
	//find out which of the vals occurs the most
	public String findMax(String[] vals) {
		return "nothing yet";
	}

	//returns a count of how many times val occurs in the matrix
	public int countVals(String val )	{
    int counter=0;

     for (int i = 0; i < getRows(); i++) {
      for (int j=0; j <getCols(); j++) {
       if ( val.equals(grid[i][j])){
        counter++;
       }
		  }
    }
     return counter;
  }

	//display the grid
	public String toString() {
		String output="";

    for (int i = 0; i < getRows(); i++) {
      for (int j=0; j < getCols(); j++) {
        output = output + grid [i][j] + " ";
      }
      output = output + "\n";
	  }
  
		return output;
	}
}