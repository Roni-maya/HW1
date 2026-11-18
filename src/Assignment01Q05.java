public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i==j){
            return 0;
        }
        int[] dist= new int[m.length];
        for (int k =0 ; k<m.length; k++){
            dist[k]= -1;
        }
        dist[i]=0;
        int[] queue = new int[m.length];
        queue[0]=i;
        int read = 0;
        int write= 1;
        while (read< write){
            int current= queue[read];
            read++;
            for (int c=0 ; c<m.length ; c++){
                if (m[current][c]==1 && dist[c]==-1){
                    dist[c]=dist[current]+1;
                    if(c==j){
                        return dist[c];
                    }
                    queue[write]=c;
                    write++;
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