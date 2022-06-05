
/*
 
551. You are given a string s representing an attendance record for a student where each 
character signifies whether the student was absent, late, or present on that day. The 
record only contains the following three characters:
'A': Absent.
'L': Late.
'P': Present.
The student is eligible for an attendance award if they meet both of the following criteria:

The student was absent ('A') for strictly fewer than 2 days total.
The student was never late ('L') for 3 or more consecutive days.
Return true if the student is eligible for an attendance award, or false otherwise.
 */
import java.util.*;

public class StudentAttendanceRecordI {
  public static void main(String[] args) {
    System.out.println(solution("PPALLL"));
  }

  public static boolean solution(String s) {
    int absent = 0;
    int late = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'A')
        absent++;
      if (s.charAt(i) == 'L')
        late++;
      else
        late = 0;
      if (absent >= 2)
        return false;
      if (late >= 3)
        return false;
    }
    return true;
  }
}