class Solution {
    public int numIslands(char[][] grids) {
        int m = grids.length;
        int n = grids[0].length;

        int count = 0;

        for(int i = 0;i<m;i++){
            for(int j= 0;j<n;j++){
                if(grids[i][j] =='1'){
                    count++;
                    Traverse4Dir(grids,i,j);
                }
            }
        }
        return count;
    }

    static void Traverse4Dir(char[][] grids, int i,int j){
        if(i<0 || j< 0 || i>=grids.length || j>=grids[0].length || grids[i][j] =='0'){
            return;
        }
        grids[i][j] = '0';

            Traverse4Dir(grids,i,j+1);
            Traverse4Dir(grids,i+1,j);
            Traverse4Dir(grids,i,j-1);
            Traverse4Dir(grids,i-1,j);
    }
}
