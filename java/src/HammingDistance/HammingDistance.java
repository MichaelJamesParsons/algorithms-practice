package HammingDistance;

class HammingDistance {
    int hammingDistance(int x, int y) {
        return (int)Math.floor(Math.log(x^y) / Math.log(2)) + (((x^y) % 2 > 0) ? 0 : 1);
    }
}
