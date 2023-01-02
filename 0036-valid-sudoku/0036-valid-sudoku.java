class Solution {
    public boolean isValidSudoku(char[][] board) {
         List<Set<Character>> rows = new ArrayList<>(9);
         List<Set<Character>> cols = new ArrayList<>(9);
         List<Set<Character>> boxes = new ArrayList<>(9); 

         //initialize the list
         for(int i=0;i<9;i++){
             rows.add(new HashSet<>()); 
             cols.add(new HashSet<>());
             boxes.add(new HashSet<>());
         }

         //iter over board
         for(int i=0;i<9;i++){
             for(int j=0;j<9;j++){
                 char cc= board[i][j];

                 if(cc=='.') continue;

                 //pos of box
                 int pos=(i/3)*3+(j/3);

                 if(rows.get(i).contains(cc) || cols.get(j).contains(cc)|| boxes.get(pos).contains(cc)){
                     return false;
                 }
                 rows.get(i).add(cc);
                 cols.get(j).add(cc);
                 boxes.get(pos).add(cc);
             }
         }
         return true;
    }
}