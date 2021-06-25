class RadixSort {
  
  private static String[] addPaddingDigits(int[] arr) {
    int n = arr.length;
    int maxDigits = getMaxDigits(arr);
    String[] arrStr = new String[n];
    // adds padding to numbers represented as strings
    for (int i = 0; i < n; i++) {
      arrStr[i] = String.valueOf(arr[i]);
      int numberLength = arrStr[i].length();
      int zerosToAdd = maxDigits - numberLength;
      String zeros = "";
      for (int j = 0; j < zerosToAdd; j++)
      zeros += "0";
      arrStr[i] = zeros + arrStr[i];
    }
    
    return arrStr;
  }
  
  private static int getMaxDigits(int[] arr) {
    int n = arr.length;
    int maxDigits = 0;
    // Copy values to new array as String and get 
    // the max number of digits
    for (int i = 0; i < n; i++) {
      String numberStr = String.valueOf(arr[i]);
      int numberLength = numberStr.length();
      if (numberLength > maxDigits)
        maxDigits = numberLength;
    }
    return maxDigits;
  }
  
  public static void radixSort(int[] arr) {
    int n = arr.length;
    String[] arrStr = addPaddingDigits(arr);
    for (int i = 0; i < n; i++)
      System.out.println(arrStr[i]);
  }
  
  public static void main(String [] args) {
    int [] arr = {10, 30, 20, 80, 60, 128, 2400, 40, 50, 70, 90, 1999, 234, 30008};
    radixSort(arr);
  }
}