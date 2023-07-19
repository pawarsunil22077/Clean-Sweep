public class CleanSweep {
    
    public static void main(String[] args) {
        int[][] floor = new int[10][10]; // floor is 10x10
        int counter = 0;
        
        // initialise floor with 0s
        for(int x = 0; x < floor.length; x++){
            for(int y = 0; y < floor[x].length; y++){
                floor[x][y] = 0;
            }
        }
        
        // populate the floor with dirt (odd values) and obstacles (even values)
        for(int x = 0; x < floor.length; x++){
            for(int y = 0; y < floor[x].length; y++){
                // if counter is odd, add dirt, if counter is even, add obstacle
                if (counter % 2 == 0) {
                    floor[x][y] = 2;
                } else { 
                    floor[x][y] = 1;
                }
                counter++;
            }
        }
        
        // print floor to help with debugging
        for(int x = 0; x < floor.length; x++){
            for(int y = 0; y < floor[x].length; y++){
                System.out.print(floor[x][y]);
            }
            System.out.println();
        }
        
        // initial position of robot 
        int x = 0; 
        int y = 0; 
        
        // Clean Sweep Algorithm 
        while(true) 
        { 
            // Clean the current cell 
            if (floor[x][y] == 1) 
                floor[x][y] = 0;
    
            // Check the right cell 
            if (y+1 < floor[0].length && 
               floor[x][y+1] != 0) 
            { 
                System.out.println("Right"); 
                       // Move right 
                y++; 
                continue; 
            } 
    
            // Check the bottom cell 
            if (x+1 < floor.length && 
                floor[x+1][y] != 0) 
            { 
                System.out.println("Down"); 
                // Move down 
                x++; 
                continue; 
            } 
    
            // Check the left cell 
            if (y-1 >= 0 && floor[x][y-1] != 0) 
            { 
                System.out.println("Left"); 
                // Move left 
                y--; 
                continue; 
            } 
    
            // Check the top cell 
            if (x-1 >= 0 && 
               floor[x-1][y] != 0) 
            { 
                System.out.println("Up"); 
                // Move up 
                x--; 
                continue; 
            } 
    
            // All adjacent cells are cleaned 
            break; 
        } 
        
        // print floor to help with debugging
        for(int x2 = 0; x2 < floor.length; x2++){
            for(int y2 = 0; y2 < floor[x2].length; y2++){
                System.out.print(floor[x2][y2]);
            }
            System.out.println();
        }
    }
}