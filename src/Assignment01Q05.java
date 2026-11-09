public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        // doing this with the BFS way 
        int n = m.length;
        int[] visited = new int[n]; 
        int [] queue = new int[n];
        int front = 0, rear = 0;
        
        visited[i] = 1;
        queue[rear++] = i;
        for (int distance = 0; front < rear; distance++) {
            int size = rear - front;
            for (int k = 0; k < size; k++) {
                int current = queue[front++];
                if (current == j) {
                    return distance;
                }
                for (int neighbor = 0; neighbor < n; neighbor++) {
                    if (m[current][neighbor] == 1 && visited[neighbor] == 0) {
                        visited[neighbor] = 1;
                        queue[rear++] = neighbor;
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}