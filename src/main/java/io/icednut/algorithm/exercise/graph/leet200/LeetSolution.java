package io.icednut.algorithm.exercise.graph.leet200;

class LeetSolution {

    public class Pair {
        int r;
        int c;
        public Pair(int r, int c){
            this.r = r;
            this.c = c;
        }
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == '1'){
                    count++;
                    visit(grid, i, j);
                }
            }
        }
        return count;
    }
    private void visit(char[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length){
            return;
        }
        if(grid[i][j]!='1'){return;}
        grid[i][j] = '0';
        visit(grid, i+1, j);
        visit(grid, i-1, j);
        visit(grid, i, j-1);
        visit(grid, i, j+1);
    }
}