package HomeworkAnswers;

public class Islands
{
    //To Display the input table
    public void displayMatrix(char[][] matrix)
    {
        for(char[] row: matrix)
        {
            for(char ch: row)
            {
                System.out.print(" "+ch+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //To go through each element of the matrix and call the dfs function on the 1's
    public int noOfIslands(char[][] inputTable)
    {
        int flag = 0;
        int count=0;
        start:
        for (int r = 0; r< inputTable.length; r++)
        {
            for (int c = 0; c < inputTable[r].length; c++)
            {
                if (inputTable[r][c] == 'L')
                {
                    flag = dfs(inputTable, r ,c);
                    if(flag>0)
                        ++count;
                    break start;
                }
            }
        }
        return count;
    }


    public int dfs(char[][] table, int row, int col)
    {
        int up = 0, down = 0, left = 0, right = 0;


        if (table[row][col] == 'C'||table[row][col] == 'L')
            return 1;

        else if (table[row][col] == 'W')
            return 0;

        //Assigning all the visited positions as K to differentiate from unvisited elements and avoid infinite loop
        table[row][col] = 'K';

        if (row - 1 < table.length)
            up = dfs(table, row - 1, col); //goes up

        if (row + 1 >= 0)
            down = dfs(table, row + 1, col); //goes down

        if (col - 1 < table[0].length)
            left = dfs(table, row, col - 1);  //goes left

        if (col + 1 >= 0)
            right = dfs(table, row, col + 1); //goes right

        int cloudsOrLand= up+down+left+right;

        return cloudsOrLand;
    }


    public static void main(String[] args)
    {
        char [][] inputTable1=new char[][]
                {
                        { 'C', 'C', 'C', 'C', 'C' },
                        { 'C', 'C', 'C', 'C', 'C' },
                        { 'C', 'C', 'C', 'C', 'C' },
                        { 'C', 'C', 'C', 'C', 'C' }
                };

        char [][] inputTable2=new char[][]
                {
                        { 'L', 'W' },
                        { 'C', 'C' },
                        { 'W', 'L' }
                };

        Islands obj = new Islands();
        System.out.println("Input Table1:\n");
        obj.displayMatrix(inputTable1);

        //int output1 = obj.noOfIslands(inputTable1);
        System.out.println("Minimum number of islands that is consistent with the given grid: ");
        System.out.println( obj.noOfIslands(inputTable1));

        System.out.println("\nInput Table2:\n");
        obj.displayMatrix(inputTable2);

        //int output1 = obj.noOfIslands(inputTable1);
        System.out.println("Minimum number of islands that is consistent with the given grid: ");
        System.out.println( obj.noOfIslands(inputTable2));



    }
}