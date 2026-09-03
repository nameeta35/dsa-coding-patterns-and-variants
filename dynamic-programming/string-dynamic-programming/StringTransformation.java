import java.io.IOException;
import java.util.Arrays;

/*
You have two strings. You can perform the following operations:

- Insert one character
- Delete one character
- Replace one character

Return the minimum number of operations required to transform the first string into the second.

word1 = "abb"
word2 = "ad"

output = 2
*/

/*
    abb
      i
    ad
      j

     insert(i, j+1)
     delete(i+1, j)
     replace(i+1, j+1)

    minOperations(i, j)
    if i == s1.length
      return s2.length() - j
    if j == s2.length //2
      return s1.length() - i 
    if chars at i & j are equal
      minOperations(i+1, j+1)
    else 
      Math.min(minOperations(), minOperat..........)

    abb
     i
    ad
     j
    op(0,0) -> op(1,1)[1 + 1] -> op(2,1)[1 + 0] -> op(3,1)[1]
                                        -> op(2,2)[1]
                                        -> op(3,2)[0]
                          -> op(1,2)//[2]
                          -> op(2,2)//[1]
//"ab" -> "abbd"
output = 2
"ab"
   i
"abbd"
   j
*/
class StringTransformation{
  public static int minOperations(String s1, String s2){
    int[][] transformations = new int[s1.length() +  1][s2.length() + 1];
    for (int[] row : transformations){
        Arrays.fill(row, -1);
    }

    return transform(0, 0, s1, s2, transformations);
  }

  public static int transform(int i, int j, String s1, String s2, int[][] transformations){
    if (i == s1.length()){
      return s2.length() - j; 
    }
    if (j == s2.length()){ //2
      return s1.length() - i;
    }
    if (transformations[i][j] != -1){
      return transformations[i][j];
    }
    if(s1.charAt(i) == s2.charAt(j)){
      transformations[i][j] = transform(i+1, j+1, s1, s2, transformations);
    } else {
        int insert = transform(i, j + 1, s1, s2, transformations);
        int delete = transform(i + 1, j, s1, s2, transformations);
        int replace = transform(i + 1, j + 1, s1, s2, transformations);
      transformations[i][j] =  1 + Math.min(insert, Math.min(delete, replace));
    }
    return transformations[i][j];
  }

  public static void main(String[] args) throws IOException {
    String s1 = "horse";
    String s2 = "ros";
    System.out.println("Min operations to transform " + minOperations(s1, s2));
  }
}
//time complexity  = O(M * N)
//space complexity = O(M * N)