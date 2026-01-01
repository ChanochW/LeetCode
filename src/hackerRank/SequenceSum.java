package hackerRank;

public class SequenceSum {
    private int i, j, k, answer = 0;
    public SequenceSum(int i, int j, int k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }
    public SequenceSum() {
        this(5, 9, 6);
    }
    public int getAnswer() {
        return answer;
    }
    public void solve() {
        answer = (i + j) * (j - i + 1) / 2 + (k + j - 1) * (j - k) / 2;

//        Doesn't work with negatives:
//        answer = ((j * (j + 1) - (i - 1) * ((i - 1) + 1)) + ((j - 1) * ((j - 1) + 1) - (k - 1) * ((k - 1) + 1)))/2;

//        non-constant solution and probably also doesn't work with negatives:
//        int sum = 0, result = 0;
//
//        for(int c = i; c <= j; c++){
//            sum += c;
//        }
//
//        result += sum;
//
//        for(int x = j; x > k; x-- ){
//            result = result + (x-1);
//        }
//
//        answer = result;
    }
}
