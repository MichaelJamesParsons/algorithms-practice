package HammingDistance;

class HammingDistance {
    int hammingDistance(int x, int y) {
        int diff = x ^ y;
        int distance = 0;

        while (diff > 0) {
            distance++;
            diff &= diff - 1;
        }

        return distance;
    }
}
