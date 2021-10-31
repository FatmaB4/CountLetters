import static java.lang.System.*;

class Main {
	public static void main( String args[] )	{
    String [] vals = new String [] { "a", "b", "c", "7", "x", "2", "9"};
    int valsLength = vals.length;
    //test cases, one of the three test cases can be tried one after another
    //by openning the lines and closing the others
    //object for test1
    CountLetters cl = new CountLetters(10,10, vals );
    //object test2,
    //CountLetters cl = new CountLetters(5,5, vals );
    //object test3
    //CountLetters cl = new CountLetters(10,15, vals );

    int [] numOfChars  = new int [valsLength];
    //count the number of each characters
    for ( int i = 0 ; i < valsLength ; i++){
      numOfChars[i]=  cl.countVals(vals[i]);
    }

    int largestIndex = largestIndex(numOfChars, valsLength);
    //output
    System.out.println("Output");
    System.out.println(cl.toString());
    String str1 = "";
    int count1=0;

    for (int k = 0; k<valsLength ; k++){
      count1 = numOfChars[k];
      str1 = vals[k];
      System.out.println(str1  + " count is " + count1 );
    }
    System.out.println(vals [largestIndex]  + " occurs the most " );
}

 public static int largestIndex(int arr[], int n) {
    int max = arr[0];
    int index = 0;
    for (int i = 1; i < n; i++){
        if (arr[i] > max){
            max = arr[i];
            index = i;
        }
    }
    return index;
  }
}
