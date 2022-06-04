#include <iostream>
#include <vector>
using namespace std;
class Solution
{
public:
  int diagonalSum(vector<vector<int> > mat)
  {
    int sum = 0;
    for (int i = 0; i < mat.size(); i++)
    {
      sum += mat[i][i] + mat[i][mat.size() - 1 - i];
      if (i == mat.size() - 1 - i)
        sum -= mat[i][i];
    }
    return sum;
  }

  void solution()
  {
    vector<vector<int> > v{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    cout << diagonalSum(v);
  }
};